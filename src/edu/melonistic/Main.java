package edu.melonistic;

public class Main {

    public static void main(String[] args) {
        final String name;
        if (0 == args.length) {
            name = ", identify yourself";
        } else {
            name = args[0];
        }
        System.out.println();
        System.out.printf("Hola %s!!!", name);
        System.out.println();
    }
}
