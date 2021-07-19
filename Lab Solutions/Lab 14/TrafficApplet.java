import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   This applet displays a timed traffic signal.
*/

public class TrafficApplet extends JApplet
{
   // Constants for the traffic signal
   public final int WIDTH = 300;
   public final int HEIGHT = 400;
   public final int X_TRAFFICLIGHT = WIDTH / 3;
   public final int Y_TRAFFICLIGHT = HEIGHT / 7;
   public final int TRAFFICLIGHT_WIDTH = WIDTH / 2;
   public final int TRAFFICLIGHT_HEIGHT = HEIGHT * 3 / 5;
   public final int LIGHT_DIAMETER =
                    TRAFFICLIGHT_HEIGHT / 5;
   public final int HOOD_START_ANGLE = 20;
   public final int HOOD_ANGLE_SWEPT = 140;
   public final int X_LIGHTS =
                    TRAFFICLIGHT_WIDTH /
                    3 + X_TRAFFICLIGHT;
   public final int Y_REDLIGHT =
                    TRAFFICLIGHT_HEIGHT /
                    10 + Y_TRAFFICLIGHT;
   public final int Y_ORANGELIGHT =
                    TRAFFICLIGHT_HEIGHT * 4 /
                    10 + Y_TRAFFICLIGHT;
   public final int Y_GREENLIGHT =
                    TRAFFICLIGHT_HEIGHT * 7 /
                    10 + Y_TRAFFICLIGHT;
   public final int TIME_DELAY = 1000;

   private String status = "green"; // Signal status
   private Timer timer;             // Timer object

   /**
      init method
   */

   public void init()
   {
      // Create a timer object and register an
      // action listener
      timer = new Timer (TIME_DELAY, new TimerListener());

      // Start the light cycle
      timer.start();
   }

   /**
      Private inner class that handles the Timer object's
      action events.
   */

   private class TimerListener implements ActionListener
   {
      public void actionPerformed(ActionEvent action)
      {
         // Changes a red light to a green light
         if (status.equals("red"))
         {
            status = "green";
         }

         // Changes a green light to an orange light
         else if (status.equals("green"))
         {
            status = "orange";
         }

         // Changes an orange light to a red light
         else if (status.equals("orange"))
         {
            status = "red";
         }

         // Redraw the applet
         repaint();
      }
   }

   /**
      paint method
      @param g The applet's Graphics object.
   */

   public void paint(Graphics g)
   {
      // Call the superclass's paint method
      super.paint(g);

      // Draw the yellow traffic signal rectangle
      g.setColor(Color.yellow);
      g.fillRect(X_TRAFFICLIGHT, Y_TRAFFICLIGHT,
                 TRAFFICLIGHT_WIDTH, TRAFFICLIGHT_HEIGHT);

      // Draw the red light
      g.setColor(Color.red);
      g.drawOval(X_LIGHTS, Y_REDLIGHT,
                 LIGHT_DIAMETER, LIGHT_DIAMETER);

      if (status.equals("red"))
      {
         g.fillOval(X_LIGHTS, Y_REDLIGHT,
                    LIGHT_DIAMETER, LIGHT_DIAMETER);
      }

      // Draw the hood for the red light
      g.setColor(Color.black);
      g.drawArc(X_LIGHTS, Y_REDLIGHT, LIGHT_DIAMETER,
                LIGHT_DIAMETER, HOOD_START_ANGLE,
                HOOD_ANGLE_SWEPT);

      // Draw the green light
      g.setColor(Color.green);
      g.drawOval(X_LIGHTS, Y_GREENLIGHT, LIGHT_DIAMETER,
                 LIGHT_DIAMETER);

      if (status.equals("green"))
      {
         g.fillOval(X_LIGHTS, Y_GREENLIGHT,
                    LIGHT_DIAMETER, LIGHT_DIAMETER);
      }

      // Draw the hood for the green light
      g.setColor(Color.black);
      g.drawArc(X_LIGHTS, Y_GREENLIGHT,LIGHT_DIAMETER,
                LIGHT_DIAMETER, HOOD_START_ANGLE,
                HOOD_ANGLE_SWEPT);

      // Draw the orange light
      g.setColor(Color.orange);
      g.drawOval(X_LIGHTS, Y_ORANGELIGHT,
                 LIGHT_DIAMETER, LIGHT_DIAMETER);

      if (status.equals("orange"))
      {
         g.fillOval(X_LIGHTS, Y_ORANGELIGHT,
                    LIGHT_DIAMETER, LIGHT_DIAMETER);
      }

      // Draw the hood for the orange light
      g.setColor(Color.black);
      g.drawArc(X_LIGHTS, Y_ORANGELIGHT, LIGHT_DIAMETER,
                LIGHT_DIAMETER, HOOD_START_ANGLE,
                HOOD_ANGLE_SWEPT);
   }
}