#include <algorithm>
#include <iomanip>
#include <iostream>
#include <ctype.h>
#include <cmath>
#include <deque>
#include <limits>
#include <memory>
#include <sstream>
#include <tuple>
#include <unordered_map>
#include <unordered_set>
#include <vector>

using namespace std;

int totalNodes;
vector<pair<double, double>> nodeCoords;

void solve();

struct tuple_by_third
{
  template <class T1, class T2, class T3>
  inline bool operator()(const std::tuple<T1, T2, T3> &t1, const std::tuple<T1, T2, T3> &t2)
  {
    return get<2>(t1) < get<2>(t2);
  }
};

struct Forest
{
  int id;
  unordered_set<int> nodeIndeces;

  Forest(int nodeIndex)
  {
    id = nodeIndex;
    nodeIndeces.insert(nodeIndex);
  }

  bool contains(int nodeIndex) const { return nodeIndeces.find(nodeIndex) != nodeIndeces.end(); }

  bool contains(const Forest &forest) const
  {
    for (int nodeIndex : forest.nodeIndeces)
    {
      if (contains(nodeIndex))
        return true;
    }
    return false;
  }

  void merge(const Forest &forest)
  {
    for (int nodeIndex : forest.nodeIndeces)
      nodeIndeces.insert(nodeIndex);
  }

  bool isSpanning() const { return nodeIndeces.size() == totalNodes; }
};

double calculateDistance(const pair<double, double> &p1, const pair<double, double> &p2)
{
  int deltaX = p1.first - p2.first;
  int deltaY = p1.second - p2.second;
  return sqrt((deltaX * deltaX) + (deltaY * deltaY));
}

void fillInput()
{
  double x, y;
  cin >> totalNodes;
  for (int i = 0; i < totalNodes; ++i)
  {
    cin >> x >> y;
    nodeCoords.emplace_back(std::make_pair(x, y));
  }
}

void printEdges(const deque<tuple<int, int, double>> &edges)
{
  for (const auto &e : edges)
  {
    cout << "\tEdge: " << get<0>(e) << " <-> " << get<1>(e) << " => " << get<2>(e) << endl;
  }
}

void solve2()
{
  unordered_map<int, Forest *> nodeToForest;
  deque<tuple<int, int, double>> edges;
  for (int i = 0; i < totalNodes; ++i)
  {
    nodeToForest[i] = new Forest(i);
    for (int j = 0; j < i; ++j)
    {
      double distance = calculateDistance(nodeCoords[i], nodeCoords[j]);
      edges.emplace_back(std::make_tuple(j, i, distance));
    }
  }
  sort(edges.begin(), edges.end(), tuple_by_third());

  int n1, n2;
  double dist, minDist = 0;
  while (edges.size() && !nodeToForest[0]->isSpanning())
  {
    tie(n1, n2, dist) = edges.front();
    edges.pop_front();

    if (!nodeToForest[n1]->contains(*nodeToForest[n2]))
    {
      nodeToForest[n1]->merge(*nodeToForest[n2]);
      minDist += dist;
    }
    if (nodeToForest[n1] != nodeToForest[n2])
    {
      auto forestToDelete = nodeToForest[n2];
      for (int nodeIndex : forestToDelete->nodeIndeces)
      {
        nodeToForest[nodeIndex] = nodeToForest[n1];
      }
      delete forestToDelete;
    }
  }
  cout << minDist << endl;
}

int main()
{
  ios_base::sync_with_stdio(0);
  cin.tie(0);
  cout << std::fixed;
  cout << std::setprecision(2);
  fillInput();
  solve2();
  return EXIT_SUCCESS;
}

struct pair_hash
{
  template <class T1, class T2>
  std::size_t operator()(std::pair<T1, T2> const &pair) const
  {
    std::size_t h1 = std::hash<T1>()(pair.first);
    std::size_t h2 = std::hash<T2>()(pair.second);
    return h1 ^ h2;
  }
};

void printMatrix(const vector<vector<double>> &matrix)
{
  cout << "Nodes distances Matrix: " << endl;
  for (int i = 0; i < matrix.size(); ++i)
  {
    for (int j = 0; j < matrix[i].size(); ++j)
    {
      cout << matrix[i][j] << "\t";
    }
    cout << endl;
  }
  cout << endl;
}

void solve()
{
  vector<vector<double>> nodesMatrix(totalNodes, vector<double>(totalNodes + 2));
  double minDistanceSum = 0.0;
  for (int i = 0; i < totalNodes; ++i)
  {
    double minDistance = std::numeric_limits<double>::max();
    int minDistanceInd = -1;
    for (int j = 0; j < totalNodes; ++j)
    {
      if (i == j)
      {
        nodesMatrix[i][j] = 0;
      }
      else if (!nodesMatrix[i][j])
      {
        nodesMatrix[i][j] = nodesMatrix[j][i] = calculateDistance(nodeCoords[i], nodeCoords[j]);
      }
      if (nodesMatrix[i][j] && nodesMatrix[i][j] < minDistance)
      {
        minDistance = nodesMatrix[i][j];
        minDistanceInd = j;
      }
    }
    nodesMatrix[i][totalNodes] = minDistance;
    nodesMatrix[i][totalNodes + 1] = minDistanceInd;

    if (i == 0 || nodesMatrix[minDistanceInd][totalNodes + 1] != i)
    {
      minDistanceSum += minDistance;
    }
  }
  cout << floor(minDistanceSum * 100) / 100 << endl;
}
