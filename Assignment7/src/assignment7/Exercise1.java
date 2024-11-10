package assignment7;

import java.util.*;

public class Exercise1 
{
    public static void main( String[] args ) 
    {
        Scanner sc = new Scanner( System.in );
        
        System.out.print("How many friend? ");
        int num = sc.nextInt();
        sc.nextLine();
        
        ArrayList <String> names = new ArrayList<>();
        
        for ( int i = 0; i < num; i++ )
        {
            
            System.out.print("Friend " + (i+1) + ": ");
            names.add(sc.nextLine());

        }
        
        System.out.print(Arrays.toString(names.toArray()));
        
    }
    
}
