// Java program to clone single dimensional array 

public class P4_Array_1D_clone {
    public static void main(String [] args){
        
        // defining an array 
        int Array[] = new int[5];

        Array[0] = 10;
        Array[1] = 20;
        Array[2] = 30;
        Array[3] = 40;
        Array[4] = 50;

        // defining another array 
        int cloneArray[] = Array.clone();

        // will print false
        System.out.println(Array == cloneArray);

        // printing copied array 
        for(int i=0; i<Array.length; i++){
            System.out.print(cloneArray[i] + " ");
        }
    }
}
