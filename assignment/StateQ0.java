package assignment;

public class StateQ0 extends State {
    @Override
    public State isValidCharacterForState(char character) {
        if (isLowercaseLetter(character)) {

            System.out.print(" - Caracter válido - Mudando para o estado: q1");
            return new StateQ1();
        }

        System.out.print(" - Caracter inválido!");
        return null;
    }
}