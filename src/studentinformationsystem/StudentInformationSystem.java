
package studentinformationsystem;

public class StudentInformationSystem {
    public static void main(String[] args) {
        System.out.println("=== Student Information System ===");
        System.out.println("Name: Nur Alia Husna binti Fauzi");
        System.out.println("Student ID: S85248");
        System.out.println("Programme: Bachelor of Computer Science (Software Engineering)");
        
        int mark1 = 42;
        int mark2 = 45;
        int total = mark1 + mark2;

        System.out.println("Total Mark: " + total);

        if (total >= 80) {
            System.out.println("Result: Excellent");
        } else if (total >= 50) {
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Needs Improvement");
        }
    
    }
    
}
