/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Objects;


import java.net.URL;

import javafx.scene.transform.Rotate;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.animation.SequentialTransition;
import java.util.Stack;

import boot.Code.Java.Animation.AnimationSystem;
import boot.Code.Java.HUD.HeadsUpDisplay;
import boot.Code.Java.Support.XGroup;
import boot.Code.Java.Support.TorpedoLauncher;

import boot.Code.Java.Support.LightObject;
import javafx.scene.PerspectiveCamera;
import boot.Code.Java.Support.ImageSpawner;
import javafx.scene.paint.Color;


import boot.Interface.Playable;

import boot.Interface.Stateable;
;
import boot.Os;
import javafx.scene.image.Image;

import boot.Code.Java.HUD.MotionCamera;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Sphere;
import javafx.util.Duration;


public class PrototypeObject   implements Playable ,Stateable{


     protected static  URL moonTexture;  
      protected final PhongMaterial moonMaterial = new PhongMaterial();
    protected Image moontextureImage; 
    Stack<PrototypeObject> playMatrix;
    ParallelTransition parallelTransition; 
 TorpedoLauncher launcher;
    MotionCamera onboardCam;
    Sphere buffer ;
    Sphere buffer2;
    
 XGroup   gameObjectXGroup;
   protected  static int formID=0;
  protected static   int formID2=0;
  protected double score;
  protected static int formIDObject=0;
    
     
    
  protected  boolean changeTexture=true;
  protected  Image suntextureImage; 
   protected static  URL sunTexture;
 protected  final PhongMaterial sunMaterial = new PhongMaterial();
 protected   double points=0;

  
  protected  static boolean sd=false;
  protected  int size=2;

  
   protected LightObject lo;
 
  protected  String state="ok";
  protected  ImageSpawner destroyed;
 
  protected  boolean enable =false;

  protected  int number=0;
 protected   int id=0;
   protected static double hit=0;
  
      final PhongMaterial redMaterial = new PhongMaterial();
  protected  String loadingName="";
  protected  String name;
  protected  Torpedo currentObject;
 
   
  protected  PerspectiveCamera camera = new PerspectiveCamera();
    AnimationSystem am;
    {
        am=new AnimationSystem();
    }
    public AnimationSystem getEngine(){
        return am;
    }

