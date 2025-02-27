import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GetUniqueRecords {

    public static List<String> getUniqueRecords(List<String> strings) {
        // Use a HashSet to remove duplicates
        Set<String> uniqueStrings = new HashSet<>(strings);
        // Convert the set back to a list
        return new ArrayList<>(uniqueStrings);
    }

    public static void main(String[] args) {
        System.out.println("hello");
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("apple");
        strings.add("orange");
        strings.add("banana");
        strings.add("pear");

        List<String> uniqueRecords = getUniqueRecords(strings);
        System.out.println("Unique records: " + uniqueRecords);
    }
}
