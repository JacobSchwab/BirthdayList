class Date 
{
  private int dotw;
  private int moty;
  
  Date (int dayoftheweek, int monthoftheyear)
  {
    dotw = dayoftheweek;
    moty =  monthoftheyear;
  }
  
  public String toString() //doesnt get used, but I used it for testing
  {
    return dotw + " , " + moty;
  }
  
  public boolean equals(Object b) //custom equals method for the Date class
  {
   return dotw == ((Date)b).dotw && moty == ((Date)b).moty; 
  }
  
  public int hashCode()  //referenced this directly from the slides
  {
    return (dotw + moty) * (dotw + moty + 1) / 2 + moty;
  } 
}
