package infomanga;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utilisateur {

    private Manga manga;
    
    public void comparer() throws IOException {
        String file;
        try ( BufferedReader br = new BufferedReader(new FileReader("liste.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // process the line.
                System.out.println(line);

            }
        }
    }
}
      