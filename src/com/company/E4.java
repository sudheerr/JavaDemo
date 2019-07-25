package com.company;

import java.util.Arrays;

//Anagram
public class E4 {

    static int NO_OF_CHARS =256;
    public static void main(String[] args) {

        String str1="Hello";
        String str2="elloH";
        System.out.println(str1.indexOf('H'));


        System.out.println("Method1 "+method1(str1, str2));
        System.out.println("Method1 "+isAnagram(str1, str2));
        }
    // Method1 by sorting
        static boolean method1(String str1, String str2){

            if(str1.length()!=str2.length()){
                return false;
            }
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch1); Arrays.sort(ch2);
            boolean isAnagram=true;
            for(int i=0;i< str1.length();i++) {
                if(ch1[i]!=ch2[i]){
                    isAnagram = false;
                    break;
                }
            }
            return  isAnagram;

        }

    /*
     * One way to find if two Strings are anagram in Java. This method
     * assumes both arguments are not null and in lowercase.
     *
     * @return true, if both String are anagram
     */
    public static boolean isAnagram(String word, String anagram){
        if(word.length() != anagram.length()){
            return false;
        }
        char[] chars = word.toCharArray();
        for(char c : chars){
            int index = anagram.indexOf(c);
            if(index != -1){
                anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length());
            }else{
                return false;
            }
        }

        return anagram.isEmpty();
    }

    /* function to check whether two strings
    are anagram of each other */
    static boolean areAnagram(char str1[], char str2[])
    {
        // Create 2 count arrays and initialize
        // all values as 0
        int count1[] = new int[NO_OF_CHARS];
        Arrays.fill(count1, 0);
        int count2[] = new int[NO_OF_CHARS];
        Arrays.fill(count2, 0);
        int i;

        // For each character in input strings,
        // increment count in the corresponding
        // count array
        for (i = 0; i < str1.length && i < str2.length;
             i++) {
            count1[str1[i]]++;
            count2[str2[i]]++;
        }

        // If both strings are of different length.
        // Removing this condition will make the program
        // fail for strings like "aaca" and "aca"
        if (str1.length != str2.length)
            return false;

        // Compare count arrays
        for (i = 0; i < NO_OF_CHARS; i++)
            if (count1[i] != count2[i])
                return false;

        return true;
    }
}
