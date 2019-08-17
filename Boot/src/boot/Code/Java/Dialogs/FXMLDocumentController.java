/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Dialogs;
import boot.Code.Java.Support.Message;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.util.Observable;
/**
 *
 * @author Richardo
 */
public class FXMLDocumentController implements Initializable {
   static Message message=new Message();  
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
      
        message.send("continue");
        
    }
   @FXML
    private void handleButtonAction2(ActionEvent event) {
        System.out.println("You exit me!");
        label.setText("exit");
      
          message.send("exit");
        
    } 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
