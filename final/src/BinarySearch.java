import java.util.Scanner;

public class BinarySearch {

    public static int[] list= {0,1,2,3,4,5,6,7,8,9};
     
    public static <T> void BinaryS(){
        Scanner in = new Scanner(System.in);
        System.out.print("In the list are values 0, ..., 9; which value would you like to search with binary search?  ");
        int t = in.nextInt();
        if(BS(list, 0, 9, t)){
            System.out.println("\nFound");
        }else 
        {
            System.out.println("\nNot found");
        }
    }

    public static <T extends Comparable<T>>  boolean BS(int[] data, int min, int max, int target)
    {  
        boolean found = false;
        int midpoint = (min + max) / 2;  // determine the midpoint

        if (data[midpoint] == (target) )
            found = true;

        else if (data[midpoint]> (target) )
        {
            if (min <= midpoint - 1)
                found = BS(data, min, midpoint - 1, target);
        }
        
        else if (midpoint + 1 <= max)
            found = BS(data, midpoint + 1, max, target);

        return found;
    }		
}