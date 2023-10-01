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
