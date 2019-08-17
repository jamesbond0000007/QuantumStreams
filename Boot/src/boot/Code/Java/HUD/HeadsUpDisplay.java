/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.HUD;
import boot.Code.Java.Support.XGroup;
import boot.Code.Java.Support.ScreenPositionManager;
import boot.ModelLoader;
import boot.ResourceManager;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.net.URL;
import boot.Os;
import java.util.Observer;
import java.util.Stack;
import boot.VideoChannel;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.Group;
import  boot.Code.Java.Dialogs.FxDialog;
import javafx.scene.PerspectiveCamera;
import javafx.scene.image.Image;

import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import javafx.scene.text.Font;
import boot.Interface.Stateable;
import java.util.Observable;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.shape.Polygon;
import javafx.scene.transform.Rotate;

import javafx.scene.PointLight;
import javafx.scene.AmbientLight;
import javafx.scene.Parent;
import javafx.scene.Scene;


import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import boot.Code.Java.Support.MessageProcessor;
import boot.Code.Java.Support.Message;
import boot.Code.Java.Support.ImageSpawner;
import boot.Code.Java.Support.Pack;
import boot.Code.Java.Support.SimpleText;
import boot.Code.Java.Support.LightObject;
import boot.Code.Java.Dialogs.Dialog;
import boot.Code.Java.Objects.PrototypeObject;
/**
 *
 * @author Richardo
 */
public class HeadsUpDisplay extends Application implements Observer,Stateable{
    static int level=0;
       double xComponent;
    double ycomponent;
         double modifier = 1.0;
                double modifierFactor = 0.1;
     MessageProcessor messageProcessor =new MessageProcessor();
     XGroup   gameObjectXGroup;
    MotionCamera mc;
   
      VideoChannel videoChannel ;
static double  counter=0;
    HudSupport huSupport=new  HudSupport() ; 
   Polygon hexagon = new Polygon();
   Polygon hexagon2 = new Polygon();
   Polygon hexagon3= new Polygon();
   Polygon hexagon4 = new Polygon();
  
   
     ModelLoader modelLoader;
   private StackPane root;  
     Media media = null;
   XGroup v=new XGroup(); 

  PointLight light = new PointLight(Color.WHITE);  
    PointLight light2 = new PointLight(Color.WHITE);  
      AmbientLight light3 = new AmbientLight(Color.BLUE); 

static String flyMessage="";
 
FxDialog fd=new FxDialog();

Polygon continueHexagon = new Polygon();
Polygon continueHexagon2 = new Polygon();
Polygon continueDialogBox = new Polygon();
    String headupMessage;
    boolean starfix=false ;
    Message message=new Message();   
    String state;
ScreenPositionManager    screenPosition=new  ScreenPositionManager();
    static int  countID=0;
   
    Pack pak=new Pack();

  static double nol  =0;
  static double no2  =0;
   static double no3  =0;
    static double bufferno3  =0;
  static double R=5;
  static double R2=5;
     private Timeline animation;
 
      ImageSpawner life1;
    ImageSpawner life2;
    ImageSpawner life3;
 
      private Stack<XGroup> gameObjectMatrix=new Stack<XGroup>();     
       
    
   static double rotate=0;
    SimpleText systemtext=new SimpleText(); ;
    SimpleText text; ;
    SimpleText text2; 
    SimpleText text3; 
    SimpleText text4; 
    SimpleText text5; 
    SimpleText text6; 
    SimpleText text7; 
    SimpleText text8; 
    SimpleText text9; 
   private int stage=0;
 XGroup iconSpin=new XGroup();
   Sphere circle=new Sphere();
   private PathTransition pathTransition;    

 final  XGroup  TextHUD=new XGroup();


 final  XGroup universe=new XGroup();
 final  XGroup world=new XGroup();

   
   
 
   Group xform=new Group();
   static double collision=0;
   static int picNo=0;
   String result="GameObject Collision=000000";      
   static int songNumber=0;//4/5/6
   static int levelNumber=0;
   ResourceManager config=new ResourceManager();
   static int torpedoNumber=0;
   int TEXTSIZE=2;
    Image     image;
   Image suntextureImage; 
   private static  URL sunTexture;
   final PhongMaterial sunMaterial = new PhongMaterial();
   XGroup GUI=new XGroup();
   final PhongMaterial redMaterial = new PhongMaterial();
   Sphere buffer=new Sphere();
   String FontList[]; Timeline animationLeft = new Timeline();
   Font font;
    {
        GraphicsEnvironment ge =
    GraphicsEnvironment.getLocalGraphicsEnvironment(); 
    FontList = ge.getAvailableFontFamilyNames();
    font=new Font(FontList[25],150);//27   
     
    }

