class Main 
{
    public static void arraySwap(int[] arr)
    {
        int temp;
        for(int i = 0; i<arr.length - 1; i+=2){
        temp = arr[i];
        arr[i]= arr[i+1];
        arr[i+1] = temp;
        }
    }
    
    public static void main(String[] args) 
    {
        int[] arr = {4, 6, 7, 8, 9, 54, 66, 78, 98, 90};
        System.out.println("Before Swaping: ");
        for(int x:arr)
        System.out.println(x);
        
        arraySwap(arr);
        
        System.out.println("After Swaping: ");
        for(int x:arr)
        System.out.println(x);
    }
}
