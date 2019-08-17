/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Animation;


import javafx.animation.ParallelTransition;
import javafx.animation.ParallelTransitionBuilder;

import javafx.animation.RotateTransitionBuilder;

import javafx.animation.ScaleTransitionBuilder;
import boot.Code.Java.Support.XGroup;
import javafx.animation.TranslateTransitionBuilder;
import javafx.util.Duration;
import boot.Os;
import boot.Interface.Stateable;
/**
 *
 * @author Richardo
 */
public class ParallelBehavior implements Stateable{
    protected  String state="initialise";
  double limitN=90000;
   double limitP=30000;
   public ParallelTransition outOfScreen(Os os, XGroup rect){
        setState("outOfScreen");
    ParallelTransition parallelTransition;     
    parallelTransition = ParallelTransitionBuilder.create()
            .node(rect)
            .children(
             
              
                 TranslateTransitionBuilder.create()
                    .duration(Duration.seconds(12))
                    .fromZ(limitP)
                    .toZ(randomDouble(9200,limitN))
                    .cycleCount(2)
                    .autoReverse(true)
                    .build()
                    
                   
             
            )
            .cycleCount(1)
            .autoReverse(true)
            .build();
    
    return parallelTransition;
    
 } 
  public ParallelTransition outOfScreenSlow(Os os, XGroup rect){
   os.getSystemMessage().send("outOfScreenSlow");
    ParallelTransition parallelTransition;     
    parallelTransition = ParallelTransitionBuilder.create()
            .node(rect)
            .children(
             
              
                 TranslateTransitionBuilder.create()
                    .duration(Duration.minutes(50))
                    .fromZ(rect.getTranslateZ())
                    .toZ(19000)
                    .cycleCount(1)
                    .autoReverse(false)
                    .build()
                    
                   
             
            )
            .cycleCount(1)
            .autoReverse(false)
            .build();
    
    return parallelTransition;
    
 } 
 
 
   
 public ParallelTransition intoScreen(Os os, XGroup rect){
      setState("intoScreen");
    ParallelTransition parallelTransition;     
    parallelTransition = ParallelTransitionBuilder.create()
            .node(rect)
            .children(
                
             
               
                 TranslateTransitionBuilder.create()
                    .duration(Duration.seconds(12))
                    .fromZ(rect.getTranslateZ())
                    .toZ(randomDouble(8000,limitP))
                    .cycleCount(2)
                    .autoReverse(true)
                    .build()
                    
                  
            
             
            )
            .cycleCount(1)
            .autoReverse(true)
            .build();
    
    return parallelTransition;
    
 }
 public ParallelTransition right(Os os, XGroup rect){
   
   setState("right");
    ParallelTransition parallelTransition;     
    parallelTransition = ParallelTransitionBuilder.create()
            .node(rect)
            .children(
                
                TranslateTransitionBuilder.create()
                    .duration(Duration.seconds(12))
                    .fromX(limitN)
                    .toX(limitP)
                    .cycleCount(2)
                    .autoReverse(true)
                    .build()
               
            
             
            )
            .cycleCount(1)
            .autoReverse(true)
            .build();
    return parallelTransition;
    
 }
  public ParallelTransition left(Os os, XGroup rect){
   
   setState("left");
    ParallelTransition parallelTransition;     
    parallelTransition = ParallelTransitionBuilder.create()
            .node(rect)
            .children(
               
                TranslateTransitionBuilder.create()
                    .duration(Duration.seconds(12))
                    .fromX(rect.getTranslateX())
                    .toX(-9999999)
                    .cycleCount(2)
                    .autoReverse(true)
                    .build()
               
            
             
            )
            .cycleCount(1)
            .autoReverse(true)
            .build();
    return parallelTransition;
    
 }
 
 public ParallelTransition up(Os os, XGroup rect){
     
      setState("up");
      ParallelTransition parallelTransition;     
    parallelTransition = ParallelTransitionBuilder.create()
            .node(rect)
            .children(
                
                TranslateTransitionBuilder.create()
                    .duration(Duration.seconds(12))
                    .fromY(rect.getTranslateY())
                    .toY(-99999999)
                    .cycleCount(2)
                    .autoReverse(true)
                    .build()
               
            
             
            )
            .cycleCount(1)
            .autoReverse(true)
            .build();
    return parallelTransition;
    
 }
  
 public ParallelTransition down(Os os, XGroup rect){
   setState("down");
      ParallelTransition parallelTransition;     
    parallelTransition = ParallelTransitionBuilder.create()
            .node(rect)
            .children(
                
                TranslateTransitionBuilder.create()
                    .duration(Duration.seconds(12))
                    .fromY(rect.getTranslateY())
                    .toY(99999999)
                    .cycleCount(2)
                    .autoReverse(true)
                    .build()
               
            
             
            )
            .cycleCount(1)
            .autoReverse(true)
            .build();
    return parallelTransition;
    
 }
 public ParallelTransition diagonalDown(Os os, XGroup rect){
       setState("diagonalDown");
    ParallelTransition parallelTransition;     
    parallelTransition = ParallelTransitionBuilder.create()
            .node(rect)
            .children(
                     
                  TranslateTransitionBuilder.create()
                    .duration(Duration.seconds(12))
                    .fromX(rect.getTranslateX())
                    .toX(-999999999)
                    .cycleCount(2)
                    .autoReverse(true)
                    .build(),
                TranslateTransitionBuilder.create()
                    .duration(Duration.seconds(12))
                    .fromY(-300000)
                    .toY(300000)
                    .cycleCount(2)
                    .autoReverse(true)
                    .build(), 
                 TranslateTransitionBuilder.create()
                    .duration(Duration.seconds(12))
                    .fromZ(rect.getTranslateZ())
                    .toZ(900000)
                    .cycleCount(2)
                    .autoReverse(true)
                    .build()
            
            )
            .cycleCount(7)
            .autoReverse(true)
            .build();
    
    return parallelTransition;
    
 }
 
