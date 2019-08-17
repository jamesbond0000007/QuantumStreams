/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Support;

import javafx.scene.transform.Rotate;
import java.awt.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author Richardo
 */
public class SimpleText {
    private ScreenPositionManager screenPosition;  
 
    XGroup groups=new XGroup();
 Text text;   
     Font font;
     int TEXTSIZE=60;
  String FontList[];  
  String msg;
   public SimpleText(){
     
        
   }
  public void boot(){
          screenPosition=new  ScreenPositionManager();
          font=new Font(20);//12
        text=new Text();
     GraphicsEnvironment ge =
GraphicsEnvironment.getLocalGraphicsEnvironment();
FontList = ge.getAvailableFontFamilyNames();
for(int i = 0; i < FontList.length; i++){
msg += FontList[i] + " ";

  }

         text.setFont(font);
     text.setFill(Color.WHITE);
      text.setScaleX(TEXTSIZE-.2);
      text.setScaleY(TEXTSIZE-.2);
      text.setScaleZ(TEXTSIZE-.2
      );
            text.setTranslateX(screenPosition.getTopLeft().getX()+-500);//topleft
     text.setTranslateY(screenPosition.getCentre().getY()-2700);
     text.setTranslateZ(screenPosition.getTopLeft().getZ());
      
      
        text.setText("text assigned =0");   
      groups.getChildren().add(text);
  }
  
  public void setColor(int color ){
    if(color==1){
    text.setFill(Color.WHITE); 
    }
     if(color==2){
     text.setFill(Color.RED);
    }
     if(color==3){
   text.setFill(Color.ALICEBLUE); 
    }
     if(color==4){
    text.setFill(Color.ANTIQUEWHITE);
    }
     if(color==5){
   text.setFill(Color.AQUAMARINE); 
    }
     if(color==6){
  text.setFill(Color.AQUA);
    }
     if(color==7){
    text.setFill(Color.BEIGE);
    }
     if(color==8){
     text.setFill(Color.BLUE);
    }
     if(color==9){
    text.setFill(Color.LIGHTSEAGREEN);
    }
     if(color==10){
   text.setFill(Color.CORAL);
    }
     if(color==11){
    text.setFill(Color.ROSYBROWN);
    }
     if(color==12){
   text.setFill(Color.BLUEVIOLET);
    }
}
   public void SimpleText(){
    
   }
   public XGroup getGroup(){
       return groups;
   }
   public String getText(){
       return text.getText();
   }
   
   public void setText(String t){
       text.setText(t);
   }
   
   public Text getTextObject(){
     return  text;
   }
   
   public void setSize(Text text,double s){
        text.setScaleX(s);
      text.setScaleY(s);
      text.setScaleZ(s);
   }
   
   public void setPosition(double x,double y,double z){
      text.setTranslateX(x);
      text.setTranslateY(y);
      text.setTranslateZ(z);
   }
    public void setRotateZ(double z){
        text.setRotationAxis(Rotate.Z_AXIS);
     
      text.setRotate(z);
   }
     public void setRotateY(double y){
        text.setRotationAxis(Rotate.Y_AXIS);

      text.setRotate(y);
   }
     
      public void setRotateX(double y){
        text.setRotationAxis(Rotate.X_AXIS);
     
      text.setRotate(y);
   }
}
