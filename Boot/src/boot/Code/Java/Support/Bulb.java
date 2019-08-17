/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Support;

import boot.Code.Groovy.Animation.Navigation;
import javafx.scene.Group;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.paint.Color;
import javafx.scene.shape.Sphere;

import boot.Os;

/**
 *
 * @author Richardo
 */
public class Bulb  {
 

  private static  Color jewelColor = Color.rgb(0, 190, 222);
  Lighting lighting ;  
  {
       
       
 


  }

    Navigation navigation =new Navigation();


    {
        navigation.load();
    }
    public Navigation getNavigation(){
        return navigation;
    }
    public void LightObject() {
        
       
    }
     public void  setDistantLight(XGroup model,double x,double y,double z){
 Light.Distant   distantLight=new  Light.Distant();
          lighting = new Lighting();
    distantLight.setAzimuth(400000000.0);;
distantLight.setElevation(400000000.0);
 lighting.setSurfaceScale(5.0);
  lighting.setLight(distantLight);
//Applying the Lighting effect to the text
model.setEffect(lighting);

     }
     
      public void  setDistantLight(Sphere model,double x,double y,double z){
 Light.Distant   distantLight=new  Light.Distant();
          lighting = new Lighting();
    distantLight.setAzimuth(400000000.0);;
distantLight.setElevation(400000000.0);
 lighting.setSurfaceScale(5.0);
  lighting.setLight(distantLight);
//Applying the Lighting effect to the text
model.setEffect(lighting);

     }
     public void  setPointLight(Group model,double x,double y,double z){
         Light.Point pointLight = new Light.Point();
    pointLight.setX(x);
pointLight.setY(y);
pointLight.setZ(z); 
  lighting.setLight(pointLight);
//Applying the Lighting effect to the text
model.setEffect(lighting);
lighting.setSurfaceScale(5000.0);
     pointLight.setColor(Color.RED); 
     
     
     }
      public void setSpotLight(XGroup model,double x,double y,double z){
          
           Light.Spot light = new Light.Spot(); 
      
      //Setting the color of the light 
      light.setColor(Color.GRAY); 
      
      //setting the position of the light 
      light.setX(x); 
      light.setY(y); 
      light.setZ(z); 
       
      //Instantiating the Lighting class  
      Lighting lighting = new Lighting(); 
      
      //Setting the light source 
      lighting.setLight(light);  
      
      //Applying lighting effect to the text 
      model.setEffect(lighting);      
      
      //Applying lighting effect to the circle 
      
     }
     public void setSpotLight(Group model,double x,double y,double z){
          
           Light.Spot light = new Light.Spot(); 
      
      //Setting the color of the light 
      light.setColor(Color.GRAY); 
      
      //setting the position of the light 
      light.setX(x); 
      light.setY(y); 
      light.setZ(z); 
       
      //Instantiating the Lighting class  
      Lighting lighting = new Lighting(); 
      
      //Setting the light source 
      lighting.setLight(light);  
      
      //Applying lighting effect to the text 
      model.setEffect(lighting);      
      
      //Applying lighting effect to the circle 
      
     }
   public void  setPointLight(XGroup model,double x,double y,double z){
       
         Light.Point pointLight = new Light.Point();
    pointLight.setX(x);
pointLight.setY(y);
pointLight.setZ(z); 
  lighting.setLight(pointLight);
//Applying the Lighting effect to the text
model.setEffect(lighting);
lighting.setSurfaceScale(5000.0);
     pointLight.setColor(Color.RED); 
     
     
     }
 
 public void  setDistantLight(Group model,double x,double y,double z){
 Light.Distant   distantLight=new  Light.Distant();
          lighting = new Lighting();
    distantLight.setAzimuth(400000000.0);;
distantLight.setElevation(400000000.0);
 lighting.setSurfaceScale(500.0);
  lighting.setLight(distantLight);
//Applying the Lighting effect to the text
model.setEffect(lighting);

     }
     

  public void  setPointLight(Sphere model,double x,double y,double z){
         Light.Point pointLight = new Light.Point();
    pointLight.setX(x);
pointLight.setY(y);
pointLight.setZ(z); 
  lighting.setLight(pointLight);
//Applying the Lighting effect to the text
model.setEffect(lighting);
lighting.setSurfaceScale(5000.0);
     pointLight.setColor(Color.RED); 
     
     
     }
      public void setSpotLight(Sphere model,double x,double y,double z){
          
           Light.Spot light = new Light.Spot(); 
      
      //Setting the color of the light 
      light.setColor(Color.GRAY); 
      
      //setting the position of the light 
      light.setX(x); 
      light.setY(y); 
      light.setZ(z); 
       
      //Instantiating the Lighting class  
      Lighting lighting = new Lighting(); 
      
      //Setting the light source 
      lighting.setLight(light);  
      
      //Applying lighting effect to the text 
      model.setEffect(lighting);      
      
      //Applying lighting effect to the circle 
      
     }
    public boolean getFighteable(){
        return true;
    }
    public void setFighteable(boolean b){

    }

    public int getStage(){
        return 0;
    }
    public void setStage(int kk){

    }
    public void getQuantumLanguage(String gu){

    }
    public void getQuantumLanguage(Os os ){

    }
      
}
