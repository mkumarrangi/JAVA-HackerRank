
    import java.util.*;
import java.io.*;
import java.lang.Math;
    public class javaLoopII {
        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                int sum=0;
                for(int j=0;j<n;j++)
                {
                    a=a+(int)Math.pow(2,j)*b;
                    //sum=sum+fSum;
                    System.out.print(a+" ");
                }
                System.out.println();
            }
            in.close();
        }
    }
    
