package src.main.java.state;

public class StateQ4 extends State {
    @Override
    public State isValidCharacterForState(char character) {
        if (isNumber(character)) {
            System.out.print(" - Caracter válido - Mudando para o estado: q4");
            return new StateQ4();
        } else if (isDot(character)) {
            System.out.print(" - Caracter válido - Mudando para o estado: q6");
            return new StateQ6();
        } else if (isSemicolon(character)) {
            System.out.print(" - Caracter válido - Mudando para o estado: q8");
            return new StateQ8();
        }

        System.out.print(" - Caracter inválido!");
        return null;
    }
}