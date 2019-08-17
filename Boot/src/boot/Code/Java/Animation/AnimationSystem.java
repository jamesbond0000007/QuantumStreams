/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Animation;
import boot.Code.Groovy.Animation.Navigation;
import boot.Code.Java.Support.XGroup;
import javafx.animation.*;
import javafx.util.Duration;
import javafx.scene.transform.Rotate;
import javafx.animation.Timeline;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.animation.SequentialTransition;
/**
 *
 * @author Richardo
 */
public class AnimationSystem {

    Navigation navigation =new Navigation();


    {
        navigation.load();
    }


    public int getStage(){
        return 0;
    }
    public void setStage(int kk){

    }



    public RotateTransition rotateZ(XGroup group,double from,double to,double speed,int repeat,boolean enable){
        RotateTransition rotatez= new RotateTransition();
        rotatez.setAxis(Rotate.Z_AXIS);
        rotatez.durationProperty().setValue(Duration.millis(speed));
        rotatez.setNode(group);
        rotatez.setFromAngle(group.rz.getAngle());
        rotatez.setToAngle(to);
        rotatez.setAutoReverse(enable);
        rotatez.setCycleCount(repeat);
        group.rx.setPivotX(randomInt(-200000,200000));
        group.rx.setPivotZ(randomInt(-200000,200000));
        group.rx.setPivotY(randomInt(-200000,200000));
        return rotatez;
    }
    public RotateTransition rotateY(XGroup group,double from,double to,double speed,int repeat,boolean enable){

        RotateTransition rotatey= new RotateTransition();
        rotatey.setAxis(Rotate.Y_AXIS);
        rotatey.durationProperty().setValue(Duration.millis(speed));
        rotatey.setNode(group);
        rotatey.setFromAngle(group.ry.getAngle());
        rotatey.setToAngle(to);
        rotatey.setAutoReverse(enable);
        rotatey.setCycleCount(repeat);
        return rotatey;
    }

    public RotateTransition RotateX(XGroup group,double from,double to,double speed,int repeat,boolean enable){
        RotateTransition rotatex= new RotateTransition();
        rotatex.setAxis(Rotate.X_AXIS);
        rotatex.durationProperty().setValue(Duration.millis(speed));
        rotatex.setNode(group);
        rotatex.setFromAngle(group.rx.getAngle());
        rotatex.setToAngle(to);
        rotatex.setAutoReverse(enable);
        rotatex.setCycleCount(repeat);
        return rotatex;
    }

    public ScaleTransition scaleX(XGroup group,double from,double to,double speed,int repeat,boolean enable){
        ScaleTransition scaler= new ScaleTransition();

        scaler.durationProperty().setValue(Duration.millis(speed));
        scaler.setNode(group);
        scaler.setFromX(group.getTranslateX());
        scaler.setToX(to);
        scaler.setAutoReverse(enable);
        scaler.setCycleCount(repeat);
        return scaler;

    }

    public ScaleTransition scaleZ(XGroup group,double from,double to,double speed,int repeat,boolean enable){
        ScaleTransition scaler= new ScaleTransition();
        scaler.durationProperty().setValue(Duration.millis(speed));
        scaler.setNode(group);
        scaler.setFromZ(group.getTranslateZ());
        scaler.setToZ(to);
        scaler.setAutoReverse(enable);
        scaler.setCycleCount(repeat);
        return scaler;
    }
    public ScaleTransition scaleY(XGroup group,double from,double to,double speed,int repeat,boolean enable){
        ScaleTransition scaler= new ScaleTransition();

        scaler.durationProperty().setValue(Duration.millis(speed));
        scaler.setNode(group);
        scaler.setFromY(group.getTranslateY());
        scaler.setToY(to);
        scaler.setAutoReverse(enable);
        scaler.setCycleCount(repeat);
        return scaler;

    }
    public SequentialTransition action10(XGroup g, double from, double to, int time , int repeat, boolean enable){
        SequentialTransition     animation = new SequentialTransition();

        animation.getChildren().add( moveX(g,888888888,-888888888,1200,12,true)) ;
        animation.getChildren().add( moveY(g,888888888,-888888888,1200,12,true));
        animation.getChildren().add( moveZ(g,888888888,-888888888,1200,12,true));
        return  animation;
    }

