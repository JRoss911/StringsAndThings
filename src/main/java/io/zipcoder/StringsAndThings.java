package io.zipcoder;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String str) { //check for alphabetic letter, return count Y && Z IF last character
        int count = 0;
        Pattern regex = Pattern.compile("[yz](?!\\p{L})", Pattern.CASE_INSENSITIVE);
        Matcher regexMatcher = regex.matcher(str);
        while (regexMatcher.find()) {
            count++;
        }
        return count;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {

        new String().replace("base", "");


        return base;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        //string
        //return true if is count = not count
        // "sentence" contains "input"
        //String input
        String word1 = "is";
        String word2 = "not";

        String temp[] = input.split(" ");
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < temp.length; i++) {
            if (word1.equals(temp[i])) {
                count1++;
            } else if (word2.equals(temp[i])) {
                count2++;
            }

            return count1 == count2;

        }
        return null;
    }


    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){

        return (input.contains("g" + "g"));
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
//find when string contains 3 of the same char in sequence
        //input needs to be split into char's
        // input repeated char's counted three+ times
        if(input.length() <= 2) return 0;   //Less than three char's then just ignore that
        if(input.charAt(0) == input.charAt(1) && input.charAt(0) == input.charAt(2))
            //if char at first index is the same as the one after and the next one after
            return 1 + countTriple(input.substring(1)); //count the above events (triples)

        return countTriple(input.substring(1));

    }
}