    public void gameControl(Os osX){
        int num=osX.getCoreMatrix().size();
        if(num>500){
            osX.purge();
        }

        else   if(osX.countOpponents()<5){
            //  operatingSystemX.pauseTransitions();// operatingSystemX.resetNumberOfplayerChances(10);
            //operatingSystemX.getStageLoader().replenish(operatingSystemX);
            osX.exchangedWorlds();
            osX.getSystemMessage().send("replenish");
            System.out.println("replenish");
        }
        else if(osX.getScore()>50400){
            osX.resetScore();
//operatingSystemX.resetNumberOfplayerChances(10);
            loadLifeDisplay(osX);
// operatingSystemX.stopTransitions();
            osX.getStageLoader().loadAllLightStreams(osX);
            this.getPack().get(0).setVisible(true);
            this.getMessage().send("Superapp ");
            // operatingSystemX.resumeTransitions();
        }


        if(osX.getStage()==-1){
            osX.getHud().getPack().get(0).setVisible(true);
        }
        else   if(osX.getStage()==0){
            osX.getHud().getPack().get(1).setVisible(true);
        }
        else   if(osX.getStage()==1){
            osX.getHud().getPack().get(2).setVisible(true);
        }
        else   if(osX.getStage()==2){
            osX.getHud().getPack().get(3).setVisible(true);
        }
        else   if(osX.getStage()==3){
            osX.getHud().getPack().get(4).setVisible(true);
        }
        else   if(osX.getStage()==4){
            osX.getHud().getPack().get(5).setVisible(true);
        }
        else   if(osX.getStage()==5){
            osX.getHud().getPack().get(5).setVisible(true);
        }
        else   if(osX.getStage()==6){
            osX.getHud().getPack().get(7).setVisible(true);
        }
        else   if(osX.getStage()==7){
            osX.getHud().getPack().get(8).setVisible(true);
        }

        else   if(osX.getStage()==8){
            osX.getHud().getPack().get(9).setVisible(true);
        }
        else   if(osX.getStage()==9){
            osX.getHud().getPack().get(10).setVisible(true);
        }


        setState("gameControl");
        HUDPicOutput();
        updateHeadsUpDisplay(osX);
        HUDtPointsOutput(String.valueOf(osX.getCurrenPoint()),680,680, osX);


        osX.getHud().getMessageProcessor().getMessageMatrix().add(Message.getMessage());






        if(  osX.getHud().getMessageProcessor().getMessageMatrix().peek()=="continue"){


            System.out.println("continue");
        }
        if(  osX.getHud().getMessageProcessor().getMessageMatrix().peek()=="exit"){
            osX.resetScore();
//operatingSystemX.resetNumberOfplayerChances(10);
            loadLifeDisplay(osX);
// operatingSystemX.stopTransitions();
            osX.getStageLoader().loadAllLightStreams(osX);

            this.getMessage().send("Superapp ");
            // operatingSystemX.resumeTransitions();

            System.out.println("exit");
        }
        if(  osX.getHud().getMessageProcessor().getMessageMatrix().peek()=="Torpedo hits Opponent"){
            decrementLifeDisplay(osX);
            updateLifeDisplay(osX);
            for(int count = 7; count< osX.getCoreMatrix().size(); count++){
                if(osX.getCoreMatrix().get(count).getName()=="hit"){
                    osX.getCoreMatrix().remove(count);
                    osX.getWorld().getChildren().remove(count);
                }




            }


        }
        if(  osX.getHud().getMessageProcessor().getMessageMatrix().peek()=="XTorpedo hits Player"){
            decrementLifeDisplay(osX);
            updateLifeDisplay(osX);
            for(int count = 7; count< osX.getCoreMatrix().size(); count++){
                if(osX.getCoreMatrix().get(count).getName()=="hit"){
                    osX.getCoreMatrix().remove(count);
                    osX.getWorld().getChildren().remove(count);
                    // message.send("Destroyed");
                }




            }





        }

        else  if( osX.getPlayerHits()==8){
            this.getMessage().send("GAME OVER ");
          //  Dialog v=new Dialog();
         //   v.setVisible(true);
            osX.getPlayer().resetHit();
 /*try{
     start(new Stage());

 }

 catch(Exception e){

 }
if(operatingSystemX.getHud().getMessageProcessor().getMessageMatrix().peek()=="continue"){
   try{
      System.out.println("you");
   }
   catch(Exception e){

   }
*/
        };
// h.getGroup().setTranslateZ(-370000);

        //  operatingSystemX.injectIntoWorld( h.getGroup());
        osX.halt();
    }

    public Polygon getHexagonDialog() {
        return continueHexagon;
    }
   public  boolean firingSolution(Os os) {
       boolean lock=false;
    
     
      
       return lock;
   }
   
   public MotionCamera getMotionCamera(){
       return mc;
   }

