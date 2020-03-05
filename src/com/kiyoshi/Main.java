package com.kiyoshi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Pattern examples
        // ()() -> true
        // ) -> false
        System.out.println(isBalanced("asdb(123)&/(asdg)156"));

        // deletes patterns with 1561, asdasd, $%$%$
        System.out.println(deleteChars("asdb(123)&/(asdg)156"));
    }

    // ONLY UNDERSTANDS ()()
    // ALSO UNDERSTANDS 912(123)ASD(53)98 WITH CHARACTERS
    public static boolean isBalanced(String pattern){
        if(pattern.charAt(0) == ')')
            return false;

        byte control = 0;

        for(int i = 0; i < pattern.length(); i++){
            switch(pattern.charAt(i)){
                case '(':
                    control++;
                    break;
                case ')':
                    control--;
                    break;
            }
        }

        return control == 0 ? true : false;
    }

    // DELETES ALL THE EXTRA CHARACTERS AS -> asdad -> $%&"# -> 9786153
    public static boolean deleteChars(String pattern){
        if(pattern.charAt(0) == ')')
            return false;

        byte control = 0;
        String cleanedPattern = "";

        for(int i = 0; i < pattern.length(); i++){
            switch(pattern.charAt(i)){
                case '(':
                    control++;
                    cleanedPattern += pattern.charAt(i);
                    break;

                case ')':
                    control--;
                    cleanedPattern += pattern.charAt(i);
                    break;
            }
        }

        System.out.println(cleanedPattern);

        return control == 0 ? true : false;
    }
}
