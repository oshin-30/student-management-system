import java.util.*;

class SMS{
    ArrayList<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    void addStudents(){
        System.out.println("Enter ID: ");
        int id = sc.nextInt();
        for(int i = 0;i < students.size();i++){
            if(students.get(i).id == id){
                System.out.println("Student already exists.");
                return;
            }
        }
        System.out.println("Enter Name: ");
        String name = sc.next();
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        System.out.println("Enter Marks: ");
        double marks = sc.nextDouble();
        students.add(new Student(id, name, age, marks));
        System.out.println("Student added.");
    }
    void removeStudents(){
        System.out.println("Enter Id to Remove:");
        int idToRemove = sc.nextInt();
        for(int i = 0;i < students.size();i++){
            if(students.get(i).id == idToRemove){
                students.remove(i);
                System.out.println("Student removed.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
    void updateStudents(){
        System.out.println("Enter Id to Update: ");
        int idToUpdate = sc.nextInt();
        for(int i = 0;i < students.size();i++){
            if(students.get(i).id == idToUpdate){
                System.out.println("Enter New Id:");
                int newId = sc.nextInt();
                students.get(i).id = newId;
                System.out.println("Enter New Name:");
                String newName = sc.next();
                students.get(i).name = newName;
                System.out.println("Enter New Age:");
                int newAge = sc.nextInt();
                students.get(i).age = newAge;
                System.out.println("Enter New Marks:");
                double newMarks = sc.nextInt();
                students.get(i).marks = newMarks;
                System.out.println("Student updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
    void searchStudents(){
        System.out.println("Enter Id to Search: ");
        int idToSearch = sc.nextInt();
        for(int i = 0;i < students.size();i++){
            if(students.get(i).id == idToSearch){
                students.get(i).displaystud();
                return;
            }
        }
        System.out.println("Student not found.");
    }
    void displayAllStudents(){
        for(Student s : students){
            s.displaystud();
        }
        if(students.isEmpty())
        System.out.println("No students found.");
    }
}