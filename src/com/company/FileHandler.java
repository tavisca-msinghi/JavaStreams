package com.company;

import java.io.FileNotFoundException;

public class FileHandler {
    public  static void main(String[] args){
        writeFileContents();
        readFileContents();
    }

    private static void readFileContents() {
        FileReader myFileReader =new FileReader();
        try{
            String contents = myFileReader.readFile("DataFile.txt");
            System.out.println("Contents of file is" + contents);
        }
        catch (java.io.IOException e){
            e.printStackTrace();
        }
    }

    private static void writeFileContents(){
        FileWrite myFileWriter = new FileWrite();
        String data = "Hello!! How are You";
        try{
            myFileWriter.writeFile("DataFile.txt",data);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
