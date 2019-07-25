package com.company;
//String reverse
public class E3 {

    public static void main(String... args){
        String test ="Hello";
        String temp ="";
        System.out.print("Before : "+test+", After: ");
        int len =test.length();

        char[] ch = test.toCharArray();
//        byte[] bytes = test.getBytes();
//        for(int i=0;i<len;i++){
//            temp +=(char)bytes[len-i-1];
//        }
        char temC;
        for(int i=0;i<len/2;i++){
            temC = ch[i];
            ch[i] =ch[len-i-1];
            ch[len-i-1] = temC;
        }


        for (char c : ch)
            System.out.print(c);

    //    System.out.print(",After : "+ch.toString());
    }
}
