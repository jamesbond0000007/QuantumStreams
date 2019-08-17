/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Objects;
import boot.Code.Groovy.Animation.Navigation;
import boot.Code.Java.Support.XGroup;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import boot.Code.Java.Support.Bulb;
import boot.Code.Java.Support.Message;
import boot.Os;
import boot.Interface.Playable;
import boot.Code.Java.Support.TorpedoLauncher;
import java.net.URL;
import java.util.Stack;
/**
 *
 * @author Richardo Reyes
 */
public class Ball  extends GameShape  {
    Bulb lo;
    protected  Image suntextureImage;
    protected static  URL sunTexture;
    protected  final PhongMaterial sunMaterial = new PhongMaterial();
      private  String name;
    Sphere buffer,buffer2;
XGroup gameObjectAppearance;
     Message sendToheadsUpDisplay=new Message();
 private Stack<Playable> ObjectMatrix;

    Navigation navigation =new Navigation();


    {
        navigation.load();
    }

    final PhongMaterial redMaterial = new PhongMaterial();  
    {
     try{
   
             
     
             sunTexture =new URL(this.getClass().getResource("Code/Material/panels.png").toString());  
            suntextureImage = new Image(sunTexture.toString());
            sunMaterial.setDiffuseMap(suntextureImage);
    
  
           
      
     
         
           moonTexture =new URL(this.getClass().getResource("warpfield.png").toString()); 
          moontextureImage = new Image(moonTexture.toString());
             moonMaterial.setDiffuseMap(moontextureImage);
    
   
        }   
        
        
       
       catch(Exception e){
           
       }
    

}

    public  void getQuantumLanguage(String name){

    }
    public  void getQuantumLanguage(Os os ){

    }
    public  Ball(String name,double x,double y, double z,double a,double b,double c,double size){
  
    buffer=new Sphere();
      buffer2=new Sphere();    
      //  buffer2=new Sphere();
        TorpedoLauncher launcher=new TorpedoLauncher();
       setName(this.getName());
       setLoadingName(name);
       gameObjectAppearance.setTranslateX(x);
       gameObjectAppearance.setTranslateY(y);
       gameObjectAppearance.setTranslateZ(z);
       gameObjectAppearance.rx.setAngle(a);
       gameObjectAppearance.ry.setAngle(b);
       gameObjectAppearance.rz.setAngle(c);
       
        gameObjectAppearance.setScaleX(size);
      gameObjectAppearance.setScaleY(size);
      gameObjectAppearance.setScaleZ(size);
   
 lo=new Bulb();   
//lo.lightThis2(gameObjectXGroup);

        
         buffer2.setScaleX(1.3);//enterpriseD.03
    redMaterial.setDiffuseColor(Color.GRAY);
       redMaterial.setSpecularColor(Color.GRAY); 
   buffer.setMaterial(sunMaterial);
    buffer2.setScaleY(1.3);
    buffer2.setScaleZ(1.3);
    buffer2.setTranslateX(400);//-900
    buffer2.setTranslateY(-2000);//-2700
    buffer2.setTranslateZ(0);//0
    buffer2.setRadius(30);
    buffer2.setMaterial(sunMaterial);
    //--------------------
    
 
   
    }


    public Ball(){
      name="Cylinder";
  } 
  
public String getName(){
    return "Ball";
}
    public boolean getFighteable(){
        return true;
    }
    public void setFighteable(boolean b){

    }

    public int getStage(){
        return 0;
    }
    public void setStage(int kk){

    }

}
