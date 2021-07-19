import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
// ADD LINES FOR TASK #3 HERE
// Import the JavaFX Image class.
import javafx.scene.image.ImageView;

/**
   This is the controller class for the
   Dwarf Planets JavaFX application.
 */

public class DwarfPlanetsController
{
   @FXML
   private ImageView dwarfPlanetsImageView;

   @FXML
   private Label discoveredByLabel;

   @FXML
   private Label dateOfDiscoveryLabel;

   @FXML
   private Label orbitPeriodLabel;

   @FXML
   private Label lengthOfDayLabel;

   @FXML
   private Label namedAfterLabel;

   @FXML
   private ToggleGroup dwarfPlanetsToggleGroup;

   @FXML
   private RadioButton ceresRadioButton;

   @FXML
   private RadioButton erisRadioButton;

   @FXML
   private RadioButton haumeaRadioButton;

   @FXML
   private RadioButton makemakeRadioButton;

   @FXML
   private RadioButton plutoRadioButton;

   // ADD LINES FOR TASK #3 HERE
   // Declare private fields for the images
   // Load the image files in the intialize method

   // Event listener for the ceresRadioButton
   public void ceresRadioButtonListener()
   {
      // ADD THE LINES FOR TASK #3 HERE
      // If this radio button is selected,
      // display image and data for Ceres.
   }

   // Event listener for the erisRadioButton
   public void erisRadioButtonListener()
   {
      // ADD THE LINES FOR TASK #3 HERE
      // If this radio button is selected,
      // display image and data for Eris.
   }

   // Event listener for the haumeaRadioButton
   public void haumeaRadioButtonListener()
   {
      // ADD THE LINES FOR TASK #3 HERE
      // If this radio button is selected,
      // display image and data for Haumea.
   }

   // Event listener for the makemakeRadioButton
   public void makemakeRadioButtonListener()
   {
      // ADD THE LINES FOR TASK #3 HERE
      // If this radio button is selected,
      // display image and data for Makemake.
   }

   // Event listener for the plutoRadioButton
   public void plutoRadioButtonListener()
   {
      // ADD THE LINES FOR TASK #3 HERE
      // If this radio button is selected,
      // display image and data for Pluto.
   }
}