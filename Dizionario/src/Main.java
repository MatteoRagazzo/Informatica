import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            File inFile=new File("words.txt");
            Scanner reader=new Scanner(inFile);
            AlberoBinarioRicerca<String> dizionario=new AlberoBinarioRicerca<String>(reader.nextLine());
            while(reader.hasNextLine()){
                dizionario.add(reader.nextLine());
            }
            AlberoBinarioRicerca.visitaSimmetrica(dizionario);
        } catch(Exception e){
            System.err.println("File not found");
        }
    }
}
