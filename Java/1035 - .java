import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.Math.log;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

public class SqrtLogSin {
static int x[]=new int[1000005];

static void calcula()
{
    int i;
    double d;
    x[0] = 1;
    for(i = 1; i <= 1000000; i++){
        d = i;
        x[i] = (x[(int)(d-sqrt(d))] + x[(int)log(d)] + x[(int)(d*sin(d)*sin(d))])%1000000;
    }
}

public static void main(String []args) throws IOException
{
    int n;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in),1024*8);
    PrintWriter pw=new PrintWriter(System.out,false);
    calcula();
    while(true)
    {
        n=Integer.parseInt(br.readLine());
        if(n == -1) break;
        pw.println(x[n]);
    }
    pw.close();
  }
}
