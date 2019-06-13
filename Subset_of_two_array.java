import java.util.*;
public class MyClass{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int [n];
        int b[]=new int [m];
        int count=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
               if(a[i]==b[j])
               {
                   count++;
               }
            }
        }
        if(count!=0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
