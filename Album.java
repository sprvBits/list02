public class Album {
   
   private String position;
   private String year;
   private String album;
   private String artist;
   
   
   public Album() {
      position = "1";
      year = "1990";
      album = "The Complete Recordings";
      artist = "Robert Johnson";
   }
   
   public Album(String p, String y, String a, String ar) {
      position = p;
      year = y;
      album = a;
      artist = ar;
   }
   
   public void setPosition(String p) {
      position = p;
   }
   
   public void setYear(String y) {
      year = y;
   }
   
   public void setAlbum(String a) {
      album= a;
   }
   
   public void setArtist(String ar) {
      artist = ar;
   }
   
   public String getPosition() {
      return position;
   }
   
   public String getYear() {
      return year;
   }
   
   public String getAlbum() {
      return album;
   }
   
   public String getArtist() {
      return artist;
   }
   
   public String toString() {
      return position + " " + album + " " + year + " " + artist;
   }
   
}