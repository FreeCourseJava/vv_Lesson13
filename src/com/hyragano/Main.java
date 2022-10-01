package com.hyragano;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Street street1 = new Street("Lenin", 1000, 1000);
        Street street2 = new Street("Gagarin", 1000, 1000);
        Street street3 = new Street("Nazarbayev", 1000, 1000);


//        Dictionary<String, Street> streets = new DictionaryArrayBased<>();
        Dictionary<String, Street> streets = new DictionaryHashTable<>(5);


        streets.put("AaAa", street1);
        streets.put( "BBAa", street2);
        streets.put("Three", street3);


        Street foundCity = streets.get("AaAa");
        System.out.println(foundCity);


        Street smth = new Street("Smth", 100, 100);
        streets.put("AaAa", smth);

        System.out.println(streets.get("AaAa"));


        System.out.println(streets.get("BBAa"));

        System.out.println(streets);

//
//
//
//
//
//
//
//
//        var strings = new String[10];
//
//
//        String string1 = "str1";
//
//        int str1Index = getIndex(strings, string1.hashCode());
//
//        strings[str1Index] = string1;
//
//
//
//        String string2 = "str2";
//
//
//        int str2Index = getIndex(strings, string2.hashCode());
//
//        strings[str2Index] = string2;
//
//        System.out.println(Arrays.toString(strings));
//
//
//        var index = getIndex(strings, "str2".hashCode());
//        System.out.println(strings[index]);
//
//        System.out.println("AaAa".hashCode());
//        System.out.println("BBBB".hashCode());
//        System.out.println("AaBB".hashCode());
//        System.out.println("BBAa".hashCode());
//
//
//        System.out.println("AaAa".equals("BBBB"));
//
//
    }
//
//    private static int getIndex(String[] ints, int someInt) {
//        return ints.length - 1  & someInt;
//    }
}
