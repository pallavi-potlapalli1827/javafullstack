import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NameFileIO
 {
    public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

      
        System.out.print("How many names do you want to enter? ");
        int count = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < count; i++)
 {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            names.add(name);
        }

        try {
            FileWriter writer = new FileWriter("names.txt");
            for (String name : names) {
                writer.write(name + "\n");
            }
            writer.close();
            System.out.println("\nNames saved to 'names.txt'.");
        } catch (IOException e)
 {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }


        System.out.println("\nNames read from file:");
        try {
            File file = new File("names.txt");
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }

            fileReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
