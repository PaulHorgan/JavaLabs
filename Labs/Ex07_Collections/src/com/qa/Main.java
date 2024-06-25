package com.qa;
import java.util.Map.*;
import com.qa.model.Animal;
import com.qa.model.Cat;
import com.qa.model.Dog;
import com.qa.model.Rabbit;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog("Alba", 1);
        Cat c1 = new Cat("Garfield", 2);
        Rabbit r1 = new Rabbit("Buggs", 49);
        Rabbit r2 = new Rabbit("Roger", 73);
        Cat a1 = new Cat("Lion-o", 49);
        System.out.println("Animal List");
        ArrayList<Animal> animalList = new ArrayList<>();
            animalList.add(c1);
        animalList.add(d1);
        animalList.add(r1);
        animalList.add(r2);
        animalList.add(a1);

        for(int i =0; i<animalList.size();  i++ ){
            System.out.println(animalList.get(i));
        }

        System.out.println("Cat List");
    List<Cat> catList = new ArrayList<>();
        catList.add(c1);
        catList.add(a1);
      //  catList.add(d1);

        for(int i =0; i<catList.size();  i++ ){
            System.out.println(catList.get(i));
        }



        Map<String, Animal> animalMap = new HashMap<>();

        animalMap.put(c1.getName(), c1);
        animalMap.put(a1.getName(), a1);
        animalMap.put(d1.getName(), d1);
        animalMap.put(r1.getName(), r1);
        animalMap.put(r2.getName(), r2);

        Map<Animal, String> animalMap2 = new HashMap<>();

        animalMap2.put(c1, "Doesnt Like Mondays");
        animalMap2.put(a1, "Lion-O is the leader and the hereditary 'Lord of the ThunderCats'.");
        animalMap2.put(d1, "The Bean, The Wean, the random little Spleen");
        animalMap2.put(r1, "What's up Doc?");
        animalMap2.put(r2, "Who Framed Me?");

        System.out.println("Animal Map 1");
        for(Entry<String, Animal> s : animalMap.entrySet()){
            System.out.println(s);
        }
        System.out.println("Animal Map 2");
        for(Entry<Animal, String> s : animalMap2.entrySet()){
            System.out.println(s);
        }

    }

}
