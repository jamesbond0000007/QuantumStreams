/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Objects;

import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import boot.Code.Java.Support.Message;
import boot.Code.Java.Support.XGroup;
import boot.Code.Groovy.Animation.Navigation;
import boot.Code.Java.Objects.Player;
import java.util.Stack;

import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import boot.Code.Java.Support.Message;
import boot.Code.Java.Support.XGroup;
import boot.Code.Groovy.Animation.Navigation;
import boot.Interface.Playable;
import java.util.Stack;
import boot.Code.Java.Support.TorpedoLauncher;
import boot.Code.Java.Support.Bulb;

/**
 *
 * @author Richardo Reyes
 */
public class Block extends GameShape  {
     Message sendToheadsUpDisplay=new Message();
 private Stack<Player> ObjectMatrix;
      final PhongMaterial redMaterial = new PhongMaterial();

    Navigation navigation =new Navigation();


    {
        navigation.load();
    }
    public Navigation getNavigation(){
        return navigation;
    }

    public  Block(String name,double x,double y, double z,double a,double b,double c,double size){
      name="Shape";  
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
   
Bulb lo=new Bulb();   
//lo.lightThis2(gameObjectXGroup);

        
         buffer2.setScaleX(1.3);//enterpriseD.03
    redMaterial.setDiffuseColor(Color.GRAY);
       redMaterial.setSpecularColor(Color.GRAY); 
   buffer2.setMaterial(redMaterial);
    buffer2.setScaleY(1.3);
    buffer2.setScaleZ(1.3);
    buffer2.setTranslateX(400);//-900
    buffer2.setTranslateY(-2000);//-2700
    buffer2.setTranslateZ(0);//0
    buffer2.setRadius(30);
    buffer2.setMaterial(redMaterial);
    //--------------------
    
 
   
    } 
 
   public String getName(){
        return "Box";
    }
 
  public XGroup getGameObjectAppearance(){
     return gameObjectAppearance;
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
