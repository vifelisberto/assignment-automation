package src.main.java.assignment;

import src.main.java.state.State;
import src.main.java.state.StateQ0;
import src.main.java.state.StateQ8;

public class Assignment {
    public Boolean validAssignment(String assignment) {
        if (assignment == null)
            return false;

        State state = new StateQ0();

        for (int i = 0; i < assignment.length(); i++) {
            char character = assignment.charAt(i);

            System.out.println(System.lineSeparator());
            System.out.print("Lendo caracter: " + character + " na posição: " + i);

            // Chama a validação de cada estado, e cada estado é responsável por encaminhar
            // para o próximo estado
            state = state.isValidCharacterForState(character);

            if (state == null)
                return false;

            if (state instanceof StateQ8)
                return true;
        }

        System.out.println();
        System.out.println("Palavra inválida");
        return false;
    }
}
