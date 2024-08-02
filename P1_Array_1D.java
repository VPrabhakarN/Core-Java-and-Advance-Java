// Java program to define the array 
class P1_Array_1D {
    public static void main(String [] args){

        // declare an array of integers
        int arr[];

        // allocating memory size for 5 integers
        arr = new int[5];

        // intializing the first element of the array 
        arr[0] = 10;

        // intializing the second element of the array 
        arr[1] = 20;

        // and so on...
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // accessing the elements of the specified array 
        for(int i=0; i<arr.length; i++){
            System.out.println("Element at index "+ i + " : " + arr[i]);
        }
    }
}