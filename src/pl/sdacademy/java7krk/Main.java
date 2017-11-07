package pl.sdacademy.java7krk;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<String>();

        for (int i = 0; i < 4; i++) {


            System.out.println("podaj imiona");
            String imiona = scanner.nextLine();
            list.add(imiona);
        }

        List<String > fefe = WordsMixer.mixWords(list);
        System.out.println(fefe);


    }
}
