package com.manish.ds.linkedList;

public class App {
    public static void main(String[] args) {
       /* List<Integer> list = new LinkedList<>();
        list.insert(10);
        list.insert(-2);
        list.insert(3);
        list.insert(100);

        list.remove(10);
        list.remove(100);*/

       List<Person> personList = new LinkedList<>();
       personList.insert(new Person("john",10));
       personList.insert(new Person("doe",22));
       personList.insert(new Person("Lily",12));
       personList.insert(new Person("Shiva",100));
        System.out.println(personList.size());
        personList.travserseList();


    }
}
