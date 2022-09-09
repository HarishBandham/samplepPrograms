package com.psrp.coding;


import java.util.stream.Stream;

public class SpecialCharacters {

    public static void main(String[] args) {

        String strValue = "Swa$pn&il";

        System.out.println(reverseStringCharacters(strValue));
    }

    private static String reverseStringCharacters(String strValue) {

        char[] ConvertStrTochar = strValue.toCharArray();
        //int j=0;
        for(int i=0,j=strValue.length()-1;i<j;) {

            if (isAlphaNumeric(ConvertStrTochar[i]) && isAlphaNumeric(ConvertStrTochar[j])) {
                char temp = ConvertStrTochar[i];
                ConvertStrTochar[i] = ConvertStrTochar[j];
                ConvertStrTochar[j] = temp;
                i++;
                j--;
            } else if (!isAlphaNumeric(ConvertStrTochar[i])) {
                i++;
            } else if (!isAlphaNumeric(ConvertStrTochar[j])) {
                j--;
            }

        }
        return String.valueOf(ConvertStrTochar);
        }

    private static boolean isAlphaNumeric(char c) {

        if(Character.isAlphabetic(c) || Character.isDigit(c)){
            return true;
    }
        return false;

}
}
