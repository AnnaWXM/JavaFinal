public class On2 {

    public static int[] list= {-93, -36, 25, 44, -30 ,-21, 34, 56, 82 ,64};
     
    public static <T> void sorting(){
        
        System.out.println("\nData set before insertion sorting:");
        for(int i=0; i< list.length ;i++){
            System.out.print(list[i] + " ");
        }

        System.out.println("\n\nData set after insertion sorting:");
        int [] data = insertionSort(list);
        for(int i=0; i< list.length ;i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("\n");
    }
    

    public static int[] insertionSort(int[] data)
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
        return (data);
    }		


}