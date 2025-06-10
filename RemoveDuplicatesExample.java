import java.util.*;

public class RemoveDuplicatesExample {
    public static void main(String[] args) {
        List<String> originalList = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");

        List<String> result1 = removeUsingLinkedHashSet(originalList);
        System.out.println("Using LinkedHashSet: " + result1);

        List<String> result2 = removeUsingContains(originalList);
        System.out.println("Using contains() check: " + result2);
    }

    static List<String> removeUsingLinkedHashSet(List<String> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    static List<String> removeUsingContains(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String item : list) {
            if (!result.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