 public boolean setTransition(ParallelTransition p){
     parallelTransition=p;
    p.setNode(this.getGroup());
   return true;
 }
 public boolean addTransition(ParallelTransition p){
    parallelTransition.getChildren().add(p);
    return true;
}
 public ParallelTransition getTransition(){
 return  parallelTransition;  
}
  public ParallelTransition setDefaultParralelTransition(Os os){
        setState("parallelTransition");
      SequentialTransition     sequence0 = new SequentialTransition();
      //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
      TranslateTransition transition4=new TranslateTransition();
      transition4.fromZProperty().setValue(gameObjectXGroup.getTranslateZ());
      transition4.fromXProperty().setValue(randomDouble(99999999,-99999999));
      transition4.durationProperty().setValue(Duration.seconds(12));
      transition4.setNode(gameObjectXGroup);
      transition4.cycleCountProperty().setValue(12);
      transition4.setAutoReverse(enable);
      transition4.play();
//=========================================================================================
      TranslateTransition     transition5 = new TranslateTransition();
      transition5.fromXProperty().setValue(gameObjectXGroup.getTranslateX());
      transition5.toXProperty().setValue(randomDouble(99999999,-99999999));
      transition5.durationProperty().setValue(Duration.seconds(12));
      transition5.setNode(gameObjectXGroup);
      transition5.cycleCountProperty().setValue(12);
      transition5.setAutoReverse(enable);
      transition5.play();
//======================================================================================
      //=======================================================================================
      TranslateTransition     transition6 = new TranslateTransition();
      transition6.fromYProperty().setValue(gameObjectXGroup.getTranslateY());
      transition6.toYProperty().setValue(randomDouble(99999999,-99999999));
      transition6.durationProperty().setValue(Duration.seconds(12));
      transition6.setNode(gameObjectXGroup);
      transition6.cycleCountProperty().setValue(12);
      transition6.setAutoReverse(enable);
      transition6.play();
//======================================================================================

      //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
      TranslateTransition transition=new TranslateTransition();
      transition.fromZProperty().setValue(gameObjectXGroup.getTranslateZ());
      transition.fromXProperty().setValue(randomDouble(-99999999,99999999));
      transition.durationProperty().setValue(Duration.seconds(12));
      transition.setNode(gameObjectXGroup);
      transition.cycleCountProperty().setValue(12);
      transition.setAutoReverse(enable);
      transition.play();
    //=========================================================================================
      TranslateTransition     transition2 = new TranslateTransition();
      transition2.fromXProperty().setValue(gameObjectXGroup.getTranslateX());
      transition2.toXProperty().setValue(randomDouble(-99999999,99999999));
      transition2.durationProperty().setValue(Duration.seconds(12));
      transition2.setNode(gameObjectXGroup);
      transition2.cycleCountProperty().setValue(12);
      transition2.setAutoReverse(enable);
      transition2.play();
//=========================================================================================
      //=========================================================================================
      TranslateTransition     transition3 = new TranslateTransition();
      transition3.fromYProperty().setValue(gameObjectXGroup.getTranslateY());
      transition3.toYProperty().setValue(randomDouble(-99999999,99999999));
      transition3.durationProperty().setValue(Duration.seconds(12));
      transition3.setNode(gameObjectXGroup);
      transition3.cycleCountProperty().setValue(12);
      transition3.setAutoReverse(enable);
      transition3.play();
//=========================================================================================
      RotateTransition rotatex= new RotateTransition();
      rotatex.setAxis(Rotate.Y_AXIS);
      rotatex.durationProperty().setValue(Duration.seconds(12));
      rotatex.setNode(gameObjectXGroup);
      rotatex.setFromAngle(gameObjectXGroup.ry.getAngle());
      rotatex.setToAngle(gameObjectXGroup.ry.getAngle()+360);
      rotatex.setAutoReverse(enable);
      rotatex.setCycleCount(3);
      rotatex.play();
    //========================================================================================
      ParallelTransition parallelTransition  =new ParallelTransition();
      parallelTransition.getChildren().add(transition);
      sequence0.getChildren().add(transition2);
      sequence0.getChildren().add(transition);
      sequence0.getChildren().add(transition3);
      sequence0.getChildren().add(transition4);
      sequence0.getChildren().add(transition5);
      sequence0.getChildren().add(transition6 );
      sequence0.getChildren().add(rotatex);
      parallelTransition.getChildren().add(sequence0);


    
    return parallelTransition;
    
 } 
  
 public void  resetHit(){
     
 }
  public boolean setGroupId(){
     this.getGroup().setId(String.valueOf(formIDObject));
formIDObject++;;
 return true;    
 }
  public void loadSheild(Os os){
    Sphere s = new Sphere();
    PhongMaterial mat = new PhongMaterial();
    //mat.setDiffuseMap(new Image("http://www.zfight.com/misc/images/textures/envmaps/interstellar_large.jpg"));
    buffer.setMaterial(sunMaterial);
      buffer.setDrawMode(DrawMode.FILL);
      buffer.setRadius(25000);
      buffer.setTranslateX(this.getGroup().getTranslateX());
      buffer.setTranslateX(this.getGroup().getTranslateY());
      buffer.setTranslateZ(this.getGroup().getTranslateZ()+4500);
     // buffer.setOpacity(.5);

}   

