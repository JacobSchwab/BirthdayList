//So I chose to iterate through the list sacrificing time to save more space
//I was also thinking about using 2 maps (similar to twoKey) to save time, but this would double the space required
//In terms of an employee database for birthdays, (over 1000 employees) I figured saving the space was more important.
import java.util.*;
public class BDayList 
{
  HashMap<String, Object> map;
    
  public BDayList() 
  { 
    map = new HashMap<>(1500,0.60F); //custom capacity and load factor
  }
 
  void add(String employeeName, Date bday)
    
  {
    map.put(employeeName, bday);
  }
  
  void remove(String empoyeeName)
    
  {
    map.remove(empoyeeName);
  }
  
  ArrayList getBirthdays(Date today)
  {
   ArrayList<Object> list = new ArrayList<Object>();  // A junior/senior CS major gave me this suggestion by explaining entrySet to me while I was in the lab
   for (Map.Entry<String, Object> e : map.entrySet()) // I found this line on how to create the set on a StackOverflow thread, but I lost the link to it
   {
    if (today.equals(e.getValue()))
      list.add(e.getKey());
     }
   return list;
  }
}
