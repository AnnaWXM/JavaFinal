import java.util.Scanner;

public class LinearSearch {

    public static int[] list= {0,1,2,3,4,5,6,7,8,9};
     
    public static <T> void LinearS(){
        Scanner in = new Scanner(System.in);
        System.out.print("In the list are values 0, ..., 9; which value would you like to search with linear search?  ");
        int t = in.nextInt();
        if(LS(list, 0, 9, t)){
            System.out.println("\nFound");
        }else 
        {
            System.out.println("\nNot found");
        }
    }
    

    public static <T> boolean LS(int[] list2, int min, int max, int t)
    {
        int index = min;
        boolean found = false;

        while (!found && index <= max) 
        {
            if (list2[index]!=t) found = false;
            else found = true;
            index++;
        }

        return found;
    }
}