/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Support;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import boot.Code.Java.Support.XGroup;


import javafx.scene.transform.Rotate;

/**
 *
 * @author Richardo
 */
public class ImageX {
    XGroup shape;

     protected double score; 
 
 
      String state="ok";
     
     double hit=0; 
  
    
  
   
   
  ImageView imageView;
   Image image ; 
  
 
   
    public boolean ImageX(){
         
 
     
     return true; 
    }
   public boolean showText(int g){
       return true;  
   }
 
      
    public ImageX( ){
     
     
       
    
  
}
  
  public Image getImage(){
        return image;
  }
   public void create(String name){
         try{
         imageView=new ImageView();  //image = new Image(this.getClass().getResource(config.getPicName(num)).toString());

         
         image = new Image(boot.Boot.class.getResourceAsStream(name));
            imageView.setImage(image);

             shape=new XGroup();
                // imageView.setRotationAxis(Rotate.X_AXIS);
             shape.getChildren().add(imageView);
       }
       catch(Exception e){
         System.out.println(e);
       } 
       
    }

    public XGroup getImageX(){
        return shape;
    }
 public XGroup getPicture(){
     return shape;
 }
 
 public void rotatePicture(double d){
     shape.setRotationAxis(Rotate.Z_AXIS);
     shape.setRotate(d);
 }
 public void setScale(double x,double y,double z){
     shape.setScaleX(x);
     shape.setScaleY(y);
     shape.setScaleZ(z);
     
 }
 
 public void setPosition(double x,double y,double z){
     shape.setTranslateX(x);
     shape.setTranslateY(y);
     shape.setTranslateZ(z);
     
 }
 
public String getState(){

return state;
}
    public boolean setState(String st){
      state=  st;
      return true;
    }    
    
public boolean enable(){
 return true;     
}
 

 
}
