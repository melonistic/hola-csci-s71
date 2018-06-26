package edu.melonistic;

public class Main {

    public static void main(String[] args) {
        String name = args[0];
        if (null == name) {
            name = ", identify";
        }
        System.out.printf("Hola %s!!!", args[0]);
    }
}
