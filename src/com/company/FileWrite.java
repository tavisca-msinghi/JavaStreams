package com.company;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.System.out;

public class FileWrite {
    public void writeFile(String fileName, String data) throws FileNotFoundException{
        FileOutputStream writer = new FileOutputStream(fileName);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(writer);
        try (bufferedOutputStream) {
            writer.write(data.getBytes());
        }
        catch (IOException e){
            out.println("Exception "+e.getMessage());
        }
    }
}
