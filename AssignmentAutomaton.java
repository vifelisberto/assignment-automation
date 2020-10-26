import assignment.Assignment;

public class AssignmentAutomaton {
    public static void main(String[] args) {
        // Simulador de um automato que reconhece uma atribuição no formato:
        // identificador op_atrib (identificador | numero) pv")

        // System.out.println(
        // "Escreva uma palavra para ver se atende ao formato: identificador op_atrib
        // (identificador | numero) pv");
        // String word = System.console().readLine();

        String word = "abc_1=12.5;";

        Boolean valid = new Assignment().validAssignment(word);

        System.out.println(System.lineSeparator());
        System.out.println("Palavra: '" + word + "' é " + (valid ? "válida" : "inválida"));
    }
}