public class Assignment {

    public Boolean validAssignment(String assignment) {
        final int IDX_FIRST_LETTER = 0;

        if (assignment == null || assignment.isEmpty())
            return false;

        char firstCharacter = assignment.charAt(IDX_FIRST_LETTER);

        if (!isLowercaseLetter(firstCharacter))
            return false;

        System.out.println("Primeiro caracter inválido: " + firstCharacter);

        Boolean validOperator, validAssignment, validSemicolon;
        validOperator = validAssignment = validSemicolon = false;

        for (int i = 1; i < assignment.length(); i++) {
            char character = assignment.charAt(i);

            if (!validOperator && isValidCharacterIdentifier(character)) {
                System.out.println("Caracter: " + character + " na posição: " + i + " é válido");
                continue;
            } else if (!validOperator && isAssignmentOperator(character)) {
                System.out.println("Operador: " + character + " na posição: " + i + " é válido");
                validOperator = true;
                break;
            } else if (validOperator && !validAssignment) {

            } else {
                return false;
            }
        }

        return validOperator && validAssignment && validSemicolon;
    }

    // Validação de identificador
    private Boolean isValidCharacterIdentifier(char character) {
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

    private Boolean isSpace(char character) {
        return character == ' ';
    }
}
