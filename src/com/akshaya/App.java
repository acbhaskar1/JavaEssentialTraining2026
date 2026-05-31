//Debugging or Exception

package com.akshaya;

public class App {
    public static void main(String[] args) throws Exception {
        try {
             String str = null;
             var extract = str.substring(1);
           } catch (Exception e) {
             e.printStackTrace();
           }
        System.out.println("I haven't dead YET! ");
    }
}


