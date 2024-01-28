import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
        Scanner myReader = new Scanner(myFile);
        int counter = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            lines[counter] = data;
            counter++;
        }
        myReader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(clean(lines[i]))==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public static boolean palindrome(String word)
{
 if(word.equals(reverse(word)))
    return true;
  else
  return false;
}
public static String reverse(String str)
{
    String sNew = new String();
    for(int i = str.length() - 1; i >= 0; i--) 
    sNew += str.charAt(i);
    return sNew;
}
public static String clean(String word){
  String ballsBad = new String();
  for(int i = 0; i < word.length(); i++)
  {
    if(Character.isLetter(word.charAt(i)))
    ballsBad += word.charAt(i);
  }
  return ballsBad.toLowerCase();
}
}
