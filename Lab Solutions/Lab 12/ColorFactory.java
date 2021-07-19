// Import the needed packages
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorFactory extends JFrame
{
   // Constants for window size
   public final int WIDTH = 500;
   public final int HEIGHT = 300;

   // Objects needed for GUI
   private JLabel message;
   private Container contentPane;
   private JPanel topPanel;
   private JPanel bottomPanel;
   private JButton redButton;
   private JButton yellowButton;
   private JButton orangeButton;
   private JRadioButton greenButton;
   private JRadioButton blueButton;
   private JRadioButton cyanButton;
   private ButtonGroup radioButtonGroup;

   /**
      Constructor
   */

   public ColorFactory()
   {
      // Create a closeable JFrame with a specific size
      setTitle("Color Factory");
      setSize(WIDTH, HEIGHT);
      setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      // Get the contentPane and set the layout of the window
      contentPane = getContentPane();
      contentPane.setLayout(new BorderLayout());

      // Build a panel and add it to the top of the window
      buildTopPanel();
      contentPane.add(topPanel, BorderLayout.NORTH);

      // Build a panel and add it to the bottom of the window
      buildBottomPanel();
      contentPane.add(bottomPanel, BorderLayout.SOUTH);

      // Create a message and add it to the middle of the window
      message = new JLabel("Top buttons change the panel " +
                           "color and bottom radio buttons " +
                           "change the text color");
      contentPane.add(message, BorderLayout.CENTER);
   }

   /**
      Create a panel to add to the window.
   */

   private void buildTopPanel()
   {
      // Create a panel, set the color and layout
      topPanel = new JPanel();
      topPanel.setBackground (Color.white);
      topPanel.setLayout(new FlowLayout());

      // Create 3 buttons, setting background, actions
      // commands, and adding listeners
      redButton = new JButton("Red");
      redButton.setBackground(Color.red);
      redButton.setActionCommand("R");
      redButton.addActionListener(new ButtonListener());

      orangeButton = new JButton("Orange");
      orangeButton.setBackground(Color.orange);
      orangeButton.setActionCommand("O");
      orangeButton.addActionListener(new ButtonListener());

      yellowButton = new JButton("Yellow");
      yellowButton.setBackground(Color.yellow);
      yellowButton.setActionCommand("Y");
      yellowButton.addActionListener(new ButtonListener());

      // Add the 3 buttons to the panel
      topPanel.add(redButton);
      topPanel.add(orangeButton);
      topPanel.add(yellowButton);
   }

   /**
      Create a panel to add to the window.
   */

   private void buildBottomPanel()
   {
      // Create a panel, set the color and layout
      bottomPanel = new JPanel();
      bottomPanel.setBackground (Color.white);
      bottomPanel.setLayout(new FlowLayout());

      // Create 3 radio buttons, setting foreground
      greenButton = new JRadioButton("Green");
      greenButton.setForeground(Color.green);
      blueButton = new JRadioButton("Blue");
      blueButton.setForeground(Color.blue);
      cyanButton = new JRadioButton("Cyan");
      cyanButton.setForeground(Color.cyan);

      // Create a radio button group and add the 3
      // radio buttons
      radioButtonGroup = new ButtonGroup();
      radioButtonGroup.add(greenButton);
      radioButtonGroup.add(blueButton);
      radioButtonGroup.add(cyanButton);

      // Add listeners to the radio buttons
      greenButton.addActionListener(new RadioButtonListener());
      blueButton.addActionListener(new RadioButtonListener());
      cyanButton.addActionListener(new RadioButtonListener());

      // Add the radio buttons to the panel
      bottomPanel.add(greenButton);
      bottomPanel.add(blueButton);
      bottomPanel.add(cyanButton);
   }

   /**
      Button listener changes color of background depending
      on which button is clicked.
   */

   private class ButtonListener implements ActionListener
   {
      public void actionPerformed (ActionEvent event)
      {
         String whichButton= event.getActionCommand();
         if(whichButton.equals("R"))
         {
            contentPane.setBackground(Color.red);
         }
         else if (whichButton.equals("O"))
         {
            contentPane.setBackground(Color.orange);
         }
         else if (whichButton.equals("Y"))
         {
            contentPane.setBackground(Color.yellow);
         }
      }
   }

   /**
      Radio button listener changes color of foreground (text)
      depending on which button is clicked.
   */

   private class RadioButtonListener implements ActionListener
   {
      public void actionPerformed (ActionEvent event)
      {
         if(event.getSource() == greenButton)
         {
            message.setForeground(Color.green);
         }
         else if (event.getSource() == blueButton)
         {
            message.setForeground(Color.blue);
         }
         else if (event.getSource() == cyanButton)
         {
            message.setForeground(Color.cyan);
         }
      }
   }

   /**
      Create a window and make it visible on the screen.
   */

   public static void main(String[] args)
   {
      ColorFactory labGUI = new ColorFactory();
      labGUI.setVisible(true);
   }
}