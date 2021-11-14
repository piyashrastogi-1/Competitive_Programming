/*
        Take as input N, a number.
        Take N more inputs and store that in an array.
        Write a recursive function which reverses the array.
        Print the values of reversed array.
*/

import java.util.*;
public class lastIndex {
    public static int lastOccurrence(int [] arr, int end, int m)
    {
        if(end<0)
        {
            return -1;
        }
        if(m==arr[end])
        {
            return end;
        }
        return(lastOccurrence(arr,end-1,m));
    }
    public static void main(String[] args) {
        // Your Code Here
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Size of Array - ");
        int n=in.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter Array Element - ");
        for (int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        System.out.print("Enter the element you want to check its last occurrence  ");
        int m=in.nextInt();


        System.out.println("Last lastOccurrence is at index no - " + lastOccurrence(arr,arr.length-1,m));
    }
}
