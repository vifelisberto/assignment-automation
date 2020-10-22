public class Assignment {

    public Boolean validAssignment(String assignment) {
        final int IDX_FIRST_LETTER = 0;
        if (assignment == null || assignment.isEmpty())
            return false;

        char firstCharacter = assignment.charAt(IDX_FIRST_LETTER);

        if (!isLowercaseLetter(firstCharacter))
            return false;

        int indexAssignmentOperator;
        for (int i = 1; i < assignment.length(); i++) {
            char character = assignment.charAt(i);

            if (isLowercaseLetter(character)) {
                continue;
            } else if (isNumber(character)) {
                continue;
            } else if (isUnderscore(character)) {
                continue;
            } else if (isAssignmentOperator(character)) {
                indexAssignmentOperator = i;
                break;
            } else {
                return false;
            }
        }

        return true;
    }

    // Validação de identificador

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
}
