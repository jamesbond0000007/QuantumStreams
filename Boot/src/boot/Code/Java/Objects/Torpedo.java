/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Objects;

import boot.Code.Java.Animation.AnimationSystem;
import boot.Code.Java.Support.XGroup;
import boot.Interface.Playable;

import boot.Code.Java.Support.Xform;
import boot.Code.Java.Support.Message;
import boot.Os;

import java.net.URL;

import boot.Code.Java.HUD.HeadsUpDisplay;
import java.util.Stack;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.ParallelTransition;

import javafx.animation.Timeline;

import javafx.scene.PerspectiveCamera;

import javafx.scene.image.Image;

import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.DrawMode;

import javafx.scene.shape.Sphere;
import javafx.util.Duration;



/**
 *
 * @author Richardo
 */
public class Torpedo extends PrototypeObject implements Playable{
     PerspectiveCamera obBoard=new PerspectiveCamera();
 ParallelTransition parallelTransition; 
     static Message sendToheadsUpDisplay;
    private Stack<Playable> ObjectMatrix;

     
        double limitN=-900000;
   double limitP=900000;
 
     
  
                     
    int hit=0;
 int id=0;
   

    XGroup  gameObjectXform;
  
    public String getName(){
     return name;
 }
    AnimationSystem am;
    {
        am=new AnimationSystem();
    }
    public AnimationSystem getEngine(){
        return am;
    }

     @Override
   public boolean setTransition(ParallelTransition p){
     parallelTransition=p;
    p.setNode(this.getGroup());
   return true;
 }
    public boolean synchronizePosition(XGroup model){
        return true;
    }
 public ParallelTransition getTransition(){
 return  parallelTransition;  
}   
 public boolean addTransition(ParallelTransition p){
    parallelTransition.getChildren().add(p);
    parallelTransition.play();
    return true;
}
public XGroup turn3Player(XGroup xform,XGroup target){
        double endTime = 3000.0; 
     double w=3000;
        double z=3000;
   Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.millis(z),  
                          new KeyValue(xform.translateXProperty(),target.getTranslateX())),
             new KeyFrame(new Duration(endTime),  
                          new KeyValue(xform.translateYProperty(),target.getTranslateY())),
             new KeyFrame(Duration.millis(z),  
                          new KeyValue(xform.translateZProperty(),target.getTranslateZ()-3000)));         
          
     
        animation.cycleCountProperty().setValue(1);
        animation.setAutoReverse(false);
        animation.play();
  
        return xform;
} 
   
 
    public  void  run (){
        
    }
  public XGroup turn3( XGroup xform,double x){
       double endTimex = 40000; 
     double endTimey = 40000.0; 
        double z=40000;
   Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.millis(endTimex),  
                          new KeyValue(xform.translateXProperty(),xform.getTranslateX())),
             new KeyFrame(new Duration(endTimey),  
                          new KeyValue(xform.translateYProperty(),xform.getTranslateY())),
             new KeyFrame(Duration.millis(z),  
                          new KeyValue(xform.translateZProperty(),-99999999.0)));         
          
     
        animation.cycleCountProperty().setValue(1);
        animation.setAutoReverse(false);
        animation.play();
  
        return xform;
}        
 public XGroup turn3Negative(Os os, XGroup xform, double x, double y){
       double endTimex = 6000; 
     double endTimey = 6000.0; 
        double z=6000;
   Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.millis(endTimex),  
                          new KeyValue(xform.translateXProperty(),x+limitP)),
             new KeyFrame(new Duration(endTimey),  
                          new KeyValue(xform.translateYProperty(),y+limitP)),
             new KeyFrame(Duration.millis(z),  
                          new KeyValue(xform.translateZProperty(),-limitP)));         
          
     
        animation.cycleCountProperty().setValue(1);
        animation.setAutoReverse(false);
        animation.play();
  
        return xform;
}       
 public XGroup turn3(Os os, XGroup xform, double x, double y){
       double endTimex = 6000; 
     double endTimey = 6000.0; 
        double z=6000;
   Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.millis(endTimex),  
                          new KeyValue(xform.translateXProperty(),x)),
             new KeyFrame(new Duration(endTimey),  
                          new KeyValue(xform.translateYProperty(),y)),
             new KeyFrame(Duration.millis(z),  
                          new KeyValue(xform.translateZProperty(),limitP)));         
          
     
        animation.cycleCountProperty().setValue(1);
        animation.setAutoReverse(false);
        animation.play();
  
        return xform;
}      
public XGroup turn32(XGroup xform,double x,double y){
       double endTimex = 1700.0; 
     double endTimey = 1700.0; 
        double z=1700;
   Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.millis(endTimex),  
                          new KeyValue(xform.translateXProperty(),x)),
             new KeyFrame(new Duration(endTimey),  
                          new KeyValue(xform.translateYProperty(),randomDouble(2000,limitP))),
             new KeyFrame(Duration.millis(z),  
                          new KeyValue(xform.translateZProperty(),-limitP)));         
          
     
        animation.cycleCountProperty().setValue(1);
        animation.setAutoReverse(false);
        animation.play();
  
        return xform;
}          
   public int getObjectNumber(){
       return id;
   }  
       public XGroup  getGroup(){
           
           return gameObjectXform;
       }
       
       
       public boolean addPoints(double point){
   points=points+point;  
   return  true;
  }
