import java.io.*;
import java.util.*;

public class WhataretheNumbers1855 {

  private static final InputStreamReader isr = new InputStreamReader(System.in);
  private static final BufferedReader br = new BufferedReader(isr);
  private static final OutputStreamWriter osw = new OutputStreamWriter(
    System.out
  );
  private static final BufferedWriter bw = new BufferedWriter(osw);

  public static void main(String[] args) throws IOException {
    Set<Integer> s = new TreeSet();
    int t = Integer.parseInt(br.readLine());
    int n, k;
    boolean imp;
    while (t-- > 0) {
      n = Integer.parseInt(br.readLine());
      imp = true;
      s.clear();
      while (n-- > 0) {
        k = Integer.parseInt(br.readLine());
        if (s.contains(k)) {
          bw.append(k + "");
          bw.newLine();
          imp = false;
        } else {
          s.add(k);
        }
      }
      if (imp) {
        bw.append("Not found!");
        bw.newLine();
      }
    }
    bw.flush();
    bw.close();
  }
}
