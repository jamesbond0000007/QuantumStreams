/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Objects;
import boot.Code.Java.Animation.AnimationSystem;
import boot.Code.Java.Support.XGroup;
import java.util.Stack;
import javafx.scene.paint.Color;
import javafx.scene.shape.Sphere;
import static boot.Code.Java.Objects.Torpedo.sendToheadsUpDisplay;
import boot.Interface.Playable;
import boot.Os;
import boot.Code.Java.Support.TorpedoLauncher;
import boot.Code.Java.Support.LightObject;
/**
 *
 * @author Richardo
 */
public class Player extends PrototypeObject implements Runnable,Playable{
    Os opx;
    int hitt=0;
     private Stack<Playable> ObjectMatrix;
    String name="Player";

  @Override
  public String getName()  {
    return "Player";
}
  public boolean incrementHit(){
    hitt++;
    return true;
} 
   public void  resetHit(){
    hitt=0;
 }
    AnimationSystem am;
    {
        am=new AnimationSystem();
    }
    public AnimationSystem getEngine(){
        return am;
    }

public  Player(String name,double x,double y, double z,double a,double b,double c,double size){
    gameObjectXGroup=new XGroup();
    buffer=new Sphere();
      buffer2=new Sphere();    
      //  buffer2=new Sphere();
  launcher=new TorpedoLauncher();
       setName(this.getName());
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
public double getHit(){
    return hitt;
}

public void process(Os os){
  opx=os;  
}
public  void run(){

                    
                        
}

public boolean  collisionDetection( Os universe){
     boolean detect=false;

            ObjectMatrix=universe.getCoreMatrix();
int number=ObjectMatrix.size();
    Playable static_bloc =ObjectMatrix.get(randomInt(0,number));
            if (static_bloc != this&&static_bloc.getGroup().getBoundsInParent().intersects(this.getGroup().getBoundsInParent())) {
                collissionResponse( static_bloc, universe);
                static_bloc =ObjectMatrix.get(randomInt(0,number));
                if (static_bloc != this&&static_bloc.getGroup().getBoundsInParent().intersects(this.getGroup().getBoundsInParent())) {
                    collissionResponse( static_bloc, universe);
                }
            }
     static_bloc =ObjectMatrix.get(randomInt(0,number));
    if (static_bloc != this&&static_bloc.getGroup().getBoundsInParent().intersects(this.getGroup().getBoundsInParent())) {
        collissionResponse( static_bloc, universe);

    }

    static_bloc =ObjectMatrix.get(randomInt(0,number));
    if (static_bloc != this&&static_bloc.getGroup().getBoundsInParent().intersects(this.getGroup().getBoundsInParent())) {
        collissionResponse( static_bloc, universe);
    }
    static_bloc =ObjectMatrix.get(randomInt(0,number));
    if (static_bloc != this&&static_bloc.getGroup().getBoundsInParent().intersects(this.getGroup().getBoundsInParent())) {
        collissionResponse( static_bloc, universe);
    }

    static_bloc =ObjectMatrix.get(randomInt(0,number));
    if (static_bloc != this&&static_bloc.getGroup().getBoundsInParent().intersects(this.getGroup().getBoundsInParent())) {
        collissionResponse( static_bloc, universe);

    }
    static_bloc =ObjectMatrix.get(randomInt(0,number));
    if (static_bloc != this&&static_bloc.getGroup().getBoundsInParent().intersects(this.getGroup().getBoundsInParent())) {
        collissionResponse( static_bloc, universe);

    }

    static_bloc =ObjectMatrix.get(randomInt(0,number));
    if (static_bloc != this&&static_bloc.getGroup().getBoundsInParent().intersects(this.getGroup().getBoundsInParent())) {
        collissionResponse( static_bloc, universe);
    }
    static_bloc =ObjectMatrix.get(randomInt(0,number));
    if (static_bloc != this&&static_bloc.getGroup().getBoundsInParent().intersects(this.getGroup().getBoundsInParent())) {
        collissionResponse( static_bloc, universe);
    }

    static_bloc =ObjectMatrix.get(randomInt(0,number));
    if (static_bloc != this&&static_bloc.getGroup().getBoundsInParent().intersects(this.getGroup().getBoundsInParent())) {
        collissionResponse( static_bloc, universe);

    }
    static_bloc =ObjectMatrix.get(randomInt(0,number));
    if (static_bloc != this&&static_bloc.getGroup().getBoundsInParent().intersects(this.getGroup().getBoundsInParent())) {
        collissionResponse( static_bloc, universe);

    }

    static_bloc =ObjectMatrix.get(randomInt(0,number));
    if (static_bloc != this&&static_bloc.getGroup().getBoundsInParent().intersects(this.getGroup().getBoundsInParent())) {
        collissionResponse( static_bloc, universe);
    }
    static_bloc =ObjectMatrix.get(randomInt(0,number));
    if (static_bloc != this&&static_bloc.getGroup().getBoundsInParent().intersects(this.getGroup().getBoundsInParent())) {
        collissionResponse( static_bloc, universe);
    }

    static_bloc =ObjectMatrix.get(randomInt(0,number));
    if (static_bloc != this&&static_bloc.getGroup().getBoundsInParent().intersects(this.getGroup().getBoundsInParent())) {
        collissionResponse( static_bloc, universe);

    }

    return detect;
} 
  public void collissionResponse(Playable static_bloc,Os universe){
      //    this.getSphere().setRadius(700);

      if(static_bloc.getName()=="XTorpedo"&&this.getName()=="Player"){
          sendToheadsUpDisplay.send("XTorpedo hits Player");
          //   sendToheadsUpDisplay.send("game over");
          static_bloc.loadSheild(universe);
          this.incrementHit();
          static_bloc.setState("collided");
          // this.setState("collided");

          universe.getHud(). decrementLifeDisplay( universe);
          universe.getHud().updateLifeDisplay(universe);
          //universe.getStageLoader().loadStreams(universe,"Opponent",universe.getResourceManager().getModelName(randomInt(0,3)),120000,0,29000,0,0,0,.1);
          universe.getHud().refreshScreen(universe);
          static_bloc.getDestroyed(universe);
          //  this.getGroup().setTranslateX(static_bloc.getGroup().getTranslateX());
          //  this.getGroup().setTranslateY(static_bloc.getGroup().getTranslateY());
          //  this.getGroup().setTranslateZ(static_bloc.getGroup().getTranslateZ());
          //   universe.getHud().incrementHit(universe);

          // static_bloc.setName("hit");
          //this.setState("destroyed");
          buffer.setRadius(randomInt(25,125));
          this.changeMissile();
          if(static_bloc.getHit()>100){

              static_bloc.setName("hit");
              if(universe.getCoreMatrix().size()<3){
                  // universe.switchStage();
              }

          }


      }



      this.changeMissile();
      if(static_bloc.getHit()>3){

          if(universe.getCoreMatrix().size()<3){
              // universe.switchStage();
          }

      }
  }
}
