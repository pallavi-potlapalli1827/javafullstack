import java.io.*;
import java.util.Scanner;
class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        
        if (sc.hasNextLine()) {
          
            
            String s = sc.nextLine();
            
            
            StringBuilder res = new StringBuilder();

            
            for (int i = s.length() - 1; i >= 0; i--) {
                
               
                res.append(s.charAt(i));
            }


            System.out.println(res.toString());
        } else {
            System.out.println("No input provided.");
        }
        
        sc.close();      }
}