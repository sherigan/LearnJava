package com.company;

public class Main {

    public static void main(String[] args) {
        //1
        String a = "kek W";
        final int num = 10;
        if (num > 0) {
            System.out.println(num);
        }

        String word = "wee";
        System.out.println(a + num + word);

        //2
        short age = 26;
        short temp = 18;

        if (age >= 20 && age <= 45 && temp >= -20 && temp >= 30) {
            System.out.println("Можно идти гулять");
        }
        if (age > 20 && temp == 0 && temp >= 28) {
            System.out.println("Можно идти гулять");
        }
        if (age > 45 && temp == -10 && temp >= 25) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
        }

        printAll();


        //3
        array new a []
    }

    public static void printAll(){
        System.out.println("вывод метода принтОл");
    }

    public static void test(){

    }

}


