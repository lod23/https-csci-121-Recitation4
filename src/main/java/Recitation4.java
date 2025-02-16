public class Recitation4 {
    /**
     * Returns a string generated from word by duplicating
     * each letter in the string based on the character's position. Digits
     * are duplicated by the value of their digit. Any other character
     * considered non-alphanumeric will result in all characters being
     * appended to the result, up to but not including the non-alphanumeric
     * character.
     *
     * @param word a string that is to be exploded
     * @return a string generated from word by duplicating
     * each letter in the string based on the character's position. Digits
     * are duplicated by the value of their digit. Any other character
     * considered non-alphanumeric will result in all characters being
     * appended to the result, up to but not including the non-alphanumeric
     * character
     */
    public static String explode(String word) {
        StringBuilder sb = new StringBuilder();
        int pos;
        // Loop through the string
        for (pos = 0; pos < word.length(); pos++) {
            char currentChar = word.charAt(pos);
            if (Character.isDigit(currentChar)) {
                sb.repeat(currentChar, (int)(currentChar - '0'));
            } else if (Character.isLetter(currentChar)) {
                    sb.repeat(currentChar, (pos + 1));
            } else {
                // Stop expansion and append the rest of the string as-is
                String subString = word. substring(0, pos);
                sb.append(subString);
            }
        }
        return sb.toString();
    }

}
/*
1. Assume we have a variable called word
2. Assume we have a variable called sb
3. start with first character
4. if the character is digit, then duplicate the character based on its value
5. else if the character is a letter, then duplicate by its position
6. else if the character is not (a letter and not a digit), then append string up to but not including the character
7. get the next character
8. if there is a character, then goto 4
9. Done
*/

/*
chrAt of character
#56bat

grab part of the string in word
Look in the documentation for string
2 loops inside of if statement
taking the chr that's digit changing to string
taking the position of the chr

step 7 is the update part of the loop char ch = word.charAt(index);

find out when character is a digit (isdigit in the character class)
figure out how to grab (when its non letter or non digit)
 */
