import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int choice = 1;

        while(choice>=1 && choice<=5){

            System.out.println("\nMenu of Searching and Sorting Testbed");
            System.out.println("\n1)  Linear searching");
            System.out.println("2)  Binary searching");
            System.out.println("3)  O(n^2) type of sorting");
            System.out.println("4)  O(n*log(n)) type of sorting");
            System.out.println("5)  Sorting performance");
            System.out.println("\nq/Q) Quit");

            System.out.print("\nYour choice:  ");
            choice = in.nextInt();

            if(choice == 1){
                LinearSearch.LinearS();
            }

            if(choice == 2){
                BinarySearch.BinaryS();
            }

            if(choice == 3){
                On2.sorting();
            }

            if(choice == 4){
                Onlog.sorting();
            }

        }    
    }
}
