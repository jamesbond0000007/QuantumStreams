/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Input;
import boot.Code.Groovy.Animation.Locations;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.input.MouseEvent;
import boot.Code.Java.Animation.AnimationSystem;
import boot.Os;
/**
 *
 * @author Richardo
 */
public class Mouse implements Runnable{
    AnimationSystem am=new AnimationSystem();
   double  entrypoint=125000;
    Scene scene;
    Locations locations = new Locations();
    Os os;
     int missileSize=1500;
     double DELTA_MULTIPLIER = 200.0;
    double CONTROL_MULTIPLIER = 0.1;
    double SHIFT_MULTIPLIER = 0.1;
    double ALT_MULTIPLIER = 0.5;
    double mousePosX;
    double mousePosY;
        double mousePosZ;
    double mouseOldX;
    double mouseOldY;
     double mouseOldZ;
    double mouseDeltaX;
    double mouseDeltaY;
       double mouseDeltaZ;
    double xComponent;
    double ycomponent;
       private double initX;
    private double initY;
    private Point2D dragAnchor;
         double modifier = 1.0;
                double modifierFactor = 0.1;{
        locations.load()    ;
    }
  public  Mouse(){
  
  }
          public void handleMouse(Scene scene, Os os) {
        scene.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent me) {
                mousePosX = me.getSceneX();
                mousePosY = me.getSceneY();
                mouseOldX = me.getSceneX();
                mouseOldY = me.getSceneY();
               
            }
        });
        
         os.getHud().getHexagonDialog().setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent me) {
           System.out.println("Hello");
            os.getHud().getHexagonDialog().setVisible(false);
              os.getHud().getHexagon2Dialog().setVisible(false);
               os.getHud().getDialogBox().setVisible(false);
            }
        });

              scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent me) {
           System.out.println("Good bye");
              os.getHud().getHexagonDialog().setVisible(false);
              os.getHud().getHexagon2Dialog().setVisible(false);
               os.getHud().getDialogBox().setVisible(false);

            //    am.moveZ(os.getPlayer().getGroup(),os.getPlayer().getGroup().getTranslateZ(),os.getPlayer().getGroup().getTranslateZ()+locations.getDistance("CloseToHome"), 800, 1,false).play();
               // am.moveZ(os.getHud().getMotionCamera().getCameraXGroup3(),os.getHud().getMotionCamera().getCameraXGroup3().getTranslateZ(), os.getHud().getMotionCamera().getCameraXGroup3().getTranslateZ()+locations.getDistance("CloseToHome"), 801, 1,false).play();
            }
        }); 
      scene.setOnMouseMoved((MouseEvent me) -> {
     mouseOldX = mousePosX;
                mouseOldY = mousePosY;
                mousePosX = me.getSceneX();
                mousePosY = me.getSceneY();
            
                mouseDeltaX = (mousePosX - mouseOldX);
                mouseDeltaY = (mousePosY - mouseOldY);

        double modifier = 3.0;
        double modifierFactor = 0.1;

        if (me.isControlDown()) {
            modifier = 0.1;                
        }
        if (me.isShiftDown()) {
            modifier = 10.0;
        }
 os.getWorld().rz.setAngle(  os.getWorld().rz.getAngle() + mouseDeltaX * modifierFactor * modifier * 2.0);  // +
   os.getWorld().rx.setAngle(  os.getWorld().rx.getAngle() + mouseDeltaY * modifierFactor * modifier * 2.0);
          os.getWorld().rz.setAngle(  os.getWorld().rz.getAngle() + mouseDeltaY * modifierFactor * modifier * 2.0);


      });
         
         
        scene.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent me) {
                mouseOldX = mousePosX;
                mouseOldY = mousePosY;
                mousePosX = me.getSceneX();
                mousePosY = me.getSceneY();
            
                mouseDeltaX = (mousePosX - mouseOldX);
                mouseDeltaY = (mousePosY - mouseOldY);
              

                double modifier = 1.0;
                double modifierFactor = 0.1;

             
                if (me.isPrimaryButtonDown()) {
                    os.getWorld().rz.setAngle(  os.getWorld().rz.getAngle() + mouseDeltaX * modifierFactor * modifier * 2.0);  // +
                    os.getWorld().rx.setAngle(  os.getWorld().rx.getAngle() + mouseDeltaY * modifierFactor * modifier * 2.0);
                    os.getWorld().rz.setAngle(  os.getWorld().rz.getAngle() + mouseDeltaY * modifierFactor * modifier * 2.0);






                    os.getRapter(os.getPlayerNumber()).getLauncher().launch(os);
                                  
                                   
               
                    
                } else if (me.isSecondaryButtonDown()) {
                    os.getWorld().rz.setAngle(  os.getWorld().rz.getAngle() + mouseDeltaX * modifierFactor * modifier * 2.0);  // +
                    os.getWorld().rx.setAngle(  os.getWorld().rx.getAngle() + mouseDeltaY * modifierFactor * modifier * 2.0);
                    os.getWorld().rz.setAngle(  os.getWorld().rz.getAngle() + mouseDeltaY * modifierFactor * modifier * 2.0);


                    os.getRapter(os.getPlayerNumber()).getLauncher().launch2(os);
                          
                         // os.getRotationBehavior(os, 1);
                                
                    
                }
                else if (me.isMiddleButtonDown()) {
                    os.getWorld().rz.setAngle(  os.getWorld().rz.getAngle() + mouseDeltaX * modifierFactor * modifier * 2.0);  // +
                    os.getWorld().rx.setAngle(  os.getWorld().rx.getAngle() + mouseDeltaY * modifierFactor * modifier * 2.0);
                    os.getWorld().rz.setAngle(  os.getWorld().rz.getAngle() + mouseDeltaY * modifierFactor * modifier * 2.0);

                    os.getRapter(os.getPlayerNumber()).getLauncher().launch3(os);
                }
            }
        });
          }
           public double getModifier(){
       return modifier;
   }
 public double getModifierFactor(){
       return modifierFactor;
   }
 public Mouse getMouse()  {
     return this;
 }    
       
  public  double getDELTA_MULTIPLIER(){
      return DELTA_MULTIPLIER;
  }
  public  double getCONTROL_MULTIPLIER(){
      return CONTROL_MULTIPLIER;
  }
  public  double getSHIFT_MULTIPLIER (){
      return SHIFT_MULTIPLIER;
  }
   public double getALT_MULTIPLIER(){
       return ALT_MULTIPLIER;
   }
    public double getmousePosX(){
        return mousePosX;
    }
    public double getmousePosY(){
        return mousePosY;
    }
   public      double getmousePosZ(){
       return mousePosZ;
   }
   public  double getmouseOldX(){
       return mouseOldX;
   }
   public double getmouseOldY(){
       return mouseOldY;
   }
   public  double getmouseOldZ(){
       return mouseOldZ;
   }
   public  double getmouseDeltaX(){
       return mouseDeltaX;
   }
   public  double getmouseDeltaY(){
       return mouseDeltaY;
   }
   public    double getmouseDeltaZ(){
       return mouseDeltaZ;
   }
   public double getxComponent(){
       return xComponent;
   }
  public  double getycomponent()  {
      return ycomponent;
  }  
  
 public void setXComponent(double g) {
    xComponent=g;
    double ycomponent;  
 }
 public void setYComponent(double g) {
  
     ycomponent=g;  
 }
  public  int randomInt(int low, int high)
{ 
int result=0;
        result = (int)(Math.random() 
* (high - low + 1)) + low;
     
return result;
}
public  double randomDouble(double low, double high)
{ 
double result=0;
        result = (double)(Math.random() 
* (high - low + 1)) + low;
     
return result;
}  
public void updateMouse(Scene sceneX, Os oss){
    os=oss;
    scene=sceneX;
}
public void run(){
 try{
     handleMouse(scene, os);
 }
catch(Exception e) {
    
}
}
        


  }
          

