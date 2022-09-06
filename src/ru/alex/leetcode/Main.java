package ru.alex.leetcode;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Person person1 = new Person(10, "a");
        Person person2 = new Person(16, "b");
        Person person3 = new Person(4, "c");
        Person person4 = new Person(20, "d");
        Person person5 = new Person(25, "f");
        List<Person> list = new ArrayList<>(List.of(person1, person2, person3, person4, person5));
        list.sort((o1, o2) -> o1.age - o2.age);
        System.out.println(list);

    }


    public static class Person {
        public int age;
        public String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
