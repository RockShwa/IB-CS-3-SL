import java.util.*;

public class Houston {
    // Houston cipher
    // key text (secret decoder text) -> the blueprint
    // words arranged by length & alphabetically within each length group
    // example: "the crazy ones" key
    // each word gets a unique code based on its length and position in that alphabetized list
    // "the" would get a different code each time bc its position changes
    // "the country is for all" -> key text
        // "the" appears 7 times in our key text
        // the is the first position word of the three letter group (code: 31)
        // country has 7 letters, and only 7 letter in the key text, so (code: 70)

    // "5 10, 11 0"
    // look at list of 5 letter words, and get the 10th letter of that list -> "think"
    // look at the list of 11 letter words, get the first letter of that list -> "differently"

    // "65 313 7 4 3 28 8 4 22 3 30"
    // "ignore the misfits who disagree with you"

    // "12 0 5 11 3 15 5 12 15 5"
    // error if it's not in the key text

    private String[][] keyText = {
        {"all", "boo", "the", "tie"}, 
        {"asks", "cool", "eats", "moon", "pool", "then"}, 
        {"apple", "flaps", "moose"},
        {"fragile"}
    };

    private int[] code; 

    private int counter;

    private String message = "";

    private int numNotFound = 0;

    public Houston(int[] code) {
        this.code = code;
        this.counter = 0;
    }

    public String decipher() {
        while (counter < code.length - 1) {
            for (int r = 0; r < keyText.length; r++) {
                numNotFound = 0;
                // match the row with the length of the word
                if (code[counter] == keyText[r][0].length()) {
                    message += keyText[r][code[counter + 1]] + " ";
                    numNotFound = 0;
                    break;
                } else {
                    numNotFound++;
                }
                
                if (numNotFound != 0 && r == 3) {
                   message += "ERROR ";
                }
            }
            counter += 2;
        }
        // gets rid of extra space at the end
        return message.substring(0, message.length() - 1);
    }



}   