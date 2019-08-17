/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Support;
import boot.Code.Java.Objects.PrototypeObject;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Sphere;
import boot.ModelLoader;
import boot.Os;
import boot.ResourceManager;
import boot.Code.Java.Objects.Terrain;
import boot.Code.Java.Objects.Opponent;
import boot.Code.Java.Objects.Player;
import boot.Code.Java.Objects.SkyBox;
import boot.Code.Java.Objects.SkyBox2;
import boot.Code.Java.Input.Mouse;
import boot.Code.Java.Input.Keyboard;

/**
 *
 * @author Richardo
 */
public class StageLoader {
   
      private Timeline animation;
       double limitN=-9000;
   double limitP=9600;
      Thread collisionThread ;
      double out=0;
        Thread coreThread ;
      Thread coreThread2 ; 
    private boolean forward, backward, left, right, vertControl;

    double MAX=32000;
    double MIN=-3200;

static String  state  ="ok";
    
int    numberofrapters=14;
    
   static int track=0; 
  static Message systemMessage= new Message(); 
 
    Pack pack;
 static   boolean test=true;
  
    static int count=2;
        double size=2.1;
    Mouse mouse;
    Os osX;
    Scene scene;
   
    int missileSize=100;
    int counter=2;

    PrototypeObject currentObject;
 
   static int formIDObject=0;
    Color color;
    static int level;
 boolean enable=false;

 ModelLoader modelLoader;
 
 ResourceManager resorceManager=new ResourceManager();

 Keyboard keyboard;

 static int numberOfplayerChances=10;
    String play="yes";
    int numberOfOpponents=100; 
 
    public  StageLoader(){
    
      modelLoader=new ModelLoader();
    }
   public int getnumberOfplayerChances() {
       return numberOfplayerChances;
   }

   public void setNumberOfplayerChances(int num){
       numberOfplayerChances=num;
   }
   
