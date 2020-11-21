/**
 * A class that holds all the characterstics of the album like its name, yeear it was released, position, and the artist.
*/
public class Albums
{
   private String  year;
   private String name;
   private String artist;
   private String  position;
   
   
  /**
   *  The setName method sets the name of the album.
   *  @param n The name of the album.
   */
    
   public void setName(String n)
   {
      name = n;
   }

   /**
   *  The setArtist method sets the name of the artist.
   *  @param g The album's artist.
   */
    
   public void setArtist(String a)
   {
      artist = a;
   }
   
   /**
   *  The setPosition method sets the position of the album in the chart.
   *  @param p The position of the album in the chart.
   */
    
   public void setPosition(String p)
   {
      position = p;
   }
   
   /**
   *  The setYear method sets the year the album was released.
   *  @param y The year the album was released.
   */
    
   public void setYear(String y)
   {
      year = y;
   }
   
   /**
    * The getName method returns the name of the album.
    * @return The value stored in the name of the album.
    */
   
   public String getName()
   {
      return name;
   }

   /**
   *  The getArtist method gets the name of the artist.
   *  @return The album's artist.
   */
    
   public String getArtist()
   {
      return artist;
   }
   
    
   /**
   *  The getPosition method gets the position of the album in the chart.
   *  @return The position of the album in the chart.
   */
    
   public String  getPosition()
   {
      return position;
   }
   
   /**
   *  The getYear method gets the year the album was released.
   *  @return The year the album was released.
   */
    
   public String getYear()
   {
      return year;
   }
   
   
   /**
   *  The formattedOutput method gives a formtted version of the album with all its information.
   *  @return The formatted album..
   */
    
   public String formattedOutput()
   {
      String outline1= "\n***************************************************************************************************************************************";
      String header = String.format("\n| %-4s | %-4s | %-60s | %-54s |", "Rank", "Year", "Album", "Artist");
      String divider = "\n---------------------------------------------------------------------------------------------------------------------------------------";
      String content = String.format("\n| %-4s | %-4s | %-60s | %-54s |", position, year, name, artist);
        
      return outline1 + header + divider + content + outline1;
      
      
   }
}