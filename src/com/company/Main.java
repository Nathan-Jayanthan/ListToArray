package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] stuff = {"babies", "watermelong", "melons", "fudge"};
        LinkedList<String> theList = new LinkedList<String>(Arrays.asList(stuff));

        theList.add("pumpkin");
        theList.addFirst("firstthing");

        //convert back to an array
        stuff = theList.toArray(new String[theList.size()]);

        for(String x : stuff){
            System.out.printf("%s ", x);
        }
    }
}
