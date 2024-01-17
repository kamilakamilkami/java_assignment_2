package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import main.models.AbstractPerson;
import main.models.Employee;
import main.models.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Kamila", "Nurlybayeva", 2.5);
        Student s2 = new Student("Alima", "Kasenkazy", 3.5);
        Employee e1 = new Employee("Nursultan", "Khaimuldin", "Programmer", 2500000);
        Employee e2 = new Employee("Askar", "Khaimuldin", "Programmer", 2000000);
        ArrayList<AbstractPerson> people = new ArrayList<>();
        people.add(s1);
        people.add(s2);
        people.add(e1);
        people.add(e2);
        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<AbstractPerson> people){
        for(AbstractPerson person: people){
            printPersonInfo(person);
        }
    }

    public static void printPersonInfo(AbstractPerson person){
        System.out.println(person.toString() + " earns " + person.getPaymentAmount());
    }
}