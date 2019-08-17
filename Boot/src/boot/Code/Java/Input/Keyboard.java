/*
 * To chccvvxxange this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Input;
import javafx.scene.Scene;
import boot.Code.Java.HUD.HeadsUpDisplay;
import boot.Code.Java.Objects.Torpedo;
import boot.Interface.Stateable;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

import javafx.util.Duration;
import boot.Os;
/**
 *
 * @author Richardo
 */
public class Keyboard implements Stateable{
    
    HeadsUpDisplay hudx;
    Os os;
    Scene scenex;
     static double zoom=56000;
       static double spin=0;
   int missileSize=300;
    static double number0=0;
    static double number1=0;
    Torpedo sidewinder;
   static    double moveZ=0;
    Torpedo systemTorpedo=new Torpedo(0,0,0);
  
    {
       
    }

    public void userKeyboardInput(Scene scene, Os universe){
    
          hudx=universe.getHud();
          os=universe;
          scenex=scene;
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                Duration currentTime;
               
                switch (event.getCode()) {
               case Q:
                   try{
        
  
               number0=number0+100000;
                      
                   
        universe.getGameObject(7).getGroup().setTranslateZ(number0);
                                
                    
            
                          }
                       catch(Exception e){
                          
                      }               
                            
            
                          
                         // os.getRotationBehavior(os, 1);
                                
                    
                
                    break;
                    
                    
                    
                     case W:
                        zoom=zoom-5000;
                     hudx.setCameraDistance(zoom);
                     hudx.getCamera().setTranslateZ(-zoom);
                     hudx.setHUDDistance(-hudx.getCameraDistance()+-2300);
                     scenex.setCamera(hudx.getCamera());
                    break;
                    
                      case E:
                        zoom=zoom+10000;
                     hudx.setCameraDistance(zoom);
                     hudx.getCamera().setTranslateZ(-zoom);
                     hudx.setHUDDistance(-hudx.getCameraDistance()+-2300);
                     scenex.setCamera(hudx.getCamera());
                    break;   
                       
                     
               
             
                  
               
                      case Z:
                       //  action.Up(os,os.getObject(0).getGroup(),1000);
                       //  action.Up(os,systemTorpedo.getGroup(),1000);
                         
                        break;
                    case DOWN:
                    //  action.Down(os,os.getObject(0).getGroup(),1000);
                    //   action.Down(os,systemTorpedo.getGroup(),1000);
            // systemTorpedo.synchronizePosition(os.getObject(0).getGroup());
                        
                        break;
                    case RIGHT:
                     //   action.Right(os,os.getObject(0).getGroup(),1000) ;
                      //  systemTorpedo.synchronizePosition(os.getObject(0).getGroup());
                      //  action.Right(os,systemTorpedo.getGroup(),1000) ;

        
                          
                        break;
                    case LEFT:
                     //  action.Left(os,os.getObject(0).getGroup(),1000);//static vriable is global and not unique
                      //  systemTorpedo.synchronizePosition(os.getObject(0).getGroup());
                     //  action.Left(os,systemTorpedo.getGroup(),1000);
                      
                             
                        break;
                 
                 case A:
                     
                     for(int count=3;count<12;count++){
                    //   action.outOfScreen(os.getGameObject(count).getGroup());//static vriable is global and not unique
                 
                      
                     }       
                        break;
                }   
                                 
                       
                        
         }
        });
}
public  double randomDouble(double low, double high)
{ 
double result=0;
        result = (double)(Math.random() 
* (high - low + 1)) + low;
     
return result;
}   
public String getState(){

return "State";
}
    public boolean setState(String f){
        
  return true;  }   
    
    
}
