package assignment;

public class Assignment {
    public Boolean validAssignment(String assignment) {
        State state = State.q0;

        for (int i = 0; i < assignment.length(); i++) {
            char character = assignment.charAt(i);

            System.out.println(System.lineSeparator());
            System.out.print("Lendo caracter: " + character + " na posição: " + i);

            // new State().isValidCharacterForState(character);

            switch (state) {
                case q0:
                    if (isLowercaseLetter(character)) {
                        state = State.q1;
                        printMessageValid(state);
                    } else
                        return printMessageInvalidAndReturnFalse();
                    break;
                case q1:
                    if (isValidCharacterIdentifier(character)) {
                        state = State.q1;
                        printMessageValid(state);
                    } else if (isAssignmentOperator(character)) {
                        state = State.q3;
                        printMessageValid(state);
                    } else
                        return printMessageInvalidAndReturnFalse();
                    break;
                case q2:
                    if (isValidCharacterIdentifier(character)) {
                        state = State.q2;
                        printMessageValid(state);
                    } else if (isSemicolon(character)) {
                        state = State.q8;
                        i--;
                        printMessageValid(state);
                    } else
                        return printMessageInvalidAndReturnFalse();
                    break;
                case q3:
                    if (isNumber(character)) {
                        state = State.q4;
                        printMessageValid(state);
                    } else if (isLowercaseLetter(character)) {
                        state = State.q2;
                        printMessageValid(state);
                    } else
                        return printMessageInvalidAndReturnFalse();
                    break;
                case q4:
                    if (isNumber(character)) {
                        state = State.q4;
                        printMessageValid(state);
                    } else if (isDot(character)) {
                        state = State.q6;
                        printMessageValid(state);
                    } else if (isSemicolon(character)) {
                        state = State.q8;
                        i--;
                        printMessageValid(state);
                    } else
                        return printMessageInvalidAndReturnFalse();
                    break;
                case q6:
                    if (isNumber(character)) {
                        state = State.q7;
                        printMessageValid(state);
                    } else
                        return printMessageInvalidAndReturnFalse();
                    break;
                case q7:
                    if (isNumber(character)) {
                        state = State.q7;
                        printMessageValid(state);
                    } else if (isSemicolon(character)) {
                        state = State.q8;
                        i--;
                        printMessageValid(state);
                    } else
                        return printMessageInvalidAndReturnFalse();
                    break;
                case q8:
                    int lastIndex = assignment.length() - 1;
                    Boolean isLastIndex = i == lastIndex;
                    System.out.println("Palavra é " + (isLastIndex ? "válida" : "inválida"));
                    return isLastIndex;
                default:
                    return printMessageInvalidAndReturnFalse();
            }
        }

        System.out.println(System.lineSeparator());
        System.out.println("Não existe mais caracteres para atender o automato");
        return false;
    }

    private void printMessageValid(State state) {
        System.out.print(" - Caracter válido - Mudando para o estado: " + state);
    }

    private Boolean printMessageInvalidAndReturnFalse() {
        System.out.println(" - Caracter inválido!");
        return false;
    }

    // Validação de identificador
    private Boolean isValidCharacterIdentifier(char character) {
        return isLowercaseLetter(character) || isNumber(character) || isUnderscore(character);
    }

    // Estados
    public Boolean validateCharactersIdentifier(char character) {
        return isLowercaseLetter(character) || isNumber(character) || isUnderscore(character);
    }

    // Validações de caracteres
    private Boolean isLowercaseLetter(char character) {
        final int ASCII_LOWERCASE_LETTER_START = 97;
        final int ASCII_LOWERCASE_LETTER_END = 122;

        final int ASCCI_CHARACTER = (int) character;

        return ASCCI_CHARACTER >= ASCII_LOWERCASE_LETTER_START && ASCCI_CHARACTER <= ASCII_LOWERCASE_LETTER_END;
    }

    private Boolean isUnderscore(char character) {
        final int ASCII_UNDERSCORE = 95;
        final int ASCII_CHARACTER = (int) character;

        return ASCII_CHARACTER == ASCII_UNDERSCORE;
    }

    private Boolean isNumber(char character) {
        final int ASCII_NUMBER_START = 48;
        final int ASCII_NUMBER_END = 57;

        final int ASCII_CHARACTER = (int) character;

        return ASCII_CHARACTER >= ASCII_NUMBER_START && ASCII_CHARACTER <= ASCII_NUMBER_END;
    }

    private Boolean isAssignmentOperator(char character) {
        final int ASCII_ASSIGNMENT_OP = 61;
        final int ASCII_CHARACTER = (int) character;

        return ASCII_CHARACTER == ASCII_ASSIGNMENT_OP;
    }

    private Boolean isDot(char character) {
        final int ASCII_DOT = 46;
        final int ASCII_CHARACTER = (int) character;

        return ASCII_CHARACTER == ASCII_DOT;
    }

    private Boolean isSemicolon(char character) {
        final int ASCII_SEMICOLON = 59;
        final int ASCII_CHARACTER = (int) character;

        return ASCII_CHARACTER == ASCII_SEMICOLON;
    }

    private enum State {
        q0, q1, q3, q4, q6, q7, q2, q8
    }
}