  public boolean setLoadingName(String ln){
    loadingName=ln;
    return true;
}
public String getLoadingName(){
   
    return loadingName;
}
 public boolean getTransition(Os universe, int num){
       
       int m=randomInt(0,8);
       
   switch   (m){
       case 1:
         universe.getParallelBehavior().intoScreen(universe,gameObjectXGroup).play();
        break;
            

         case 2:
         universe.getParallelBehavior().outOfScreen(universe,gameObjectXGroup).play();  
        break;
        
         case 3:
                universe.getParallelBehavior().left(universe,gameObjectXGroup).play();
        break;
        
         case 4:
                universe.getParallelBehavior().right(universe,gameObjectXGroup).play();
        break;
        
         case 5:
                universe.getParallelBehavior().up(universe,gameObjectXGroup).play();
        break;
      
         case 6:
                 universe.getParallelBehavior().diagonalDown(universe,gameObjectXGroup).play();
        break;
        
         case 7:
              universe.getParallelBehavior().rotate(universe,gameObjectXGroup).play();
        break;
        
         case 8:
                universe.getParallelBehavior().rotate(universe,gameObjectXGroup).play();
        break;
         case 9:
                universe.getParallelBehavior().outOfScreenSlow(universe,gameObjectXGroup).play();
        break;
       
   }
    return  true ;
}  
   

public boolean changeMissile(){
   
     try{
     sunTexture =new URL(this.getClass().getResource("Clouds-mask.jpg").toString()); 
             
        if(changeTexture==false){
            suntextureImage = new Image(sunTexture.toString());
            changeTexture=true;
        }
        else if(changeTexture==true)  {
          changeTexture=false;  
          suntextureImage = new Image(sunTexture.toString());
        }   
        
       }
       catch(Exception e){
           
       }
       sunMaterial.setDiffuseMap(suntextureImage);
    buffer.setMaterial(redMaterial); 
    return true;
}
public boolean incrementScore(double  yy){
    score=score+yy;
    return  true;
}

public double getScore(){
    return score ;
}
public void setScore(double s){
    score =s;
}
public int getObjectNumber(){
    return id;
}
public void run(){
    
}

public boolean loadCamera(MotionCamera mc){
    onboardCam=mc;

    return  true ;
}

public boolean setName(String n){
   name=n; 
   return true;
}
public void turn(double x,double y,double z,double speed){
   // pilot.(gameObjectXform, x, y, z, speed);
    
 // return gameObjectXform;  
}

public void addjust(double x,double y, double z,double a,double b,double c,double size){
    gameObjectXGroup.setTranslateX(x);
      gameObjectXGroup.setTranslateY(y);
      gameObjectXGroup.setTranslateZ(z);
       gameObjectXGroup.rx.setAngle(a);
       gameObjectXGroup.ry.setAngle(b);
       gameObjectXGroup.rz.setAngle(c);
   
        gameObjectXGroup.setScaleX(size);
        gameObjectXGroup.setScaleY(size);
        gameObjectXGroup.setScaleZ(size);  
 }
    public  PrototypeObject(String Opponent,String name,double x,double y, double z,double a,double b,double c,double size){
    gameObjectXGroup=new XGroup();
    buffer=new Sphere();
      buffer2=new Sphere();    
      //  buffer2=new Sphere();
        am= new AnimationSystem();
  launcher=new TorpedoLauncher();
       setName(Opponent);
       setLoadingName(name);
       gameObjectXGroup.setTranslateX(x);
       gameObjectXGroup.setTranslateY(y);
       gameObjectXGroup.setTranslateZ(z);
       gameObjectXGroup.rx.setAngle(a);
       gameObjectXGroup.ry.setAngle(b);
       gameObjectXGroup.rz.setAngle(c);
       
        gameObjectXGroup.setScaleX(size);
      gameObjectXGroup.setScaleY(size);
      gameObjectXGroup.setScaleZ(size);
   
 lo=new LightObject();   
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

public XGroup getGroup(){
  return gameObjectXGroup;  
}

public boolean play(){
//  engine.play();  
return true;
}
     public  PrototypeObject(){
    
        buffer2=new Sphere();
         am= new AnimationSystem();
      //   animation=new Timeline();

       
       launcher=new TorpedoLauncher(); 
     
     gameObjectXGroup=new XGroup();   
    
  

       
        
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
    
    gameObjectXGroup.getChildren().add(launcher); 
    gameObjectXGroup.getChildren().add(buffer2); 
        
    }
 public   TorpedoLauncher getLauncher(){
     return launcher;
 } 
public boolean InitialiseComunication(HeadsUpDisplay hud){
      
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
 public void shoot(){

    
//gun.play();
    
} 

 public boolean getDestroyed2(Os universe){
  
   buffer.setScaleX(randomInt(35,50));
     buffer.setScaleY(randomInt(35,50));
       buffer.setScaleZ(randomInt(35,50));
     
    return    true;    
  }
  public boolean getDestroyed(Os universe){
  
   buffer.setScaleX(randomInt(5,15));
     buffer.setScaleY(randomInt(5,15));
       buffer.setScaleZ(randomInt(5,15));
  
 
  
     // gameObjectXGroup.setTranslateZ(gameObjectXGroup.getTranslateZ()+100);
     
     
  return    true;
      
  }
  
  
  
  

 
 public MotionCamera getMotionCameraCamera(){
    
    return onboardCam;
}




public boolean move(){
    return true;
}

 public String getName(){
     return name;
 } 

  
   
   
      
 public boolean control(){
  
   
   return  true;     //backward();  
   
  }
  public boolean control2(){
  
   
     //   backward();  
    return  true;     //backward();  
    
  }
public boolean control3(){
  
   
     //   backward();  
     return  true;     //backward();  
   
  }
public boolean ai(Os u){
    
    return  true;     //backward();  
     
}
public boolean ai2(Os u){
   return  true;     //backward();  
   
}
public boolean ai3(Os u){
    
  return  true;     //backward();  
      
}
public boolean ai4(Os u){
    return  true;     //backward();  
    
}


 public boolean LoadModel(XGroup  x){
  gameObjectXGroup=x;  
    return  true;     //backward();  
   
 }
 
 public boolean synchronizePosition(XGroup model){
     gameObjectXGroup.setTranslateX(model.getTranslateX());
     gameObjectXGroup.setTranslateY((model.getTranslateY()));
      gameObjectXGroup.setTranslateZ((model.getTranslateZ())); 
     return  true;     //backward();  
     
 }
 public boolean synchronizePosition(PerspectiveCamera model){
     gameObjectXGroup.setTranslateX(model.getTranslateX());
     gameObjectXGroup.setTranslateY((model.getTranslateY()));
      gameObjectXGroup.setTranslateZ((model.getTranslateZ())); 
     return  true;     //backward();  
     
 }
         
public double getHit(){
    return hit;
}


 
  
  
  
public boolean incrementHit(){
    hit++;
      return  true;     //backward();  
   
} 

 public boolean decrememntHit(){
     
hit--;
  return  true;     //backward();  
   
}
 public boolean setID(int i){
    id=i; 
      return  true;     //backward();  
   
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
    return true;   
  }
public double getPoints(){
    return points;
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
            
  

 public void playDestroyed(){
  
      //  scaleTransition.play();      
    }  
  
 public void kenetics(Stack<Prototype>  gameObjectMatrix){
    
  //  ai();
 }
  public void gameLoopProcess(Stack<Prototype>  gameObjectMatrix){
    kenetics(gameObjectMatrix);  
  } 
  public boolean engineOn(){
     // if(!track.isPlaying()){
     // track.play();
     // }
     // else if(track.isPlaying()){
return true;      
     // }
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
    
    
public boolean setScale(double v){
    this.getGroup().setScaleX(v);
    this.getGroup().setScaleY(v);
    this.getGroup().setScaleZ(v);
    return true;
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
 




 public void  Prototype(){
   
    
     
         gameObjectXGroup=new XGroup();
          buffer=new Sphere();
     buffer2=new Sphere();
  
 
 lo=new LightObject();   
lo.lightThis2(gameObjectXGroup);
gameObjectXGroup.setOpacity(0);
       
        
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
    

  
  
public boolean  collisionDetection( Os universe){

   return enable;          
} 
 
  public boolean sheildEarlyDetection(Os universe){
           

return true;
  }
 
 
  


  


  
}
