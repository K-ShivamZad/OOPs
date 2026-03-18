import java.util.*;

public class Findinglargestnum 
{
    int arr[];
    Findinglargestnum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the size of arrays");
        int n=sc.nextInt();
        int arr=new arr[n];
    }
    void inpute()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the size of arrays");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    int largest()
    {
        int max=0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]<max)
            {
                max=arr[i];
            }
        }
        return max ;
    }
 
    public static void main(String[] args) 
    {
        Findinglargestnum obj=new Findinglargestnum();
        obj.inpute();
        int max=obj.largest();
        System.out.println(max);
    }
}