    public void decrementNumberOfChances(){
     numberOfplayerChances--; 
  }
  public void incrementNumberOfChances(){
     numberOfplayerChances++; 
  }
 public void reEnterBattle(Os os){


  
for(int count=0;count<os.getCoreMatrix().size();count++){    
if(os.getGameObject(count).getGroup().getTranslateZ()>999999){
os.getGameObject(count).getGroup().setTranslateZ(600000);
os.getGameObject(count).setName("Opponent");
} 

 
}
 }


 
 public void replenish(Os os){

  try{
  
for(int count=0;count<5;count++){    
this.loadStreams(os,"Opponent",resorceManager.getModelName(2),680,-2000,97000,-90,0,-90,size); 

} 
 for(int count=5;count<50;count++){ 
   
// os.getGameObject(count).getTransition(os, count);
}

    //
//os.addBubbles();
 //this.transition(os);


  }
  catch(Exception e){
      
  }

 }

public void  loadAllResevedStreams(Os os){
  
  this.loadReservedStreams(os,"Player",resorceManager.getModelName(0),0,17500,-18000,90,90,0,2.1);
    os.setNumberOfOpponents(35);
for(int count=0;count<os.getNumberOfOpponent();count++){
   
 this.loadReservedStreams(os,"Opponent",resorceManager.getModelName(2),randomDouble(-42000, 42000),randomDouble(-42000, 42000),randomDouble(-999999, 999999),-90,0,-90,size); 


}
}
public void  loadAllLightStreams(Os os){
      
 
 os.switchStage();
 
 switch(os.getStage()){
     
      case 0:
  //   Butterfly   butterfly=new Butterfly(-1980,200,9000);
     os.getCoreMatrix().clear();
       os.getWorld().getChildren().clear(); 
os.getHud().videoOutput2(os,os.randomInt(0, 3));
loadSky2( os, "Pictures/tt5a.jpg");
//loadSky( os,"Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png");
          os.getHud().getPack().get(1).setVisible(true);
   this.loadStreams(os,"Player",resorceManager.getModelName(9),0,0,18000,0,0,0,10);

          this.loadStreams(os,"Terrain",resorceManager.getModelName(2),0,90000,limitP,0,180,180,1000);
 this.loadStreams(os,"Terrain",resorceManager.getModelName(5),0,0,0,0,180,180,3000);//2 3  4  5 6
          os.setNumberOfOpponents(35);
          for(int count=0;count<os.getNumberOfOpponent();count++){
   
 this.loadStreams(os,"Opponent",resorceManager.getModelName(0),0,randomDouble(-42000, 42000),randomDouble(-limitP, limitP),-90,0,-90,size); 


}
// os.getPlayer().loadCamera(os.getHud().getMotionCamera());
 
 //  os.getHud().videoOutput2(os,os.randomInt(0, 5));

    break;     
 
     
     case 1:
   os.getCoreMatrix().clear();
       os.getWorld().getChildren().clear(); 
  os.setNumberOfChances(8) ;
os.getHud().getHuSupport().reset(os);
os.getHud().loadLifeDisplay(os);
os.getHud().updateLifeDisplay(os);
loadSky2( os ,"Pictures/tt5a.jpg");
//loadSky( os,"Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png");
         os.getHud().videoOutput2(os,0);
   this.loadStreams(os,"Player",resorceManager.getModelName(0),0,17500,-18000,90,90,0,2.1);

   
 this.loadStreams(os,"Terrain",resorceManager.getModelName(8),0,90000,limitP,0,180,180,1000);

         os.setNumberOfOpponents(35);
         for(int count=0;count<os.getNumberOfOpponent();count++){
   
 this.loadStreams(os,"Opponent",resorceManager.getModelName(0),0,randomDouble(-42000, 42000),randomDouble(-limitP, limitP),-90,0,-90,size); 


}
// os.getPlayer().loadCamera(os.getHud().getMotionCamera());
         os.getHud().getPack().get(2).setVisible(true);
 //  os.

    break;     
 
     case 2:
   os.getCoreMatrix().clear();
       os.getWorld().getChildren().clear(); 
       
  os.setNumberOfChances(8) ;
os.getHud().getHuSupport().reset(os);
os.getHud().loadLifeDisplay(os);
os.getHud().updateLifeDisplay(os);
loadSky2( os, "Pictures/tt5a.jpg");
//loadSky( os,"Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png");

   this.loadStreams(os,"Player",resorceManager.getModelName(0),0,17500,-18000,90,90,0,2.1);

   
 this.loadStreams(os,"Terrain",resorceManager.getModelName(4),0,90000,limitP,0,180,180,400);

         os.setNumberOfOpponents(35);
         for(int count=0;count<os.getNumberOfOpponent();count++){
   
 this.loadStreams(os,"Opponent",resorceManager.getModelName(0),0,randomDouble(-42000, 42000),randomDouble(-limitP, limitP),-90,0,-90,size); 


}
// os.getPlayer().loadCamera(os.getHud().getMotionCamera());
         os.getHud().getPack().get(3).setVisible(true);
 //  os.
  break;    
  
  case 3:
  //   Butterfly   butterfly=new Butterfly(-1980,200,9000);
   os.getCoreMatrix().clear();
       os.getWorld().getChildren().clear(); 
  os.setNumberOfChances(8) ;
os.getHud().getHuSupport().reset(os);
os.getHud().loadLifeDisplay(os);
os.getHud().updateLifeDisplay(os);
loadSky( os,"Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png"); 
   this.loadStreams(os,"Player",resorceManager.getModelName(0),0,17500,-18000,90,90,0,2.1);

   
 this.loadStreams(os,"Terrain",resorceManager.getModelName(4),0,90000,limitP,0,180,180,1000);

      os.setNumberOfOpponents(35);
      for(int count=0;count<os.getNumberOfOpponent();count++){
   
 this.loadStreams(os,"Opponent",resorceManager.getModelName(0),0,randomDouble(-42000, 42000),randomDouble(-limitP, limitP),-90,0,-90,size); 


}
 //os.getPlayer().loadCamera(os.getHud().getMotionCamera());
      os.getHud().getPack().get(4).setVisible(true);
 //  os.getHud().videoOutput2(os,os.randomInt(0, 5));
  break;  
 case 4:
  os.getCoreMatrix().clear();
       os.getWorld().getChildren().clear(); 
  os.setNumberOfChances(8) ;
os.getHud().getHuSupport().reset(os);
os.getHud().loadLifeDisplay(os);
os.getHud().updateLifeDisplay(os);      
loadSky( os,"Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png");
   this.loadStreams(os,"Player",resorceManager.getModelName(0),0,17500,-18000,90,90,0,2.1);

   
 this.loadStreams(os,"Terrain",resorceManager.getModelName(5),0,90000,limitP,0,180,180,100);

     os.setNumberOfOpponents(35);
     for(int count=0;count<os.getNumberOfOpponent();count++){
   
 this.loadStreams(os,"Opponent",resorceManager.getModelName(0),0,randomDouble(-42000, 42000),randomDouble(-limitP, limitP),-90,0,-90,size); 


}
// os.getPlayer().loadCamera(os.getHud().getMotionCamera());
     os.getHud().getPack().get(5).setVisible(true);
 //  os.getHud().videoOutput2(os,os.randomInt(0, 5));
       
  break;  
 case 5:
    //   Butterfly   butterfly=new Butterfly(-1980,200,9000);
     os.getCoreMatrix().clear();
       os.getWorld().getChildren().clear(); 
    os.setNumberOfChances(8) ;
os.getHud().getHuSupport().reset(os);
os.getHud().loadLifeDisplay(os);
os.getHud().updateLifeDisplay(os);   
       
loadSky( os,"Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png");   this.loadStreams(os,"Player",resorceManager.getModelName(0),0,17500,-18000,90,90,0,2.1);

   
 this.loadStreams(os,"Terrain",resorceManager.getModelName(3),0,90000,limitP,0,180,180,100);

     os.setNumberOfOpponents(35);
     for(int count=0;count<os.getNumberOfOpponent();count++){
   
 this.loadStreams(os,"Opponent",resorceManager.getModelName(0),0,randomDouble(-42000, 42000),randomDouble(-limitP, limitP),-90,0,-90,size); 


}
 //os.getPlayer().loadCamera(os.getHud().getMotionCamera());
     os.getHud().getPack().get(6).setVisible(true);
 //  os.getHud().videoOutput2(os,os.randomInt(0, 5));
 //os.getScene().setCamera( os.getPlayer().getMotionCameraCamera().getCamera());
  //this.transition(os);


     
  break;  
 case 6:
 //   Butterfly   butterfly=new Butterfly(-1980,200,9000);
     os.getCoreMatrix().clear();
       os.getWorld().getChildren().clear(); 
    os.setNumberOfChances(8) ;
os.getHud().getHuSupport().reset(os);
os.getHud().loadLifeDisplay(os);
os.getHud().updateLifeDisplay(os);    
loadSky( os,"Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png"); this.loadStreams(os,"Player",resorceManager.getModelName(0),0,17500,-18000,90,90,0,2.1);

   
 this.loadStreams(os,"Terrain",resorceManager.getModelName(0),0,90000,limitP,0,180,180,100);

     os.setNumberOfOpponents(35);
     for(int count=0;count<os.getNumberOfOpponent();count++){
   
 this.loadStreams(os,"Opponent",resorceManager.getModelName(0),0,randomDouble(-42000, 42000),randomDouble(-limitP, limitP),-90,0,-90,size); 


}
 //os.getPlayer().loadCamera(os.getHud().getMotionCamera());
 
  os.getHud().videoOutput2(os,os.randomInt(0, 5));
 //os.getScene().setCamera( os.getPlayer().getMotionCameraCamera().getCamera());
  //this.transition(os);
     os.getHud().getPack().get(7).setVisible(true);


  break;  

 case 7:
  //   Butterfly   butterfly=new Butterfly(-1980,200,9000);
     os.getCoreMatrix().clear();
       os.getWorld().getChildren().clear(); 
   os.setNumberOfChances(8) ;
os.getHud().getHuSupport().reset(os);
os.getHud().loadLifeDisplay(os);
os.getHud().updateLifeDisplay(os);
loadSky( os,"Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png"); this.loadStreams(os,"Player",resorceManager.getModelName(0),0,17500,-18000,90,90,0,2.1);

   
 this.loadStreams(os,"Terrain",resorceManager.getModelName(0),0,90000,limitP,0,180,180,100);

     os.setNumberOfOpponents(35);
     for(int count=0;count<os.getNumberOfOpponent();count++){
   
 this.loadStreams(os,"Opponent",resorceManager.getModelName(0),0,randomDouble(-42000, 42000),randomDouble(-limitP, limitP),-90,0,-90,size); 


}
// os.getPlayer().loadCamera(os.getHud().getMotionCamera());
     os.getHud().getPack().get(8).setVisible(true);
 // os.getHud().videoOutput2(os,os.randomInt(0, 5));
 //os.getScene().setCamera( os.getPlayer().getMotionCameraCamera().getCamera());
  //this.transition(os);


  break;  
 case 8:
    //   Butterfly   butterfly=new Butterfly(-1980,200,9000);
     os.getCoreMatrix().clear();
       os.getWorld().getChildren().clear(); 
   os.setNumberOfChances(8) ;
os.getHud().getHuSupport().reset(os);
os.getHud().loadLifeDisplay(os);
os.getHud().updateLifeDisplay(os);   
loadSky( os,"Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png"); this.loadStreams(os,"Player",resorceManager.getModelName(0),0,17500,-18000,90,90,0,2.1);

   
 this.loadStreams(os,"Terrain",resorceManager.getModelName(0),0,90000,limitP,0,180,180,100);

     os.setNumberOfOpponents(35);
     for(int count=0;count<os.getNumberOfOpponent();count++){
   
 this.loadStreams(os,"Opponent",resorceManager.getModelName(0),0,randomDouble(-42000, 42000),randomDouble(-limitP, limitP),-90,0,-90,size); 


}
 //os.getPlayer().loadCamera(os.getHud().getMotionCamera());
  // os.getHud().videoOutput2(os,os.randomInt(0, 5));
     os.getHud().getPack().get(9).setVisible(true);
 //os.getScene().setCamera( os.getPlayer().getMotionCameraCamera().getCamera());
  //this.transition(os);



  break;  

 case 9:
   //   Butterfly   butterfly=new Butterfly(-1980,200,9000);
     os.getCoreMatrix().clear();
       os.getWorld().getChildren().clear();
   os.setNumberOfChances(8) ;
os.getHud().getHuSupport().reset(os);
os.getHud().loadLifeDisplay(os);
os.getHud().updateLifeDisplay(os);   
       
loadSky( os,"Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png","Pictures/sky31.png"); loadSky( os,"Pictures/london_night_2-wallpaper-1366x768.jpg","Pictures/sky27.png","Pictures/sky27.png","Pictures/sky27.png","Pictures/sky27.png","Pictures/sky27.png");
  this.loadStreams(os,"Player",resorceManager.getModelName(0),0,17500,-18000,90,90,0,2.1);

   
 this.loadStreams(os,"Terrain",resorceManager.getModelName(0),0,90000,limitP,0,180,180,100);

     os.setNumberOfOpponents(35);
     for(int count=0;count<os.getNumberOfOpponent();count++){
   
 this.loadStreams(os,"Opponent",resorceManager.getModelName(0),0,randomDouble(-42000, 42000),randomDouble(-limitP, limitP),-90,0,-90,size); 


}
 //os.getPlayer().loadCamera(os.getHud().getMotionCamera());
     os.getHud().getPack().get(10).setVisible(true);

 //os.getScene().setCamera( os.getPlayer().getMotionCameraCamera().getCamera());
  //this.transition(os);


                   
  break;    
  
    }




}



public void loadReservedStreams(Os os, String targetName, String name, double x, double y, double z, double a, double b, double c, double size){
  

if(targetName=="Terrain"){
     Terrain opponent=new Terrain(name,x,y,z,a,b,c,size); 
opponent.setLoadingName(name);
  opponent.LoadModel(modelLoader.LoadModel(opponent.getLoadingName(),100,150,100,true));
  opponent.addjust( x, y, z, a, b, c, size);
 opponent.setID(formIDObject);
opponent.getGroup().setId(String.valueOf(formIDObject));
formIDObject++;
      
  Xform moleculeXform = new Xform();
        Xform oxygenXform = new Xform();

XGroup  moleculeGroup=new XGroup();
moleculeXform.getChildren().add(oxygenXform);
oxygenXform.getChildren().add(opponent.getGroup());
moleculeGroup.getChildren().add(moleculeXform);
os.injectIntoReservedWorld(moleculeGroup);
os. insertIntoReservedGameOjecrMatrix(opponent);
}

else if(targetName=="Player"){
  Player opponent=new Player( name,x,y,z,a,b,c,size); 
opponent.setLoadingName(name);
  opponent.LoadModel(modelLoader.LoadModel(opponent.getLoadingName(),100,150,100,true));
  opponent.addjust( x, y, z, a, b, c, size);
 opponent.setID(formIDObject);
opponent.getGroup().setId(String.valueOf(formIDObject));
formIDObject++;
   // opponent.getTransition(os, os.randomInt(0, 6));
// opponent.setDefaultParralelTransition(os).play();
    //  opponent.getTransition(os, 9);
  Xform moleculeXform = new Xform();
        Xform oxygenXform = new Xform();

XGroup  moleculeGroup=new XGroup();
moleculeXform.getChildren().add(oxygenXform);
oxygenXform.getChildren().add(opponent.getGroup());
moleculeGroup.getChildren().add(moleculeXform);
os.injectIntoReservedWorld(moleculeGroup);
os. insertIntoReservedGameOjecrMatrix(opponent);
}
else if(targetName=="Opponent"){
  Opponent opponent=new Opponent( name,x,y,z,a,b,c,size); 
opponent.setLoadingName(name);
  opponent.LoadModel(modelLoader.LoadModel(opponent.getLoadingName(),100,150,100,true));
  opponent.addjust( x, y, z, a, b, c, size);
 opponent.setID(formIDObject);
opponent.getGroup().setId(String.valueOf(formIDObject));
formIDObject++;
     // opponent.getTransition(os, os.randomInt(0,  randomInt(0,9)));
 //opponent.setDefaultParralelTransition(os).play();
     // opponent.getTransition(os, randomInt(0,9));
  Xform moleculeXform = new Xform();
        Xform oxygenXform = new Xform();

XGroup  moleculeGroup=new XGroup();
moleculeXform.getChildren().add(oxygenXform);
oxygenXform.getChildren().add(opponent.getGroup());
moleculeGroup.getChildren().add(moleculeXform);
os.injectIntoReservedWorld(moleculeGroup);
os. insertIntoReservedGameOjecrMatrix(opponent);



}   
   
}

public void loadStreams(Os os, String targetName, String name, double x, double y, double z, double a, double b, double c, double size){
 

if(targetName=="Terrain"){
     Terrain opponent=new Terrain(name,x,y,z,a,b,c,size); 
opponent.setLoadingName(name);
  opponent.LoadModel(modelLoader.LoadModel(opponent.getLoadingName(),100,150,100,true));
  opponent.addjust( x, y, z, a, b, c, size);
 opponent.setID(formIDObject);
opponent.getGroup().setId(String.valueOf(formIDObject));
formIDObject++;
      
  Xform moleculeXform = new Xform();
        Xform oxygenXform = new Xform();

XGroup  moleculeGroup=new XGroup();
moleculeXform.getChildren().add(oxygenXform);
oxygenXform.getChildren().add(opponent.getGroup());
moleculeGroup.getChildren().add(moleculeXform);
os.injectIntoWorld(moleculeGroup);
os. insertIntoGameObjectMatrix(opponent);
}

else if(targetName=="Player"){
  Player opponent=new Player( name,x,y,z,a,b,c,size); 
opponent.setLoadingName(name);
  opponent.LoadModel(modelLoader.LoadModel(opponent.getLoadingName(),100,150,100,true));
  opponent.addjust( x, y, z, a, b, c, size);
 opponent.setID(formIDObject);
opponent.getGroup().setId(String.valueOf(formIDObject));
formIDObject++;
   //\\ opponent.getTransition(os, os.randomInt(0, 6));
// opponent.setDefaultParralelTransition(os).play();
    //  opponent.getTransition(os, 9);
  Xform moleculeXform = new Xform();
        Xform oxygenXform = new Xform();

XGroup  moleculeGroup=new XGroup();
moleculeXform.getChildren().add(oxygenXform);
oxygenXform.getChildren().add(opponent.getGroup());
moleculeGroup.getChildren().add(moleculeXform);
os.injectIntoWorld(moleculeGroup);
os. insertIntoGameObjectMatrix(opponent);


}
else if(targetName=="Opponent"){
  Opponent opponent=new Opponent( name,x,y,z,a,b,c,size); 
opponent.setLoadingName(name);
  opponent.LoadModel(modelLoader.LoadModel(opponent.getLoadingName(),100,150,100,true));
  opponent.addjust( x, y, z, a, b, c, size);
 opponent.setID(formIDObject);
opponent.getGroup().setId(String.valueOf(formIDObject));
formIDObject++;
     // opponent.getTransition(os, os.randomInt(0,  randomInt(0,9)));
 //opponent.setDefaultParralelTransition(os).play();
    ///  opponent.getTransition(os, randomInt(0,9));
  Xform moleculeXform = new Xform();
        Xform oxygenXform = new Xform();
    opponent.ai(os);
XGroup  moleculeGroup=new XGroup();
moleculeXform.getChildren().add(oxygenXform);
oxygenXform.getChildren().add(opponent.getGroup());
moleculeGroup.getChildren().add(moleculeXform);
os.injectIntoWorld(moleculeGroup);
os. insertIntoGameObjectMatrix(opponent);
}


      
}   
 
   
 
