package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class palindrome_coll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string to check: ");
        String s=sc.next();

        String reve="";

        for(int i=s.length()-1;i>=0;i--)
        {
            reve=reve+s.charAt(i);
        }
       if(s.equalsIgnoreCase(reve))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not");
        }
    }
}

