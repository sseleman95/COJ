import java.util.*;

public class COJ2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String ng = "";
		int temp = 0, grupo;
		int[] rooms;
		boolean full = false;
		ng = sc.nextLine();
		rooms = new int[Integer.parseInt(ng.split(" ")[0])]; 
		grupo = Integer.parseInt(ng.split(" ")[1]); 

		for(int i = 0; i < grupo; i++)
		{
			temp = Integer.parseInt(sc.nextLine());

			byte j=0;
			while(temp != 0)
			{
				if(temp > 1 && rooms[j] == 0)
				{
					rooms[j] += 2;
					temp -= 2;
				}
				else if(temp == 1 && rooms[j] == 0)
				{
					rooms[j] = 1;
					temp--;
				}
				else
				{
					full = true; 
					for(int k = 0; k < rooms.length && full; k++)
					{
						if(rooms[k] == 0)
							full = false;
					}

					if(full && rooms[j] == 1)
					{
						rooms[j] += 1;
						temp--;
					}
				}

				j++;

				if(j == rooms.length)
					j=0;
			}
		}
		for (int i = 0; i < rooms.length; ++i) 
		{
			System.out.println(rooms[i]);
		}
	}
}