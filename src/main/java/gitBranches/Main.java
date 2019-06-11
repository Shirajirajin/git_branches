package gitBranches;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter("data.txt", true));

            printWriter.println("Hello world!");

            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
