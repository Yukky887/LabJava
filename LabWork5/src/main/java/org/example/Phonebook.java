package org.example;

import javax.lang.model.element.Name;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Phonebook
{
    private Map<String, HashSet<Integer>> phbk;

    Phonebook() {
        this.phbk = new HashMap<String, HashSet<Integer>>();
    }

    void add(String Name, Integer phone)
    {
        HashSet<Integer> numbers;

        if (phbk.containsKey(Name))
        {
            numbers = phbk.get(Name);
        } else
        {
            numbers = new HashSet<>();
        }
        numbers.add(phone);
        phbk.put(Name, numbers);
    }
    Set<Integer> get(String Name)
    {
        System.out.print(Name + " : ");
        return phbk.get(Name);
    }
}
