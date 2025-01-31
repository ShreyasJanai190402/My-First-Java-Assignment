import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int age;
    int score;

    
    public Student(String name, int rollNo, int age, int score) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.score = score;
    }

    
    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Age: " + age + ", Score: " + score);
    }
}

public class StudentScoreGroups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        ArrayList<Student> group1 = new ArrayList<>(); 
        ArrayList<Student> group2 = new ArrayList<>(); 
        ArrayList<Student> group3 = new ArrayList<>(); 
        ArrayList<Student> group4 = new ArrayList<>(); 

      
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Roll No: ");
            int rollNo = scanner.nextInt();
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            System.out.print("Enter Score: ");
            int score = scanner.nextInt();
            scanner.nextLine(); 

            Student student = new Student(name, rollNo, age, score);

          
            if (score <= 50) {
                group1.add(student);
            } else if (score <= 65) {
                group2.add(student);
            } else if (score <= 80) {
                group3.add(student);
            } else {
                group4.add(student);
            }
        }

    
        System.out.println("\nStudents in score group [0 - 50]:");
        for (Student student : group1) {
            student.display();
        }

        System.out.println("\nStudents in score group [50 - 65]:");
        for (Student student : group2) {
            student.display();
        }

        System.out.println("\nStudents in score group [65 - 80]:");
        for (Student student : group3) {
            student.display();
        }

        System.out.println("\nStudents in score group [80 - 100]:");
        for (Student student : group4) {
            student.display();
        }

        scanner.close();
    }
}
