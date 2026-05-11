import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SMS sms = new SMS();
        while (true) {
            System.out.println("1. Add Students");
            System.out.println("2. Remove Students");
            System.out.println("3. Update Students");
            System.out.println("4. Search Students");
            System.out.println("5. Display all Students");
            System.out.println("6.Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sms.addStudents();
                    System.out.println();
                    break;
                case 2:
                    sms.removeStudents();
                    System.out.println();
                    break;
                case 3 :
                    sms.updateStudents();
                    System.out.println();
                    break;
                case 4:
                    sms.searchStudents();
                    System.out.println();
                    break;
                case 5:
                    sms.displayAllStudents();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Exiting..."); 
                    System.out.println();
                    return;       
                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println();
            }
        
        }
    }    
}
