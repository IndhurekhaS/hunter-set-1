import java.util.*;
public class MyClass{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]+a[j]==0)
                {
                   System.out.print(a[i]+" "+a[j]);
                }
                // System.out.print(a[j]+" ");
            }
            // System.out.print(a[i]+" ");
        }
    }
}
