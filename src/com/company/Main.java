package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String num = "89209570746";
        System.out.println(Arrays.toString(getNum(num)));
    }

    public static String[] getNum(String tNum) {
        String phone = tNum;
        boolean test7 = phone.contains("+7");
        boolean testBr = phone.contains("(");
        boolean testBr2 = phone.contains(")");
        boolean testSp = phone.contains(" ");

        String b = "";
        String c = "";
        String d = "";
        String e = "";
        String f = "";

        if (test7||testBr||testBr2||testSp==true){
            f = "";
        } else {
            f = "не было изменений";
        }

        if (test7 == true) {
            b = "замена +7 на 8;";
        } else {
            b = "";
        }
        if (testBr == true) {
            c = "есть открывающие скобки;";
        } else {
            c = "";
        }
        if (testBr2) {
            d = "есть закрывающие скобки;";
        } else {
            d = "";
        }
        if (testSp == true) {
            e = "есть пробелы;";
        } else {
            e = "";
        }

        String q = b + c + d + e + f;

        phone = phone.replace("+7", "8");
        phone = phone.replaceAll("[() ]", "");

        String x;
        if (phone.length() == 11) {
            x = phone;
        } else {
            x = "Введен некорректный номер";
        }


        String[] out = {x, q};
        return out;

    }

}
