package com.java.T_FileHandlingandStreams.Files;

import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        // the below line dosen't mean that actually we are creating a new file in th disk, it is just creating a reference in JVM.
        File newfile = new File("testfile.txt");

        // the below line will actually create new file in disk.
        if(newfile.createNewFile()){
            System.out.println("File Created: " + newfile.getName());
        }
        else {
            System.out.println("File already exists");
        }
        System.out.println("Path: " + newfile.getAbsolutePath());
        System.out.println("Path: " + newfile.getCanonicalPath());
        System.out.println("Path: " + newfile.getAbsoluteFile());
        System.out.println("Size: " + newfile.length() + "bytes");
    }

}
