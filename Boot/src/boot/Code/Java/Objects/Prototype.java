/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Objects;

import java.net.URL;

import java.util.Stack;
import javafx.animation.ParallelTransition;
import javafx.animation.ParallelTransitionBuilder;

import javafx.animation.RotateTransitionBuilder;

import javafx.animation.ScaleTransitionBuilder;

import javafx.animation.TranslateTransitionBuilder;
import javafx.scene.shape.Sphere;
import boot.Code.Java.Support.ImageSpawner;
import boot.Code.Java.HUD.HeadsUpDisplay;
import javafx.scene.PerspectiveCamera;
import boot.Code.Java.Support.LightObject;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.util.Duration;
import boot.Code.Java.Support.XGroup;
import boot.Code.Java.Support.Message;
import boot.Interface.Stateable;
import boot.Os;

/**
 *
 * @author Richardo
 */
public abstract class Prototype extends Sphere implements Stateable{
protected ParallelTransition parallelTransition; 
  protected double score=0; 
  protected  static int formID=0;
  protected static   int formID2=0;
  protected static int formIDObject=0;
   
      protected Stack<Prototype> playMatrix;
  protected  boolean changeTexture=true;
  protected  Image suntextureImage; 
   protected static  URL sunTexture;
 protected  final PhongMaterial sunMaterial = new PhongMaterial();
 protected   double points=0;
 protected    Sphere buffer;
 protected    Sphere buffer2;
  protected  static Message sendToheadsUpDisplay;
  protected  static boolean sd=false;
  protected  int size=2;
  
  
   protected LightObject lo;
 
  protected  String state="ok";
  protected  ImageSpawner destroyed;
 
  protected  boolean enable =false;

  protected  int number=0;
 protected   int id=0;
   protected  double hit=0;
  
      final PhongMaterial redMaterial = new PhongMaterial();
  protected  String loadingName="";
  protected  String name;
  protected  Torpedo currentObject;
 
 protected       XGroup gameObjectXGroup;
     
