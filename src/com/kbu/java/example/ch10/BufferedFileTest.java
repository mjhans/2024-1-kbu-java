package com.kbu.java.example.ch10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

public class BufferedFileTest {
    static String fileDIR = "/Users/mjhans/workspaces/personal/2024-1-kbu-java/src/com/kbu/java/example/ch10/";
    static void bufferedCopy(String filePath){
        try (FileReader fr = new FileReader(filePath, StandardCharsets.UTF_8);
            FileWriter fw = new FileWriter(fileDIR + "copy_with_buffered.txt", StandardCharsets.UTF_8, false);
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw)
        ){
            int i;
            while ((i = br.read()) != -1){
                bw.write((char)i);
            }
        }catch (Exception e){
                e.printStackTrace();
            }
    }

    static void fileReaderCopy(String filePath){
        try(FileReader fr = new FileReader(filePath, StandardCharsets.UTF_8);
            FileWriter fw = new FileWriter(fileDIR + "copy_with_filewriter.txt", StandardCharsets.UTF_8, false)){
                int i;
                while ((i = fr.read()) != -1){
                    fw.write((char)i);
                }
            } catch (Exception e){
                e.printStackTrace();
            }
    }

    public static void main(String[] args){

        long start = System.currentTimeMillis();
        fileReaderCopy("/Users/mjhans/workspaces/personal/2024-1-kbu-java/src/com/kbu/java/example/ch10/Lorem.txt");
        long end = System.currentTimeMillis();
        System.out.printf("fileReaderCopy elapsed time : %s \n", (end - start));


        start = System.currentTimeMillis();
        bufferedCopy("/Users/mjhans/workspaces/personal/2024-1-kbu-java/src/com/kbu/java/example/ch10/Lorem.txt");
        end = System.currentTimeMillis();
        System.out.printf("bufferedCopy elapsed time : %s \n", (end - start));
    }
}
