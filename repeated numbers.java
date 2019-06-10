import java.util.*;
public class MyClass{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        List list = new ArrayList();
        int count=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                  list.add(a[i]);
        
                }
            }
        }
        Collections.sort(list);
        if(list.size()==0){
            System.out.println("unique");
        }
        else{
            System.out.print(list.toString().replace("[","").replace("]","").replace(",",""));
        }
        
    }
}
