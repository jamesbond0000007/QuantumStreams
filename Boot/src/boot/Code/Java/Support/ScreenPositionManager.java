/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Support;
import boot.Interface.Stateable;
import javafx.geometry.Pos;

import java.util.ArrayList;
/**
 *
 * @author Richardo
 */
public class ScreenPositionManager implements Stateable{
Pos screenPos;
 private  Position topleft;
 private  Position topMiddle;  
 private  Position topRight;  
 private  Position middleLeft;  
 private  Position centre;  
 private  Position middleRight;  
 private  Position bottomLeft;  
 private  Position bottomMiddle;  
 private  Position bottomRight;  
 
 private ArrayList<Position> screenPosition=new ArrayList<Position>();

 
 public void ScreenManager(){
    
 }
 {
  topleft=new Position(-2500,174,7500,"Top Left"); //
  topMiddle=new Position(-400,174,7500,"Top Middle");  
  topRight=new Position(1800,174,7500,"Top Right"); //
  middleLeft=new Position(-2200,-800,7500,"Middle Left");
  centre=new Position(-400,-300,7500,"Centre");
  middleRight=new Position(2700,700,7500,"Middle Right");
  bottomLeft=new Position(-2500,700,7500,"Bottom Left"); //
  bottomMiddle=new Position(-400,1700,7500,"Bottom Middle");
  bottomRight=new Position(-700,0,7500,"Bottom Right"); //good
  
  screenPosition.add(topleft);
  screenPosition.add(topMiddle);
  screenPosition.add(topRight);
  screenPosition.add(middleRight);
  screenPosition.add(middleLeft);
  screenPosition.add(centre);
  screenPosition.add(bottomLeft);
  screenPosition.add(bottomMiddle);
  screenPosition.add(bottomRight);   
 }
 public Position getTopLeft(){
 
     return screenPosition.get(0);
 }
  public Position getTopRight(){
    return screenPosition.get(2);   
 }
   public Position getTopMiddle(){
   return screenPosition.get(1);    
 }
  public Position getCentre(){
    return screenPosition.get(5);   
 } 
   public Position getMiddleLeft(){
   return screenPosition.get(4);    
 }
   
    public Position getMiddleRight(){
    return screenPosition.get(3);   
 }
  public Position getBottomLeft(){
    return screenPosition.get(6);   
 } 
 
 public Position getBottomMiddle(){
    return screenPosition.get(7);   
 } 
  public Position getBottomRight(){
    return screenPosition.get(8);   
 }
  
  public Position getPosition(int num){
    return   screenPosition.get(num);
  }
   public String getPositionName(int num){
    return   screenPosition.get(num).getName();
  }
  
public String getState(){

return "State";
}
    public boolean setState(String f){
    return true;    
    }  
}
