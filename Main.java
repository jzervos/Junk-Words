/**
 * To experiment with creating test files, this project will randomly create 
 * a file that is composed of a random number of junk words.
 * 
 * @author (John Zervos)
 * @version (4/19/2018)
 */
import java.util.Random;        // import methods to create random numbers
public class Main
{
    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        /**     initialise instance variables
        * size = number of words
        * length = length of the word
        * letter = random letter to add to word
        */
        int size, length, letter;
        Random dice = new Random();
        
        //define various arrays to pull characters for the words
        char alphabet [] = new char[] {'q','w','e','r','t','y','u','i','o','p','l','k','j','h','g','f','d','s','a','z','x','c','v','b','n','m'};
        char alphaNum [] = new char[] {'q','w','e','r','t','y','u','i','o','p','l','k','j','h','g','f','d','s','a','z','x','c','v','b','n','m','1','2','3','4','5','6','7','8','9','0'};
        String newWord = "";
        
        size = dice.nextInt(5) + 1;                         // 1-6 words
        for (int y = 0; y < size; y++)                      // loop through each word
        {
            length = dice.nextInt(5) + 3;                   // 3-8 letters
            for (int x = 0; x < length; x++)                // loop through each letter
            {
                letter = dice.nextInt(alphabet.length);
                newWord = newWord + alphabet[letter];
            }
            
            // print each word            
            System.out.println(newWord);                    
            newWord = "";                                   // reinitialize word variable
        }
    }

}
