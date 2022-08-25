package Lesson0822Interfaces.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetInterfaceExample {
    public static void main(String[] args) {

        //HashSet
        //example 1
        //set nelaiko eiliskumo
        HashSet<String> names = new HashSet<>();
        //Adding elements
        names.add("Bob");
        names.add("Anna");
        names.add("Liam");
        //print all elements
        System.out.println(names);

        //remove
        names.remove("Bob");
        System.out.println(names);

        //size
        System.out.println(names.size());

        //contains some of value
        System.out.println(names.contains("Liam"));
        System.out.println(names.contains("Bob"));

        //Iterate
        for(String str: names){
            System.out.println(str);
        }

        //Create Iterator object, kad astpausdintu visus elementus
        Iterator<String> i = names.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + " ");
        }
        System.out.println();

        //HashSet example2

        HashSet<Integer> intSet1 = new HashSet<Integer>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(3);
        intSet1.add(4);

        System.out.println("insSet1: " + intSet1);

        HashSet<Integer> intSet2 = new HashSet<Integer>();
        intSet2.add(3);
        intSet2.add(4);
        intSet2.add(5);
        intSet2.add(6);

        System.out.println("intSet2: " + intSet2);

        //Find union - combine all elements
        HashSet<Integer> union = new HashSet<>(intSet1);
        System.out.println("union: " + union);
        //idedam antro set elementus
        //3, 4 neprideda, nes kartojasi
        union.addAll(intSet2);
        System.out.println("union: " + union);

        //Find intersection - suranda vienodus elementus set'uose
        HashSet<Integer> intersection = new HashSet<>(intSet1);
        intersection.retainAll(intSet2);
        System.out.println("intersection: " + intersection);

        //Find difference - randa skirtingus elementus, kurie nesikartoja vienoje ar kitoje puseje
        HashSet<Integer> difference = new HashSet<>(intSet1);
        difference.removeAll(intSet2);
        System.out.println("difference: " + difference);

        //LinkedHasSet - islaiko eiliskuma
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Latvia");
        linkedHashSet.add("Lithuania");
        linkedHashSet.add("Sweden");

        System.out.println(linkedHashSet);

        //remove elements
        linkedHashSet.remove("Latvia");
        System.out.println(linkedHashSet);
    }
}
