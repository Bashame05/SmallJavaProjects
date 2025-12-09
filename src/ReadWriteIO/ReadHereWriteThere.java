package ReadWriteIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadHereWriteThere {
    public static void main(String[] args) {
        readFile();
    }

    private static void readFile() {
        Path path = Paths.get("read.txt");
        try(BufferedReader reader = Files.newBufferedReader(path)){
            String line;
            while((line = reader.readLine()) != null){
                writeFile(line);
            }
        } catch (IOException e) {
            System.out.println("Specified file not found"+e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }


    private static void writeFile(String line ) {
        Path path = Paths.get("write.txt");
        try(BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.APPEND)){
            writer.write(line+"\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
