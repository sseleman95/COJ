package COJ;

import java.util.Scanner;

public class _2346__GlassOfWiskey {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double R1, R2, H, h;

    while (in.hasNext()) {
      R1 = in.nextInt();
      R2 = in.nextInt();
      H = in.nextInt();
      h = in.nextInt();

      if (R1 == 0 && R2 == 0 && H == 0 && h == 0) return;

      if (H == h) System.out.println("0.0000");

      if (R1 < R2) System.out.println(
        String.format("%.4f", getVol(R1, R2, H, h))
      ); else System.out.println(String.format("%.4f", getVol(R1, H - h)));
    }
  }

  public static double getVol(double R1, double h) {
    return Math.PI * R1 * R1 * h;
  }

  public static double getVol(double R1, double R2, double H, double h) {
    double sAngle = getSmallAngle(((int) (R2 - R1)), ((int) H)), R3 =
      R1 + (Math.tan(sAngle) * h);

    return getFrustumVol(R2, R3, H - h);
  }

  public static double getFrustumVol(double R1, double R2, double h) {
    return Math.PI * h * (R1 * R1 + R2 * R2 + R1 * R2) / 3;
  }

  public static double getSmallAngle(int co, int ca) {
    return Math.atan2(co, ca);
  }
}
