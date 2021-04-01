import java.util.Scanner;

public class MadLibs {
  
  /*
  The purpose of this programme is to generate
  a mad libbed story.

  Author: Adam
  Date: 01/04/2021
  */

  	public static void main(String[] args){
      
      Scanner scan = new Scanner(System.in); // Creating the scanner for dynamic input by the user

      // The characters of our story
      System.out.println("Enter the name for the first character in our story");
      String name1 = scan.next();
    
      System.out.println("Enter the name for the second character in our story");
      String name2 = scan.next();
      
      // Adjectives to spice up our story
      System.out.println("Enter an adjective for our story");
      String adjective1 = scan.next();

      System.out.println("Enter a second adjective for our story");
      String adjective2 = scan.next();

      System.out.println("Enter a third adjective for our story");
      String adjective3 = scan.next();

      // The verbs for our story
      System.out.println("Enter a verb for our story");
      String verb1 = scan.next();

      // The nouns for our story
      System.out.println("Enter a noun for our story");
      String noun1 = scan.next();

      System.out.println("Enter a second noun for our story");
      String noun2 = scan.next();

      System.out.println("Enter a third noun for our story");
      String noun3 = scan.next();

      System.out.println("Enter a fourth noun for our story");
      String noun4 = scan.next();

      System.out.println("Enter a fifth noun for our story");
      String noun5 = scan.next();

      System.out.println("Enter a final noun for our story");
      String noun6 = scan.next();

      // The interger for our story
      System.out.println("Enter a whole number for our story");
      int number = scan.nextInt();

      // The place of our story
      System.out.println("Enter a location for our story");
      String place1 = scan.next();;

      //The template for the story
      String story =
      "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      // Printing the story
      System.out.println(story);
    }       
}
