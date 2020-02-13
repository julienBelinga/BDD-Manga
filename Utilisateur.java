package infomanga;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utilisateur {

    private Manga manga;
    private String tabReader[];

    public void lire() throws IOException {
        String file;
        try (BufferedReader br = new BufferedReader(new FileReader("liste.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {

                System.out.println(line);
                for (int i = 0; i < 7; i++) {
                    tabReader[i] = line;
                }
                
                int annee = Integer.parseInt(tabReader[4]);
                int nbTome = Integer.parseInt(tabReader[5]);
                
                tabReader[0] = manga.getTitre();
                tabReader[1] = manga.getEditeur();
                tabReader[2] = manga.getGenre();
                tabReader[3] = manga.getAuteur();
                                            
            }
        }
    }
}
