package com.random.tests;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Student {

    String name;
    int age;
    char gender;

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static void main(String[] args) {

        Student s1 = new Student("James", 18, 'M');
        Student s2 = new Student("Marry", 20, 'F');
        Student s3 = new Student("Tom", 25, 'M');

        PriorityQueue<Student> myQueue = new PriorityQueue<>(3, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.age - o1.age;
            }
        });

        myQueue.add(s1);
        myQueue.add(s2);
        myQueue.add(s3);

        while(!myQueue.isEmpty()){
            System.out.println(myQueue.poll().name);
        }
    }

}
