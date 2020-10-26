package src.main.java.state;

public class StateQ6 extends State {
    @Override
    public State isValidCharacterForState(char character) {
        if (isNumber(character)) {
            System.out.print(" - Caracter válido - Mudando para o estado: q7");
            return new StateQ7();
        }

        System.out.print(" - Caracter inválido!");
        return null;
    }
}