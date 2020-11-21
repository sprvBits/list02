	
	/**
    * This program can be used to test the AlbumList class methods.
  	 *
	 * @author Dr.C.
    */
public class P2Test
{
   public static void main(String[] args)
   {    
      AlbumList albums = new AlbumList();
   		
      System.out.println("File opened successfully? " + albums.readAlbums("albumlist10.csv"));
      int total = albums.total();
      System.out.println("\nTotal albums read: " + total + "\n"); 
      
      System.out.println("The top 5 albums are: \n" + albums.topAlbums(5));
      System.out.println("The greatest albums are: \n" + albums.topAlbums());
      
      String artist = "The Beatles";
      System.out.println("\nTop albums by " + artist + "\n");
      int count = albums.display(artist);
      System.out.println("\n " + count + " out of the top " + total + " albums belong to " + artist + "\n");
      artist = "The Rolling Stones";
      System.out.println("\nTop albums by " + artist + "\n");
      count = albums.display(artist);
      System.out.println("\n " + count + " out of the top " + total + " albums belong to " + artist + "\n");
      
      int decade = 1960;
      System.out.println("\nTop albums released in the " + decade + "'s\n");
      count = albums.display(decade);
      System.out.println("\n " + count + " out of the top " + total + " albums were released in the " + decade + "'s\n");
   
      decade = 1970;
      System.out.println("\nTop albums released in the " + decade + "'s\n");
      count = albums.display(decade);
      System.out.println("\n " + count + " out of the top " + total + " albums were released in the " + decade + "'s\n");
      
      System.out.println("\n Artist(s) with the highest number of albums on the list: " + albums.topArtist());
   }
}