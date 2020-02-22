package com.alevel.java.nix.homework;

public class SearchForaCommonPrefixinaString {
    public static void main (String[] args)
    {
        String[] strings= {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strings));
    }
    public static String longestCommonPrefix(String[] strings) {
        if (strings.length == 0) {
            return "";
        }

        for (int prefix = 0; prefix < strings[0].length(); prefix++) {
            char c = strings[0].charAt(prefix);
            for (int i = 1; i < strings.length; i++)
            {
                if ( prefix >= strings[i].length() ||
                        strings[i].charAt(prefix) != c )
                {
                    return strings[i].substring(0, prefix);
                }
            }
        }

        return strings[0];

    }

}
