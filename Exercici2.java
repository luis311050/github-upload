package com.company;
import java.io.*;
import java.util.Scanner;

public class Exercici2 {

        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            System.out.println("introdueix el nom del fitxer o ruta del fitxer");
            String name = sc.nextLine();

            FileReader f = new FileReader(name);
            String cadena;

            BufferedReader b = new BufferedReader(f);
            while((cadena = b.readLine())!=null) {
                System.out.println(cadena);
            }
            b.close();
        }
    }