    public Polygon getHexagon2Dialog() {
        return continueHexagon2;
    }
    public Polygon getDialogBox() {
        return continueDialogBox;
    }
    public void loadToken(){
        
    }
    
    public  XGroup getGUI(){
        return GUI;
    }
    
   public SimpleText getlivetext(){
       return systemtext;
   }
    public Pack getPack(){
        
        return pak;
    }
      public XGroup getCameraXGroup2(){
        return mc.getCameraXGroup2();
    }
      
       public XGroup getCameraXGroup3(){
        return mc.getCameraXGroup3();
    }
       
  public XGroup getCameraXGroup(){
        return mc.getCameraXGroup();
    }
    public void setScreen(String pictureName){
          life3=new ImageSpawner()  ;
         life3.create("Pictures/"+pictureName);
         life3.setPosition(3500,-1500, 1000000000.0);
        
        life3.setScale(5080590, 5080590, 2); 
    }
 public boolean  setState(String st){
      state=  st;
      return true;
    }   
  public  void updateText()  {
     
 text8 .setSize(text8.getTextObject(),120);
 //text8.setColor(randomInt(0,10));
 // text8.setPosition(randomInt(15,200), randomInt(15,200), -mc.getCameraDistance()+4450);
  
  text.setPosition(-5300, -3800,mc.getCameraDistance()+4450);
 text2.setPosition(-2200, -3800,mc.getCameraDistance()+4450);
  text3.setPosition(1600,-3800,mc.getCameraDistance()+4450);
text4.setPosition(-7000, -2000, mc.getCameraDistance()+4450);
  text5.setPosition(-3400, -2000, mc.getCameraDistance()+4450);
  text6.setPosition(5900,  -2000, mc.getCameraDistance()+4450);
  text7.setPosition(-1000, -800, mc.getCameraDistance()+4450);
  text8.setPosition(400,  -800,mc.getCameraDistance()+4450);
  text9.setPosition(1800,  -800, mc.getCameraDistance()+4450);
//text8.setRotateZ(randomInt(15,360));
hexagon.setTranslateZ(mc.getCameraDistance()+4480);
hexagon2.setTranslateZ(mc.getCameraDistance()+4480);
hexagon3.setTranslateZ(mc.getCameraDistance()+4480);
hexagon4.setTranslateZ(mc.getCameraDistance()+4480);
  }
  
public  void refreshScreen(Os os)  {
      
for(int count=0;count<os.getNumberOfChances();count++){
    huSupport.getSupport(count).setTranslateZ(mc.getCameraDistance()+4455);
}

for(int count=0;count<os.getNumberOfChances();count++){
    pak.get(count).setTranslateZ(mc.getCameraDistance()+4455);
}
}
    public void HUDtPointsOutput(String rr, double x, double y, Os os){
        // text8 .setSize(text8.getTextObject(),120);
      text8.setText(rr);
  


    }
    public void Boot(ResourceManager config, int level, Os u){
        pak.load(); 
        int kount=0;
      videoChannel=new VideoChannel();
        this.setState("start");
  hexagon = new Polygon();
  hexagon.setTranslateX(-7500);
  hexagon.setTranslateY(-4000);
 hexagon.setTranslateZ(mc.getCameraDistance()+4500);
//Adding coordinates to the hexagon
hexagon.getPoints().addAll(new Double[]{
200.0, 50.0,
15930.0, 50.0,
15980.0, 150.0,
15930.0, 250.0,
200.0, 250.0,
150.0, 150.0,

});

hexagon.setFill(Color.DARKBLUE);
 
 hexagon2 = new Polygon();

  hexagon2.setTranslateX(-7500);
  hexagon2.setTranslateY(-3750);
 hexagon2.setTranslateZ(mc.getCameraDistance()+4500);
//Adding coordinates to the hexagon
hexagon2.getPoints().addAll(new Double[]{
200.0, 50.0,
15930.0, 50.0,
15980.0, 150.0,
15930.0, 250.0,
200.0, 250.0,
150.0, 150.0,
});

hexagon2.setFill(Color.DARKBLUE);

//===================================================================================================

 hexagon3 = new Polygon();

  hexagon3.setTranslateX(-7500);
  hexagon3.setTranslateY(4000);
 hexagon3.setTranslateZ(mc.getCameraDistance()+4500);
//Adding coordinates to the hexagon
hexagon3.getPoints().addAll(new Double[]{
200.0, 50.0,
15930.0, 50.0,
15980.0, 150.0,
15930.0, 250.0,
200.0, 250.0,
150.0, 150.0,
});

hexagon3.setFill(Color.DARKBLUE);

//==================================================================================================

 hexagon4 = new Polygon();

  hexagon4.setTranslateX(-7500);
  hexagon4.setTranslateY(4500);
 hexagon4.setTranslateZ(mc.getCameraDistance()+4500);
//Adding coordinates to the hexagon
hexagon4.getPoints().addAll(new Double[]{
200.0, 50.0,
15930.0, 50.0,
15980.0, 150.0,
15930.0, 250.0,
200.0, 250.0,
150.0, 150.0,
});

hexagon4.setFill(Color.DARKBLUE);



//==================================================================================================
        
 continueDialogBox.setTranslateX(0);
  continueDialogBox.setTranslateY(0);
 continueDialogBox.setTranslateZ(mc.getCameraDistance()+4500);
//Adding coordinates to the hexagon
continueDialogBox.getPoints().addAll(new Double[]{
-100.0, -350.0,
1200.0, -350.0,
1200.0, 400.0,
-100.0, 400.0,

});   
//continueDialogBox.setOpacity(.9);

continueDialogBox.setFill(Color.CADETBLUE);
    xform.getChildren().add(continueDialogBox); 
//==================================================================================================
        
 continueHexagon2.setTranslateX(0);
  continueHexagon2.setTranslateY(0);
 continueHexagon2.setTranslateZ(mc.getCameraDistance()+4500);
//Adding coordinates to the hexagon
continueHexagon2.getPoints().addAll(new Double[]{
800.0, 50.0,
1100.0, 50.0,
1100.0, 200.0,
800.0, 200.0,

});     
continueHexagon.setVisible(true);
             continueHexagon2.setVisible(true);
               continueDialogBox.setVisible(true);  
       
    xform.getChildren().add(continueHexagon2); 
//==================================================================================================

        
 continueHexagon.setTranslateX(0);
  continueHexagon.setTranslateY(0);
 continueHexagon.setTranslateZ(7600);
//Adding coordinates to the hexagon
continueHexagon.getPoints().addAll(new Double[]{
100.0, 50.0,
400.0, 50.0,
400.0, 200.0,
100.0, 200.0,

});     
continueHexagon.setFill(Color.RED);
    xform.getChildren().add(continueHexagon); 
//==================================================================================================
   systemtext=new SimpleText(); ;
   text=new SimpleText(); ;
   text2=new SimpleText(); 
   text3=new SimpleText(); 
   text4=new SimpleText(); 
   text5=new SimpleText(); 
   text6=new SimpleText(); 
   text7=new SimpleText(); 
   text8=new SimpleText(); 
   text9=new SimpleText(); 
    text.boot();
    text2.boot();
    text3.boot();
    text4.boot();
    text5.boot();
    text6.boot();
    text7.boot();
    text8.boot();
    text9.boot();
    
  text.setPosition(-5300, -3800,mc.getCameraDistance()+4450);
 text2.setPosition(-2200, -3800,mc.getCameraDistance()+4450);
  text3.setPosition(1600,-3800,mc.getCameraDistance()+4450);
text4.setPosition(-7000, -2000, mc.getCameraDistance()+4450);
  text5.setPosition(-3400, -2000, mc.getCameraDistance()+4450);
  text6.setPosition(5900,  -2000, mc.getCameraDistance()+4450);
  text7.setPosition(-1000, -800, mc.getCameraDistance()+4450);
  text8.setPosition(400,  -800,mc.getCameraDistance()+4450);
  text9.setPosition(1800,  -800, mc.getCameraDistance()+4450);

    //    pak.get(0).setScaleX(10);
     //   pak.get(0).setScaleY(10);
    //    pak.get(0).setScaleZ(10);
  text.setSize(text.getTextObject(),15);
  text2.setSize(text2.getTextObject(),15);;
  text3.setSize(text3.getTextObject(),15);;
  text4.setSize(text4.getTextObject(),13);
  text5.setSize(text5.getTextObject(),13);
  text6.setSize(text6.getTextObject(),13);
  text7.setSize(text7.getTextObject(),13);
 text9.setSize(text9.getTextObject(),13);
// text8.setSize(text8.getTextObject(),13);
 text7.setSize(text7.getTextObject(),13);
 text4.setSize(text4.getTextObject(),20);
  ;
    for(int count=0;count<13;count++){
   pak.get(count).setTranslateX(0);
  pak.get(count).setTranslateY(0);//-16300
  pak.get(count).setTranslateZ(2000);
        mc.getCameraXGroup3().getChildren().add(pak.get(count));
    }
  XGroup n=new XGroup();
//==================================================================================================
 mc.getCameraXGroup3().getChildren().add(text.getTextObject());
 mc.getCameraXGroup3().getChildren().add(text2.getTextObject());
 mc.getCameraXGroup3().getChildren().add(text3.getTextObject());
 mc.getCameraXGroup3().getChildren().add(text4.getTextObject());
 mc.getCameraXGroup3().getChildren().add(text5.getTextObject());
 mc.getCameraXGroup3().getChildren().add(text6.getTextObject());
 mc.getCameraXGroup3().getChildren().add(text7.getTextObject());
 mc.getCameraXGroup3().getChildren().add(text8.getTextObject());
 mc.getCameraXGroup3().getChildren().add(text9.getTextObject());
 mc.getCameraXGroup3().getChildren().add(hexagon4);
 mc.getCameraXGroup3().getChildren().add(hexagon3);
 mc.getCameraXGroup3().getChildren().add(hexagon2);
 mc.getCameraXGroup3().getChildren().add(hexagon);



        for(int count=0;count<10;count++) {
            pak.get(count).setTranslateX(-2000);
            pak.get(count).setTranslateY(-2000);
            pak.get(count).setTranslateZ(-2000);
        }

        pak.get(0).setTranslateX(200);
        pak.get(0).setTranslateY(0);
        pak.get(0).setTranslateZ(mc.getCameraDistance()+4450);


        for(int count=0;count<10;count++){
    pak.get(count).setVisible(false);
}
        for(int count=0;count<10;count++){
            pak.get(count).setScaleX(10);
            pak.get(count).setScaleY(10);
            pak.get(count).setScaleZ(10);
        }

        for(int count=1;count<10;count++){
            pak.get(count).setTranslateX(-8200);
            pak.get(count).setTranslateY(-3500);
            //pak.get(count).setScaleZ(10);
        }
        ;
        //==============================================================================================
    xform.getChildren().add(circle);



        LightObject lo=new LightObject();
//lo.lightThis2(sky);


 //Image     image = new Image(QuantumFlux.class.getResourceAsStream("missile.png"));
   // SkyBox skyBox = new SkyBox(image);


           

 loadLifeDisplay(u);
//loadSkyBox(u);
message.addObserver(this);
message.addObserver(messageProcessor);
message.send("heads up displayboot");

        stage=level;
   config.initialize();  
  // ShapeOutput(u,0,0); 
   buildCameras(u) ;
   buildScene();
   sunMaterial.setDiffuseColor(Color.WHITE);
   sunMaterial.setSpecularColor(Color.WHITE);
   redMaterial.setDiffuseColor(Color.RED);
   redMaterial.setSpecularColor(Color.RED); 
   

    buffer.setMaterial(sunMaterial);    
    buffer.setScaleX(.7);
    buffer.setScaleY(.7);
    buffer.setScaleZ(.7);
    buffer.setTranslateX(0);
    buffer.setTranslateY(2000);
    buffer.setTranslateZ(8000);
    buffer.setRadius(350);
    //buffer.setRotationAxis(Rotate.X_AXIS);
    //buffer.setRotate(90);
    GraphicsEnvironment ge =
    GraphicsEnvironment.getLocalGraphicsEnvironment(); 
    FontList = ge.getAvailableFontFamilyNames();
    font=new Font(FontList[25],100);//27   
    GUI.setTranslateX(0);
    GUI.setTranslateY(0);  
    GUI.setTranslateY(0);
    }
  public void loadSkyBox(Os os){
        os.getWorld().getChildren().add(v);   
  }
  
