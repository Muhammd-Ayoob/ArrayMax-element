package arraymax;
import java.util.*;
public class ArrayMax {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int a[]=new int[5];
        int loc=0;
        
        int max=a[0];
        System.out.println("Enter array elements to find max value among them.");
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            loc=i+1;
            }
        }
        
        System.out.println("Maximum value in given array is "+max+" it is present at "+loc+" position");
        
    }
    
}
