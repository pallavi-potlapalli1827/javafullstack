import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

 class StudentHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        HashMap<Integer, String> studentMap = new HashMap<>();

      
        System.out.print("How many students do you want to enter? ");
        int count = scanner.nextInt();
        scanner.nextLine();


        for (int i = 1; i <= count; i++)
 {
            System.out.print("Enter student ID for student " + i + ": ");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter name for student ID " + id + ": ");
            String name = scanner.nextLine();

            studentMap.put(id, name);
        }

       
        System.out.println("\nStored Student Records:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) 
{
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }


        System.out.print("\nEnter a student ID to search for the name: ");
        int searchId = scanner.nextInt();
        if (studentMap.containsKey(searchId)) 
{
            System.out.println("Name of student with ID " + searchId + ": " + studentMap.get(searchId));
        } else
 {
            System.out.println("Student ID not found.");
        }

        scanner.close();
    }
}
