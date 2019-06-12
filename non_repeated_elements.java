import java.util.*;
public class MyClass{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int res=0;
        for(int i=0;i<a.length-1;i++)
        {
            count=0;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]!=a[j])
                {
                   count++;
                }
            }
            if(count==(n-i-1))
            {
                res=a[i];
                break; 
              
            }
        }
            System.out.print(res+" ");
    }
}
