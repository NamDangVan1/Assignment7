package assignment7;

import java.util.*;

public class Exercise4 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in );
        System.out.print("How many language? ");
        int num = sc.nextInt();
        sc.nextLine();
        
        ArrayList<String> languages = new ArrayList<>();
        
        for ( int i = 0; i < num; i++ )
        {
            System.out.print("Language " + (i+1) + ": ");
            languages.add(sc.nextLine());
        }
        
        System.out.print("What language you want to check? ");
        String language = sc.nextLine();
        
        if (languages.remove(language))
        {
            System.out.print(language + " is in the list.");
        }else
        {
            System.out.print(language + " isn't in the list.");
        }
        
    }
}
