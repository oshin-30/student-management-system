class Student{
    int id;
    String name;
    int age;
    double marks;
    Student(int id, String name, int age, double marks){
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    void displaystud(){
        System.out.println("----------------------------");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------------");
    }

}