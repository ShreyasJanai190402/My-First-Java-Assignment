import java.util.Scanner;

class Student {
    String name;
    int age;

  
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void swap(Student student1, Student student2) {
    
        String tempName = student1.name;
        int tempAge = student1.age;

        student1.name = student2.name;
        student1.age = student2.age;

        student2.name = tempName;
        student2.age = tempAge;
    }

    
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class StudentClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the name of the first student: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter the age of the first student: ");
        int age1 = scanner.nextInt();
        scanner.nextLine(); 

    
        System.out.print("Enter the name of the second student: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter the age of the second student: ");
        int age2 = scanner.nextInt();

      
        Student student1 = new Student(name1, age1);
        Student student2 = new Student(name2, age2);

    
        System.out.println("\nBefore swapping:");
        student1.display();
        student2.display();

    
        Student.swap(student1, student2);

      
        System.out.println("\nAfter swapping:");
        student1.display();
        student2.display();

        scanner.close();
    }
}
