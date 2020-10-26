import assignment.Assignment;

public class AssignmentAutomaton {
    public static void main(String[] args) {
        // System.out.println(
        // "Escreva uma palavra para ver se atende ao formato: identificador op_atrib
        // (identificador | numero) pv");
        // String word = System.console().readLine();

        String word = "abc_1=abc;";

        Assignment assignment = new Assignment();
        Boolean valid = assignment.validAssignment(word);

        System.out.println(word + " é " + (valid ? "válida" : "inválida"));
    }
}