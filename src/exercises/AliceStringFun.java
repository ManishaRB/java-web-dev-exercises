package exercises;

import java.util.Scanner;

public class AliceStringFun {
    public static void main (String args[]) {
        String playStr = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book," +
                "' thought Alice 'without pictures or conversation?'";
        String searchFor;
        Scanner input = new Scanner(System.in);

        System.out.println("Which String you want to search : ");
        searchFor = input.next();

        if(playStr.contains(searchFor)) {
            System.out.println("Found the String");
        } else {
            System.out.println("String not present");
        }
        //index of the input string
        int  idx = playStr.indexOf(searchFor);
        System.out.println("User entered " + searchFor + ". Which is found at index " + idx +
        " It's length is : " +searchFor.length());
        //prints new string without entered word
        playStr = playStr.replaceAll(searchFor,"");
        System.out.println(playStr);
    }
}
