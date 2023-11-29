package oop;

import java.util.HashMap;
import java.util.Map;

public class Collections4c {
    static Map<Integer, String> slownik = new HashMap<>();
    public static void main (String[]args) {
        slownik.put(1,"ala");
        slownik.put(2,"ma");
        slownik.put(3,"kota");
        slownik.put(5,"typu");
        slownik.put(6,"tego");
        for (int i = 1; i <= slownik.size() ; i++){
            System.out.println("Element slownika" + slownik.get(i));
        }
        slownik.put(1,"Adam");
        slownik.put(7,"As to kot Ali");
        for(int i = 1; i <= slownik.size() ; i++){
            System.out.println("Element słownika:" + slownik.get(i));
        }
    }
}
