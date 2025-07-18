package ru.netology;

import java.util.*;

public class PhoneBook{
    private  Map<String, String> nameNumber = new HashMap<>();
    private  Map<String, String> numberName = new HashMap<>();
    public int add(String name, String number) {
        if(!nameNumber.containsKey(name)){
            nameNumber.put(name, number);
            if(!numberName.containsKey(number)){
                numberName.put(number, name);
            }
        }
        return numberName.size();
    }

    public String findByNumber(String number) {
        return numberName.getOrDefault(number, null);
    }

    public String printAllNames() {
            TreeSet<String> sortedNames = new TreeSet<>(nameNumber.keySet());
            return String.join("\n", sortedNames);
    }
}
