package com.company;
//Write a program to find the least number of coins required for a number with 1, 3 and 5 coins.
public class E2 {

    public static void main(String... args){
        int[] coins= new int[]{1,3,5};
        int value = 138;
        int count=0;
        System.out.print("value: "+value);
            for(int i=2;i>=0;i--) {
                int temp = value/coins[i];
                if(temp>0){
                    value-= coins[i]*temp;
                    count+= temp;
                }
            }
        System.out.println(", count: "+count);
    }
}
