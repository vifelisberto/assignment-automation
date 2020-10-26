package src.main.java;

import java.util.HashMap;
import src.main.java.assignment.Assignment;

public class AssignmentAutomaton {
    public static void main(String[] args) {
        // Simulador de um automato que reconhece uma atribuição no formato:
        // identificador op_atrib (identificador | numero) pv")
        // TestCases();

        System.out.println(
                "Escreva uma palavra para ver se atende ao formato: identificador op_atrib (identificador | numero) pv");
        String word = System.console().readLine();

        Assignment assignment = new Assignment();
        Boolean valid = assignment.validAssignment(word);

        System.out.println(System.lineSeparator());
        System.out.println("Palavra: '" + word + "' é " + (valid ? "válida" : "inválida"));
    }

    public static void TestCases() {
        String[] testsCases = { "a=a;", "a=9;", "a=9.9;", "a_=a_;", "a_=aa;", "a_=9a;", "aa=a;", "aa=a_;", "aa=aa;",
                "aa=a9;", "a9=a;", "a9=a_;", "a9=aa;", "a9=a9;", "a9=aa;", "a=a_;", "a_=aa;", "a_=a9;", "a=99;",
                "a_=9;", "aa=9;", "a9=9;", "aa=99;", "a_=9;", "a_=99;", "a_=9.9;", "a_=9.99;", "9", "aa", "a==", "a=a",
                "a=_", "a=9", "a=9.9a" };
        HashMap<String, Boolean> valids = new HashMap<String, Boolean>();

        Assignment assignment = new Assignment();
        for (String testCase : testsCases) {
            Boolean valid = assignment.validAssignment(testCase);

            valids.put(testCase, valid);
        }

        System.out.println(valids.toString().replaceAll("[{ }]", " ").replace(",", "&" + System.lineSeparator()));
    }
}