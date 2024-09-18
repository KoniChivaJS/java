import java.util.*;

public class Main {
    public static <T> Collection<T> getUniqueElements(List<T> list) {
        Set<T> uniqueSet = new HashSet<>(list);
        return uniqueSet;
    }

    public static <T> Map<T, Integer> countElement(List<T> list) {
        Map<T, Integer> elementsMap = new HashMap<>();
        for (T element : list) {
            elementsMap.put(element, elementsMap.getOrDefault(element, 0) + 1);
        }
        return elementsMap;
    }

    public static void main(String[] args) {
        List<String> items = Arrays.asList("eduard", "alek", "eduard", "kolya", "kolya", "eduard");

        Collection<String> uniqueItems = getUniqueElements(items);
        System.out.println("Unique elements: " + uniqueItems);

        Map<String, Integer> occurrences = countElement(items);
        System.out.println("Occurrences: " + occurrences);
    }
}