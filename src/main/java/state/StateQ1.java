package src.main.java.state;

public class StateQ1 extends State {
    @Override
    public State isValidCharacterForState(char character) {
        if (isValidCharacterIdentifier(character)) {
            System.out.print(" - Caracter válido - Mudando para o estado: q1");
            return new StateQ1();
        } else if (isAssignmentOperator(character)) {
            System.out.print(" - Caracter válido - Mudando para o estado: q3");
            return new StateQ3();
        }

        System.out.print(" - Caracter inválido!");
        return null;
    }
}