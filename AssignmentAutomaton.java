public class AssignmentAutomaton {
    public static void main(String[] args) {
        Assignment assignment = new Assignment();
        Boolean valid = assignment.validAssignment("assignment");

        System.out.println("Palavra é " + (valid ? "válid" : "inválida"));
    }
}