public double getPoints(){
    return points;
}
public void randomExplosion(Os os){
    os.getMusicResource().select(2).play();
}


    Sphere torp=new Sphere();  

      final PhongMaterial redMaterial = new PhongMaterial();
  public void synchronizePosition(Xform model){
    gameObjectXform.setTranslateX(model.getTranslateX());
     gameObjectXform.setTranslateY((model.getTranslateY()));
      gameObjectXform.setTranslateZ((model.getTranslateZ()));
  }
 
  


  public Sphere getSphere(){
      return  buffer2;
  }
  public boolean  collisionDetection( Os universe){
     boolean detect=false;

            ObjectMatrix=universe.getCoreMatrix();

     for (Playable static_bloc : ObjectMatrix)
            if (static_bloc != this&&static_bloc.getGroup().getBoundsInParent().intersects(this.getGroup().getBoundsInParent())) {
          //    this.getSphere().setRadius(700);
                collissionResponse( static_bloc, universe);

            }




   return detect;
}
    public void collissionResponse(Playable static_bloc,Os universe) {
        if(static_bloc.getName()=="Player"&&this.getName()=="XTorpedo") {
            sendToheadsUpDisplay.send("Torpedo hits Opponent");
            //   sendToheadsUpDisplay.send("game over");
            static_bloc.loadSheild(universe);
            static_bloc.incrementHit();
            this.incrementHit();
            static_bloc.setState("collided");
            this.setState("collided");
            universe.incrementScore(randomDouble(0, 10));
            universe.getHud(). decrementLifeDisplay( universe);
            universe.getHud().updateLifeDisplay(universe);
            //universe.getStageLoader().loadStreams(universe,"Opponent",universe.getResourceManager().getModelName(randomInt(0,3)),120000,0,29000,0,0,0,.1);
            universe.getHud().refreshScreen(universe);
            this.setTransition(universe.getParallelBehavior().down(universe, this.getGroup()));
            //universe.getStageLoader().loadStreams(universe,"Opponent",universe.getResourceManager().getModelName(randomInt(0,3)),120000,0,29000,0,0,0,.1);
            universe.getHud().refreshScreen(universe);
            this.getDestroyed(universe);
            //  this.getGroup().setTranslateX(static_bloc.getGroup().getTranslateX());
            //  this.getGroup().setTranslateY(static_bloc.getGroup().getTranslateY());
            //  this.getGroup().setTranslateZ(static_bloc.getGroup().getTranslateZ());
            universe.getHud().incrementHit(universe);
            this.randomExplosion(universe);

            //this.setState("destroyed");
            this.getSphere().setRadius(randomInt(25, 125));
            this.changeMissile();
        }

       else if(static_bloc.getName()=="Opponent"&&this.getName()=="Torpedo"){
            sendToheadsUpDisplay.send("Torpedo hits Opponent");
            //   sendToheadsUpDisplay.send("game over");
            static_bloc.loadSheild(universe);
            static_bloc.incrementHit();
            this.incrementHit();
            static_bloc.setState("collided");
            this.setState("collided");
            universe.incrementScore(randomDouble(0,10));

            this.setTransition(universe.getParallelBehavior().down(universe,  this.getGroup()));
            //universe.getStageLoader().loadStreams(universe,"Opponent",universe.getResourceManager().getModelName(randomInt(0,3)),120000,0,29000,0,0,0,.1);
            universe.getHud().refreshScreen(universe);
            this.getDestroyed(universe);
            //  this.getGroup().setTranslateX(static_bloc.getGroup().getTranslateX());
            //  this.getGroup().setTranslateY(static_bloc.getGroup().getTranslateY());
            //  this.getGroup().setTranslateZ(static_bloc.getGroup().getTranslateZ());
            universe.getHud().incrementHit(universe);
            this.randomExplosion(universe);

            //this.setState("destroyed");
            this.getSphere().setRadius(randomInt(25,125));
            this.changeMissile();
            if(static_bloc.getHit()>100){
                static_bloc.setName("hit");
                this.setName("hit");
                if(universe.getCoreMatrix().size()<3){
                    // universe.switchStage();
                }

            }

        }
    }
 public void loadSheild(Os os){
    Sphere s = new Sphere();
    PhongMaterial mat = new PhongMaterial();
    //mat.setDiffuseMap(new Image("http://www.zfight.com/misc/images/textures/envmaps/interstellar_large.jpg"));
    s.setMaterial(sunMaterial);
    s.setDrawMode(DrawMode.FILL);
    s.setRadius(25000);
    s.setTranslateX(this.getGroup().getTranslateX());
     s.setTranslateX(this.getGroup().getTranslateY());
    s.setTranslateZ(this.getGroup().getTranslateZ()+4500);
  gameObjectXGroup.getChildren().add(s);
}      
   public boolean showText(int g){
    return true;   
   }
  public boolean switchEnable(Os u){
        if(enable==false){
         enable=true;   
        }
        else if(enable==true){
            enable=false;
        }
          return true; 
    }  
   public boolean switchStage(Os u){
       
       
      u.switchStage();
       
   return true; 
       
    }
   
     public boolean getDestroyed2(Os universe){
  
    

  int  f=randomInt(5,15);


   buffer.setScaleX(f);
     buffer.setScaleY(f);
       buffer.setScaleZ(f);
   return true; 
      
  }
   
  public boolean getDestroyed(Os universe){
  
   int  f=randomInt(5,15);


   buffer.setScaleX(f);
     buffer.setScaleY(f);
       buffer.setScaleZ(f);
       
     
    
       //gameObjectXform.setTranslateZ(20000);
  return true; 
      
  }
   public  int randomInt(int low, int high)
{ 
int result=0;
        result = (int)(Math.random() 
* (high - low + 1)) + low;
     
return result;
}
  
 
public double getHit(){
 return hit;   
}
public boolean incrementHit(){
 hit++;  
  return true;  
}
 public boolean decrememntHit(){
  hit--;   
    return true; 
 }

 
   
  
