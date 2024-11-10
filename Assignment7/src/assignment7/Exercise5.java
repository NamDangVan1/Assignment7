package assignment7;

import java.util.*;

public class Exercise5 
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
        
        System.out.print("Index: ");
        int index = sc.nextInt();
        System.out.print("Number: ");
        int number = sc.nextInt();
        
        numbers.set( index-1, number );
        
        System.out.println(Arrays.toString(numbers.toArray()));      
        
    }
}
