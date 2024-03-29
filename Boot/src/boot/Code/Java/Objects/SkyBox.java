/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Objects;
import java.net.URL;
import boot.Os;

import javafx.scene.paint.Color;
import javafx.scene.shape.Sphere;
import javafx.animation.AnimationTimer;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Rectangle2D;
import boot.Code.Java.Support.ImageSpawner;
import javafx.scene.PerspectiveCamera;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Rotate;
import boot.Code.Java.Support.XGroup;



        
/**
 *
 * @author Richardo
 */
public class SkyBox  extends PrototypeObject {

    protected  final PhongMaterial sunMaterial = new PhongMaterial();    
     protected  Image suntextureImage; 
   protected static  URL sunTexture;
     final PhongMaterial redMaterial = new PhongMaterial(); 
  public enum SkyboxImageType{
        MULTIPLE, SINGLE
    }
        
    private final Affine affine = new Affine();
    private final ImageView 
            top   = new ImageView(),
            bottom= new ImageView(),
            left  = new ImageView(),
            right = new ImageView(),            
            back  = new ImageView(),
            front = new ImageView();
    {
        top.setId("top ");
        bottom.setId("bottom ");
        left.setId("left ");
        right.setId("right ");
        back.setId("back ");
        front.setId("front ");
    }
    private final ImageView[] views = new ImageView[]{
        top,   
        left,
        back,
        right,  
        front, 
        bottom  
    };
    private Image 
            topImg, bottomImg, leftImg, rightImg, frontImg, backImg, singleImg;
    private WritableImage convertedImage;
    
    private  PerspectiveCamera camera;
    private AnimationTimer timer;
    private  SkyboxImageType imageType;

    public SkyBox(Image singleImg, double size, PerspectiveCamera camera) {
        super();
        this.imageType = SkyboxImageType.SINGLE;
        
        this.singleImg = singleImg;
        this.size.set(size);
        this.camera = camera;     
        
        this.getGroup().getTransforms().add(affine);
        
        loadImageViews();
        
       this.getGroup(). getChildren().addAll(views);
    }

    public SkyBox(Image topImg, Image bottomImg, Image leftImg, Image rightImg, Image frontImg, Image backImg, double size, PerspectiveCamera camera) {
        super();            
        this.imageType = SkyboxImageType.MULTIPLE;
                
        this.topImg = topImg;
        this.bottomImg = bottomImg;
        this.leftImg = leftImg;
        this.rightImg = rightImg;
        this.frontImg = frontImg;
        this.backImg = backImg;
        this.size.set(size);
        this.camera = camera;
        
        loadImageViews();
        
     this.getGroup().   getTransforms().add(affine);
                        
    this.getGroup().    getChildren().addAll(views);
        
        startTimer();
    }

    
    
    private void loadImageViews(){
                        
        for(ImageView iv : views){      
            iv.setSmooth(true);
            iv.setPreserveRatio(false);            
        }
        
        validateImageType();
        
        
    }

    private void layoutViews() {
        
        for(ImageView v : views){
            v.setFitWidth(getSize());
            v.setFitHeight(getSize());
        }
        
        back.setTranslateX(-0.5 * getSize());
        back.setTranslateY(-0.5 * getSize());
        back.setTranslateZ(-0.5 * getSize());          
                
        front.setTranslateX(-0.5 * getSize());
        front.setTranslateY(-0.5 * getSize());
        front.setTranslateZ(0.5 * getSize());
        front.setRotationAxis(Rotate.Z_AXIS);
        front.setRotate(-180);
        front.getTransforms().add(new Rotate(180,front.getFitHeight() / 2, 0,0, Rotate.X_AXIS));
        front.setTranslateY(front.getTranslateY() - getSize());
                
        top.setTranslateX(-0.5 * getSize());
        top.setTranslateY(-1 * getSize());
        top.setRotationAxis(Rotate.X_AXIS);
        top.setRotate(-90);
                
        bottom.setTranslateX(-0.5 * getSize());
        bottom.setTranslateY(0);
        bottom.setRotationAxis(Rotate.X_AXIS);
        bottom.setRotate(90);
                
        left.setTranslateX(-1 * getSize());
        left.setTranslateY(-0.5 * getSize());
        left.setRotationAxis(Rotate.Y_AXIS);
        left.setRotate(90);        
        
        right.setTranslateX(0);
        right.setTranslateY(-0.5 * getSize());
        right.setRotationAxis(Rotate.Y_AXIS);
        right.setRotate(-90);      
       
    }
    
