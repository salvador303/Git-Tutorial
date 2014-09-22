import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;


public class Controller implements Initializable{


    public void initialize(URL arg0, ResourceBundle arg1) {

        System.out.println(menuItemCloseID);
        
        
    }
    
    @FXML
    private MenuItem menuItemCloseID; 

    @FXML
    private void menuItemCloseAction(ActionEvent action)
    {
        System.out.println(menuItemCloseID);
       System.exit(0);
    }
    
    @FXML
    private void menuItemLoadTextAction(ActionEvent action)
    {
        System.out.println(menuItemCloseID);
    }
    
    @FXML
    private void menuItemLoadImage1Action(ActionEvent action)
    {
        System.out.println(menuItemCloseID);
    }
}
 