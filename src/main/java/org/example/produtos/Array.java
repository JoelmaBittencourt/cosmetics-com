package org.example.produtos;


public class Array {
    public static void main(String[] args) {
        String a = "a";
        String b = "a";
        String c = "a";
        String d = "a";
        String e = "a";
        String f = "a";
        String g = "a";

        String[] listString = new String[20];
        String[] temp;
        listString[0] = "a";
        listString[1] = "b";
        listString[2] = "c";
        listString[3] = "d";
        listString[4] = "e";


        System.out.println("Letra correspondente a a 0 é " + listString[0]);
        System.out.println("O tamanho do array é " + listString.length);
    }

}