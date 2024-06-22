import java.util.*;

public class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int c = sc.nextInt();
        int [] nums = new int [c];

        for(int i = 0; i < c; i++){
            nums[i] = sc.nextInt();
        }
        
        Arrays.sort(nums);
        
        for(int arr: nums){
            System.out.println(arr);
        }
    }
}