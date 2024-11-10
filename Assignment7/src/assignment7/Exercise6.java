package assignment7;

import java.util.*;

public class Exercise6 
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
        
        for ( int i = 0; i < numbers.size()-1; i++ )
        {
            for ( int j = i+1; j < numbers.size(); j++ )
            {
                if ( numbers.get(i) > numbers.get(j) )
                {
                    int number = numbers.get(i);
                    numbers.set( i, numbers.get(j) );
                    numbers.set( j, number);
                }
            }
        }
        
        System.out.println(Arrays.toString(numbers.toArray()));
    }
}
