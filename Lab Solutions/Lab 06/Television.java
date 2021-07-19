/**
   The purpose of this class is to model a television.
*/

public class Television
{
   private String MANUFACTURER;  // The television maker
   private int SCREEN_SIZE;      // The television size
   private boolean powerOn;      // Flag for TV power
   private int channel;          // The television channel
   private int volume;           // The television volume

   /**
      The constructor creates a television with
      the given brand and size.
      @param brand The manufacturer of the television.
      @param size The size of the screen.
   */

   public Television(String brand, int size)
   {
      MANUFACTURER = brand;
      SCREEN_SIZE = size;
      powerOn = false;
      volume = 20;
      channel = 2;
   }

   /**
      Accessor method returns the current volume.
      @return The current volume.
   */

   public int getVolume()
   {
      return volume;
   }

   /**
      Accessor method returns the current channel.
      @return The current channel.
   */

   public int getChannel()
   {
      return channel;
   }

   /**
      Accessor method returns the manufacturer's name.
      @return The television manufacture's name.
   */

   public String getManufacturer()
   {
      return MANUFACTURER;
   }

   /**
      Accessor method returns the size of the screen.
      @return The size of the screen.
   */

   public int getScreenSize()
   {
      return SCREEN_SIZE;
   }

   /**
      Mutator method stores the desired station in
      the channel field.
      @param station The desired television channel.
   */

   public void setChannel(int station)
   {
      channel = station;
   }

   /**
      Toggles the power on and off.
   */

   public void power()
   {
      powerOn = !powerOn;
   }

   /**
      Increases the volume by one.
   */

   public void increaseVolume()
   {
      volume++;
   }

   /**
      Decreases the volume by one.
   */

   public void decreaseVolume()
   {
      volume--;
   }
}