private String name="torpedo";



  Image suntextureImage; 
 Image moontextureImage; 
   private static  URL sunTexture;
    private static  URL moonTexture;
   final PhongMaterial sunMaterial = new PhongMaterial();
  final PhongMaterial moonMaterial = new PhongMaterial();

 
  

      

 



 

 


 public void ShowState(){
      
  } 
public Torpedo(XGroup  model){
  

  gameObjectXform=model;    
    
   
  
}


public boolean changeMissile(){
  int changeTexture=randomInt(0,1);
     try{
   
             
        if(changeTexture==0){
           
    
   buffer.setMaterial(sunMaterial);   
           
        }
        else if(changeTexture==1)  {
         
          
    
   buffer.setMaterial(moonMaterial);
        }   
        
        
       }
       catch(Exception e){
           
       }
    

     
  
      return true; 
}
public Torpedo(double x,double y,double z){
      
   buffer=new Sphere();
  gameObjectXform=new XGroup ();   

   redMaterial.setDiffuseColor(Color.RED);
   redMaterial.setSpecularColor(Color.RED); 
   
    buffer.setMaterial(redMaterial);    
 
    buffer.setTranslateX(x);
    buffer.setTranslateY(y);
    buffer.setTranslateZ(z);
    buffer.setRadius(100);
   
    //================================
    buffer.setScaleX(1.3);//enterpriseD.03
 
   buffer.setMaterial(redMaterial);
 
    buffer.setRadius(1000);
    {
        try {


            sunTexture = new URL(this.getClass().getResource("ObjectMedia/boot.jpg").toString());
            suntextureImage = new Image(sunTexture.toString());
            sunMaterial.setDiffuseMap(suntextureImage);


            buffer2.setMaterial(sunMaterial);

            buffer.setMaterial(sunMaterial);
        } catch (Exception e) {

        }
    }

        //--------------------
    
 //   buffer.setMaterial(redMaterial);
    gameObjectXform.getChildren().add(buffer); 

}

public Sphere getBuffer(){
     return buffer;
}
    public Sphere getBuffer2(){
        return buffer2;
    }
