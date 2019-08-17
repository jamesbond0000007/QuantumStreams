/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Objects;
import boot.Os;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.TriangleMesh;
import boot.Code.Java.Support.XGroup;
import boot.Code.Java.Support.ImageSpawner;
/**
 *
 * @author Richardo
 */
public class SkyBox2 extends PrototypeObject{
 XGroup plane ;
ImageSpawner is;
    TriangleMesh planeMesh = new TriangleMesh();
    float[] points = {
            -5, 5, 0,
            -5, -5, 0,
            5, 5, 0,
            5, -5, 0
    };
    float[] texCoords = {
            0, 0,
            0, 1,
            1, 0,
            1, 1
    };
    int[] faces = {
            0, 0, 1, 1, 2, 2,
            2, 2, 3, 3, 1, 1
    };
    {
           plane=new XGroup();
            is =new ImageSpawner();
      is.create("Pictures/sky32.png");
        planeMesh.getPoints().addAll(points);
    planeMesh.getTexCoords().addAll(texCoords);
    planeMesh.getFaces().addAll(faces);
    MeshView meshView =   new MeshView(planeMesh);
    meshView.setMaterial(new PhongMaterial(Color.BLACK, is.getPicture().getImage(), null, null, null));

   
   plane.getChildren().add(meshView);
   plane.setScaleX(100);
   plane.setScaleY(100);
   plane.setScaleZ(100);
    }
  public void   SkyBox2(Os os){
    
   
   plane.setTranslateX(0);
   plane.setTranslateY(0);
   plane.setTranslateZ(0);
   
   os.injectIntoWorld(plane);
   os.insertIntoGameObjectMatrix(this);
  }
  
  public XGroup getGroup(){
      return plane ;
  }
}