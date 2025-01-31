public class Student {
  
    int age;
    String name;

    
    public Student() {
        this(0, null);  
    }

    
    public Student(int age) {
        this(age, null);  
    }

    
    public Student(String name) {
        this(0, name);  
    }

    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

  
    public void display() {
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(20);
        Student student3 = new Student("John");
        Student student4 = new Student(25, "Alice");

      
        student1.display();
        student2.display();
        student3.display();
        student4.display();
    }
}