    public SequentialTransition action9(XGroup g, double from, double to, int time , int repeat, boolean enable){
        SequentialTransition     animation = new SequentialTransition();

        animation.getChildren().add( moveX(g,888888888,-888888888,1200,12,true)) ;
        animation.getChildren().add( moveY(g,888888888,-888888888,1200,12,true));
        animation.getChildren().add( moveZ(g,888888888,-888888888,1200,12,true));
        return  animation;
    }
    public SequentialTransition action8(XGroup g, double from, double to, int time , int repeat, boolean enable){
        SequentialTransition     animation = new SequentialTransition();

        animation.getChildren().add( moveX(g,888888888,-888888888,1200,12,true)) ;
        animation.getChildren().add( moveY(g,888888888,-888888888,1200,12,true));
        animation.getChildren().add( moveZ(g,888888888,-888888888,1200,12,true));
        return  animation;
    }

    public SequentialTransition action7(XGroup g, double from, double to, int time , int repeat, boolean enable){
        SequentialTransition     animation = new SequentialTransition();

        animation.getChildren().add( moveX(g,888888888,-888888888,1200,12,true)) ;
        animation.getChildren().add( moveY(g,888888888,-888888888,1200,12,true));
        animation.getChildren().add( moveZ(g,888888888,-888888888,1200,12,true));
        return  animation;
    }
    public SequentialTransition action6(XGroup g, double from, double to, int time , int repeat, boolean enable){
        SequentialTransition     animation = new SequentialTransition();

        animation.getChildren().add( moveX(g,888888888,-888888888,1200,12,true)) ;
        animation.getChildren().add( moveY(g,888888888,-888888888,1200,12,true));
        animation.getChildren().add( moveZ(g,888888888,-888888888,1200,12,true));
        return  animation;
    }
    public SequentialTransition action15(XGroup g, double from, double to, int time , int repeat, boolean enable){
        SequentialTransition     animation = new SequentialTransition();

        animation.getChildren().add( moveX(g,888888888,-888888888,1200,12,true)) ;
        animation.getChildren().add( moveY(g,888888888,-888888888,1200,12,true));
        animation.getChildren().add( moveZ(g,888888888,-888888888,1200,12,true));
        return  animation;
    }
    public SequentialTransition action4(XGroup g, double from, double to, int time , int repeat, boolean enable){
        SequentialTransition     animation = new SequentialTransition();

        animation.getChildren().add( moveX(g,888888888,-888888888,1200,12,true)) ;
        animation.getChildren().add( moveY(g,888888888,-888888888,1200,12,true));
        animation.getChildren().add( moveZ(g,888888888,-888888888,1200,12,true));
        return  animation;
    }
    public SequentialTransition action13(XGroup g, double from, double to, int time , int repeat, boolean enable){
        SequentialTransition     animation = new SequentialTransition();

        animation.getChildren().add( moveX(g,888888888,-888888888,1200,12,true)) ;
        animation.getChildren().add( moveY(g,888888888,-888888888,1200,12,true));
        animation.getChildren().add( moveZ(g,888888888,-888888888,1200,12,true));
        return  animation;
    }
    public SequentialTransition action2(XGroup g, double from, double to, int time , int repeat, boolean enable){
        SequentialTransition     animation = new SequentialTransition();

        animation.getChildren().add( moveX(g,888888888,-888888888,1200,12,true)) ;
        animation.getChildren().add( moveY(g,888888888,-888888888,1200,12,true));
        animation.getChildren().add( moveZ(g,888888888,-888888888,1200,12,true));
        return  animation;
    }
    public SequentialTransition action1(XGroup g, double from, double to, int time , int repeat, boolean enable){
        SequentialTransition     animation = new SequentialTransition();

        animation.getChildren().add( moveX(g,888888888,-888888888,1200,12,true)) ;
        animation.getChildren().add( moveY(g,888888888,-888888888,1200,12,true));
        animation.getChildren().add( moveZ(g,888888888,-888888888,1200,12,true));
        return  animation;
    }
    public void getDefault(XGroup g){

        //   rotateZ(g,888888888,g.getTranslateX()+5000,1200,12,true).play();
        //  rotateZ(g,888888888,g.getTranslateY()+5000,1200,12,true).play();
        //  rotateZ(g,888888888,g.getTranslateZ()+5000,1200,12,true).play();

    }
    public TranslateTransition moveX(XGroup group,double from,double to,double speed,int repeat,boolean enable){

        TranslateTransition transition=new TranslateTransition();
        transition.fromXProperty().setValue(from);
        transition.fromXProperty().setValue(to);
        transition.durationProperty().setValue(Duration.millis(speed));
        transition.setNode(group);
        transition.cycleCountProperty().setValue(repeat);
        transition.setAutoReverse(enable);
        return transition;

    }
    public TranslateTransition moveY(XGroup group,double from,double to,double speed,int repeat,boolean enable){
        TranslateTransition transition=new TranslateTransition();
        transition.fromYProperty().setValue(from);
        transition.fromYProperty().setValue(to);
        transition.durationProperty().setValue(Duration.millis(speed));
        transition.setNode(group);
        transition.cycleCountProperty().setValue(repeat);
        transition.setAutoReverse(enable);
        return transition;
    }
    public TranslateTransition moveZ(XGroup group,double from,double to,double speed,int repeat,boolean enable){
        TranslateTransition transition=new TranslateTransition();
        transition.fromZProperty().setValue(from);
        transition.toZProperty().setValue(to);

        transition.durationProperty().setValue(Duration.millis(speed));
        transition.setNode(group);
        transition.cycleCountProperty().setValue(repeat);
        transition.setAutoReverse(enable);
        return transition;
    }

