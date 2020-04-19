package com.epm.junit_test;

/**
 * ParseString
 */
public class ParseString {

    public String modifyString(String str) {

        if (str.charAt(0) == 'A' && str.charAt(1) == 'A')
            str = str.substring(2);
        else if (str.charAt(0) == 'A')
            str = str.substring(1);
        else if (str.charAt(1) == 'A')
            str = str.charAt(0) + str.substring(2);
        return str;
    }
}