import java.util.Scanner;
class reverseArray
{
    public static void revArr(int [] arr, int start, int end )
    {
       if(start > end)
       {
           return;
       } 
       System.out.print(arr[end]+" ");
       revArr(arr, start, end-1);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the size of array - ");
       int n=sc.nextInt();
       int [] arr=new int[n];
       System.out.println("Enter the element of array");
       for (int i=0; i<n; i++)
       {           
           arr[i]=sc.nextInt();
       }
       System.out.print("Reverse array - ");
       revArr(arr, 0, arr.length-1);
      
    }
    
    
}
