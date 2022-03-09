import java.util.*;

public class Main {
    public static void main(String[] args) {
        countString("TESTE");
    }

    public static void countString(String s) {
        Map<String, Integer> countChar = new HashMap<>();
        for (char c : s.toCharArray()) {
            Integer valueMap = countChar.get(String.valueOf(c));
            countChar.put(String.valueOf(c), valueMap == null ? 1: ++valueMap);
        }
        countChar.forEach((key, value) -> System.out.print(value + key));
    }

}
