package com.tts;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	AnotherClass <Integer, String> myClass = new AnotherClass <> (12, "Hello");
	int numVal = (int) myClass.getThingOne();
	String strVal= (String) myClass.getThingTwo();
        System.out.println("Printing everything");
        System.out.println("numVal" + numVal);
        System.out.println("strVal" + strVal);

        Set<String> newSet = new HashSet<>();
        newSet.add("One");
        newSet.add("Two");
        newSet.add("Java");

        Set<String> newSet2 = new HashSet<>();
        newSet2.add("One");
        newSet2.add("Two");
        newSet2.add("Spring");

        Set<String> setResult = printStuff(newSet, newSet2);
        for (String s : setResult){
            System.out.println(s);
        }
    }

    public static <E>Set<E> printStuff(Set<E> setOne, Set<E> setTwo){
        Set<E> result = new HashSet<>(setOne);
        result.addAll(setTwo);
        return result;
    }
}
