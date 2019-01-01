package core;

import java.util.Stack;

public class Tester {

    public static void main(String[] args) {

        Stack<String> stringStack = new Stack<>();

        stringStack.add("foo");
        stringStack.add("bar");
        stringStack.add("boo");

        String a = "";

        for (Object i : stringStack.toArray())
        {
            a += i + ".";
        }
        a = a.substring(0,a.length()-1);

        System.out.println(a);

    }
}
