package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(generateString(3, 6));
        ArrayList<LinkedList<String>> bigBox = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            LinkedList<String> smallBox = new LinkedList<>();
            for (int j = 0; j < 5; j++)
                smallBox.add(generateString(3, 6));
            bigBox.add(smallBox);

        }
        bigBox.get(2).set(3,"elem");


        LinkedList<String>box=new LinkedList<>();
        for (int i = 0; i <5 ; i++) {
            box.add("s");


        }
                bigBox.set(2,box);


        for (LinkedList<String> smallBox : bigBox) {
            for (String s : smallBox)
                System.out.print(s + " ");
            System.out.println();
        }
    }


    public static String generateString(int minCount, int maxCount) {
        Random random = new Random();
        int count = random.nextInt(maxCount - minCount) + minCount;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            char c = (char) (random.nextInt((int) 'z' - (int) 'a') + 'a');
            sb.append(c);
        }
        int b = random.nextInt(10);
        sb.append(b);

        return sb.toString();
    }
}