    /**
     *  for single image creates viewports and sets all views(image) to singleImg
     *  for multiple... sets images per view.
     */
    private void validateImageType(){
        switch(imageType){
            case SINGLE:
                loadSingleImageViewports();
                break;
            case MULTIPLE:
                setMultipleImages();
                break;
        }
    }
    /**
     * this will layout the viewports to this style pattern
     *              ____
     *             |top |
     *         ____|____|____ ____
     *        |left|fwd |rght|back|
     *        |____|____|____|____|
     *             |bot |
     *             |____|
     * 
     */
    private void loadSingleImageViewports(){        
        layoutViews();
        double width = singleImg.getWidth(),
               height = singleImg.getHeight();
               
        //simple chack to see if cells will be square
      //  if(width / 4 != height / 3){
       //     throw new UnsupportedOperationException("Image does not comply with size constraints");            
       // }
        double cellSize = singleImg.getWidth() - singleImg.getHeight();               
        
        recalculateSize(cellSize);        
        
        double  
                topx = cellSize, topy = 0, 
                
                botx = cellSize, boty = cellSize * 2,
                
                leftx = 0, lefty = cellSize,
                
                rightx = cellSize * 2, righty = cellSize,
                
                fwdx = cellSize, fwdy = cellSize,
                
                backx = cellSize * 3, backy = cellSize;
        
        //add top padding x+, y+, width-, height
        top.setViewport(new Rectangle2D(topx , topy , cellSize, cellSize ));
        
        //add left padding x, y+, width, height-
        left.setViewport(new Rectangle2D(leftx , lefty , cellSize - 1, cellSize - 1));
        
        //add front padding x+, y+, width-, height
        back.setViewport(new Rectangle2D(fwdx , fwdy, cellSize , cellSize));
        
        //add right padding x, y+, width, height-
        right.setViewport(new Rectangle2D(rightx, righty , cellSize , cellSize ));
        
        //add back padding x, y+, width, height-
        front.setViewport(new Rectangle2D(backx + 1, backy - 1, cellSize - 1, cellSize - 1));
        
        //add bottom padding x+, y, width-, height-
        bottom.setViewport(new Rectangle2D(botx, boty, cellSize , cellSize));
        
        for(ImageView v : views){
            v.setImage(singleImg);
            //System.out.println(v.getId() + v.getViewport() + cellSize);
        }       
    }
    
    private void recalculateSize(double cell){        
        double factor = Math.floor(getSize() / cell);
        setSize(cell * factor);         
    }
    
    private void setMultipleImages() {        
        layoutViews();
        
        back.setImage(frontImg);
        front.setImage(backImg);
        top.setImage(topImg);
        bottom.setImage(bottomImg);
        left.setImage(leftImg);
        right.setImage(rightImg);
    }
    
    private void startTimer(){
      //  timer = new AnimationTimer() {
        //    @Override
         //   public void handle(long now) {
           //     Transform ct = (camera != null) ? camera.getLocalToSceneTransform() : null;
           //     if(ct != null){
                  //  affine.setTx(ct.getTx());
                  //  affine.setTy(ct.getTy());
                   // affine.setTz(ct.getTz());
              //  }
           // }
       // };
     //   timer.start();
    }
    
    /*
        Properties
    */
    private final DoubleProperty size = new SimpleDoubleProperty(){
        @Override
        protected void invalidated() {  
            switch(imageType){
            case SINGLE:
                layoutViews();
                break;
            case MULTIPLE:
                break;
            }
            
        }        
    };

    public final double getSize() {
        return size.get();
    }

    public final void setSize(double value) {
        size.set(value);
    }

    public DoubleProperty sizeProperty() {
        return size;
    }
    public void skybox2(){
        
    }
    public void WideSky(Os os, String pic){
    ImageSpawner is=new ImageSpawner();
    is.create(pic);
    
    is.getGroup().setScaleX(99999999);
     is.getGroup().setScaleY(99999999);
    is.getGroup().setTranslateZ(9999999);
       
    os.injectIntoWorld(is.getGroup());
     os.insertIntoGameObjectMatrix(is);
  
      ImageSpawner is1=new ImageSpawner();
    is1.create(pic);
    
    is1.getGroup().setScaleX(99999999);
     is1.getGroup().setScaleY(99999999);
    is1.getGroup().setTranslateZ(-9999999);//cuntertois
  
    os.injectIntoWorld(is1.getGroup());
     os.insertIntoGameObjectMatrix(is1);
    
   
    
}
    public   SkyBox(){
        
    }
    public void SphereSky(Os os){
        
     
      buffer=new Sphere();  
         redMaterial.setDiffuseColor(Color.YELLOW);
   redMaterial.setSpecularColor(Color.YELLOW); 
   
    buffer.setMaterial(sunMaterial);    
// buffer.setOpacity(5);
    buffer.setTranslateX(0);
    buffer.setTranslateY(0);
    buffer.setTranslateZ(0);
  try{
   
             
     
             sunTexture =new URL(this.getClass().getResource("explosion.png").toString());  
            suntextureImage = new Image(sunTexture.toString());
            sunMaterial.setDiffuseMap(suntextureImage);
    
  
           
      
     
         
            moonTexture =new URL(this.getClass().getResource("ParticleCloudBlack.png").toString()); 
          moontextureImage = new Image(moonTexture.toString());
             moonMaterial.setDiffuseMap(moontextureImage);
    
   
        }   
        
        
       
       catch(Exception e){
           
       }
     redMaterial.setDiffuseColor(Color.BLACK);
   redMaterial.setSpecularColor(Color.RED);
 
    //================================
    buffer.setScaleX(10);//enterpriseD.03
  buffer.setScaleY(10);//enterpriseD.03
   buffer.setScaleZ(10);//enterpriseD.03
  // buffer.setMaterial(redMaterial);
;
    buffer.setRadius(2500);
  XGroup c=new XGroup ();
  c.getChildren().add(buffer);
           os.injectIntoWorld(c);
     os.insertIntoGameObjectMatrix(this);
    }
}