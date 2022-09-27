package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str;
        String text = "";

        System.out.print("Укажите расположение файла ");
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
            while ((str = br.readLine()) != null) {
                text += str;
            }

            String symbols = "Всего : " + text.length();
            String space = "Всего без пробелов " + text.replaceAll(" ", "").length();
            String words = "Всего слов в тексте " + text.split(" ").length;
            System.out.println(symbols + "\t" + space + "\t" + words);

            FileWriter fileWriter = new FileWriter("statka.txt");
            fileWriter.write(symbols + "\n");
            fileWriter.write(space + "\n");
            fileWriter.write(words + "\n");
            fileWriter.flush();
        }
        catch (Exception ex){
            ex.getMessage();
        }
    }
}