  public Group getXform(){
      return xform;
  }
  public void loadlight(String targetName,String name,double x,double y,double z,double a,double b,double c,double size){
 PrototypeObject opponent=new PrototypeObject();  
modelLoader=new ModelLoader();
opponent.LoadModel(modelLoader.LoadModel(name,100,150,100,true));
opponent.setName(targetName);
//opponent.setID(formIDObject);
//opponent.getGroup().setId(String.valueOf(formIDObject));
//formIDObject++;
opponent.getGroup().rx.angleProperty().setValue(a);  //delete      
opponent.getGroup().ry.angleProperty().setValue(b);//oxyge
opponent.getGroup().rz.angleProperty().setValue(c);

opponent.getGroup().setTranslateX(x);
opponent.getGroup().setTranslateY(y );// 35000  
opponent.getGroup().setTranslateZ(z);
     
opponent.getGroup().setScaleX(size);
opponent.getGroup().setScaleY(size);
opponent.getGroup().setScaleZ(size);

//setOrientation(randomInt(0,6),opponent.getGroup());
//=======================================================================================================
//========================================================================================================

XGroup load0Xform=new XGroup();

 load0Xform.getChildren().add(opponent.getGroup());





mc.getCameraXGroup().getChildren().add(load0Xform);

}   
 
