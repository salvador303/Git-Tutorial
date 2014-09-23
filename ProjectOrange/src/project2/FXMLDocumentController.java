/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.net.*;
import java.io.*;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author oscar
 */
public class FXMLDocumentController implements Initializable {

    //Images to be displayed

    @FXML
    private TextArea txt;
    @FXML
    private BorderPane image1Pane;
    @FXML
    private BorderPane image2Pane;
    @FXML
    private BorderPane image3Pane;

    @FXML
    private void loadTxt(ActionEvent event) {
        txt.setText(getTxtfromFile());
    }

    @FXML
    private void loadImgOne(ActionEvent event) {
        ImageView view = new ImageView(getImg());
        image1Pane.getChildren().add(view);
    }

    @FXML
    private void loadImgTwo(ActionEvent event) {
        ImageView view = new ImageView(getImg());
        image2Pane.getChildren().add(view);
    }

    @FXML
    private void loadImgThree(ActionEvent event) {
        ImageView view = new ImageView(getImg());
        image3Pane.getChildren().add(view);
    }

    /**
     * closes program if menu item "close" is clicked
     *
     * @param event
     */
    @FXML
    private void menuItemClose(ActionEvent event) {
        System.exit(0);
    }

    /**
     * shows file chooser dialog to let user pick the image to be displayed
     *
     * @return Image object of chosen image
     */
    private Image getImg() { 
        FileChooser fc = new FileChooser();
        String file = fc.showOpenDialog(null).getAbsoluteFile().toURI().toString();
        System.out.println(file);
        if (file != null) {
            Image img = new Image(file);
            return img;
        }
        return null;
    }

    /**
     * shows file chooser dialog to let user pick the text to be displayed
     *
     * @return string text from chosen file
     */
    private String getTxtfromFile() {
        String str = "";
        FileChooser fc = new FileChooser();
        File txtFile = fc.showOpenDialog(null);
        if (txtFile != null) {
            try (BufferedReader br = new BufferedReader(new FileReader(txtFile))) {
                String sCurrentLine;
                while ((sCurrentLine = br.readLine()) != null) {
                    str += sCurrentLine + "\n";
                }
            } catch (IOException e) {
                System.err.println(e);
            }
        }
        return str;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
