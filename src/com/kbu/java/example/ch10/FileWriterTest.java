package com.kbu.java.example.ch10;

import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

public class FileWriterTest {
    public static void writeFile(String filePath){
        try(FileWriter fw = new FileWriter(filePath, StandardCharsets.UTF_8, true)){
            //fw.flush();
            System.out.printf("**** start: [%s] \n", filePath);
            for (int i = 0 ; i < 10 ; i++){
                String msg = String.format("5 * %d = %d \n", i, (5 * i));
                fw.write(msg);
            }
            //fw.flush();

            fw.write('A');
            fw.write("65");
            char buf[] = {'A', 'B', 'c'};
            fw.write(buf);
            fw.write(3);
            fw.write("안녕하세요");
            fw.write("\n");
            fw.flush();
            System.out.println("**** end!!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        
        writeFile("/Users/mjhans/workspaces/personal/2024-1-kbu-java/src/com/kbu/java/example/ch10/WriteSample01.txt");

    }
}
