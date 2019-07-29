package com.company2;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public class ConsoleReader {

    public static void main(String[] args) {
        writeToConsole("Hello");
    }

    private static void writeToConsole(String data) {
        OutputStream writer = new BufferedOutputStream(System.out);
        try(writer) {
            writer.write(data.getBytes());
        }
        catch (IOException e){
            System.out.println("Exception occured "+ e.getMessage());
            e.printStackTrace();
        }
    }
}
