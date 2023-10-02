import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

class Student{
  
    String firstName;
    String lastName;
    String studentID;
    
    double A1; // double because the data contains decimals
    double A2;
    double A3;
    double totalMark;
 
        
    public Student(String firstName, String lastName, String studentID, double a1, double a2, double a3)
    { 
        this.firstName = firstName;
        this.lastName = lastName;        
        this.studentID = studentID;
        A1 = a1;
        A2 = a2;
        A3 = a3;
        totalMark = A1 + A2 + A3;
}

@Override
public String toString(){
  return firstName + " " + lastName + " (ID: " + studentID + ") - A1: " + A1 + ", A2: " + A2 + ",A3: " + A3 + ", Total Mark: " + totalMark; 
}

}

public class GradeCalculations {
    public static void main(String[] args){
        String filePath = "C://Users//mariy//Desktop//SCU//TERM 5//Fundamentals of programming//tables.csv";

        List<Student> students = readFromFile(filePath);
        
        if (students.isEmpty()){
            System.out.println("No valid student data found in the file.");
            return;
        
        }
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Print Unit Name");
            System.out.println("2. Calculate Total Marks and Print Students information");
            System.out.println("3. Print Students Below Threshold");
            System.out.println("4. Print Top 5 Students (Highest and Lowest)");
            System.out.println("5. Exit");
            
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
}
}
private static List<Student> readFromFile(String filePath){
    List<Student> students = new ArrayList<>();
    return students;
}
}

