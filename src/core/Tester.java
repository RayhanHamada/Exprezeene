package core;

import core.structures.AccessModifier;
import core.structures.Variable;
import core.structures.Class;

public class Tester {

    int a =3;
    static int angka = 5;



    private static String scopeName = "GLOBAL.Orang.Func";
    private static String iScopeName = "GLOBAL.Orang.Func.get";

    public static int angka()
    {
        return 4;
    }

    public static void main(String[] args) {

        System.out.println(scopeName.equals(iScopeName.substring(0, scopeName.length())));


    }

}
