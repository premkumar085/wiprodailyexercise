package com.wipro.filedemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyImage {

    public static void main(String[] args) {

        String inputFileName = "d://doremon.PNG";
        String outputFileName = "d://Doremon_new.PNG";

        try {
            FileInputStream fi = new FileInputStream(inputFileName);
            FileOutputStream fo = new FileOutputStream(outputFileName);

            byte[] buffer = new byte[1024];
            int byteRead = 0;

            while ((byteRead = fi.read(buffer)) != -1) {
                fo.write(buffer, 0, byteRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