   public void loadAPlanet(Os os){
    Sphere s = new Sphere();
    PhongMaterial mat = new PhongMaterial();
    //mat.setDiffuseMap(new Image("http://www.zfight.com/misc/images/textures/envmaps/interstellar_large.jpg"));
    s.setMaterial(mat);
    s.setDrawMode(DrawMode.LINE);
    s.setRadius(190000);
    s.setTranslateX(os.getHud().getCamera().getTranslateX());
    s.setTranslateZ(os.getHud().getCamera().getTranslateZ() + 5000);
   os.getUniverse() .getChildren().add(s);
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
public void loadSky2(Os os, String name){
     

       SkyBox skybox=new SkyBox();
        skybox.getGroup().setTranslateX(0);
 skybox.getGroup().setTranslateY(0);
      skybox.getGroup().setTranslateZ(100);
      skybox.getGroup().setScaleX(900000);
      skybox.getGroup().setScaleY(900000);
      skybox.getGroup().setScaleZ(900000);
      skybox.WideSky(  os,name);
       
       
} 
 public void loadSky(Os os, String name){
     
   ImageX imageX1 =new ImageX();
      imageX1.create(name);
       SkyBox2 skybox=new SkyBox2();
        skybox.getGroup().setTranslateX(0);
 skybox.getGroup().setTranslateY(0);
      skybox.getGroup().setTranslateZ(100);
      skybox.getGroup().setScaleX(900000);
      skybox.getGroup().setScaleY(900000);
      skybox.getGroup().setScaleZ(900000);
        os.injectIntoWorld(skybox.getGroup());
 os.insertIntoGameObjectMatrix(skybox);
}
public void loadSky(Os os, String sky1, String sky2, String sky3, String sky4, String sky5, String sky6){
  
    SkyBox skybox;
   ImageX imageX1 =new ImageX();
      imageX1.create(sky1);
      
      ImageX imageX2 =new ImageX();
      imageX2.create(sky2);
      
         ImageX imageX3 =new ImageX();
      imageX3.create(sky3);
      
         ImageX imageX4 =new ImageX();
      imageX4.create(sky4);
         ImageX imageX5 =new ImageX();
      imageX5.create(sky5);
      
         ImageX imageX6 =new ImageX();
      imageX6.create(sky6);
      


 skybox=new SkyBox(imageX1.getImage(), imageX2.getImage(), imageX3.getImage(), imageX4.getImage(), imageX5.getImage(), imageX6.getImage(),90000000.0,os.getHud().getCamera());
 //skybox.setSize(9999999999999999.0);

 skybox.getGroup().setTranslateX(0);
 skybox.getGroup().setTranslateY(0);
      skybox.getGroup().setTranslateZ(0);
 os.injectIntoWorld(skybox.getGroup());
 os.insertIntoGameObjectMatrix(skybox);
}  
      
}
