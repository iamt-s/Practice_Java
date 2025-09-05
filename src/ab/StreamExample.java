package ab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Filter names that start with 'A' and collect them into a new list
        List<String> filteredNames = names.stream().filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
               

        System.out.println(filteredNames);  // Output: [Alice]

        // Convert names to uppercase and collect them into a new list
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCaseNames);  // Output: [ALICE, BOB, CHARLIE, DAVID, EVE]
    }
}
