package gitBranches;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter("data.txt", true));
            printWriter.println("Hello world!");

            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();


        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            String linia;
            int licznik =0;

            while ((linia = reader.readLine()) != null) {
//                String[] slowa = linia.split("%==%");
//                System.out.println(slowa[1]);
                licznik++;
            }

            System.out.println("liczba linni " + licznik );
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();




        }

    }
}
