/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Support;
import boot.Code.Java.Animation.AnimationSystem;
import boot.Code.Java.Animation.ParallelBehavior;
import boot.Code.Java.Objects.PrototypeObject;
import boot.Code.Java.HUD.HeadsUpDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import boot.Os;

import boot.Interface.Playable;


import boot.ResourceManager;

import java.util.Stack;
import javafx.animation.ParallelTransition;
import javafx.animation.ParallelTransitionBuilder;
import javafx.animation.RotateTransitionBuilder;
import javafx.animation.ScaleTransitionBuilder;
import javafx.animation.TranslateTransitionBuilder;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Sphere;


import javafx.scene.transform.Rotate;
import javafx.util.Duration;

/**
 *
 * @author Richardo
 */
public class ImageSpawner extends PrototypeObject implements Playable   {
    protected    ParallelBehavior parallelBehavior;

     protected double score; 
     private Stack<Playable> ObjectMatrix;
  XGroup gameObjectXGroup=new XGroup();  
      String state="ok";
    ParallelTransition parallelTransition;
     double hit=0; 
  
    
  
    ResourceManager config=new ResourceManager();
   
  ImageView imageView;
   Image image ; 
  public boolean setTransition(ParallelTransition p){
       parallelTransition=p;
    p.setNode(this.getGroup());
   return true;
 }
    AnimationSystem am;
    {
        am=new AnimationSystem();
    }
    public AnimationSystem getEngine(){
        return am;
    }
  public void loadSheild(Os os){
    Sphere s = new Sphere();
    PhongMaterial mat = new PhongMaterial();
    //mat.setDiffuseMap(new Image("http://www.zfight.com/misc/images/textures/envmaps/interstellar_large.jpg"));
    s.setMaterial(mat);
    s.setDrawMode(DrawMode.FILL);
    s.setRadius(25000);
    s.setTranslateX(this.getGroup().getTranslateX());
     s.setTranslateX(this.getGroup().getTranslateY());
    s.setTranslateZ(this.getGroup().getTranslateZ()+4500);
  gameObjectXGroup.getChildren().add(s);
}
  public ParallelTransition getTransition(){
 return  parallelTransition;  
} 
  public boolean addTransition(ParallelTransition p){
    parallelTransition.getChildren().add(p);
    return true;
}
  public ParallelTransition setDefaultParralelTransition(Os os){
        setState("parallelTransition");
        
    parallelTransition = ParallelTransitionBuilder.create()
            .node(gameObjectXGroup)
            .children(
                 RotateTransitionBuilder.create()
                    .duration(Duration.seconds(13))
                       .fromAngle(randomDouble(-360,7200))
                    .toAngle(randomDouble(-360,7200))
                    .cycleCount(4)
                    .autoReverse(true)
                    .build(),
                TranslateTransitionBuilder.create()
                    .duration(Duration.seconds(12))
                    .fromX(gameObjectXGroup.getTranslateX())
                    .toX(randomDouble(-22000,22000))
                    .fromZ(gameObjectXGroup.getTranslateX())
                    .toZ(randomDouble(-99999999,99999999))    
                    .cycleCount(4)
                    .autoReverse(true)
                    .build(),
                TranslateTransitionBuilder.create()
                    .duration(Duration.seconds(12))
                    .fromY(randomDouble(-9200000,9200000))
                    .toY(randomDouble(-9200,9200))
                    .cycleCount(2)
                    .autoReverse(true)
                    .build(),
                    
                    ScaleTransitionBuilder.create()
                    .duration(Duration.seconds(15))
                    .toX(1)
                    .toX(10)
                    .cycleCount(5)
                    .autoReverse(true)
                    .build(),
                    ScaleTransitionBuilder.create()
                    .duration(Duration.seconds(15))
                    .toY(1)
                    .toY(10)
                    .cycleCount(5)
                    .autoReverse(true)
                    .build()
            
             
            )
            .cycleCount(12)
            .autoReverse(true)
            .build();
    
    return parallelTransition;
    
 }  
  
