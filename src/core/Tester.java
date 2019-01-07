package core;

import core.structures.AccessModifier;
import core.structures.Variable;
import core.structures.Class;

public class Tester {

    int a =3;
    int angka = 4;

    private static String scopeName = "GLOBAL.Orang.func.$0_$0";
    private static String iScopeName = "GLOBAL.Orang.func";

    public static void main(String[] args) {

        int scopeLen = scopeName.length();
        int iScopeLen = iScopeName.length();

        System.out.println(scopeName.substring(0, iScopeLen));

        {
            {
                int a;
            }
        }

        {
            int a;
        }
        int a;

    }

    public void angka()
    {

    }

}
