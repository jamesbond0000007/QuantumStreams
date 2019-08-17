package boot.Code.Java.Objects;
import boot.Code.Java.Animation.AnimationSystem;
import boot.Code.Java.Support.XGroup;
import boot.Interface.Playable;
import boot.Os;
import javafx.animation.*;
import javafx.scene.image.Image;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Sphere;
import javafx.util.Duration;

import java.net.URL;

public class Smoke extends Prototype implements Playable {
XGroup gameObjectXform=new XGroup();

    double limitN=-900000;
    double limitP=900000;




    int hit=0;
    int id=0;

    AnimationSystem am;
    {
        am=new AnimationSystem();
    }
    public AnimationSystem getEngine(){
        return am;
    }

    public Smoke(double x,double y,double z){
        {
            try {


                sunTexture = new URL(this.getClass().getResource("ObjectMedia/sm2.png").toString());
                suntextureImage = new Image(sunTexture.toString());
                sunMaterial.setDiffuseMap(suntextureImage);


                buffer2.setMaterial(sunMaterial);
                buffer2.setRadius(500);
                buffer.setMaterial(sunMaterial);
            } catch (Exception e) {

            }
        }

        //--------------------

        //   buffer.setMaterial(redMaterial);
        gameObjectXform.getChildren().add(buffer);
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
    public void resetHit() {

    }
    public void setSmokeSize(int size){
        buffer.setRadius(size);

    }
    public XGroup getGroup(){
        return gameObjectXform;
    }
    public boolean setID(int i){
        id=i;
        return true;
    }
    public int getID(){
        return id;
    }
    @Override
    public void run() {

    }

    public boolean addTransition(ParallelTransition p) {
        parallelTransition.getChildren().add(p);
        return true;
    }

    public ParallelTransition setDefaultParralelTransition(Os os) {
        setState("parallelTransition");

        parallelTransition = ParallelTransitionBuilder.create()
                .node(gameObjectXGroup)
                .children(
                        RotateTransitionBuilder.create()
                                .duration(Duration.seconds(13))
                                .fromAngle(randomDouble(-360, 7200))
                                .toAngle(randomDouble(-360, 7200))
                                .cycleCount(4)
                                .autoReverse(true)
                                .build(),
                        TranslateTransitionBuilder.create()
                                .duration(Duration.seconds(12))
                                .fromX(gameObjectXGroup.getTranslateX())
                                .toX(randomDouble(-22000, 22000))
                                .fromZ(gameObjectXGroup.getTranslateX())
                                .toZ(randomDouble(-99999999, 99999999))
                                .cycleCount(4)
                                .autoReverse(true)
                                .build(),
                        TranslateTransitionBuilder.create()
                                .duration(Duration.seconds(12))
                                .fromY(randomDouble(-9200000, 9200000))
                                .toY(randomDouble(-9200, 9200))
                                .cycleCount(2)
                                .autoReverse(true)
                                .build()


                )
                .cycleCount(12)
                .autoReverse(true)
                .build();

        return parallelTransition;

    }

    public boolean setTransition(ParallelTransition p) {
        parallelTransition = p;
        p.setNode(this.getGroup());
        return true;
    }
    public XGroup turn3Player(XGroup xform,XGroup target){
        double endTime = 3000.0;
        double w=3000;
        double z=3000;
        Timeline animation = new Timeline();
        animation.getKeyFrames().addAll
                (new KeyFrame(Duration.millis(z),
                                new KeyValue(xform.translateXProperty(),target.getTranslateX())),
                        new KeyFrame(new Duration(endTime),
                                new KeyValue(xform.translateYProperty(),target.getTranslateY())),
                        new KeyFrame(Duration.millis(z),
                                new KeyValue(xform.translateZProperty(),target.getTranslateZ()-3000)));


        animation.cycleCountProperty().setValue(1);
        animation.setAutoReverse(false);
        animation.play();

        return xform;
    }


    public XGroup turn3( XGroup xform,double x){
        double endTimex = 40000;
        double endTimey = 40000.0;
        double z=40000;
        Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
                (new KeyFrame(Duration.millis(endTimex),
                                new KeyValue(xform.translateXProperty(),xform.getTranslateX())),
                        new KeyFrame(new Duration(endTimey),
                                new KeyValue(xform.translateYProperty(),xform.getTranslateY())),
                        new KeyFrame(Duration.millis(z),
                                new KeyValue(xform.translateZProperty(),-99999999.0)));


        animation.cycleCountProperty().setValue(1);
        animation.setAutoReverse(false);
        animation.play();

        return xform;
    }
    public XGroup turn3Negative(Os os, XGroup xform, double x, double y){
        double endTimex = 6000;
        double endTimey = 6000.0;
        double z=6000;
        Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
                (new KeyFrame(Duration.millis(endTimex),
                                new KeyValue(xform.translateXProperty(),x+limitP)),
                        new KeyFrame(new Duration(endTimey),
                                new KeyValue(xform.translateYProperty(),y+limitP)),
                        new KeyFrame(Duration.millis(z),
                                new KeyValue(xform.translateZProperty(),-limitP)));


        animation.cycleCountProperty().setValue(1);
        animation.setAutoReverse(false);
        animation.play();

        return xform;
    }
    public XGroup turn3(Os os, XGroup xform, double x, double y){
        double endTimex = 6000;
        double endTimey = 6000.0;
        double z=6000;
        Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
                (new KeyFrame(Duration.millis(endTimex),
                                new KeyValue(xform.translateXProperty(),x)),
                        new KeyFrame(new Duration(endTimey),
                                new KeyValue(xform.translateYProperty(),y)),
                        new KeyFrame(Duration.millis(z),
                                new KeyValue(xform.translateZProperty(),limitP)));


        animation.cycleCountProperty().setValue(1);
        animation.setAutoReverse(false);
        animation.play();

        return xform;
    }
    public XGroup turn32(XGroup xform,double x,double y){
        double endTimex = 1700.0;
        double endTimey = 1700.0;
        double z=1700;
        Timeline     animation = new Timeline();
        animation.getKeyFrames().addAll
                (new KeyFrame(Duration.millis(endTimex),
                                new KeyValue(xform.translateXProperty(),x)),
                        new KeyFrame(new Duration(endTimey),
                                new KeyValue(xform.translateYProperty(),randomDouble(2000,limitP))),
                        new KeyFrame(Duration.millis(z),
                                new KeyValue(xform.translateZProperty(),-limitP)));


        animation.cycleCountProperty().setValue(1);
        animation.setAutoReverse(false);
        animation.play();

        return xform;
    }
    public void loadSheild(Os os) {
        Sphere s = new Sphere();
        PhongMaterial mat = new PhongMaterial();
        //mat.setDiffuseMap(new Image("http://www.zfight.com/misc/images/textures/envmaps/interstellar_large.jpg"));
        s.setMaterial(mat);
        s.setDrawMode(DrawMode.FILL);
        s.setRadius(25000);
        s.setTranslateX(this.getGroup().getTranslateX());
        s.setTranslateX(this.getGroup().getTranslateY());
        s.setTranslateZ(this.getGroup().getTranslateZ() + 4500);
        s.setOpacity(.5);
        gameObjectXGroup.getChildren().add(s);
    }
}