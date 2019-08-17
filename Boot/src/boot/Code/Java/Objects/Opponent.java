/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Objects;

import java.util.Stack;

import boot.Code.Java.Support.Attack;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Sphere;
import static boot.Code.Java.Objects.Torpedo.sendToheadsUpDisplay;
import  boot.Code.Java.Support.XGroup;
import boot.Interface.Playable;
import boot.Os;
import  boot.Code.Java.Support.TorpedoLauncher;
import  boot.Code.Java.Support.LightObject;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

/**
 *
 * @author Richardo
 */
public class Opponent extends PrototypeObject implements Playable{
  String name="Opponent";
  Attack attack=new Attack();
 private Stack<Playable> ObjectMatrix;
  @Override
  public String getName()  {
    return name;
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
        buffer.setVisible(true);
        buffer2.setVisible(true);
        // buffer.setOpacity(.5);

    }


    public  Opponent(String name,double x,double y, double z,double a,double b,double c,double size){
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

        gameObjectXGroup.getChildren().add(buffer2);
        gameObjectXGroup.getChildren().add(buffer);
    }
  public boolean  collisionDetection( Os universe){
     boolean detect=false;

            ObjectMatrix=universe.getCoreMatrix();

      Playable static_bloc =ObjectMatrix.get(randomInt(0,ObjectMatrix.size()));
            if (static_bloc != this&&static_bloc.getGroup().getBoundsInParent().intersects(this.getGroup().getBoundsInParent())) {
          //    this.getSphere().setRadius(700);

                collissionResponse( static_bloc, universe);
            
            
            }

      int number=ObjectMatrix.size();
       static_bloc =ObjectMatrix.get(randomInt(0,number));
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
    public boolean ai(Os u){
      int a=randomInt(0,6);
      if(a==6){
          attack.attack0(this.getGroup());
      }
    else if(a==1) {
          attack.attack1(this.getGroup());
      }
      else if(a==2) {
          attack.attack2(this.getGroup());
      }
      else if(a==3) {
          attack.attack3(this.getGroup());
      }
      else if(a==4) {
          attack.attack4(this.getGroup());
      }

      else if(a==5) {
          attack.attack5(this.getGroup());
      }


       // attack.attack1(this.getGroup());
       // attack.attack2(this.getGroup());
       // attack.attack4(this.getGroup());
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



    public void collissionResponse(Playable static_bloc,Os universe) {
        if(static_bloc.getName()=="Torpedo"&&this.getName()=="Opponent"){
            sendToheadsUpDisplay.send("Torpedo hits Opponent");
            //   sendToheadsUpDisplay.send("game over");
            static_bloc.loadSheild(universe);
            getDestroyed( universe);
            buffer.setRadius(randomInt(25,125));
            this.changeMissile();
            this.incrementHit();
            //universe.incrementScore(randomDouble(0,10));

            static_bloc.setState("collided");
            this.setState("collided");
            //universe.getStageLoader().loadStreams(universe,"Opponent",universe.getResourceManager().getModelName(randomInt(0,3)),120000,0,29000,0,0,0,.1);
            universe.getHud().refreshScreen(universe);
            this.getDestroyed(universe);
            //  this.getGroup().setTranslateX(static_bloc.getGroup().getTranslateX());
            //  this.getGroup().setTranslateY(static_bloc.getGroup().getTranslateY());
            //  this.getGroup().setTranslateZ(static_bloc.getGroup().getTranslateZ());
            //   universe.getHud().incrementHit(universe);


            // static_bloc.setName("hit");
            //this.setState("destroyed");

            this.changeMissile();
            if(static_bloc.getHit()>100){
                static_bloc.setName("hit");
                this.setName("hit");
                if(universe.getCoreMatrix().size()<3){
                    // universe.switchStage();
                }

            }


        }

        if(static_bloc.getName()=="Player"&&this.getName()=="Opponent"){
            sendToheadsUpDisplay.send("Player hits Opponent");
            //   sendToheadsUpDisplay.send("game over");

            // this.getGroup().setTranslateZ(60000);

            // this.setTransition(universe.getParallelBehavior().intoScreen(universe,  this.getGroup()));
            //universe.getStageLoader().loadStreams(universe,"Opponent",universe.getResourceManager().getModelName(randomInt(0,3)),120000,0,29000,0,0,0,.1);
            universe.getHud().refreshScreen(universe);
            this.getDestroyed(universe);
            //  this.getGroup().setTranslateX(static_bloc.getGroup().getTranslateX());
            //  this.getGroup().setTranslateY(static_bloc.getGroup().getTranslateY());
            //  this.getGroup().setTranslateZ(static_bloc.getGroup().getTranslateZ());



            if(static_bloc.getHit()>3){

                if(universe.getCoreMatrix().size()<3){
                    // universe.switchStage();
                }

            }

        }
        if(static_bloc.getName()=="Opponent"&&this.getName()=="Torpedo"){
            sendToheadsUpDisplay.send("Torpedo hits Opponent");
            //   sendToheadsUpDisplay.send("game over");
            static_bloc.loadSheild(universe);
            static_bloc.incrementHit();
            this.incrementHit();
            universe.incrementScore(randomDouble(0,10));

            this.setTransition(universe.getParallelBehavior().down(universe,  this.getGroup()));
            //universe.getStageLoader().loadStreams(universe,"Opponent",universe.getResourceManager().getModelName(randomInt(0,3)),120000,0,29000,0,0,0,.1);
            universe.getHud().refreshScreen(universe);
            this.getDestroyed(universe);
            //  this.getGroup().setTranslateX(static_bloc.getGroup().getTranslateX());
            //  this.getGroup().setTranslateY(static_bloc.getGroup().getTranslateY());
            //  this.getGroup().setTranslateZ(static_bloc.getGroup().getTranslateZ());
            universe.getHud().incrementHit(universe);

            this.setName("hit");
            static_bloc.setName("hit");
            //this.setState("destroyed");
            buffer.setRadius(randomInt(25,125));
            this.changeMissile();
            if(static_bloc.getHit()>3){

                if(universe.getCoreMatrix().size()<3){
                    // universe.switchStage();
                }

            }

        }

    }


}
