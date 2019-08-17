/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Dialogs;
import boot.Code.Java.Dialogs.FxDialog;
import javafx.scene.shape.Box;
import boot.Code.Java.Support.XGroup;
import boot.Code.Java.Support.Message;
/**
 *
 * @author Richardo
 */
public class FxDialog {
    XGroup gameObjectXGroup;
    Box messageBox;
     Box yesBox;
      Box noBox;
   Message message=new Message() ;
   public FxDialog() {
       gameObjectXGroup=new XGroup();
      yesBox=new Box(); 
      yesBox.setHeight(20);
      yesBox.setWidth(30);
      yesBox.setDepth(10);
      
         yesBox=new Box(); 
      yesBox.setHeight(200);
      yesBox.setWidth(300);
      yesBox.setDepth(10);
      
 yesBox.setTranslateX(0);
      yesBox.setTranslateY(0);
      yesBox.setTranslateZ(100);
      
      
      
      
       noBox=new Box(); 
      noBox.setHeight(200);
      noBox.setWidth(300);
      noBox.setDepth(10);
      
      noBox.setTranslateX(0);
      noBox.setTranslateY(0);
      noBox.setTranslateZ(100);
       
      
       
      messageBox=new Box(); 
      messageBox.setHeight(200);
      messageBox.setWidth(3000);
      messageBox.setDepth(10);
      
      messageBox.setTranslateX(900);
      messageBox.setTranslateY(0);
      messageBox.setTranslateZ(100);
     
       gameObjectXGroup.getChildren().add(yesBox);
       gameObjectXGroup.getChildren().add(noBox);
      gameObjectXGroup.getChildren().add(messageBox);
      gameObjectXGroup.setTranslateX(980);
       gameObjectXGroup.setTranslateZ(-980);
      
   }
 public XGroup getGroup(){
    return gameObjectXGroup;
}   
}
