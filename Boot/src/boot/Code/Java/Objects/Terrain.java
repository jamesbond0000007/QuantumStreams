/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Objects;
import boot.Code.Java.Support.XGroup;
import javafx.scene.paint.Color;
import javafx.scene.shape.Sphere;
import boot.Code.Java.Support.TorpedoLauncher;
import boot.Code.Java.Support.LightObject;
/**
 *
 * @author Richardo
 */
public class Terrain extends PrototypeObject{
  String name="Terrain";
    LightObject lo;
  @Override
  public String getName()  {
    return name;
}
public  Terrain(String name,double x,double y, double z,double a,double b,double c,double size){
    gameObjectXGroup=new XGroup();
    buffer=new Sphere();
      buffer2=new Sphere();    
      //  buffer2=new Sphere();
  launcher=new TorpedoLauncher();
       setName(this.getName());
       setLoadingName(name);
       gameObjectXGroup.setTranslateX(x);
       gameObjectXGroup.setTranslateY(y);
       gameObjectXGroup.setTranslateZ(z);
       gameObjectXGroup.rx.setAngle(a);
       gameObjectXGroup.ry.setAngle(b);
       gameObjectXGroup.rz.setAngle(c);
       
        gameObjectXGroup.setScaleX(size);
      gameObjectXGroup.setScaleY(size);
      gameObjectXGroup.setScaleZ(size);
   
 lo=new LightObject();   
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
  
}
