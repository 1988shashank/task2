package com.test;

import javax.swing.*;

public class stringreverse {
   public static void main(String args[]) {
       StringBuilder sb = new StringBuilder("This is Nithya");
       StringBuilder b = new StringBuilder();
       System.out.println(sb);
        for(int i=sb.length()-1; i>=0; i--){
            b.append(sb.charAt(i));
        }
       System.out.println(b);
    }

}
