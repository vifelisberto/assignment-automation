package src.main.java.state;

public abstract class State {
    public abstract State isValidCharacterForState(char character);

    // Validação de identificador
    protected Boolean isValidCharacterIdentifier(char character) {
        return isLowercaseLetter(character) || isNumber(character) || isUnderscore(character);
    }

    // Validações de caracteres
    protected Boolean isLowercaseLetter(char character) {
        final int ASCII_LOWERCASE_LETTER_START = 97;
        final int ASCII_LOWERCASE_LETTER_END = 122;

        final int ASCCI_CHARACTER = (int) character;

        return ASCCI_CHARACTER >= ASCII_LOWERCASE_LETTER_START && ASCCI_CHARACTER <= ASCII_LOWERCASE_LETTER_END;
    }

    protected Boolean isUnderscore(char character) {
        final int ASCII_UNDERSCORE = 95;
        final int ASCII_CHARACTER = (int) character;

        return ASCII_CHARACTER == ASCII_UNDERSCORE;
    }

    protected Boolean isNumber(char character) {
        final int ASCII_NUMBER_START = 48;
        final int ASCII_NUMBER_END = 57;

        final int ASCII_CHARACTER = (int) character;

        return ASCII_CHARACTER >= ASCII_NUMBER_START && ASCII_CHARACTER <= ASCII_NUMBER_END;
    }

    protected Boolean isAssignmentOperator(char character) {
        final int ASCII_ASSIGNMENT_OP = 61;
        final int ASCII_CHARACTER = (int) character;

        return ASCII_CHARACTER == ASCII_ASSIGNMENT_OP;
    }

    protected Boolean isDot(char character) {
        final int ASCII_DOT = 46;
        final int ASCII_CHARACTER = (int) character;

        return ASCII_CHARACTER == ASCII_DOT;
    }

    protected Boolean isSemicolon(char character) {
        final int ASCII_SEMICOLON = 59;
        final int ASCII_CHARACTER = (int) character;

        return ASCII_CHARACTER == ASCII_SEMICOLON;
    }
}