public XGroup turn3Target(XGroup xform,XGroup target){
        double endTime = 9000.0; 
     double w=9000;
        double z=9000;
   Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.millis(z),  
                          new KeyValue(xform.translateXProperty(),target.getTranslateX())),
             new KeyFrame(new Duration(endTime),  
                          new KeyValue(xform.translateYProperty(),target.getTranslateY())),
             new KeyFrame(Duration.millis(z),  
                          new KeyValue(xform.translateZProperty(),target.getTranslateZ())));         
          
     
        animation.cycleCountProperty().setValue(1);
        animation.setAutoReverse(false);
        animation.play();
  
        return xform;
} 

public XGroup turn3Target2(XGroup xform){
        double endTime = 9000.0; 
     double w=9000;
        double z=9000;
   Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.millis(z),  
                          new KeyValue(xform.translateXProperty(),xform.getTranslateX())),
             new KeyFrame(new Duration(endTime),  
                          new KeyValue(xform.translateYProperty(),xform.getTranslateY())),
             new KeyFrame(Duration.millis(z),  
                          new KeyValue(xform.translateZProperty(),-999999)));         
          
     
        animation.cycleCountProperty().setValue(1);
        animation.setAutoReverse(false);
        animation.play();
  
        return xform;
} 
public XGroup turn3x(XGroup xform,double x,double y){
        double endTime = 5080.0; 
    
        double z=5600;
   Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.millis(z),  
                          new KeyValue(xform.translateXProperty(),x)),
             new KeyFrame(new Duration(endTime),  
                          new KeyValue(xform.translateYProperty(),y)),
             new KeyFrame(Duration.millis(z/1000),  
                          new KeyValue(xform.translateZProperty(),limitP)));         
          
     
        animation.cycleCountProperty().setValue(1);
        animation.setAutoReverse(false);
        animation.play();
  
        return xform;
}   
public boolean setColor(int color ){
    if(color==1){
     redMaterial.setSpecularColor(Color.YELLOW); 
     redMaterial.setDiffuseColor(Color.YELLOW); 
    }
     if(color==2){
     redMaterial.setSpecularColor(Color.ORANGE); 
     redMaterial.setDiffuseColor(Color.ORANGE); 
    }
     if(color==3){
     redMaterial.setSpecularColor(Color.RED); 
     redMaterial.setDiffuseColor(Color.RED); 
    }
     if(color==4){
     redMaterial.setSpecularColor(Color.BLACK); 
     redMaterial.setDiffuseColor(Color.BLACK); 
    }
     if(color==5){
     redMaterial.setSpecularColor(Color.RED); 
     redMaterial.setDiffuseColor(Color.RED); 
    }
     if(color==6){
     redMaterial.setSpecularColor(Color.ALICEBLUE); 
     redMaterial.setDiffuseColor(Color.ALICEBLUE); 
    }
     if(color==7){
     redMaterial.setSpecularColor(Color.ANTIQUEWHITE); 
     redMaterial.setDiffuseColor(Color.ANTIQUEWHITE); 
    }
     if(color==8){
     redMaterial.setSpecularColor(Color.AQUA); 
     redMaterial.setDiffuseColor(Color.AQUA); 
    }
     if(color==9){
     redMaterial.setSpecularColor(Color.AZURE); 
     redMaterial.setDiffuseColor(Color.AZURE); 
    }
     if(color==10){
     redMaterial.setSpecularColor(Color.AQUAMARINE); 
     redMaterial.setDiffuseColor(Color.AQUAMARINE); 
    }
     if(color==11){
     redMaterial.setSpecularColor(Color.BEIGE); 
     redMaterial.setDiffuseColor(Color.BEIGE); 
    }
     if(color==12){
     redMaterial.setSpecularColor(Color.BISQUE); 
     redMaterial.setDiffuseColor(Color.BISQUE); 
    }
     
       return true; 
}
public void setTorpedoSize(int size){
    buffer.setRadius(size); 

}


  public  double randomIDouble(double low, double high)
{ 
double result=0;
        result = (double)(Math.random() 
* (high - low + 1)) + low;
     
return result;
}
 
  public boolean setName(String n){
   name=n; 
   return true ;
}   
 
 
  public boolean InitialiseComunication(HeadsUpDisplay hud){
        sendToheadsUpDisplay=new Message();
         sendToheadsUpDisplay.addObserver(hud);
         return true;
}
public String getState(){

return "State";
}
    public boolean setState(String h){
       return true; 
    } 
  public boolean setHit(int h){
      hit=h;
      return true;
  }
 public  double randomDouble(double low, double high)
{ 
double result=0;
        result = (double)(Math.random() 
* (high - low + 1)) + low;
     
return result;
}  
}

 