  public  HeadsUpDisplay(Os os){
      gameObjectXGroup=new XGroup() ;
      huSupport.load(os);
    mc=new MotionCamera() ; 
        for(int count=0;count<os.getNumberOfChances();count++) {    
       mc.getCameraXGroup3().getChildren().add(huSupport.getSupport(count));//loadingplanestohud
       
     } 
      root = new StackPane(); 
  xform.getChildren().add(root);
     try{
               media = null;//loading video
            File video = new File("Media/Video/5 Smartphones You Won_t Believe Actually Exist! - .mp4");
            String url =new URL(this.getClass().getResource("Media/Video/5 Smartphones You Won_t Believe Actually Exist! - .mp4").toString()).toString();
            System.out.println("URL: "+url);
            media = new Media(url);
        }catch(Exception e){
        System.err.println(e.toString());
    }  
     
        
   
         
   }
  
 public AmbientLight getAmbientLight(){
      return light3;
  } 
 public PointLight getLight2(){
      return light2;
  } 
  public PointLight getLight1(){
      return light;
  }
 public void loadUniverse(XGroup w){
     
     world.getChildren().add(w);
     universe.getChildren().add(world);
    
 } 
 public Message getMessage(){
     return  message;
 } 
 public void clearHud(){
     if(xform.getChildren().size()>18){
         for(int count=18;count<xform.getChildren().size();count++){
         xform.getChildren().remove(count);
         }
     }
   
 }
 
