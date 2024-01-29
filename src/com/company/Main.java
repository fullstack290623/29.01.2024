package com.company;

public class Main {

    static int number2;

    private static void changeName(Person p, String newName) { // #50
        p = new Person(1, "moshe", "cohen"); //#80
        p.setLname(newName);
        p.setId(100);
    }

    private static void chaneNumber(int number, int newValue) {
        number = newValue;
        number2++;
    }

    private static void chaneInArray(int[] arr) {
        arr[0] = 100;
    }

    public static void main(String[] args) {

        Person p = new Person(1, "moshe", "cohen"); //#50
        System.out.println(p);

        int[] arr = { 1, 2, 3}; // [1, 2, 3]
        String[] words = {"I", "Love", "Java"};

        //                   0      1     2  3
        Object[] whatever = {"123", true, 1, p}; // ["123", true, 1, p]
        System.out.println(whatever[0]);
        if (whatever[0].getClass() == Person.class) {
            ((Person) whatever[0]).setLname("danny");
        }
        if (whatever[0] instanceof Boolean) {

        }
        if (whatever[0].getClass().equals(boolean.class)) {

        }

        changeName( p , "david");

        System.out.println( p );

        int number = 10;
        System.out.println(number);
        chaneNumber(number, 100);
        System.out.println(number); // 10

    }
}
