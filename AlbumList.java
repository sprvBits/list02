import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;


/**
 * A class that holds all the list of the albums.
 
 */
public class AlbumList extends Albums
{
   
   private List <Albums> list;          
  
   /**
    * Initializes the arraylist for the list of albums created.
    */
    
   public AlbumList()
   {
      list = new ArrayList<Albums>();
   }
   
   /**
    * The readAlbums method adds the albums in the file to the list and
    * lets us know if there are any errors while reading the file.
    * @param The name of the file that is to be read
    * @return Whether the file has been read properly or not.
    */
    
   public boolean readAlbums(String filename)
   {
      boolean flag = false;
      try
      {
      
         Scanner in = new Scanner(new File(filename)); //using scanner object to read the file
         
         in.nextLine();                     //getting past the list that says name, number and year from the excel file
         int k = 0;
         while (in.hasNextLine())
         {  
            //creating a scanner object to read through each line
            Scanner lineReader = new Scanner(in.nextLine());
            
            //using delimeter to read upto a certain point in the line
            lineReader.useDelimiter(",");
            
            //creating an object of Album to store the information about the album
            Albums album = new Albums();
            
            //setting the value of the instance variables 
            album.setPosition(lineReader.next());
            album.setYear(lineReader.next());
            album.setName(lineReader.next());
            album.setArtist(lineReader.next());
            
            //adding the albums to the list
            list.add(k, album);
            k++;       
         }
         //returning true if the try block is execueted
         return true;
      
      }//end oftry 
        
         
      
      
      catch(FileNotFoundException e)
      {
         System.out.println("File not found");
         return false;
      }
      
      /*catch(NoSuchElementException e)
      {
         System.out.print("Insufficient data.\n\n");
         return false;
      }*/

   
   }//boolean method
   
   
   /**
    * The count method returns the total number of albums in the file
    * @return The total number of albums in the file that have been added to the list.
    */
   public int total()
   {
      return list.size();
      
   }
   
   /**
    * The topAlbums method returns the top n number of albums as specified
    * in the parameter when the method is called
    * @param 
    * @return The formatted output of the top n albums from the file.
    */
   public String topAlbums (int n)
   {  
      String result = "";
      for(int i = 0; i < n ; i++)
      {
         result += list.get(i).formattedOutput() + "\n";
      }
        
      return result;
   }
   
   
  /**
    * The topAlbums method returns the all tha albums that have been added to the list
    * @return The formatted output of all the albums from the file.
    */ 
    
   public String topAlbums()
   {
      String result = "";
      for(int i = 0; i < total(); i ++)
      {
         result += list.get(i).formattedOutput() + "\n";
      }
        
      return result;
   }
   
    /**
    * The display method returns the all tha albums
    * that were published in the decade which is the argument of the method
    * @param decade The decade in which the returned albums were published
    * @return The formatted output of all the albums published in the decade.
    */ 
    
   public int display(int decade)
   {  int numberYear = 0;
      System.out.println("Albums released in " + decade + "s are displayed below");
      for(int i = 0; i < total(); i++)
      { 
         int year = Integer.parseInt(list.get(i).getYear());
         if ((Math.floor(year/10)) == (Math.floor(decade/10)))
         {
            System.out.println(list.get(i).formattedOutput());
            numberYear++;
         }
      }
      
      return numberYear++;
   }
   
   
   /**
    * The display method returns the all tha albums
    * that were published by the artist which is the argument of the method
    * @param artist The artist of the albums returned as the output.
    * @return The formatted output of all the albums of the given artist.
    */ 
    
   public int display(String artist)
   {
      System.out.println("Albums released by " + artist + " are displayed below");
      int artistNumber = 0;
      for (int i = 0; i < total(); i++)
      {  
         
         if (list.get(i).getArtist().equals(artist))
         {
            System.out.println(list.get(i).formattedOutput());
            artistNumber++;
         }
      }
      
      return artistNumber++;
   
   }
   
   /**
    * The topArtist method returns name of the artist with the largest
    * number of the albums in the list
    * @return The name of the artist with the most albums in the list.
    */ 
    
   public String topArtist()
   {
      String top = "";
      int total = 0;
      for(int i = 0; i<total(); i++)
      {
         String artist = list.get(i).getArtist();
         int tempCount = 0;
         for(int k = 0; k < total(); k++)
         {
            if (list.get(k).getArtist().equals(artist))
            {
               tempCount++;
                
               if(tempCount > total)
               {
                  top = artist;
                  total = tempCount;
               }
            }
         }
        
       
      } //main for
      
      return top;
      
      
   }
   
}
   
   
