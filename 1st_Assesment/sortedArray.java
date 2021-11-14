import java.util.*;
public class sortedArray {
    public static boolean sortedArr(int[] arr,int end)
    {
        if(end==0||end==1)
        {
            return true;
        }
        return (arr[end-1] >= arr[end-2] && sortedArr(arr,end-1));

    }
    public static void main(String [] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array - ");
        int n=in.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter array elements - ");
        for (int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();

        }
        System.out.print("Array is sorted - ");
        if(sortedArr(arr ,n))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
