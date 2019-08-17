/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Support;

import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.paint.Color;

/**
 *
 * @author Richardo
 */
public class LightObject {
  Light.Distant  light2;
 Light.Point light; 
  Lighting lighting ;  
  {
        light2=new  Light.Distant();
          lighting = new Lighting();
       light = new Light.Point();
    light.setX(70);
light.setY(55);
light.setZ(45); 

    light2.setAzimuth(45.0);;
light2.setElevation(30.0);
light.setZ(45);
     light.setColor(Color.GRAY); 
     
      lighting.setLight(light);
  }
    public void LightObject() {
        
       
    }
     public void  lightThis2(XGroup x){
 
  lighting.setLight(light2);
//Applying the Lighting effect to the text
x.setEffect(lighting);
//Applying the Lighting effect to the circle
x.setEffect(lighting);
    }
   public void  lightThis(XGroup x){
 
 
//Applying the Lighting effect to the text
x.setEffect(lighting);
//Applying the Lighting effect to the circle
x.setEffect(lighting);
    }
}
