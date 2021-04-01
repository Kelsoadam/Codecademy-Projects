public class MadLibs {
  
  /*
  The purpose of this programme is to generate
  a mad libbed story.

  Author: Adam
  Date: 01/04/2021
  */

  	public static void main(String[] args){
      
      // The characters of our story
      String name1 = "Adam";
      String name2 = "Johnny";
      
      // Adjectives to spice up our story
      String adjective1 = "hungry";
      String adjective2 = "glowing";
      String adjective3 = "smart";

      // The verbs for our story
      String verb1 = "dancing";

      // The nouns for our story
      String noun1 = "toy";
      String noun2 = "apple";
      String noun3 = "London";
      String noun4 = "watch";
      String noun5 = "bear";
      String noun6 = "dragon";

      // The interger for our story
      int number = 45;

      // The place of our story
      String place1 = "Belfast";

      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      // Printing the story
      System.out.println(story);
    }       
}