  protected  PerspectiveCamera camera = new PerspectiveCamera();
 
public boolean setGroupId(){
     this.getGroup().setId(String.valueOf(formIDObject));
formIDObject++;;
 return true;    
 }

public boolean setScale(double v){
    this.getGroup().setScaleX(v);
    this.getGroup().setScaleY(v);
    this.getGroup().setScaleZ(v);
    return true;
}
public ParallelTransition setDefaultParralelTransion(Os os, XGroup rect){
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
public ParallelTransition getTransition(){
    
 return  parallelTransition;  
}
public boolean addTransution(ParallelTransition p){
    parallelTransition.getChildren().add(p);
    return true;
}


public boolean getTransition(int  m){
    
    return  true ;
}
 public boolean setTransition(){
      return  true ;
 }
  public boolean setAngleX(double v){
  this.getGroup().rx.setAngle(v);    
  return true;    
  }
public boolean setAngleY(double v){
    this.getGroup().ry.setAngle(v);
  return true;    
}      
public boolean setAngleZ(double v){
    this.getGroup().rz.setAngle(v);
    return true;  
}    
 
public boolean setLoadingName(String ln){
    loadingName=ln;
    return true;
}
public String getLoadingName(){
   
    return loadingName;
}
   
 public boolean setX(double v){
  this.getGroup().setTranslateX(v);
     return true;
 } 
public boolean setY(double v){
  this.getGroup().setTranslateY(v);
     return true;
 }
public boolean setZ(double v){
  this.getGroup().setTranslateZ(v);
     return true;
 }
 
public boolean changeMissile(){
   
 
   
    buffer.setMaterial(redMaterial); 
       buffer2.setMaterial(redMaterial); 
  return true;  
    
}

public int getObjectNumber(){
    return id;
}


public boolean setName(String n){
   name=n; 
   return true;
}


public XGroup getGroup(){
  return gameObjectXGroup;  
}
public String getMessage(){
        
  return  sendToheadsUpDisplay.getMessage() ;
}
public boolean play(){
//  engine.play();   
return true;
}

 public void  Prototype(){

    
     
         gameObjectXGroup=new XGroup();
          buffer=new Sphere();
     buffer2=new Sphere();
  
 
 lo=new LightObject();   
lo.lightThis2(gameObjectXGroup);
gameObjectXGroup.setOpacity(0);
        setVisible(true);
        
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
    
   
    gameObjectXGroup.getChildren().add(buffer2); 
        
    }
     public  Prototype(){
     
    
         gameObjectXGroup=new XGroup();
          buffer=new Sphere();
     buffer2=new Sphere();
 
 
 lo=new LightObject();   
lo.lightThis2(gameObjectXGroup);
gameObjectXGroup.setOpacity(0);
        setVisible(true);
        
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
    
   playMatrix=new Stack<Prototype>();
    gameObjectXGroup.getChildren().add(buffer2); 
        
    }
public boolean InitialiseComunication(HeadsUpDisplay hud){
        sendToheadsUpDisplay=new Message();
         sendToheadsUpDisplay.addObserver(hud);
         return true;
}
   public  int randomInt(int low, int high)
{ 
int result=0;
        result = (int)(Math.random() 
* (high - low + 1)) + low;
     
return result;
}
  public boolean setColor(int color ){
    if(color==1){
     redMaterial.setSpecularColor(Color.RED); 
     redMaterial.setDiffuseColor(Color.RED); 
    }
     if(color==2){
     redMaterial.setSpecularColor(Color.ORANGE); 
     redMaterial.setDiffuseColor(Color.ORANGE); 
    }
     if(color==3){
     redMaterial.setSpecularColor(Color.YELLOW); 
     redMaterial.setDiffuseColor(Color.YELLOW); 
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


 public boolean getDestroyed2(Os universe){

     
    return    true;    
  }
  public boolean getDestroyed(Os universe){
  
     
  return    true;
      
  }
  
  
  
  
 
 public PerspectiveCamera getCamera(){
    
    return camera;
}




public boolean move(){
    return true;
}

 
 public String getName(){
     return name;
 } 

  
   
   
      
 public boolean control(){
  
   
        //backward();  
  return true; 
  }
  public boolean control2(){
  
   
     //   backward();  
   return true;
  }
public boolean control3(){
  
   
     //   backward();  
   return true;
  }
public boolean ai(Os u){
    
 return true;   
}
public boolean ai2(Os u){
return true; 
}
public boolean ai3(Os u){
    
return true;   
}
public boolean ai4(Os u){
  return true; 
}


 public boolean LoadModel(XGroup  x){
  gameObjectXGroup=x;   
  return true;
 }
 public boolean synchronizePosition(XGroup model){
       gameObjectXGroup.setTranslateX(model.getTranslateX());
     gameObjectXGroup.setTranslateY((model.getTranslateY()));
      gameObjectXGroup.setTranslateZ((model.getTranslateZ())); 
      return true;
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
 public boolean setID(int i){
    id=i; 
    return true;
 }
 public int getID(){
     return id;
 }
  public  double randomDouble(double low, double high)
{ 
double result=0;
        result = (double)(Math.random() 
* (high - low + 1)) + low;
     
return result;
} 
 public boolean switchStage(Os u){
      u.switchStage();
   return true;    
    } 
  
  public boolean addPoints(double point){
    points=points+  point;
    return true;
  }
public double getPoints(){
    return points;
}
  
public boolean  collisionDetection( Os universe){

   

   return enable;          
} 
 
  public boolean sheildEarlyDetection(Os universe){
           

return true;
  }
 
 
  public boolean showText(int g){
  return true;     
   }       
  public boolean switchEnable(Os u){
        if(enable==false){
         enable=true;  
         u.getStage();
         
         
        }
        else if(enable==true){
            enable=false;
        }
        return true;
    }           
            
  


  
  
  public boolean engineOn(){
     // if(!track.isPlaying()){
     // track.play();
     // }
     // else if(track.isPlaying()){
          
return true;
  }
 public boolean setEnable(boolean h){
  enable=h;  
return true;  
  }
    public boolean getEnable(){
   return enable;     
    }  
public String getState(){

return state;


}
    public boolean setState(String st){
      state=  st;
      return true;
    }
}
