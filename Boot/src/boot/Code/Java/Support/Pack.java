/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Support;

import boot.ResourceManager;
import java.util.ArrayList;
import boot.Os;

/**
 *
 * @author Richardo
 */
public class Pack  {
    private ArrayList<Double> xPositionMatrix=new ArrayList<Double>();  
     private ArrayList<Double> yPositionMatrix=new ArrayList<Double>();  
      private ArrayList<XGroup> gameObjectMatrix=new ArrayList<XGroup>();
      ResourceManager resource=new ResourceManager();
        ScreenPositionManager sm=new ScreenPositionManager();   
      public void insert(ImageX x){
          
          gameObjectMatrix.add(x.getImageX());
          
          
      }
     
      
      public void load(){
         resource.initialize();

          
        /*  xPositionMatrix.add(-680.00);yPositionMatrix.add(-480.00);
         xPositionMatrix.add(-1780.00);yPositionMatrix.add(-1680.00);
         xPositionMatrix.add(880.00);yPositionMatrix.add(-1505.00);
         xPositionMatrix.add(1080.00);yPositionMatrix.add(-1980.00);
         xPositionMatrix.add(1180.00);yPositionMatrix.add(2680.00);
         xPositionMatrix.add(1280.00);yPositionMatrix.add(680.00);
         xPositionMatrix.add(1380.00);yPositionMatrix.add(680.00);
         xPositionMatrix.add(1480.00);yPositionMatrix.add(680.00);
         xPositionMatrix.add(1580.00);yPositionMatrix.add(680.00);
         xPositionMatrix.add(1680.00); yPositionMatrix.add(680.00);*/
        
         
       
        
              
         for(int count=0;count<14;count++){
             ImageX    imageSpawner7=new ImageX()  ;
        
          imageSpawner7.create(resource.getCardName(count));

          insert(imageSpawner7);
         }
      }
      public XGroup get(int x){
        return gameObjectMatrix.get(x);
      }
  
public String getState(){
return "";
}  
  public void switchStage(Os u){
      u.switchStage();
       
    }   
public void enable(){
    
}
public void playDestroyed(){
  
           
    }  


 public  int randomInt(int low, int high)
{ 
int result=0;
        result = (int)(Math.random() 
* (high - low + 1)) + low;
     
return result;
}



 
 
}