 public void videoOutput2(Os os, int count){
  
 videoChannel=new VideoChannel();
   
 
  xform.getChildren().add(videoChannel.getVideoClip(count));//3good
        
  }
 public VideoChannel getVideoChannel(){
     return videoChannel;
 }
 public void reset(){
     
 }
 public void videoOutput3(Os os, int count){
  
 videoChannel=new VideoChannel();
   
 StackPane root = new StackPane();
  root = new StackPane();
 
    root.setTranslateX(5300);   
    root.setTranslateY(300);   
    root.setTranslateZ(-400);
 
  xform.getChildren().add(videoChannel.getVideoClip(count));//3good
        
  }
 public void videoOutput(Os os){
  
     MediaPlayer player = new MediaPlayer(media);
        player.play();
        MediaView mediaView = new MediaView(player);
        root = new StackPane();
 
    root.setTranslateX(5300);   
    root.setTranslateY(300);   
    root.setTranslateZ(-400);   
 //root.setAlignment(Pos.TOP_RIGHT);
 mediaView.setTranslateZ(0.001);
  root.setTranslateZ(9000);
  mediaView.setFitHeight(9);
  mediaView.setFitWidth(27);
  mediaView.setScaleX(randomDouble(1500,3000));
  mediaView.setScaleY(randomDouble(1500,3000));
 
        root.setStyle("-fx-background-color : white;");
        root.getChildren().add(mediaView);  
  mediaView.getMediaPlayer().setCycleCount(10);
  mediaView.getMediaPlayer().setAutoPlay(true);
  
   mc.getCameraXGroup3() .getChildren().add(root);;
      mediaView.getMediaPlayer().play();

        
  }
 public void screentext8(String text,double x,double y,double z){
   
    text8.setText(text);
 text8 .setSize(text8.getTextObject(),40);;
 text8.setColor(2);

 }
 
  public void screentext7(String text,double x,double y,double z, double degrees){
   text7.setText(text);
   text7.setPosition(x, y,z);

 text7.setRotateZ(degrees);
  //text4.set   
 }
 

  public void screentext8(Os os, String text, double x, double y){
       // xform.getChildren().clear();
      text9.setText(text);
 text9.setRotateY(y);
  //text4.setPosition(screenPosition.getTopLeft().getX()+x, screenPosition.getTopLeft().getY(), screenPosition.getMiddleLeft().getZ());

  }
 //===========================================Headsup Display Text================================================================== 
  public void screenText(int num, int num2, String aa, Os go){

  for(int count=0;count<6;count++){
//textGenerator.getText(count).setText(textGenerator.getPositionName(count)+String.valueOf(go.getObject(0).getName())+"Terrain= "+String.valueOf((go.getObject(0).getGroup().getTranslateY())));
if( count ==0){
    text.setText("Hit"+String.valueOf(getScoreHits(go)));//used
    
}
else if (count==1){
     text2.setText("level "+String.valueOf(go.getStage()));//used
    
}
else if (count==2){
     text3.setText("Status ="+message.getMessage());//used
  
}
else if (count==3){
      text4.setText("Score="+String.valueOf(go.getScore()));//used
   
}

else if (count==4){
     text5.setText("Camera distance"+String.valueOf(this.getCamera().getTranslateZ()));//used
   
}

else if (count==5){
    try{
        text6.setText("Player Hit"+String.valueOf(go.getPlayerHits()));
    }//used
   catch(Exception e) {
       
   }
}
 else if (count==6
         ){
      text7.setText("Terrain distance"+String.valueOf(go.getGameObject(count).getGroup().getTranslateY()));//used
   
} 
else if (count==7
         ){
 //     text8.setText("Terrain distance"+String.valueOf(go.getGameObject(count).getGroup().getTranslateY()));//used
   
}   

  
  }

 //================================================================================================================ 

  }
  public void updateObjects(XGroup gb){
  for(int count=0;count<7;count++){
    
      
      if(String.valueOf(gameObjectMatrix.get(count).getId())==gb.getChildren().get(count).getId()){
          gameObjectMatrix.get(count).setTranslateX(gb.getTranslateX());//formID
          gameObjectMatrix.get(count).setTranslateY(gb.getTranslateY());
          gameObjectMatrix.get(count).setTranslateZ(gb.getTranslateZ());
      }
  }
 }  
  
