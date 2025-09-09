package com.java.T_FileHandlingandStreams.Streams.ByteStreams;

import java.io.*;

public class ByteStreams {

    public static void main(String[] args) {

    }

    public static void input_stream() throws IOException {
        File newfile = new File("testfile.txt");
        FileInputStream inputstream = new FileInputStream(newfile);
        inputstream.read();
        inputstream.close();
    }

    public static void output_stream() throws IOException{
        File newfile = new File("testfile.txt");
        FileOutputStream outputstream = new FileOutputStream(newfile);
        outputstream.write(0);
        outputstream.close();
    }
}
