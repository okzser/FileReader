package main;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String userHome = System.getProperty("user.home");

        try (BufferedWriter br = new BufferedWriter(new FileWriter(userHome + "/Área de Trabalho/a"))) {


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
