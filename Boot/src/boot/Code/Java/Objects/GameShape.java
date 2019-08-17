/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Objects;

import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import boot.Code.Java.Support.Message;
import boot.Code.Java.Support.XGroup;
import boot.Code.Groovy.Animation.Navigation;
import boot.Interface.Playable;
import java.util.Stack;
import boot.Code.Java.Support.TorpedoLauncher;
import boot.Code.Java.Support.Bulb;
/**
 *
 * @author Richardo Reyes
 */
public class GameShape extends PrototypeObject {
      final PhongMaterial redMaterial = new PhongMaterial();
    private  String name;
XGroup gameObjectAppearance;
    Message sendToheadsUpDisplay=new Message();
    private Stack<Playable> ObjectMatrix;
 protected Circle circle=new Circle();
 protected Cylinder saucerSection=new Cylinder(); 
 protected Cylinder warpEngine1=new Cylinder(); 
 protected Cylinder warpEngine2=new Cylinder(); 
 protected Sphere sphere=new Sphere();
protected  Sphere controlroom=new Sphere();
    public GameShape(){
         name="Shape";   
    }
    {
      {
     try{
   
             
     
         //   sunTexture =new URL(this.getClass().getResource("Pictures/panels.jpg").toString());  
         //   suntextureImage = new Image(sunTexture.toString());
          //  sunMaterial.setDiffuseMap(suntextureImage);
    
  controlroom.setMaterial(sunMaterial);
        
      sphere.setMaterial(sunMaterial);
    //    circle.setStyle(name);
     
         
     //  firstTexture =new URL(this.getClass().getResource("Pictures/clarkebm.jpg").toString()); 
      // firsttextureImage = new Image(firstTexture.toString());
       //      firstMaterial.setDiffuseMap(firsttextureImage);
    
   
        }   
        
        
       
       catch(Exception e){
           
       }
    

}  
    }
    Navigation navigation =new Navigation();


    {
        navigation.load();
    }
    public Navigation getNavigation(){
        return navigation;
    }
    public String getName(){
     return name;
 } 

public boolean setName(String n){
   name=n; 
   return true;
}
  public  GameShape(String name,double x,double y, double z,double a,double b,double c,double size){
      name="Shape";  
    buffer=new Sphere();
      buffer2=new Sphere();    
      //  buffer2=new Sphere();
      TorpedoLauncher launcher=new TorpedoLauncher();
       setName(this.getName());
       setLoadingName(name);
       gameObjectAppearance.setTranslateX(x);
       gameObjectAppearance.setTranslateY(y);
       gameObjectAppearance.setTranslateZ(z);
       gameObjectAppearance.rx.setAngle(a);
       gameObjectAppearance.ry.setAngle(b);
       gameObjectAppearance.rz.setAngle(c);
       
        gameObjectAppearance.setScaleX(size);
      gameObjectAppearance.setScaleY(size);
      gameObjectAppearance.setScaleZ(size);
   
Bulb lo=new Bulb();   
//lo.lightThis2(gameObjectXGroup);

        
         buffer2.setScaleX(1.3);//enterpriseD.03
    redMaterial.setDiffuseColor(Color.GRAY);
       redMaterial.setSpecularColor(Color.GRAY); 
   buffer2.setMaterial(redMaterial);
    buffer2.setScaleY(1.3);
    buffer2.setScaleZ(1.3);
    buffer2.setTranslateX(400);//-900
    buffer2.setTranslateY(-2000);//-2700
    buffer2.setTranslateZ(0);//0
    buffer2.setRadius(30);
    buffer2.setMaterial(redMaterial);
    //--------------------
    
 
   
    }
    public boolean setLoadingName(String ln){
        loadingName=ln;
        return true;
    }
 public void loadCircle(int r,int h){
   
    circle.setRadius(r);
gameObjectAppearance.setScaleX(2000);
gameObjectAppearance.setScaleY(2000);
gameObjectAppearance.setScaleZ(1);

    gameObjectAppearance.getChildren().add(circle);
}
 public boolean changeMissile(){
  int changeTexture=randomInt(0,1);
     try{
   
             
        if(changeTexture==0){
           
   warpEngine1.setMaterial(sunMaterial);
   warpEngine2.setMaterial(sunMaterial);
   saucerSection.setMaterial(sunMaterial);   
     controlroom.setMaterial(sunMaterial); 
        sphere.setMaterial(sunMaterial);
        }
        else if(changeTexture==1)  {
         
          
       warpEngine1.setMaterial(sunMaterial);
   warpEngine2.setMaterial(sunMaterial);
   saucerSection.setMaterial(sunMaterial);   
     controlroom.setMaterial(sunMaterial); 
        sphere.setMaterial(sunMaterial);
        }   
        
        
       }
       catch(Exception e){
           
       }
    

     
  
      return true; 
}
 public void loadEngines(int r,int h){
  
    warpEngine1.setRadius(r);
    warpEngine1.setHeight(h);
    
    warpEngine1.setMaterial(sunMaterial);
    gameObjectAppearance.getChildren().add(warpEngine1);
    
     warpEngine2.setRadius(r);
    warpEngine2.setHeight(h);
    
    warpEngine2.setMaterial(sunMaterial);
    gameObjectAppearance.getChildren().add(warpEngine2);
    
} 
public void loadCylinder(int r,int h){
  
    saucerSection.setRadius(r);
    saucerSection.setHeight(h);
    
    saucerSection.setMaterial(sunMaterial);
    gameObjectAppearance.getChildren().add(saucerSection);
}    
public void loadSphere(int r){
   
    sphere.setRadius(r);
        sphere.setMaterial(sunMaterial);
    gameObjectAppearance.getChildren().add(sphere);
}

public void loadControlRoom(int r){
    controlroom.setRadius(r);
 
       controlroom.setMaterial(sunMaterial);
    gameObjectAppearance.getChildren().add(controlroom);
}
    public XGroup getGameObjectAppearance(){
     return gameObjectAppearance;
 } 
 public Cylinder getCylinder(){
     return saucerSection;
 }   
 
