package com.java.T_FileHandlingandStreams.Streams.CharStreams;

import java.io.*;

public class CharStreams {
    public static void main(String[] args) throws IOException {
    writer();
    }
    public static void reader() throws IOException {
        File newfile = new File("testfile.txt");
        newfile.createNewFile();
        FileReader reader = new FileReader(newfile);
        reader.read();
    }
    public static void writer() throws IOException {
        File newfile = new File("testfile.txt");
        FileWriter writer = new FileWriter(newfile);
        writer.write(0);
    }
}
