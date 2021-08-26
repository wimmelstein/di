package nl.wimmelsoft;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePrinter extends Printer{
    @Override
    public void print(String message)  {
        try {
            Files.writeString(Path.of("out.txt"), message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
