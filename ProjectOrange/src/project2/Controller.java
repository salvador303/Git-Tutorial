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

/**
 *
 * @author oscar
 */
public class Controller implements Initializable {

    //Images to be displayed
    @FXML
    private TextArea txt;
    @FXML
    private ImageView imageContent1;
    @FXML
    private ImageView imageContent2;
    @FXML
    private ImageView imageContent3;

    @FXML
    private void loadTxt(ActionEvent event) {
        txt.setText(getTxtfromFile());
    }

    @FXML
    private void loadImgOne(ActionEvent event) {
        imageContent1.setImage(getImg());
    }

    @FXML
    private void loadImgTwo(ActionEvent event) {
        imageContent2.setImage(getImg());
    }

    @FXML
    private void loadImgThree(ActionEvent event) {
        imageContent3.fitWidthProperty();
        imageContent3.setImage(getImg());
    }

    @FXML
    private void saveTxt(ActionEvent event) {
        saveDialogue("txt");
    }

        @FXML
    private void fileMenuSaveImage1(ActionEvent event) {
        
    }
    
    @FXML
    private void fileMenuSaveImage2(ActionEvent event) {
        
    }
    
    @FXML
    private void fileMenuSaveImage3(ActionEvent event) {
        
    }
    
    @FXML
    private void editMenuClearImage1(ActionEvent event) {
        
    }
    
    @FXML
    private void editMenuClearImage2(ActionEvent event) {
        
    }
    
    @FXML
    private void editMenuClearImage3(ActionEvent event) {
        
    }
    
    @FXML
    private void editMenuClearText(ActionEvent event) {
        
    }    
    
    @FXML
    private void editMenuClearEverything(ActionEvent event) {
        
    }        
    
    /**
     * closes program if menu item "close" is clicked
     *
     * @param event
     */
    @FXML
    private void menuItemCloseAction(ActionEvent event) {
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

    private void saveDialogue(String content) {
        //Show save file dialog
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showSaveDialog(null);

        if (file != null) {
            SaveFile(content, file);
        }
    }

    private void SaveFile(String content, File file) {
        try {
            FileWriter fileWriter = null;

            fileWriter = new FileWriter(file);
            if (content.equals("txt")) {
                fileWriter.write(txt.getText());
            }
            fileWriter.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }

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
