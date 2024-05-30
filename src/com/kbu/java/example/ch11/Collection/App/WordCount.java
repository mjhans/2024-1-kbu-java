package com.kbu.java.example.ch11.Collection.App;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Set;

public class WordCount {
    private static HashMap<String, Integer> wordMap = new HashMap<String, Integer>();

    static void addWords(String[] words){        
        for(String word : words){
            if (wordMap.containsKey(word)){
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }
    }

    static void wordCount(String filePath){
        try (FileReader fr = new FileReader(filePath, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(fr)
        ){
            String line;
            while ((line = br.readLine()) != null){
                String str = line.replaceAll("[^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9 ]", "");
                String[] words = str.split(" ");
                addWords(words);
            }
        }catch (Exception e){
                e.printStackTrace();
            }
    }
    static void printMap(){
        Set<String> keySets = wordMap.keySet();
        for(String key : keySets){
            System.out.printf("word : %s, count: %d\n", key, wordMap.get(key));
        }
    }

    public static void main(String[] args){

        long start = System.currentTimeMillis();
        wordCount("/Users/mjhans/workspaces/personal/java_lecture/java-programming/src/com/kbu/java/File/TextFiles/Lorem.txt");
        long end = System.currentTimeMillis();
        System.out.printf("fileReaderCopy elapsed time : %s \n", (end - start));
        printMap();

    }
}
