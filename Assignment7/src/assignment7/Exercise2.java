package assignment7;

import java.util.*;

public class Exercise2 
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
        
        System.out.print("What number you want remove? ");
        int number = sc.nextInt();
        
        if (numbers.remove((Integer)number))
        {
            System.out.println("Your number was remove.");
        }else
        {
            System.out.println("Don't have this number in array.");
        }
        
        System.out.println(Arrays.toString(numbers.toArray()));
    }
}
