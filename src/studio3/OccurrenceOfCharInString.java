package studio3;
import java.util.*;

public class OccurrenceOfCharInString {
    static void characterCount(String inputString)
    {
        // key indicates characters and indicates occurrences
    HashMap<Character, Integer> charCountMap = new HashMap<>();

    // Converting given string to char array
        char[] strArray = inputString.toCharArray();

    // checking each char of strArray
        for (char c : strArray) {
        if (charCountMap.containsKey(c)) {
            // If char is present in charCountMap, incrementing its count by 1
            charCountMap.put(c, charCountMap.get(c) + 1);
        }
        else {
            charCountMap.put(c, 1);
        }
    }
        System.out.println(inputString +" : "+charCountMap);
        //for (Map.Entry entry : charCountMap.entrySet()) {
        //System.out.println(entry.getKey() + " " + entry.getValue());
    //}
}
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = input.next();
        characterCount(str);
    }
}

