import java.util.*;
class StringExfreqcy {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("A QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
        String ab = sb.toString();
        HashSet<Character> hs = new HashSet<>();
        for (int j = 0; j < ab.length(); j++) {
            char c =Character.toLowerCase(ab.charAt(j));
            if (c >= 'a' && c <= 'z') {
               hs.add(c);
            }
        }
        boolean Present = true;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!hs.contains(ch)) {
               Present = false;
                break;
            }
        }
        if (Present) {
            System.out.println("present.");
        } 
        else {
            System.out.println("Not present.");
        }
    }
}