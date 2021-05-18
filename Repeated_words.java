package com.repeated_words;


import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Repeated_words {


    public static void main(String[] args) throws Exception {
        String  word = "";
        int count = 0, maxCount = 0;
        ArrayList<String> words = new ArrayList<String>();

        FileInputStream fis=new FileInputStream("/Users/santhosh/Desktop/santro");
        Scanner sc=new Scanner(fis);

        while(sc.hasNextLine())
        {
            String line = sc.nextLine();                   // reading from the file and stored in list
            words.add(line);
        }



                                                         //Determine the most repeated word in a list
        for(int i = 0; i < words.size(); i++){
            count = 1;

            for(int j = i+1; j < words.size(); j++){
                if(words.get(i).equals(words.get(j))){
                    count++;
                }
            }

            if(count > maxCount){
                maxCount = count;
                word = words.get(i);
            }
        }

        System.out.println("Most repeated word: " + word);
        sc.close();
    }
}
