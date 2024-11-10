package assignment7;

import java.util.*;

public class Exercise3 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in );
        System.out.print("How many city? ");
        int num = sc.nextInt();
        sc.nextLine();
        
        ArrayList<String> cities = new ArrayList<>();
        
        for ( int i = 0; i < num; i++ )
        {
            System.out.print("City " + (i+1) + ": ");
            cities.add(sc.nextLine());
        }
        
        System.out.println("List cities:");
        for (String citie : cities) 
        {
            System.out.println(citie);
        }
        
    }
}
