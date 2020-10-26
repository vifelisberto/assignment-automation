package assignment;

public class StateQ3 extends State {
    @Override
    public State isValidCharacterForState(char character) {
        if (isNumber(character)) {
            System.out.print(" - Caracter válido - Mudando para o estado: q4");
            return new StateQ4();
        } else if (isLowercaseLetter(character)) {
            System.out.print(" - Caracter válido - Mudando para o estado: q2");
            return new StateQ2();
        }

        System.out.print(" - Caracter inválido!");
        return null;
    }
}