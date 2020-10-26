package assignment;

public class StateQ7 extends State {
    @Override
    public State isValidCharacterForState(char character) {
        if (isNumber(character)) {
            System.out.print(" - Caracter válido - Mudando para o estado: q7");
            return new StateQ7();
        } else if (isSemicolon(character)) {
            System.out.print(" - Caracter válido - Mudando para o estado: q8");
            return new StateQ8();
        }

        System.out.print(" - Caracter inválido!");
        return null;
    }
}