package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file1 = new File("FirstFile.txt");
        File file2 = new File("SecondFile.txt");
        try {
            PrintWriter write = new PrintWriter(new FileWriter(file1));
            write.print(123);
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            PrintWriter write = new PrintWriter(new FileWriter(file2));
            write.print(123);
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Scanner f1 = new Scanner(file1);
            Scanner f2 = new Scanner(file2);
            while(f1.hasNext() && f2.hasNext()) {
                if (f1.next().equals(f2.next())) {
                    System.out.println(f1.next());
                }
            }
            f1.close();
            f2.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Таких файлов не найдено");
        }
    }
}
