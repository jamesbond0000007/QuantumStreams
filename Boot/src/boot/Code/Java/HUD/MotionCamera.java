/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.HUD;

import java.util.Observable;
import java.util.Observer;
import javafx.scene.PerspectiveCamera;
import boot.Os;
import boot.Interface.Stateable;
import boot.Code.Java.Objects.PrototypeObject;
//=================================Support PacK=====================================================
import boot.Code.Java.Support.XGroup;
//===================================================================================
/**
 *
 * @author Richardo
 */
public class MotionCamera implements Stateable, Observer{
    protected  String state="initialise";
    PrototypeObject rap;
     double cameraDistance =-390000.0;//68000; //12800;//1999900;//965//990650
     final PerspectiveCamera camera = new PerspectiveCamera(true);
        final XGroup cameraXGroup = new XGroup();
   final XGroup cameraXGroup2 = new XGroup();
   final XGroup cameraXGroup3 = new XGroup();
   MotionCamera (){
       
   }
   
   public PerspectiveCamera getCamera(){
       return camera;
   }
    public void buildCamera(Os s) {
        setState("buildCamera");
        s.getHud().getUniverse().getChildren().add(cameraXGroup);
        cameraXGroup.getChildren().add(cameraXGroup2);
        cameraXGroup2.getChildren().add(cameraXGroup3);
        cameraXGroup3.getChildren().add(camera);
         cameraXGroup3.getChildren().add(s.getHud().getGUI());
       
     cameraXGroup3.getChildren().add(s.getHud().getXform(s));
        
        cameraXGroup.rx.setAngle(0);
       cameraXGroup.ry.setAngle(0);
       cameraXGroup.rz.setAngle(0);
          camera.setFieldOfView(100.0);//90default   do not change it will affect hud
        camera.setNearClip(100.25);//100//
        camera.setFarClip(100000000000.0);//20000000000000
        camera.setTranslateZ(cameraDistance);
        s.getHud().setHUDDistance(cameraDistance+2300);
        //============================================================
      
//camera.setTranslateY(9000);
    } 
   public void setCameraDistance(double f) {
       cameraDistance=f;
   }
   public double getCameraDistance(){
       return cameraDistance;
   }
       public XGroup getCameraXGroup(){
        return cameraXGroup;
    }
  
      public XGroup getCameraXGroup2(){
        return cameraXGroup2;
    }
      
       public XGroup getCameraXGroup3(){
        return cameraXGroup3;
    }
       
       public void update(Observable obj, Object arg) {
  setState("update");

rap=(PrototypeObject)arg;


 cameraXGroup3.setTranslateX(rap.getGroup().getTranslateX());;
 cameraXGroup3.setTranslateY(rap.getGroup().getTranslateY());;
 cameraXGroup3.setTranslateY(rap.getGroup().getTranslateZ()+cameraXGroup3.getTranslateZ());;
 
   } 
  public String getState(){

return state;


}
    public boolean setState(String st){
      state=  st;
   return true;
    }     
}