  public void resetPack(){
    for(int count=0;count<9;count++){
   pak.get(count).setTranslateX(580);
  pak.get(count).setTranslateY(4200000);//-16300
  pak.get(count).setTranslateZ(2000);
 
      }     
  }
  public void onscreen(Os os, int num){
    
 
   pak.get(num).setTranslateX(980);//-163
   pak.get(num).setTranslateY(600);//-16300
  pak.get(num).setTranslateZ(8000);//-163
   
           

  }
  public void onscreen(int num,double x,double y){
    
   pak.get(num).setTranslateX(x);//-163
   pak.get(num).setTranslateY(y);//-16300
      
  }        
  public void HUDPicOutput(){
//xform.getChildren().add(buffer);//outptforgraphics
  }
  
  public double getScorHitVariable(){
      return counter;
  }
  public double getScoreHits(Os u){

      return counter;
  }
  
  public void resetScoreHit(){
      counter=0;
  }
  public void decrementLifeDisplay(Os os){
os.decrementNumberOfChances();
  }
  public void incrementHit(Os os){
counter++;
  }
 public void incrementLifeDisplay(Os os){
os.incrementNumberOfChances();
  } 

 public  HudSupport getHuSupport(){
     return   huSupport;
 }
  public void updateLifeDisplay(Os os){

   
  if(os.getNumberOfChances()>-1) {
     // pak.get( os.getNumberOfChances()).setTranslateY(308000);
      huSupport.getSupport(os.getNumberOfChances()).setTranslateY(308000);
  }
     
    
  
  }
  public void loadLifeDisplay(Os os){
      int kount=0;
      for(int count=0;count<9;count++) {
   //  pak.get(count).setTranslateX(30800+kount);
    // pak.get(count).setTranslateY(-17980);
    
       kount=kount+1200;
    }  
  }
  

 
  


  public void moveOffscreen(int i){
    pak.get(i).setTranslateX(4200000);
  }
public long updateHeadsUpDisplay(Os s){
 
       getXform(s);
    
 
    return System.currentTimeMillis();
  
} 
  
 public Group getXform(Os s){
   // dynamicShapeOutput(collision,collision);
   screenText(200,300,"Started",s);
  
 // xform.setTranslateZ(8000);
 return     xform;  
    }
  
   public void setHUDDistance(double n){
 
       xform.setTranslateZ(n);
   }

  public void turnHUD(double a,double b,double c){
        xform.setRotate(a);
        xform.setRotate(b);
        xform.setRotate(c); 
    }
  

 
   
  
 public void buildCameras(Os s) {
    mc.buildCamera(s);
       
      
    } 
    public void buildScene() {
      
       
    }
  
public double getCameraDistance(){
    return mc.getCameraDistance();
}    
public void setCameraDistance(double s){
  mc.setCameraDistance(s);  
}
   
public PerspectiveCamera getCamera(){
    return mc.getCamera();
}

     public  double randomDouble(double low, double high)
{ 
double result=0;
        result = (double)(Math.random() 
* (high - low + 1)) + low;
     
return result;
} 
  public  int randomInt(int low, int high)
{ 
int result=0;
        result = (int)(Math.random() 
* (high - low + 1)) + low;
     
return result;
}

  public PerspectiveCamera getOSCamera(){
      return mc.getCamera();
  } 
 public void moveCamera(double num ){
     mc.getCamera().setTranslateZ(num);
     setHUDDistance(num);
 } 
 
   
     
 public XGroup getUniverse(){
     
     return universe;
 }  
  public XGroup getWorld(){
     return world;
 }
  
  
   public XGroup rotateHudElement3(XGroup gameObjectXGroup){
  no3=no3+1;
  

 if(no3==361)no3=0;
    gameObjectXGroup.setRotate(no3);
//   lazar.play();
        return gameObjectXGroup;
} 
  
  
  
  public XGroup rotateHudElement2(XGroup gameObjectXGroup){
  no3=no3+R2;
  

  if(gameObjectXGroup.getTranslateX()>5600){
  gameObjectXGroup.setScaleX(randomDouble(0.1,4));
  gameObjectXGroup.setScaleY(randomDouble(0.1,4));
  gameObjectXGroup.setScaleZ(randomDouble(0.1,4));
  gameObjectXGroup.setTranslateY(randomDouble(10,500));
  gameObjectXGroup.setTranslateX(-3000);
  R2=randomDouble(2,20);
  no3=randomDouble(2,100);
  }
    gameObjectXGroup.rz.setAngle(no3);
//   lazar.play();
        return gameObjectXGroup;
} 
   
