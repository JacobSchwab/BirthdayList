//I recieved some help from a tutor on this assignment, but he couldnt help me (I was stuck on the getBirthdays method) see that class for explanation
/*
Jacob Schwab 
Java with Data Structures
Due Final Exam Date
This Program is designed to keep track of all the birthdays of the employees at a company of over 1000 people
It works well save the discussion about space vs time in the list class
*/
public class Prog6 {

  public static void main(String[] args) 
  { 
   BDayList list = new BDayList();
   list.add("John Smith", new Date (1, 1));
   list.add("Mark Thalman", new Date (12, 11));
   list.add("Jacob Schwab", new Date (12, 11));
   list.add("Jacob Bawhcs", new Date (12, 11));
   list.remove("Mark Thalman");
   System.out.println(list.getBirthdays(new Date (12, 11)));
  }
   
}
