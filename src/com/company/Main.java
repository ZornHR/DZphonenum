package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String num = "89209570746";
        System.out.println(Arrays.toString(getNum(num)));
    }

    public static String[] getNum(String tNum) {
        String phone = tNum;
        boolean test7 = phone.startsWith("+7");
        boolean testBr = phone.contains("(");
        boolean testBr2 = phone.contains(")");
        boolean testSp = phone.contains(" ");

        String q = "не было изменений;";

        if (test7 || testBr || testBr2 || testSp) {
            q = "";
        }

        if (test7) {
            q += "замена +7 на 8;";
            phone = "8" + phone.substring(2);
        }
        if (testBr) {
            q += "есть открывающие скобки;";
        }
        if (testBr2) {
            q += "есть закрывающие скобки;";
        }
        if (testSp) {
            q += "есть пробелы;";
        }

        phone = phone.replaceAll("[() ]", "");

        String x;
        if (phone.length() == 11) {
            x = phone;
        } else {
            x = "Введен некорректный номер";
            q += "количество символов не равно 11;";
        }
        q = q.substring(0, q.length() - 1);


        String[] out = {x, q};
        return out;

    }

}
