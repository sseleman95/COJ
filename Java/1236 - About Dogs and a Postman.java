import java.util.*;

public class COJ2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] array_PMG = new int[3];
    StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
    Dog doge_1 = new Dog(
      Integer.parseInt(st.nextToken()),
      Integer.parseInt(st.nextToken())
    );
    Dog doge_2 = new Dog(
      Integer.parseInt(st.nextToken()),
      Integer.parseInt(st.nextToken())
    );
    st = new StringTokenizer(sc.nextLine(), " ");
    for (int i = 0; i < array_PMG.length; i++) {
      array_PMG[i] = Integer.parseInt(st.nextToken());
    }

    //Data logic
    for (int i = 0; i < array_PMG.length; i++) {
      int status = 0;
      doge_1.isActive(true);
      doge_1.setTime(0);
      doge_2.isActive(true);
      doge_2.setTime(0);
      while (doge_1.getTime() < array_PMG[i]) {
        if (doge_1.isActive()) {
          doge_1.setTime(doge_1.getTime() + doge_1.getActiveTime());
          if (doge_1.getTime() >= array_PMG[i]) {
            status++;
            break;
          }
          doge_1.isActive(false);
        } else {
          doge_1.setTime(doge_1.getTime() + doge_1.getRestTime());
          if (doge_1.getTime() >= array_PMG[i]) {
            break;
          }
          doge_1.isActive(true);
        }
      }

      while (doge_2.getTime() < array_PMG[i]) {
        if (doge_2.isActive()) {
          doge_2.setTime(doge_2.getTime() + doge_2.getActiveTime());
          if (doge_2.getTime() >= array_PMG[i]) {
            status++;
            break;
          }
          doge_2.isActive(false);
        } else {
          doge_2.setTime(doge_2.getTime() + doge_2.getRestTime());
          if (doge_2.getTime() >= array_PMG[i]) {
            break;
          }
          doge_2.isActive(true);
        }
      }

      if (status == 0) {
        System.out.println("none");
      } else if (status == 1) {
        System.out.println("one");
      } else {
        System.out.println("both");
      }
    }
  }

  public static class Dog {

    private int activeTime;
    private int restTime;
    private boolean active;
    private int time;

    public Dog(int activeTime, int restTime) {
      super();
      this.activeTime = activeTime;
      this.restTime = restTime;
      active = true;
    }

    public void setTime(int time) {
      this.time = time;
    }

    public int getTime() {
      return time;
    }

    public void setActiveTime(int activeTime) {
      this.activeTime = activeTime;
    }

    public int getActiveTime() {
      return activeTime;
    }

    public void setRestTime(int restTime) {
      this.restTime = restTime;
    }

    public int getRestTime() {
      return restTime;
    }

    public void isActive(boolean active) {
      this.active = active;
    }

    public boolean isActive() {
      return active;
    }
  }
}
