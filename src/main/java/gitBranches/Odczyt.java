package gitBranches;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Odczyt {
    public int Odczyt2(){
        int licznik = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            String linia;


            while ((linia = reader.readLine()) != null) {
//                String[] slowa = linia.split("%==%");
//                System.out.println(slowa[1]);
                licznik++;
            }

            System.out.println("liczba linni " + licznik);
            reader.close();

        } catch (
                IOException e) {
            e.printStackTrace();


        }
        return licznik;

    }
}

