package assignment7;

import java.util.*;

public class Exercise7 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in );
        System.out.print("How many number in array? ");
        int num = sc.nextInt();
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        for ( int i = 0; i < num; i++ )
        {
            System.out.print("Number " + (i+1) + ": ");
            numbers.add(sc.nextInt());
        }
        
        int[] arr = new int[num];
        
        for ( int i = 0; i < numbers.size(); i++ ) 
        {
            arr[i] = numbers.get(i);
        }
        
        System.out.print(Arrays.toString(arr));
        
    }
}
