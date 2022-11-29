public class Onlog {

    public static int[] list= {-7, 1, -81, -56, -91, 37, 41, 28, 34, -27};
     
    public static <T> void sorting(){
        
        System.out.println("\nData set before quicksort:");
        for(int i=0; i< list.length ;i++){
            System.out.print(list[i] + " ");
        }

        System.out.println("\n\nData set after quickort:");
        quickSort(list);
        System.out.println("\n");
        
    }
    public static void quickSort(int[] data)
    {
        int [] list = Sort(data, 0, data.length - 1);
       
        for(int i=0; i< list.length ;i++){
            System.out.print(list[i] + " ");
        }
    }

    private static int[] Sort(int[] data, int min, int max)
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
        return data;    
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