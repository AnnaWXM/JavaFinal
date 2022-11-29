import java.util.Arrays;

public class Onlog {

    public static int[] list= {-7, 1, -81, -56, -91, 37, 41, 28, 34, -27};
     
    public static <T> void sorting(){
        
        System.out.println("\nData set before quicksort:");
        System.out.println(Arrays.toString(list));

        System.out.println("\nData set after quickort:");
        quickSort(list);
        
        
    }
    public static void quickSort(int[] data)
    {
        Sort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }

    private static void Sort(int[] data, int min, int max)
    {
        if (min < max)
        {
            // create partitions
            int indexofpartition = partition(data, min, max);
        
            // sort the left partition (lower values)
            Sort(data, min, indexofpartition - 1);
        
            // sort the right partition (higher values)
            Sort(data, indexofpartition + 1, max);
        }
        
    }	
    private static int partition(int[] data, int min, int max)
	{
        int partitionelement;
        int left, right;
        int middle = (min + max) / 2;
		
        // use the middle data value as the partition element
        partitionelement = data[middle];
        // move it out of the way for now
        swap(data, middle, min);
		
        left = min;
        right = max;	
        while (left < right)
        {
            // search for an element that is > the partition element
            while (left < right && data[left]<=(partitionelement))
                left++;
			
            // search for an element that is < the partition element
            while (data[right]>(partitionelement))
                right--;
			
            // swap the elements
            if (left < right)
                swap(data, left, right);
        }
		
        // move the partition element into place
        swap(data, min, right);
		
        return right;
	}		
    private static void swap(int[] data, int index1, int index2)
    {
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp; 
    }
}