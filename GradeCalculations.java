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
            
            switch (choice) {
                case 1:
                    printUnitName(filePath); //f1: print unit name from file 
                    break;
                case 2:
                    printStudentsWithTotalMarks(students); //f2: print students details with total marks 
                    break;
                case 3:
                    System.out.print("Enter the threshold: ");
                    double threshold = scanner.nextDouble();
                    printStudentsBelowThreshold(students, threshold); //f3: print students below a given threshold
                    break;
                case 4:
                    printTop5Students(students); //f4: print top 5 students
                    break;
            }
}
}
private static List<Student> readFromFile(String filePath){
    List<Student> students = new ArrayList<>();
    return students;
}

// method to print unit name
private static void printUnitName(String filePath){
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))){ //BufferedReader to read file
        String unitName = br.readLine(); // readLine reads the first line of the file
        System.out.println("Unit Name: " + unitName);
    } catch (IOException e){ // identify error if the file doesn't exist or cannot be read
        e.printStackTrace();
    }
    }
    
// method to print student details with total marks
private static void printStudentsWithTotalMarks(List<Student> students){
    for(Student student : students){
        System.out.println(student);
    }
}

// method to print student below a given threshold
private static void printStudentsBelowThreshold(List<Student> students, double threshold){
    for(Student student : students){
        if (student.totalMark < threshold){
        System.out.println(student);
    }
}
}

//method to print the top 5 students with highest and lowest total marks
private static void printTop5Students(List<Student> students){
    students.sort((s1, s2) -> Double.compare(s2.totalMark, s1.totalMark)); //list is sorted in descending order and compare the marks
    
    System.out.println("Top 5 Students (Highest Total Marks):");
    for (int i = 0; i< Math.min(5, students.size()); i++){
        System.out.println(students.get(i)); //prints the 5 students with the highest total marks first
    }
    
    System.out.println("/nTop 5 Students (Lowest Total Marks):");
    for (int i = students.size() - 1; i >= Math.max(0, students.size() - 5); i--){
        System.out.println(students.get(i)); //prints the 5 students with the lowest total marks last.
    }
}
}



