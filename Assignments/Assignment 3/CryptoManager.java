
/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple �substitution cipher� where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */

/*
 * Class: CMSC203 CRN 22557
 * Instructor: David Kuijt
 * Description: This class decrypts and encrypts a string using Bellaso and Caesar Cipher
 * Due: 10/08/2023
 * Platform/compiler:
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Arianna Alimi
*/


public class CryptoManager {
	
	private static final int LOWER_RANGE = 32;
	private static final int UPPER_RANGE = 95;
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) 
	{
		
	
		//for each letter of the plainText, if it is not in bounds, return false
		for(int i = 0; i < plainText.length(); i++)
		{
			
			
			if ((plainText.charAt(i) < LOWER_RANGE) || (plainText.charAt(i) > UPPER_RANGE))
			{
				return false;
			}
			
		
		}
		//else return true
		return true;


	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) {
		
		//creating a variable to return
		String newText = ""; 
		
		
		//return not in bounds if plainText is not in bounds
		if (isStringInBounds(plainText) == false)
		{
			return "The selected string is not in bounds, Try again.";
		}
		
		
		//
		for(int i = 0; i < plainText.length(); i++)
		{
			char newChar = plainText.charAt(i);
			
			//adding the key to the plainText while looping through the range
			char newNewChar = (char)(((newChar + key - LOWER_RANGE) % RANGE) + LOWER_RANGE);
			newText += newNewChar;
		
		}
		
		return newText;
		
		
		
		
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr) {
		
	
		String newText = "";
		String bellasoText = "";
		
		//bellasoStr added to bellasoText so that it matches the plain text
		while (bellasoText.length() < plainText.length())
		{
			bellasoText += bellasoStr;
		}
		
		//looping through each character of plain text and bellaso text
		for(int i = 0; i < plainText.length(); i++)
		{
			
			//adding the plain text character to the bellaso text character
			int addChar = plainText.charAt(i) + bellasoText.charAt(i);
			
			
			while (addChar > UPPER_RANGE) //looping range
			{
				addChar -=  RANGE;
			}
			 
			//creating a new encryption
			newText += (char) addChar;
		}
		
		return newText;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) 
	{
		String newText = "";
		char newChar;
		char newNewChar;
		
		//% doesn't work well with negatives
		while(key > 0)
		{
			key = key - RANGE;
		}
		
		//going through each letter of the encrypted text length
		for(int i = 0; i < encryptedText.length(); i++)
		{
			newChar = encryptedText.charAt(i);
		
			//subtracting the key to the plainText while looping through the range
			newNewChar = (char)(((newChar - key - LOWER_RANGE + RANGE) % RANGE) + LOWER_RANGE);
			
			//adding the new characters ot the newtext
			newText += newNewChar;
		
			
		}
		
		
		
		return newText;
		
	}
	
		
		
		
	
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
public static String bellasoDecryption(String encryptedText, String bellasoStr) 
{
		
		String newText = "";
		String bellasoText = "";
		
		
		//bellasoStr added to bellasoText so that it matches the encrypted text
		while (bellasoText.length() < encryptedText.length())
		{
			bellasoText += bellasoStr;
		}
		
		
		//Looping through each character of the encrypted text and bellaso text
		for(int i = 0; i < encryptedText.length(); i++)
		{
			
			
			//subtracting the encrypted char character from the bellaso char character
			int subChar = encryptedText.charAt(i) - bellasoText.charAt(i);
			
			
			while (subChar < LOWER_RANGE) //looping range
			{
				subChar +=  RANGE;
			}
			 
			//creating a new text
			newText += (char)subChar;
		}
		
		return newText;
	}
	
		
}

