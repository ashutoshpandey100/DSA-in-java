public class Main
{
    static void minMax(int[] arr)
    {
        int min = arr[0];
        int max = arr[0];
        
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] < min)
                min = arr[i];
            if(arr[i] > max)
                max = arr[i];
        }
         
        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);
    }
    
    public static void main(String[] args) 
    {
        int[] arr = {5, 7, 4, 6, 9, 3, -6};
        minMax(arr);
    }
}
