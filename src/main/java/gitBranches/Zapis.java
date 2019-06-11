package gitBranches;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Zapis {
    public void ponownieZapisuje() {
        {
            try {
                PrintWriter printWriter = new PrintWriter(new FileWriter("data.txt", true));
//<<<<<<<HEAD
                printWriter.println("Hello world!");

                printWriter.close();
            } catch (
                    IOException e) {
                e.printStackTrace();
//=======

                //           printWriter.println("Hello world!");
//>>>>>>>plik_zapis

//            printWriter.close();
                //       } catch (
                //               IOException e) {
                //           e.printStackTrace();
            }
        }
    }
}

