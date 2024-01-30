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
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String word)
{
  //your code here
    String n = new String();
 for(int i = 0;i<word.length();i++){
    if(!word.substring(i,i+1).equals(" ")){
      n = n + word.substring(i,i+1);
    }
 }  
  
  String x="";
  for(int i = 0; i<n.length();i++){
    if(Character.isLetter(n.charAt(i))){
      x= x +n.substring(i,i+1);
    }
  }
  
  
  
  if(x.equals(reverse(x))){
    return true;
  }
  
  return false;
  
}

public String reverse(String str)
{
    String sNew = new String();
    String spa = new String ();
  for(int i = 0; i< str.length();i++){
    sNew = str.substring(i,i +1)+ sNew;
  }
   for(int i = 0;i<sNew.length();i++){
    if(!sNew.substring(i,i+1).equals(" ")){
      spa = spa + sNew.substring(i,i+1);
    }
 }  
  String x="";
  for(int i = 0; i<spa.length();i++){
    if(Character.isLetter(spa.charAt(i))){
      x= x +spa.substring(i,i+1);
    }
  }
  
  return x.toLowerCase();
}
}
