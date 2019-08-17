/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.HUD;

import java.util.Stack;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

import boot.Os;
/**
 *
 * @author Richardo
 */
public class HudSupport {
     private Stack<Polygon> polygonMatrix=new Stack<Polygon>();  
 public boolean load(Os os)   {
     
      for(int count=0;count<os.getNumberOfChances();count++){
     
    addSupport(new Polygon()) ;
 }
      int kount=0;
    for(int count=0;count<os.getNumberOfChances();count++){
        
       
        polygonMatrix.get(count).setTranslateX(-3000+kount);
        polygonMatrix.get(count).setTranslateY(-3400);
       polygonMatrix.get(count).setTranslateZ(-64000); 
        polygonMatrix.get(count).getPoints().addAll(new Double[]{

1500.0,300.0,
1600.0,200.00,
1700.0,300.0,
1700.0,700.0,
2100.0,1100.0,
2100.0,800.0,
2150.0,700.0,
2200.0,800.0,
2200.0,1400.0,
2100.0,1300.0,
1900.0,1100.0,
1700.0,1100.0,
1700.0,1400.0,
1500.0,1400.0,
1500.0,1100.0,
1300.0,1100.0,
1000.0,1400.0,
1000.0,800.0,
1050.0,700.0,
1100.0,800.0,
1100.0,1100.0,
1500.0,700.0,
1500.0,300.0,



    
});
 polygonMatrix.get(count).setFill(Color.HONEYDEW);
 polygonMatrix.get(count).setScaleX(.25);
 polygonMatrix.get(count).setScaleY(.25);
  polygonMatrix.get(count).setScaleZ(.25);
 kount=kount+500;
    }
 


 return true;
 }  
  public Polygon getSupport(int ip){
return polygonMatrix.get(ip);
   }   
   public boolean addSupport(Polygon p) {
      polygonMatrix.add(p);
   return true;    
   }
   
  public void reset(Os os){
      int kount=0;
  
     for(int count=0;count<os.getNumberOfChances();count++){
        
     
        polygonMatrix.get(count).setTranslateX(-3000+kount);
        polygonMatrix.get(count).setTranslateY(-3400);
       polygonMatrix.get(count).setTranslateZ(-64000);  
          kount=kount+500;
  }
  
}
}