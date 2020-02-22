package com.alevel.java.nix.module1;
import java.util.Stack;
public class StringCharacterCheck
{
    public static void main(String[] args)
    {
        String s = "{}({}";
        System.out.println(Check(s));
    }

    public static boolean Check(String s)
    {
        if (s.isEmpty()) return true;

        Character openingBrace = new Character('{');
        Character openingBracket = new Character('[');
        Character openingParen = new Character('(');
        Stack<Character> openingStack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == openingBrace || cur == openingBracket || cur == openingParen) {
                openingStack.push(cur);
            } else  {
                if (i == s.length()-1 && openingStack.size() != 1) {
                    return false;
                }
                if (openingStack.isEmpty()) {
                    return false;
                }
                Character openingCharacter = openingStack.pop();
                switch (cur) {
                    case '}':
                        if (!openingCharacter.equals(openingBrace)) {
                            return false;
                        }
                        break;
                    case ']':
                        if (!openingCharacter.equals(openingBracket)) {
                            return false;
                        }
                        break;
                    case ')':
                        if (!openingCharacter.equals(openingParen)) {
                            return false;
                        }
                        break;

                    default:
                        break;
                }
            }
        }

        return true;

    }
}