 public ParallelTransition rotate(Os os, XGroup rect){
      setState("rotate");
     ParallelTransition parallelTransition;     
    parallelTransition = ParallelTransitionBuilder.create()
            .node(rect)
            .children(
                  RotateTransitionBuilder.create()
                    .duration(Duration.seconds(13))
                       .fromAngle(0)
                    .toAngle(randomDouble(-360,7200))
                    .cycleCount(4)
                    .autoReverse(true)
                    .build()     
                    
              
            )
            .cycleCount(7)
            .autoReverse(true)
            .build();
    return parallelTransition;
    
 }
 
 public ParallelTransition parallelTransition7(Os os, XGroup rect){
   ParallelTransition parallelTransition;     
    parallelTransition = ParallelTransitionBuilder.create()
            .node(rect)
            .children(
              
                TranslateTransitionBuilder.create()
                    .duration(Duration.seconds(2))
                    .fromZ(rect.getTranslateZ())
                    .toZ(99999999.0)
                    .cycleCount(30)
                    .autoReverse(true)
                    .build()
                   
                
            
             
            )
            .cycleCount(2)
            .autoReverse(true)
            .build();
    return parallelTransition;
    
 }
 
 public ParallelTransition scale(Os os, XGroup rect){
    ParallelTransition parallelTransition;     
    parallelTransition = ParallelTransitionBuilder.create()
            .node(rect)
            .children(
                
                    
             
                ScaleTransitionBuilder.create()
                    .duration(Duration.seconds(12))
                    .toX(1)
                    .toY(10)
                    .cycleCount(2)
                    .autoReverse(true)
                    .build()
            )
            .cycleCount(7)
            .autoReverse(true)
            .build();
    
    return parallelTransition;
    
 }
 
    public ParallelTransition setDefaultParralelTransition(Os os, XGroup gameObjectXGroup){
        setState("parallelTransition");
        
  ParallelTransition  parallelTransition = ParallelTransitionBuilder.create()
            .node(gameObjectXGroup)
            .children(
                 RotateTransitionBuilder.create()
                    .duration(Duration.seconds(13))
                       .fromAngle(randomDouble(-360,7200))
                    .toAngle(randomDouble(-360,7200))
                    .cycleCount(4)
                    .autoReverse(true)
                    .build(),
                TranslateTransitionBuilder.create()
                    .duration(Duration.seconds(12))
                    .fromX(gameObjectXGroup.getTranslateX())
                    .toX(randomDouble(-22000,22000))
                    .fromZ(gameObjectXGroup.getTranslateX())
                    .toZ(randomDouble(-99999999,99999999))    
                    .cycleCount(4)
                    .autoReverse(true)
                    .build(),
                TranslateTransitionBuilder.create()
                    .duration(Duration.seconds(12))
                    .fromY(randomDouble(-9200000,9200000))
                    .toY(randomDouble(-9200,9200))
                    .cycleCount(2)
                    .autoReverse(true)
                    .build()
                    
                 
             
            )
            .cycleCount(12)
            .autoReverse(true)
            .build();
    
    return parallelTransition;
    
 } 
  
 public ParallelTransition parallelTransition9(Os os, XGroup rect){
    ParallelTransition parallelTransition;     
    parallelTransition = ParallelTransitionBuilder.create()
            .node(rect)
            .children(
                   RotateTransitionBuilder.create()
                    .duration(Duration.seconds(13))
                       .fromAngle(randomDouble(-360,7200))
                    .toAngle(randomDouble(-360,7200))
                    .cycleCount(4)
                    .autoReverse(true)
                    .build(),    
                    
              TranslateTransitionBuilder.create()
                    .duration(Duration.seconds(12))
                    .fromX(rect.getTranslateX())
                    .toX(randomDouble(-9200,9200))
                    .cycleCount(2)
                    .autoReverse(true)
                    .build(),
                TranslateTransitionBuilder.create()
                    .duration(Duration.seconds(12))
                    .fromY(rect.getTranslateY())
                    .toY(randomDouble(-9200,9200))
                    .cycleCount(2)
                    .autoReverse(true)
                    .build(), 
                 TranslateTransitionBuilder.create()
                    .duration(Duration.seconds(12))
                    .fromZ(rect.getTranslateZ())
                    .toZ(randomDouble(9200,19200))
                    .cycleCount(2)
                    .autoReverse(true)
                    .build(),
                    
                TranslateTransitionBuilder.create()
                    .duration(Duration.seconds(12))
                    .fromY(rect.getTranslateY())
                    .toY(randomDouble(-9200,9200))
                    .cycleCount(2)
                    .autoReverse(true)
                    .build()
               
            )
            .cycleCount(7)
            .autoReverse(true)
            .build();
    
    return parallelTransition;
    
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
  public String getState(){

return state;


}
    public boolean setState(String st){
      state=  st;
   return true;
    }
}
