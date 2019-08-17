/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Objects;

import boot.Code.Groovy.Animation.Navigation;
import javafx.scene.shape.*;
import boot.Code.Java.Objects.Prototype;
import boot.Code.Java.Support.XGroup;


import java.util.Stack;
/**
 *
 * @author Richardo Reyes
 */
public class Lego extends Prototype{
       private Stack<XGroup> xgroupMatrix=new Stack<XGroup>(); 
       private Stack<Sphere> sphereMatrix=new Stack<Sphere>(); 
       private Stack<Ball> ballMatrix=new Stack<Ball>(); 
       private Stack<Block> blockMatrix=new Stack<Block>(); 
       private Stack<Box> boxMatrix=new Stack<Box>();  
       private Stack<Cylinder> cylinderMatrix=new Stack<Cylinder>();  
       private Stack<Ellipse>ellipseMatrix=new Stack<Ellipse>(); 
       private Stack<Rectangle> rectangleMatrix=new Stack<Rectangle>();  
       private Stack<Circle> circleMatrix=new Stack<Circle>();  
       private Stack<Polygon> polygonMatrix=new Stack<Polygon>(); 
       
       
       
       
         public void addModel(XGroup s){
          xgroupMatrix.add(s);
       }
       
         public void addPolygon(Polygon s){
          polygonMatrix.add(s);
       }
          public void addSphere(Sphere s){
          sphereMatrix.add(s);
       }
         public void addBall(Ball s){
          ballMatrix.add(s);
       }
         public void addBlock(Block s){
          blockMatrix.add(s);
       }
         
     
        public void addBox(Box s){
          boxMatrix.add(s);
       }
         public void addCylinder(Cylinder s){
           cylinderMatrix.add(s);
       }
          public void addEllipse(Ellipse s){
          ellipseMatrix.add(s);
       }
           public void addCircle(Circle s){
           circleMatrix.add(s);
       }
            public void addRectangle(Rectangle s){
           rectangleMatrix.add(s);
       }
        public Sphere getSphere(int s){
       return   sphereMatrix.get(s);
       }
        public Box getBox(int s){
        return  boxMatrix.get(s);
       }
         public Cylinder getCylinder(int s){
         return  cylinderMatrix.get(s);
       }
          public Ellipse getEllipse(int s){
        return  ellipseMatrix.get(s);
       }
           public Circle getCircle(int s){
         return  circleMatrix.get(s);
       }
           public XGroup getModel(int num){
               return xgroupMatrix.get(num);
           }
            public Rectangle getRectangle(int s){
         return  rectangleMatrix.get(id);
       } 
              public Polygon getPolygon(int s){
         return  polygonMatrix.get(id);
       }    
       public void load(){
           for(int count=0;count<sphereMatrix.size();count++){
              
              this.getGroup().getChildren().add(sphereMatrix.get(count));
           }
                    for(int count=0;count<boxMatrix.size();count++){
              
              this.getGroup().getChildren().add(boxMatrix.get(count));
           }
  for(int count=0;count<cylinderMatrix.size();count++){
              
              this.getGroup().getChildren().add(cylinderMatrix.get(count));
           }
   for(int count=0;count<xgroupMatrix.size();count++){
              
              this.getGroup().getChildren().add(xgroupMatrix.get(count));
           }
           
       }     
  public void reBuild(){
      
  }
public void build(){
    
}
public void autoBuild(){
    
}
    Navigation quantumLanguage =new Navigation();


    {
        quantumLanguage.load();
    }
    public Navigation getQuantumLanguage(){
        return quantumLanguage;
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
