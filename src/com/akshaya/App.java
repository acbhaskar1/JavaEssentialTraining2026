// File reading

package com.akshaya;

import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
       try {
           File file = new File("hello.txt");
           System.out.println("The hello.txt file exist: " + file.exists());

           try (FileReader reader = new FileReader(file);
                BufferedReader buffReader= new BufferedReader(reader)) {
               String text = buffReader.readLine();
               System.out.println(text);
           } catch (IOException e) {
               e.printStackTrace();
           }

       } catch (Exception e) {
           e.printStackTrace();
       }
        System.out.println("I am not dead YET!");
    }

}
