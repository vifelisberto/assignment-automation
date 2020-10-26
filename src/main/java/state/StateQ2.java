package src.main.java.state;

public class StateQ2 extends State {
    @Override
    public State isValidCharacterForState(char character) {
        if (isValidCharacterIdentifier(character)) {
            System.out.print(" - Caracter válido - Mudando para o estado: q2");
            return new StateQ2();
        } else if (isSemicolon(character)) {
            System.out.print(" - Caracter válido - Mudando para o estado: q8");
            return new StateQ8();
        }

        System.out.print(" - Caracter inválido!");
        return null;
    }
}