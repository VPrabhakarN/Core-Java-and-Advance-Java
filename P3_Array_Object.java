// Java program to demonstrate the array object 

// defining student class
class Student {
    public int roll_no;
    public String name;

    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class P3_Array_Object {
    public static void main(String[] args){
        
        // declares an Array of Student
        Student[] arr;

        // allocaing memory for 5 objects of type Student 
        arr = new Student[5];

        // initialize the first elemnent of the array 
        arr[0] = new Student(1, "Vijay Prabhakar Nagane"); 

        // initialize the second element of the array
        arr[1] = new Student(2, "Tanvi Rahul Gundewar");
        
        // and so on...
        arr[2] = new Student(3, "Rohan Dattatray Kadam"); 
        arr[3] = new Student(4, "Rushikesh Ratilal Kolhal"); 
        arr[4] = new Student(5, "Lajam Dilawar Shaikh"); 

        // accessing the elements of the specified array 
        for(int i=0; i<arr.length; i++){
            System.out.println("Element at "+ i + " : " + arr[i].roll_no + " " + arr[i].name);
        }
    }    
}