 public boolean setTransution(ParallelTransition p){
     parallelTransition=p;
    p.setNode(this.getGroup());
   return true;
 } 
  
public ParallelTransition setDefaultParralelTransition(Os os, XGroup rect){
        setState("parallelTransition");
        
    parallelTransition = ParallelTransitionBuilder.create()
            .node(rect)
            .children(
                 RotateTransitionBuilder.create()
                    .duration(Duration.seconds(13))
                       .fromAngle(randomDouble(-360,7200))
                    .toAngle(randomDouble(-360,7200))
                    .cycleCount(4)
                    .autoReverse(true)
                    .build(),
                TranslateTransitionBuilder.create()
                    .duration(Duration.seconds(12))
                    .fromX(randomDouble(-9200000,9200000))
                    .toX(randomDouble(-9200,9200))
                    .cycleCount(2)
                    .autoReverse(true)
                    .build(),
                TranslateTransitionBuilder.create()
                    .duration(Duration.seconds(12))
                    .fromY(randomDouble(-9200000,9200000))
                    .toY(randomDouble(-9200,9200))
                    .cycleCount(2)
                    .autoReverse(true)
                    .build(), 
                 TranslateTransitionBuilder.create()
                    .duration(Duration.seconds(12))
                    .fromZ(randomDouble(-9200000,9200000))
                    .toZ(randomDouble(-9200,9200))
                    .cycleCount(2)
                    .autoReverse(true)
                    .build(),
                    
                    ScaleTransitionBuilder.create()
                    .duration(Duration.seconds(15))
                    .toX(1)
                    .toX(10)
                    .cycleCount(5)
                    .autoReverse(true)
                    .build(),
                    ScaleTransitionBuilder.create()
                    .duration(Duration.seconds(15))
                    .toY(1)
                    .toY(10)
                    .cycleCount(5)
                    .autoReverse(true)
                    .build(),   
                TranslateTransitionBuilder.create()
                    .duration(Duration.seconds(15))
                    .fromZ(randomDouble(-9200000,9200000))
                    .toZ(randomDouble(-9200,9200))
                    .cycleCount(15)
                    .autoReverse(true)
                    .build()
            
             
            )
            .cycleCount(1)
            .autoReverse(true)
            .build();
    
    return parallelTransition;
    
 }   
public boolean getTransition(Os universe, int  m){
     switch   (m){
       case 1:
        // sequentialBehavior.outOfScreen(universe,gameObjectXGroup).play();
        break;
    
         case 2:
      //  sequentialBehavior.intoOfScreen(universe,gameObjectXGroup).play();     
        break;
        
         case 3:
        //      sequentialBehavior.sequentialTransition6(universe,gameObjectXGroup).play();
        break;
        
         case 4:
          //    sequentialBehavior.sequentialTransition4(universe,gameObjectXGroup).play();
        break;
        
         case 5:
            //  sequentialBehavior.sequentialTransition5(universe,gameObjectXGroup).play();
        break;
        
         case 6:
             // sequentialBehavior.sequentialTransition6(universe,gameObjectXGroup).play();
        break;
        
       
   }
    return  true ;
} 
   
  public void run() {
       
   } 
  public boolean changeMissile(){
   
   return true;   
}
   
    public boolean ImageSpawner(){
         
 
       config.initialize();
     return true; 
    }
   public boolean showText(int g){
       return true;  
   }
 public boolean addPoints(double point){
  points=points+point; 
   return true; 
  }
public double getPoints(){
    return points;
}   
      
    public ImageSpawner( ){
     
     
         parallelBehavior=new ParallelBehavior();
    
  
}
  public boolean InitialiseComunication(HeadsUpDisplay hud){
      ///  sendToheadsUpDisplay.addObserver(hud);
          return true; 
}  
    
  
  public XGroup getGroup(){
      
      return gameObjectXGroup;
  }
  
 
  
  
   public void create(String name){
         try{
         imageView=new ImageView();  //image = new Image(this.getClass().getResource(config.getPicName(num)).toString());

         
         image = new Image(boot.Boot.class.getResourceAsStream(name));
            imageView.setImage(image);
            imageView.setTranslateX(-2300);
            imageView.setTranslateY(-1800);
            imageView.setTranslateZ(8100);
    
                // imageView.setRotationAxis(Rotate.X_AXIS);
   // imageView.setRotate(90);
       }
       catch(Exception e){
         System.out.println(e);
       } 
      gameObjectXGroup.getChildren().add(imageView);    
    }   
   
 public ImageView getPicture(){
     return imageView;
 }
 
 public void rotatePicture(double d){
   imageView.setRotationAxis(Rotate.Z_AXIS);
   imageView.setRotate(d);
 }
 public void setScale(double x,double y,double z){
      imageView.setScaleX(x);
             imageView.setScaleY(y);
              imageView.setScaleZ(z);
     
 }
 
 public void setPosition(double x,double y,double z){
       imageView.setTranslateX(x);
            imageView.setTranslateY(y);
            imageView.setTranslateZ(z);
     
 }
 
public String getState(){

return state;
}
    public boolean setState(String st){
      state=  st;
      return true;
    }    
  public boolean switchStage(Os u){
      u.switchStage();
    return true;     
    }   
public boolean enable(){
 return true;     
}
 
public boolean getDestroyed2(Os universe){
  
 
   //  randomExplosion();
 //      gameObjectXGroup.setTranslateZ(190000);
     
    return true;    
  }


public boolean getDestroyed(Os universe){
    
     
  return true; 
      
  }
public boolean  collisionDetection(Stack<Playable>  gameObjectMatrix, Os universe){

    
       
      
       
   return enable;          
} 



 
}
