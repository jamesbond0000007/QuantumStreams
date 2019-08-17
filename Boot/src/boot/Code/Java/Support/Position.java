/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Support;

import boot.Interface.Stateable;


/**
 *
 * @author Richardo
 */
public class Position implements Stateable{
 
    private double _x;
    private double _y;
    private double _z;
   private String _name;
     public  Position(double x,double y,double z,String name){
        
        _name=name;
     _x=x;
     _y=y;
     _z=z;
    }
   public String getName(){
       return _name;
   } 
    public void Position(double x,double y,double z,String name){
        _name=name;
     _x=x;
     _y=y;
     _z=z;
    }
 
    public double getX(){
        return _x;
    }
    public double getY(){
        return _y;
    }
    
      public double getZ(){
        return _z;
    }
   
public String getState(){

return "State";
}
    public boolean  setState(String f){
      return true;  
    }  
    
    
    
}
