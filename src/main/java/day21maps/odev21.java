package day21maps;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;

public class odev21 {
    public static void main(String[] args) {
        String s = "Hello Henry!";
        s = s.replaceAll("\\p{Punct}", "");
        s = s.replaceAll(" ", "");
        System.out.println(s);
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            characters.add(s.charAt(i));
        }
        System.out.println(characters);

        HashMap<Character, Integer> result = new HashMap<>();

        for (Character w : characters) {
            Integer ocr = result.get(w);
            if (ocr == null) {
                result.put(w, 1);
            } else {
                result.replace(w, ocr + 1);
            }
        }
        System.out.println(result);
    }
}