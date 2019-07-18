package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        ArrayList<Character> chars = new ArrayList<>();
        for (char c : s.toCharArray()) {
            chars.add(c);
        }
        int j = 0;
        while (chars.size() != 0 && j < 40) {

            for (Character aChar : chars) {
                System.out.print(aChar);
            }
            chars.remove(0);
//            System.out.print("номер строки" + j);
            j++;
            System.out.println();
        }
        //напишите тут ваш код
    }
}
