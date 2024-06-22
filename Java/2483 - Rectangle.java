
import java.io.*;

public class Rectangle2483 {

    private static final InputStreamReader isr = new InputStreamReader(System.in);
    private static final BufferedReader br = new BufferedReader(isr);
    private static final OutputStreamWriter osw = new OutputStreamWriter(System.out);
    private static final BufferedWriter bw = new BufferedWriter(osw);

    public static void main(String[] args) throws IOException {
        String[] line;
        Point[] points = new Point[3];
        double max = Double.MIN_VALUE, dist;
        Point p1 = null, p2 = null;
        for (int i = 0; i < 3; i++) {
            line = br.readLine().split("\\s+");
            points[i] = new Point(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
        }
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                dist = points[i].distance(points[j]);
                //System.out.println(points[i] + " + " + points[j] + " " + dist);
                if (max < dist) {
                    max = dist;
                    p1 = points[i];
                    p2 = points[j];
                }
            }
        }
        Point res = Point.encontrar(p1, p2, points);
        bw.append(res.toString()+"\n");
        bw.flush();
        bw.close();
    }

    private static class Point {

        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public double distance(Point a) {
            return Math.sqrt(Math.pow((a.x - this.x), 2) + Math.pow((a.y - this.y), 2));
        }

        public boolean equals(Point point) {
            return (this.x == point.x) && (this.y == point.y);
        }

        private static Point encontrar(Point p1, Point p2, Point[] points) {
            //System.out.println("p1" + " " + p1);
            //System.out.println("p2" + " " + p2);
            Point aux1, aux2;
            aux1 = new Point(p1.x, p2.y);
            aux2 = new Point(p2.x, p1.y);
            //System.out.println("aux1" + " " + aux1);
            //System.out.println("aux2" + " " + aux2);
            for (int i = 0; i < 3; i++) {
                if (points[i].equals(aux1)) {
                    return aux2;
                }
            }
            return aux1;
        }

        @Override
        public String toString() {
            return this.x + " " + this.y;
        }

    }
}