 public Group rotateHudElement(Group gameObjectXGroup){
  nol=nol+R;
  

  
  gameObjectXGroup.setScaleX(randomDouble(0.1,4));
  gameObjectXGroup.setScaleY(randomDouble(0.1,4));
  gameObjectXGroup.setScaleZ(randomDouble(0.1,4));
  gameObjectXGroup.setTranslateY(randomDouble(10,500));
  gameObjectXGroup.setTranslateX(3000);
  R=randomDouble(2,10);
  nol=randomDouble(2,10);
  
    gameObjectXGroup.setRotate(nol);;
//   lazar.play();
        return gameObjectXGroup;
}  
  
 public XGroup rotateHudElement(XGroup gameObjectXGroup){
  nol=nol+R;
  

  
  gameObjectXGroup.setScaleX(randomDouble(0.1,4));
  gameObjectXGroup.setScaleY(randomDouble(0.1,4));
  gameObjectXGroup.setScaleZ(randomDouble(0.1,4));
  gameObjectXGroup.setTranslateY(randomDouble(10,500));
  gameObjectXGroup.setTranslateX(3000);
  R=randomDouble(2,10);
  nol=randomDouble(2,10);
  
    gameObjectXGroup.rz.setAngle(nol);
//   lazar.play();
        return gameObjectXGroup;
} 
  
  public Sphere rotateHudElement(Sphere gameObjectXGroup){
 bufferno3=bufferno3+5;
  

 if(bufferno3==365)bufferno3=0;
    gameObjectXGroup.setRotationAxis(Rotate.Z_AXIS);
    
    gameObjectXGroup.setRotate(bufferno3);
//   lazar.play();
        return gameObjectXGroup;
} 
  
  
  
  
 public XGroup move(XGroup gameObjectXGroup){
  nol=nol+2;
  

  if(gameObjectXGroup.getTranslateX()>5600){
  gameObjectXGroup.setScaleX(randomDouble(0.1,4));
  gameObjectXGroup.setScaleY(randomDouble(0.1,4));
  gameObjectXGroup.setScaleZ(randomDouble(0.1,4));
  gameObjectXGroup.setTranslateY(randomDouble(10,500));
  gameObjectXGroup.setTranslateX(-3000);
  R=randomDouble(2,20);
  nol=randomDouble(2,100);
  }
    gameObjectXGroup.setTranslateX(nol);
//   lazar.play();
        return gameObjectXGroup;
} 
 public XGroup move2(XGroup gameObjectXGroup){
  no2=no2+R2;
   if(gameObjectXGroup.getTranslateY()>1600){
  gameObjectXGroup.setScaleX(randomDouble(0.1,5));
  gameObjectXGroup.setScaleY(randomDouble(0.1,5));
  gameObjectXGroup.setScaleZ(randomDouble(0.1,5));
  gameObjectXGroup.setTranslateX(randomDouble(-2000,2000));
  gameObjectXGroup.setTranslateY(-600);
  R2=randomDouble(2,100);
  no2=randomDouble(2,100);
  }
    gameObjectXGroup.setTranslateY(no2);
//   lazar.play();
        return gameObjectXGroup;
}   
  public void loadIntoHeadsUpDisplay(XGroup pic){
      pic.setId(String.valueOf(countID));
      countID++;
   gameObjectMatrix.add(pic);
   GUI.getChildren().add(pic);
   }  
  public String getState(){

return state;
}
   public boolean LoadModel(XGroup  x){
  gameObjectXGroup=x;  
  gameObjectXGroup.setTranslateX(0);
  gameObjectXGroup.setTranslateY(0);
  gameObjectXGroup.setTranslateZ(0);
  gameObjectXGroup.setScaleX(50);
  gameObjectXGroup.setScaleY(50);
  gameObjectXGroup.setScaleZ(50);
  XGroup form=new XGroup();
   form.getChildren().add(gameObjectXGroup); 
  //xform.getChildren().add(form); 
    return  true;     //backward();  
   
 } 
    public void updateModel(Os os){
      gameObjectXGroup.rx.setAngle(os.getMouse().getxComponent());
      gameObjectXGroup.ry.setAngle(os.getMouse().getycomponent());
      gameObjectXGroup.rz.setAngle(os.getMouse().getmouseDeltaZ());
  }
  
  public XGroup getGroup(){
      return gameObjectXGroup;
  }
 public void update(Observable obj, Object arg) {


message=(Message)arg;



 
   }  
  
 public MessageProcessor getMessageProcessor() {
     return messageProcessor;
 }

    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    } 
    
}
