package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        String start="";
        String temp ="";
        while(scan.hasNextLine()){
           temp = scan.nextLine();;
           if(temp.length()>start.length()){
               start=temp;
           }
        }

        scan.close();

       System.out.println("Int: " + start);
    }
}
