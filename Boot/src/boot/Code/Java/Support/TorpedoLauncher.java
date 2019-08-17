/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Support;
import boot.Os;
import boot.Code.Java.Objects.Torpedo;
/**
 *
 * @author Richardo
 */
public class TorpedoLauncher extends XGroup{
      double  entrypoint=45000;
       double  entrypoint2=90000;
         int missileSize=2511;
            double xComponent;
    double ycomponent;
         double modifier = 1.0;
                double modifierFactor = 0.1;

  public TorpedoLauncher() {
      
  } 
  
  public void launch3(Os os){
     
                   try{
                       // os.getWorld().rz.setAngle(  os.getWorld().rz.getAngle() +os.getMouse().getmouseDeltaX()  * modifierFactor * modifier * 2.0);  // +
             //os.getWorld().ry.setAngle(  os.getWorld().ry.getAngle() +os.getMouse().getmouseDeltaX()  * modifierFactor * modifier * 2.0);  // +
   //  os.getWorld().rx.setAngle(  os.getWorld().rx.getAngle() + os.getMouse().getmouseDeltaY() * modifierFactor * modifier * 2.0);
       //     os.getHud().getCameraXGroup().rx.setAngle(((os          
                    
             
                      
      XGroup torpedoForm=new XGroup();
                            Torpedo sidewinder= new Torpedo(os.getPlayer().getGroup().getTranslateX()+1000,os.getPlayer().getGroup().getTranslateY(),os.getPlayer().getGroup().getTranslateZ()-2000);
                               sidewinder.getGroup().setId("Torpedo");
                               //  sidewinder.InitialiseComunication(os.getHud());
                 //   sidewinder.synchronizePosition(os.getPlayer().getGroup());
        sidewinder.setName("Torpedo");
;
    
             
               
                 sidewinder.setTorpedoSize(missileSize);
                            torpedoForm.getChildren().add(sidewinder.turn3Target(sidewinder.getGroup(), os.getGameObject(os.getXGameObject(os)).getGroup()));
                     os.injectIntoWorld(torpedoForm);
                     os.insertIntoGameObjectMatrix(sidewinder);
                  os.getMusicResource().select(2).play();
                          
                          
                          }
                       catch(Exception e){
                          
                      }               
                          
                    
                         
  }
  public void launch2(Os os){
         try{
              //os.getWorld().rz.setAngle(  os.getWorld().rz.getAngle() +os.getMouse().getmouseDeltaX()  * modifierFactor * modifier * 2.0);  // +
                 //  os.getWorld().ry.setAngle(  os.getWorld().ry.getAngle() +os.getMouse().getmouseDeltaX()  * modifierFactor * modifier * 2.0);  // +
     //os.getWorld().rx.setAngle(  os.getWorld().rx.getAngle() + os.getMouse().getmouseDeltaY() * modifierFactor * modifier * 2.0);
       //     os.getHud().getCameraXGroup().rx.setAngle(((os          
             
                      
      XGroup torpedoForm=new XGroup();
                            Torpedo sidewinder= new Torpedo(os.getPlayer().getGroup().getTranslateX()+1000,os.getPlayer().getGroup().getTranslateY(),os.getPlayer().getGroup().getTranslateZ()-2000);
                               sidewinder.getGroup().setId("Torpedo");
                                // sidewinder.InitialiseComunication(os.getHud());
                  //  sidewinder.synchronizePosition(os.getPlayer().getGroup());
        sidewinder.setName("Torpedo");

    
             
               
                 sidewinder.setTorpedoSize(missileSize);
                           torpedoForm.getChildren().add(sidewinder.turn3Target(sidewinder.getGroup(), os.getGameObject(os.randomInt(3,os.countOpponents(true))).getGroup()));
                     os.injectIntoWorld(torpedoForm);
                     os.insertIntoGameObjectMatrix(sidewinder);
                  os.getMusicResource().select(2).play();        
                          }
                       catch(Exception e){
                          
                      }               
                     
                                
                    
                }

  
  public  void launch(Os os){
 
        try{
     //os.getWorld().rz.setAngle(  os.getWorld().rz.getAngle() +os.getMouse().getmouseDeltaX()  * modifierFactor * modifier * 2.0);  // +

                      
      XGroup torpedoForm=new XGroup();
                            Torpedo sidewinder= new Torpedo(os.getPlayer().getGroup().getTranslateX()+1000,os.getPlayer().getGroup().getTranslateY(),-entrypoint);
                               sidewinder.getGroup().setId("Torpedo");
                                 sidewinder.InitialiseComunication(os.getHud());
                    sidewinder.synchronizePosition(os.getPlayer().getGroup());
        sidewinder.setName("Torpedo");
;
    
             
               
                 sidewinder.setTorpedoSize(missileSize);
                            torpedoForm.getChildren().add(sidewinder.turn3Target(sidewinder.getGroup(), os.getGameObject(os.randomInt(3,os.countOpponents(true))).getGroup()));
                     os.injectIntoWorld(torpedoForm);
                     os.insertIntoGameObjectMatrix(sidewinder);
                  os.getMusicResource().select(2).play();
                          
  //=====================================================================================
                   
      XGroup torpedoForm2=new XGroup();
                            Torpedo sidewinder2= new Torpedo(os.getPlayer().getGroup().getTranslateX()+1000,os.getPlayer().getGroup().getTranslateY(),-entrypoint);
                               sidewinder2.getGroup().setId("Torpedo");
                                 sidewinder2.InitialiseComunication(os.getHud());
                    sidewinder2.synchronizePosition(os.getPlayer().getGroup());
        sidewinder2.setName("Torpedo");
;
    
             
               
                 sidewinder2.setTorpedoSize(missileSize);
                            torpedoForm2.getChildren().add(sidewinder2.turn3Target(sidewinder2.getGroup(), os.getGameObject(os.getYGameObject(os)).getGroup()));
                     os.injectIntoWorld(torpedoForm2);
                     os.insertIntoGameObjectMatrix(sidewinder2);
  //=================================================================================
  

                     
      XGroup torpedoForm3=new XGroup();
                            Torpedo sidewinder3= new Torpedo(os.getPlayer().getGroup().getTranslateX()+1000,os.getPlayer().getGroup().getTranslateY(),os.getPlayer().getGroup().getTranslateZ()-2000);
                               sidewinder3.getGroup().setId("Torpedo");
                               //  sidewinder3.InitialiseComunication(os.getHud());
                  //  sidewinder3.synchronizePosition(os.getPlayer().getGroup());
        sidewinder3.setName("Torpedo");
;
    
             
               
                 sidewinder3.setTorpedoSize(missileSize);
                            torpedoForm3.getChildren().add(sidewinder3.turn3Target(sidewinder3.getGroup(), os.getGameObject(os.getXGameObject(os)).getGroup()));
                     os.injectIntoWorld(torpedoForm3);
                     os.insertIntoGameObjectMatrix(sidewinder3);
                          }
                       catch(Exception e){
                          
                      }               
                          
                    
                                  
                                   
               
                    
                }   
  }

