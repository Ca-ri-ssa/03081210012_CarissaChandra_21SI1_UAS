//Name       : Carissa Chandra
//Student ID : 03081210012
//Penjelasan : class baru untuk soal no.3

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BacaSimpanFile {

    public static void main(String[] args) {
        
        String fileName = "src/Barang.java" ;
        
        try {
            File myFile = new File(fileName);
            Scanner fileReader = new Scanner(myFile);
            
            while(fileReader.hasNextLine()){
                String data = fileReader.nextLine();
                System.out.println(data);
            }
            
        }catch (FileNotFoundException e){
            System.out.println("Terjadi Kesalahan: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