    public Timeline outOfScreen(XGroup rect,double from,double to,int time,int repeat){
         Timeline    animation = new Timeline();
        animation.getKeyFrames().addAll(
                new KeyFrame(Duration.ZERO,
                        new KeyValue(rect.rx.angleProperty(), from)
                ),
                new KeyFrame(Duration.seconds(time),
                        
                        new KeyValue(rect.rx.angleProperty(), to)
                ));
        animation.setCycleCount(repeat);
                   
       
   
    return animation;
    
 } 
   public Timeline rotateX(XGroup rect,double from,double to,int time,int repeat,boolean e){
       Timeline    animation = new Timeline();
       animation.getKeyFrames().addAll(
               new KeyFrame(Duration.ZERO,
                       new KeyValue(rect.rx.angleProperty(), from)
               ),
               new KeyFrame(Duration.seconds(time),

                       new KeyValue(rect.rx.angleProperty(), to)
               ));
       animation.setCycleCount(repeat);
       return animation;
   }
  public XGroup turn3Target2(XGroup xform){
        double endTime = 9000.0; 
     double w=9000;
        double z=9000;
   Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.millis(z),  
                          new KeyValue(xform.translateXProperty(),xform.getTranslateX())),
             new KeyFrame(new Duration(endTime),  
                          new KeyValue(xform.translateYProperty(),xform.getTranslateY())),
             new KeyFrame(Duration.millis(z),  
                          new KeyValue(xform.translateZProperty(),-999999)));         
          
     
        animation.cycleCountProperty().setValue(1);
        animation.setAutoReverse(false);
        animation.play();
  
        return xform;
} 

                
    public Timeline rotateZ(XGroup rect,double from,double to,int time,int repeat){
        
     Timeline   animation = new Timeline();
        animation.getKeyFrames().addAll(
                new KeyFrame(Duration.ZERO,
                        new KeyValue(rect.rz.angleProperty(), from)
                ),
                new KeyFrame(Duration.seconds(time),
                        
                        new KeyValue(rect.rz.angleProperty(), to)
                ));
        animation.setCycleCount(repeat);
        
        return animation;
   }
    public Timeline rotateY(XGroup rect,double from,double to,int time ,int repeat){
        
    Timeline    animation = new Timeline();
        animation.getKeyFrames().addAll(
                new KeyFrame(Duration.ZERO,
                        new KeyValue(rect.ry.angleProperty(), from)
                ),
                new KeyFrame(Duration.seconds(time),
                        
                        new KeyValue(rect.ry.angleProperty(), to)
                ));
        animation.setCycleCount(repeat);
        
        return animation;
   }
  public Timeline outOfScreenSlow(XGroup rect,double from,double to,int time ,int repeat){
     Timeline    animation = new Timeline();
        animation.getKeyFrames().addAll(
                new KeyFrame(Duration.ZERO,
                        new KeyValue(rect.rx.angleProperty(), from)
                ),
                new KeyFrame(Duration.seconds(time),
                        
                        new KeyValue(rect.rx.angleProperty(), to)
                ));
        animation.setCycleCount(repeat);
    
    
    return animation;
    
 } 
 

   
  
  public Timeline intoScreen(XGroup rect,double from,double to,double time,int repeat){
     Timeline    animation = new Timeline();
        animation.getKeyFrames().addAll(
                new KeyFrame(Duration.ZERO,
                        new KeyValue(rect.rx.angleProperty(), from)
                ),
                new KeyFrame(Duration.seconds(time),
                        
                        new KeyValue(rect.rx.angleProperty(), to)
                ));
        animation.setCycleCount(repeat);
    return animation;
    
 }
 public Timeline intoScreen(XGroup rect,double from,double to,int time ,int repeat){
     double endTime = 5080.0; 
    
        double z=5600;
   Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateYProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateYProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(1);
        animation.setAutoReverse(false);
    
    return animation;
    
 }
 public Timeline intoScreenY(XGroup rect,double from,double to,int time ,int repeat){
   double endTime = 5080.0; 
    
        double z=5600;
   Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateYProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateYProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(1);
        animation.setAutoReverse(false);
    
    return animation;
    
 }
 public Timeline intoScreenX(XGroup rect,double from,double to,int time ,int repeat){
        double endTime = 5080.0; 
    
        double z=5600;
   Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateXProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateXProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(1);
        animation.setAutoReverse(false);
       // animation.play();
  
    
    return animation;
    
 }
  public Timeline intoScreenZ(XGroup rect,double from,double to,int time ,int repeat){
         
   Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
       // animation.play();
  
          
    return animation;
    
 } 

 
 public Timeline right(XGroup rect,int from,int to,int time,int repeat){
   
   Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
       // animation.play();
  
    return animation;
    
 }
 
 public Timeline revolve(XGroup rect,int from,int to,int time,int repeat){
   rect.rx.setAngle(39);
  Timeline    animation = new Timeline();
        animation.getKeyFrames().addAll(
                new KeyFrame(Duration.ZERO,
                        new KeyValue(rect.rx.angleProperty(), from)
                ),
                new KeyFrame(Duration.seconds(time),
                        
                        new KeyValue(rect.rx.angleProperty(), to)
                ));
        animation.setCycleCount(repeat);
        
        return animation;
   }
  
       
    
 
  public Timeline left(XGroup rect,double from,double to,int time ,int repeat){
   
     Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
       // animation.play();
  
    return animation;
    
 }
  
  
  public Timeline playerLeft(XGroup rect,double from,double to,int time ,int repeat){
   
    Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
       // animation.play();
  
    return animation;
    
 }
   public Timeline playerRight(XGroup rect,double from,double to,int time ,int repeat){
   
   Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
       // animation.play();
  
    return animation;
    
 }
  
  public Timeline playerUP(XGroup rect,double from,double to,int time ,int repeat){
   
    Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
       // animation.play();
  
    return animation;
    
 }
  public Timeline playerDown(XGroup rect,double from,double to,int time ,int repeat){
   
      Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
       // animation.play();
  
    return animation;
    
 }
  public Timeline camearaFoward(XGroup rect,double from,double to,int time ,int repeat){
   
    Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
       // animation.play();
  
    return animation;
    
 }
  public Timeline foward(XGroup rect,double from,double to,int time ,int repeat){
    Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
       // animation.play();
  
    return animation;
    
 }
 
  public Timeline backward(XGroup rect,double from,double to,int time ,int repeat){
   
     Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
       // animation.play();
  ;
    return animation;
    
 }
 
  public Timeline warpBAck(XGroup rect,double from,double to,int time ,int repeat){
   
     Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
       // animation.play();
  
    return animation;
    
 }
 
 public Timeline up(XGroup rect,double from,double to,int time ,int repeat){
      Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
       // animation.play();
  
    return animation;
    
 }
  
 public Timeline downToPlayer(XGroup rect,double from,double to,int time ,int repeat){
     Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
       // animation.play();
  
    return animation;
    
 }
 public Timeline down(XGroup rect,double from,double to,int time ,int repeat){
    Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
       // animation.play();
  
    return animation;
    
 }
 public Timeline diagonalDown(XGroup rect,double from,double to,int time ,int repeat){
        Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
       // animation.play();
  
    
    return animation;
    
 }
  public Timeline rotate(XGroup rect,double from,double to,int time ,int repeat){
       Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
       // animation.play();
  
    return animation;
    
 }
 
 
 
 
 public Timeline translateParallel(XGroup rect,double from,double to,int time ,int repeat){
      Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
    return animation;
    
 }
 public Timeline fade(XGroup rect,double from,double to,int time ,int repeat){
    
     Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
    return animation;
    
 }
 
 public Timeline scale(XGroup rect,double from,double to,int time ,int repeat){
     Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.scaleXProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.scaleXProperty(),to)));
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
    
    return animation;
    
 }
    public Timeline scaleX(XGroup rect,double from,double to,int time ,int repeat){
        Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
                (new KeyFrame(Duration.ZERO,
                                new KeyValue(rect.scaleXProperty(),from)),

                        new KeyFrame(Duration.seconds(time),
                                new KeyValue(rect.scaleXProperty(),to)));


        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);

        return animation;

    }
    public Timeline scaleY(XGroup rect,double from,double to,int time ,int repeat){
        Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
                (new KeyFrame(Duration.ZERO,
                                new KeyValue(rect.scaleYProperty(),from)),

                        new KeyFrame(Duration.seconds(time),
                                new KeyValue(rect.scaleYProperty(),to)));


        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);

        return animation;

    }
    public Timeline scaleZ(XGroup rect,double from,double to,int time ,int repeat){
        Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
                (new KeyFrame(Duration.ZERO,
                                new KeyValue(rect.scaleZProperty(),from)),

                        new KeyFrame(Duration.seconds(time),
                                new KeyValue(rect.scaleZProperty(),to)));


        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);

        return animation;

    }
    public Timeline setDefaultParralelTransition(XGroup rect,double from,double to,int time ,int repeat){
       Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
    
    return animation;
    
 } 
  
 public Timeline rotateParallel(XGroup rect,double from,double to,int time ,int repeat){
      Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
    return animation;
    
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
 
    
    public Timeline parallelAlpha(XGroup rect,double from,double to,int time ,int repeat){
        Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
  return animation;
    }
    
    
    public Timeline path(XGroup rect,double from,double to,int time ,int repeat){
           Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
        
 return  animation;
    }
    
    public Animation pause(XGroup rect,double from,double to,int time ,int repeat){
         Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
                 
 return  animation;
    }
  public Timeline sequential(XGroup rect,double from,double to,int time ,int repeat){
         Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
                 
 return  animation;
    }
 public Timeline stroke(XGroup rect,double from,double to,int time ,int repeat){
     
   Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
                 
 return  animation;

 
 }

  
  public Timeline translate(XGroup rect,double from,double to,int time ,int repeat){
   
  Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
            (new KeyFrame(Duration.ZERO,  
                          new KeyValue(rect.translateZProperty(),from)),
            
             new KeyFrame(Duration.seconds(time),  
                          new KeyValue(rect.translateZProperty(),to)));         
          
     
        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
                 
 return  animation;

 
 }


///Cenematics=====================================================================================



      }

    

