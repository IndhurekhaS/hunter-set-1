import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,count1=0;
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
             {
                if(a[i]%2==0 && i%2!=0)
                {
                    System.out.print(a[i]+" ");
                }
                   if(a[i]%2!=0 && i%2==0)
                {
                    System.out.print(a[i]+" ");
                }
              
             }
    }
}