 public Circle getCircle(){
     return circle;
 } 
 
  public Sphere getControlRoom(){
     return controlroom;
 }
  
   public Sphere getSphere(){
     return sphere;
 }
   
   public void setSise(double size){
       gameObjectAppearance.setScaleX(size);
       gameObjectAppearance.setScaleY(size);
       gameObjectAppearance.setScaleZ(size);
   }
  public boolean  collisionDetection( Stack<Playable> universe){
     boolean detect=false;

            ObjectMatrix=universe;
    
     for (Playable static_bloc : ObjectMatrix)
            if (static_bloc != this&&static_bloc.getGroup().getBoundsInParent().intersects(this.getGroup().getBoundsInParent())) {
          //    this.getSphere().setRadius(700);
        
          if(static_bloc.getName()=="Shape"&&this.getName()=="Torpedo"){
       sendToheadsUpDisplay.send("Torpedo hits Opponent");
       //   sendToheadsUpDisplay.send("game over");
 // static_bloc.loadSheild(universe);
   //static_bloc.getGameObjectAppearance().getChildren().add(this.turn3Target(this.getGameObjectAppearance(), static_bloc.getGameObjectAppearance()));
        this.incrementHit();
         // universe.incrementScore(randomDouble(0,10));
   buffer2.setRadius(randomInt(55,200));
    static_bloc.setState("collided");
    this.setState("collided");
 //universe.getStageLoader().loadStreams(universe,"Opponent",universe.getResourceManager().getModelName(randomInt(0,3)),120000,0,29000,0,0,0,.1);
    //  universe.getHud().getMotionCamera().refreshScreen(universe);
    //  this.getDestroyed(os);
       //  this.getGroup().setTranslateX(static_bloc.getGroup().getTranslateX());
       //  this.getGroup().setTranslateY(static_bloc.getGroup().getTranslateY());
        //  this.getGroup().setTranslateZ(static_bloc.getGroup().getTranslateZ());
    //   universe.getHud().incrementHit(universe);
           
        this.setName("hit");
           // static_bloc.setName("hit");  
          //this.setState("destroyed");
     
     this.changeMissile();
            if(static_bloc.getHit()>3){
         
         if(universe.size()<3){
              // universe.switchStage();    
         }
  
            }
          
               
          }     
           
         
      
         
      
               
            
            
            }
            
        
            
            
   return detect;
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
}
