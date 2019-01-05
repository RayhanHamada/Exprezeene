package core;

import core.structures.AccessModifier;
import core.structures.Variable;

public class Tester {

    public static void main(String[] args) {

        Variable var =
                new Variable("angka", AccessModifier.PRIVATE, new DataType("int"), false, false, new Scope("GLOBAL.MyClass"));

        System.out.println();
    }
}
