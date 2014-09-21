/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 *
 * @author oscar
 */
public class FXMLDocumentController implements Initializable {
    
    /**
     * closes program if menu item "close" is clicked
     * @param event 
     */
    @FXML
    private void menuItemClose(ActionEvent event) {
        System.exit(0);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
