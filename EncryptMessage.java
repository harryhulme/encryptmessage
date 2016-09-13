package encryptmessage; 
import java.util.*; 
 
public class EncryptMessage 
{ 
    public static void main(String[] args) 
    {         
        //create a new Scanner object to capture user input 
        Scanner input = new Scanner(System.in); 
         
        //build an array containing each letter of the alphabet 
         char [] consonants = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'}; 
         char [] vowels = {'a','e','i','o','u'};
         char [] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
 
        //prompt the user to enter a message 
        System.out.println("Please enter a message to encrypt"); 
         
        //store the user's message into a string variable 
        String message = input.nextLine().trim().toLowerCase(); 
         
        //process the user input to remove white space and change all letters to lowercase 
         
        //get the length of the message as an int 
        int messageSize = message.length(); 
         
        //loop through the message getting each character in turn 
        for (int i = 0; i<messageSize; i++) 
        { 
            //get each character in turn 
            char letter = message.charAt(i); 
             
            //if the character is a space 
            if (letter == ' ') 
            { 
                System.out.print("!");      
            }
            
            else if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
            { 
                //search for the character within the alphabet array and return the position within the alphabet 
            
                int position = Arrays.binarySearch(vowels, letter); 

                //change the position 
                position = ((position + 5) + 3) % 5;
                 
                //find the letter from the alphabet array at the given position 
                System.out.print(vowels[position]);
             
            }
            else {
                int position = Arrays.binarySearch(consonants, letter); 
                 
                //change the position 
                position = ((position + 21) + 2) % 21; 
                 
                //find the letter from the alphabet array at the given position 
                System.out.print(consonants[position]);   
            }
        }   
    }   
}