import java.util.Arrays;

public class On2 {

    public static int[] list= {-93, -36, 25, 44, -30 ,-21, 34, 56, 82 ,64};
     
    public static <T> void sorting(){
        
        System.out.println("\nData set before insertion sorting:");
        System.out.println(Arrays.toString(list));

        System.out.println("\nData set after insertion sorting:");
        System.out.println(insertionSort(list));
        
        
    }
    

    public static String insertionSort(int[] data)
    {
        for (int index = 1; index < data.length; index++)
        {
            int key = data[index];
            int position = index;
			
            // shift larger values to the right 
            while (position > 0 && data[position-1]>(key) )
            {
                data[position] = data[position-1];
                position--;
            }
			
            data[position] = key;
        }
        return Arrays.toString(data);
    }		


}