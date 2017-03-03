package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        System.out.println(Arrays.toString(args));
        switch (args[0]){
            case "-c":
                if(args[2].compareTo("м")==0){
                   SimpleDateFormat parseDate = new SimpleDateFormat("dd/MM/yyyy");
                   try {
                       Person newMen = Person.createMale(args[1], parseDate.parse(args[3]));
                       allPeople.add(newMen);
                       System.out.println(allPeople.indexOf(newMen));
                   }
                   catch (ParseException e) {
                       System.out.println("Catch Parse Exception");
                   }
                }
                else if(args[2].compareTo("ж")==0){
                    SimpleDateFormat parseDate = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        Person newWomen = Person.createFemale(args[1], parseDate.parse(args[3]));
                        allPeople.add(newWomen);
                        System.out.println(allPeople.indexOf(newWomen));
                    }
                    catch (ParseException e) {
                        System.out.println("Catch Parse Exception");
                    }

                }
                break;
            case "-u":

                break;
            case "-d":
                break;
            case "-i":
                break;
            default:
        }


/*        SimpleDateFormat outDate = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        try {
            Date date = parseDate.parse(args[3]);
            System.out.println(outDate.format(date));
        }
        catch (ParseException e) {
            System.out.println("Catch PARSE EXCEPTION");
        }*/

    }
}
