package boot.Code.Java.Support;
import boot.Code.Java.Animation.AnimationSystem;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.transform.Rotate;
import javafx.animation.Timeline;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.animation.SequentialTransition;
public class Attack {
    AnimationSystem am=new AnimationSystem();
    boolean enable=true;
    public void attack0(XGroup gameObjectXGroup){
        SequentialTransition sequence0 = new SequentialTransition();
        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        TranslateTransition transition4=new TranslateTransition();
        transition4.fromZProperty().setValue(gameObjectXGroup.getTranslateZ());
        transition4.toZProperty().setValue(randomDouble(-99999999,99999999));
        transition4.durationProperty().setValue(Duration.seconds(12));
        transition4.setNode(gameObjectXGroup);
        transition4.cycleCountProperty().setValue(10);
        transition4.setAutoReverse(enable);
      transition4.play();

//=========================================================================================
        TranslateTransition     transition5 = new TranslateTransition();
        transition5.fromXProperty().setValue(gameObjectXGroup.getTranslateX());
        transition5.toXProperty().setValue(randomDouble(-99999999,99999999));
        transition5.durationProperty().setValue(Duration.seconds(12));
        transition5.setNode(gameObjectXGroup);
        transition5.cycleCountProperty().setValue(10);
        transition5.setAutoReverse(enable);
      transition5.play();
//======================================================================================
        //=======================================================================================
        TranslateTransition     transition6 = new TranslateTransition();
        transition6.fromYProperty().setValue(gameObjectXGroup.getTranslateY());
        transition6.toYProperty().setValue(randomDouble(-99999999,99999999));
        transition6.durationProperty().setValue(Duration.seconds(12));
        transition6.setNode(gameObjectXGroup);
        transition6.cycleCountProperty().setValue(10);
        transition6.setAutoReverse(enable);
       transition6.play();
//======================================================================================

        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        TranslateTransition transition=new TranslateTransition();
        transition.fromZProperty().setValue(gameObjectXGroup.getTranslateZ());
        transition.fromXProperty().setValue(randomDouble(-99999999,99999999));
        transition.durationProperty().setValue(Duration.seconds(12));
        transition.setNode(gameObjectXGroup);
        transition.cycleCountProperty().setValue(10);
        transition.setAutoReverse(enable);
    //  transition.play();
        //=========================================================================================
        TranslateTransition     transition2 = new TranslateTransition();
        transition2.fromXProperty().setValue(gameObjectXGroup.getTranslateX());
        transition2.toXProperty().setValue(randomDouble(-99999999,99999999));
        transition2.durationProperty().setValue(Duration.seconds(12));
        transition2.setNode(gameObjectXGroup);
        transition2.cycleCountProperty().setValue(10);
        transition2.setAutoReverse(enable);
     transition2.play();
//=========================================================================================
        //=========================================================================================
        TranslateTransition     transition3 = new TranslateTransition();
        transition3.fromYProperty().setValue(gameObjectXGroup.getTranslateY());
        transition3.toYProperty().setValue(randomDouble(-99999999,99999999));
        transition3.durationProperty().setValue(Duration.seconds(12));
        transition3.setNode(gameObjectXGroup);
        transition3.cycleCountProperty().setValue(1);
        transition3.setAutoReverse(enable);
        transition3.play();
//=========================================================================================
        RotateTransition rotatex= new RotateTransition();
        rotatex.setAxis(Rotate.Y_AXIS);
        rotatex.durationProperty().setValue(Duration.seconds(12));
        rotatex.setNode(gameObjectXGroup);
        rotatex.setFromAngle(gameObjectXGroup.ry.getAngle());
        rotatex.setToAngle(gameObjectXGroup.ry.getAngle()+360);
        rotatex.setAutoReverse(enable);
        rotatex.setCycleCount(10);
      rotatex.play();
        //========================================================================================
        ParallelTransition parallelTransition  =new ParallelTransition();
        parallelTransition.getChildren().add(transition);
        sequence0.setDelay(Duration.millis(80));
        sequence0.getChildren().add(transition2);
        sequence0.getChildren().add(transition);
        sequence0.getChildren().add(transition3);
        sequence0.getChildren().add(transition4);
        sequence0.getChildren().add(transition5);
        sequence0.getChildren().add(transition6 );
        sequence0.getChildren().add(rotatex);
        sequence0.setOnFinished(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
               attack1(gameObjectXGroup);
                am.rotateZ(gameObjectXGroup,gameObjectXGroup.getTranslateZ(),gameObjectXGroup.getTranslateZ()-400000,4500,1,true).play();

            }
        });

   sequence0.playFromStart();
        sequence0.play();

    }
    public void attack1(XGroup gameObjectXGroup){
        SequentialTransition sequence0 = new SequentialTransition();

        RotateTransition rotatex= new RotateTransition();
        rotatex.setAxis(Rotate.Y_AXIS);
        rotatex.durationProperty().setValue(Duration.seconds(12));
        rotatex.setNode(gameObjectXGroup);
        rotatex.setFromAngle(gameObjectXGroup.ry.getAngle());
        rotatex.setToAngle(gameObjectXGroup.ry.getAngle()+360);
        rotatex.setAutoReverse(enable);
        rotatex.setCycleCount(3);
       // rotatex.play();
        //========================================================================================

        ScaleTransition scale= new ScaleTransition();
     //  scale.setFromX(2);
     //   scale.setToX(8);
        scale.setFromY(2);
        scale.setToY(8);
    scale.setFromZ(2);
        scale.setToZ(8);;

        scale.durationProperty().setValue(Duration.seconds(12));
        scale.setNode(gameObjectXGroup);

        scale.setAutoReverse(enable);
        scale.setCycleCount(3);
      //  scale.play();
        //========================================================================================
        ParallelTransition parallelTransition  =new ParallelTransition();
        parallelTransition.getChildren().add(scale);
        sequence0.getChildren().add(scale);
        sequence0.getChildren().add(rotatex);
        //sequence0.getChildren().add(transition3);
      //  sequence0.getChildren().add(transition4);
       // sequence0.getChildren().add(transition5);
      //  sequence0.getChildren().add(transition6 );
     //   sequence0.getChildren().add(rotatex);
      //  parallelTransition.getChildren().add(sequence0);
        sequence0.setOnFinished(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {

                am.rotateX(gameObjectXGroup,gameObjectXGroup.getTranslateZ(),gameObjectXGroup.getTranslateZ()-400000,4500,1,true).play();
            }
        });

        sequence0.play();

    }
    public void attack3(XGroup gameObjectXGroup){
        SequentialTransition sequence0 = new SequentialTransition();
        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        TranslateTransition transition4=new TranslateTransition();
        transition4.fromZProperty().setValue(gameObjectXGroup.getTranslateZ());
        transition4.fromXProperty().setValue(randomDouble(-99999999,99999999));
        transition4.durationProperty().setValue(Duration.seconds(12));
        transition4.setNode(gameObjectXGroup);
        transition4.cycleCountProperty().setValue(12);
        transition4.setAutoReverse(enable);
        transition4.play();

//=========================================================================================
        TranslateTransition     transition5 = new TranslateTransition();
        transition5.fromXProperty().setValue(gameObjectXGroup.getTranslateX());
        transition5.toXProperty().setValue(randomDouble(-99999999,99999999));
        transition5.durationProperty().setValue(Duration.seconds(12));
        transition5.setNode(gameObjectXGroup);
        transition5.cycleCountProperty().setValue(12);
        transition5.setAutoReverse(enable);
      //  transition5.play();
//======================================================================================
        //=======================================================================================
        TranslateTransition     transition6 = new TranslateTransition();
        transition6.fromYProperty().setValue(gameObjectXGroup.getTranslateY());
        transition6.toYProperty().setValue(randomDouble(99999999,-99999999));
        transition6.durationProperty().setValue(Duration.seconds(12));
        transition6.setNode(gameObjectXGroup);
        transition6.cycleCountProperty().setValue(12);
        transition6.setAutoReverse(enable);
      //  transition6.play();
//======================================================================================

        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        TranslateTransition transition=new TranslateTransition();
        transition.fromZProperty().setValue(gameObjectXGroup.getTranslateZ());
        transition.fromXProperty().setValue(randomDouble(-99999999,99999999));
        transition.durationProperty().setValue(Duration.seconds(12));
        transition.setNode(gameObjectXGroup);
        transition.cycleCountProperty().setValue(12);
        transition.setAutoReverse(enable);
       // transition.play();
        //=========================================================================================
        TranslateTransition     transition2 = new TranslateTransition();
        transition2.fromXProperty().setValue(gameObjectXGroup.getTranslateX());
        transition2.toXProperty().setValue(randomDouble(-99999999,99999999));
        transition2.durationProperty().setValue(Duration.seconds(12));
        transition2.setNode(gameObjectXGroup);
        transition2.cycleCountProperty().setValue(12);
        transition2.setAutoReverse(enable);
      //  transition2.play();
//=========================================================================================
        //=========================================================================================
        TranslateTransition     transition3 = new TranslateTransition();
        transition3.fromYProperty().setValue(gameObjectXGroup.getTranslateY());
        transition3.toYProperty().setValue(randomDouble(-99999999,99999999));
        transition3.durationProperty().setValue(Duration.seconds(12));
        transition3.setNode(gameObjectXGroup);
        transition3.cycleCountProperty().setValue(12);
        transition3.setAutoReverse(enable);
       // transition3.play();
//=========================================================================================
        RotateTransition rotatex= new RotateTransition();
        rotatex.setAxis(Rotate.Y_AXIS);
        rotatex.durationProperty().setValue(Duration.seconds(12));
        rotatex.setNode(gameObjectXGroup);
        rotatex.setFromAngle(gameObjectXGroup.ry.getAngle());
        rotatex.setToAngle(gameObjectXGroup.ry.getAngle()+360);
        rotatex.setAutoReverse(enable);
        rotatex.setCycleCount(3);
      //  rotatex.play();
        //========================================================================================
        ParallelTransition parallelTransition  =new ParallelTransition();
        parallelTransition.getChildren().add(transition);
        sequence0.getChildren().add(transition2);
        sequence0.getChildren().add(transition);
        sequence0.getChildren().add(transition3);
        sequence0.getChildren().add(transition4);
        sequence0.getChildren().add(transition5);
        sequence0.getChildren().add(transition6 );
        sequence0.getChildren().add(rotatex);
        sequence0.setOnFinished(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                attack4(gameObjectXGroup);

            }
        });

        sequence0.play();
    }

    public void attack2(XGroup gameObjectXGroup){
        SequentialTransition sequence0 = new SequentialTransition();
        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        TranslateTransition transition4=new TranslateTransition();
        transition4.fromZProperty().setValue(gameObjectXGroup.getTranslateZ());
        transition4.fromZProperty().setValue(randomDouble(-99999999,99999999));
        transition4.durationProperty().setValue(Duration.seconds(12));
        transition4.setNode(gameObjectXGroup);
        transition4.cycleCountProperty().setValue(12);
        transition4.setAutoReverse(enable);
        transition4.play();

//=========================================================================================
        TranslateTransition     transition5 = new TranslateTransition();
        transition5.fromXProperty().setValue(gameObjectXGroup.getTranslateX());
        transition5.toXProperty().setValue(randomDouble(-99999999,99999999));
        transition5.durationProperty().setValue(Duration.seconds(12));
        transition5.setNode(gameObjectXGroup);
        transition5.cycleCountProperty().setValue(12);
        transition5.setAutoReverse(enable);
        transition5.play();
//======================================================================================
        //=======================================================================================
        TranslateTransition     transition6 = new TranslateTransition();
        transition6.fromYProperty().setValue(gameObjectXGroup.getTranslateY());
        transition6.toYProperty().setValue(randomDouble(99999999,-99999999));
        transition6.durationProperty().setValue(Duration.seconds(12));
        transition6.setNode(gameObjectXGroup);
        transition6.cycleCountProperty().setValue(12);
        transition6.setAutoReverse(enable);
        transition6.play();
//======================================================================================

        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        TranslateTransition transition=new TranslateTransition();
        transition.fromZProperty().setValue(gameObjectXGroup.getTranslateZ());
        transition.fromXProperty().setValue(randomDouble(-99999999,99999999));
        transition.durationProperty().setValue(Duration.seconds(12));
        transition.setNode(gameObjectXGroup);
        transition.cycleCountProperty().setValue(12);
        transition.setAutoReverse(enable);
        transition.play();
        //=========================================================================================
        TranslateTransition     transition2 = new TranslateTransition();
        transition2.fromXProperty().setValue(gameObjectXGroup.getTranslateX());
        transition2.toXProperty().setValue(randomDouble(-99999999,99999999));
        transition2.durationProperty().setValue(Duration.seconds(12));
        transition2.setNode(gameObjectXGroup);
        transition2.cycleCountProperty().setValue(12);
        transition2.setAutoReverse(enable);
        transition2.play();
//=========================================================================================
        //=========================================================================================
        TranslateTransition     transition3 = new TranslateTransition();
        transition3.fromYProperty().setValue(gameObjectXGroup.getTranslateY());
        transition3.toYProperty().setValue(randomDouble(-99999999,99999999));
        transition3.durationProperty().setValue(Duration.seconds(12));
        transition3.setNode(gameObjectXGroup);
        transition3.cycleCountProperty().setValue(12);
        transition3.setAutoReverse(enable);
        transition3.play();
//=========================================================================================
        RotateTransition rotatex= new RotateTransition();
        rotatex.setAxis(Rotate.Y_AXIS);
        rotatex.durationProperty().setValue(Duration.seconds(12));
        rotatex.setNode(gameObjectXGroup);
        rotatex.setFromAngle(gameObjectXGroup.ry.getAngle());
        rotatex.setToAngle(gameObjectXGroup.ry.getAngle()+360);
        rotatex.setAutoReverse(enable);
        rotatex.setCycleCount(3);
        rotatex.play();
        //========================================================================================
        ParallelTransition parallelTransition  =new ParallelTransition();
        parallelTransition.getChildren().add(transition);
        am.rotateZ(gameObjectXGroup,0,360,1500,1,true).play();
        sequence0.getChildren().add(transition2);
        sequence0.getChildren().add(transition);
        sequence0.getChildren().add(transition3);
        sequence0.getChildren().add(transition4);
        sequence0.getChildren().add(transition5);
        sequence0.getChildren().add(transition6 );
        sequence0.getChildren().add(rotatex);
        sequence0.getChildren().add( am.rotateZ(gameObjectXGroup,0,360,1500,1,true));
        sequence0.setOnFinished(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                attack3(gameObjectXGroup);

            }
        });

        sequence0.play();

    }
    public void attack10(XGroup gameObjectXGroup){
        SequentialTransition sequence0 = new SequentialTransition();
        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        TranslateTransition transition4=new TranslateTransition();
        transition4.fromZProperty().setValue(gameObjectXGroup.getTranslateZ());
        transition4.fromZProperty().setValue(randomDouble(-99999999,99999999));
        transition4.durationProperty().setValue(Duration.seconds(12));
        transition4.setNode(gameObjectXGroup);
        transition4.cycleCountProperty().setValue(12);
        transition4.setAutoReverse(enable);
        transition4.play();

//=========================================================================================
        TranslateTransition     transition5 = new TranslateTransition();
        transition5.fromXProperty().setValue(gameObjectXGroup.getTranslateX());
        transition5.toXProperty().setValue(randomDouble(-99999999,99999999));
        transition5.durationProperty().setValue(Duration.seconds(12));
        transition5.setNode(gameObjectXGroup);
        transition5.cycleCountProperty().setValue(12);
        transition5.setAutoReverse(enable);
        transition5.play();
//======================================================================================
        //=======================================================================================
        TranslateTransition     transition6 = new TranslateTransition();
        transition6.fromYProperty().setValue(gameObjectXGroup.getTranslateY());
        transition6.toYProperty().setValue(randomDouble(99999999,-99999999));
        transition6.durationProperty().setValue(Duration.seconds(12));
        transition6.setNode(gameObjectXGroup);
        transition6.cycleCountProperty().setValue(12);
        transition6.setAutoReverse(enable);
        transition6.play();
//======================================================================================

        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        TranslateTransition transition=new TranslateTransition();
        transition.fromZProperty().setValue(gameObjectXGroup.getTranslateZ());
        transition.fromXProperty().setValue(randomDouble(-99999999,99999999));
        transition.durationProperty().setValue(Duration.seconds(12));
        transition.setNode(gameObjectXGroup);
        transition.cycleCountProperty().setValue(12);
        transition.setAutoReverse(enable);
        transition.play();
        //=========================================================================================
        TranslateTransition     transition2 = new TranslateTransition();
        transition2.fromXProperty().setValue(gameObjectXGroup.getTranslateX());
        transition2.toXProperty().setValue(randomDouble(-99999999,99999999));
        transition2.durationProperty().setValue(Duration.seconds(12));
        transition2.setNode(gameObjectXGroup);
        transition2.cycleCountProperty().setValue(12);
        transition2.setAutoReverse(enable);
        transition2.play();
//=========================================================================================
        //=========================================================================================
        TranslateTransition     transition3 = new TranslateTransition();
        transition3.fromYProperty().setValue(gameObjectXGroup.getTranslateY());
        transition3.toYProperty().setValue(randomDouble(-99999999,99999999));
        transition3.durationProperty().setValue(Duration.seconds(12));
        transition3.setNode(gameObjectXGroup);
        transition3.cycleCountProperty().setValue(12);
        transition3.setAutoReverse(enable);
        transition3.play();
//=========================================================================================
        RotateTransition rotatex= new RotateTransition();
        rotatex.setAxis(Rotate.Y_AXIS);
        rotatex.durationProperty().setValue(Duration.seconds(12));
        rotatex.setNode(gameObjectXGroup);
        rotatex.setFromAngle(gameObjectXGroup.ry.getAngle());
        rotatex.setToAngle(gameObjectXGroup.ry.getAngle()+360);
        rotatex.setAutoReverse(enable);
        rotatex.setCycleCount(3);
        rotatex.play();
        //========================================================================================
        ParallelTransition parallelTransition  =new ParallelTransition();
        parallelTransition.getChildren().add(transition);
        am.rotateZ(gameObjectXGroup,0,360,1500,1,true).play();
        sequence0.getChildren().add(transition2);
        sequence0.getChildren().add(transition);
        sequence0.getChildren().add(transition3);
        sequence0.getChildren().add(transition4);
        sequence0.getChildren().add(transition5);
        sequence0.getChildren().add(transition6 );
        sequence0.getChildren().add(rotatex);
        sequence0.getChildren().add( am.rotateZ(gameObjectXGroup,0,360,1500,1,true));
        sequence0.setOnFinished(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                attack3(gameObjectXGroup);

            }
        });

        sequence0.play();

    }
    public void attack9(XGroup gameObjectXGroup){
        SequentialTransition sequence0 = new SequentialTransition();
        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        TranslateTransition transition4=new TranslateTransition();
        transition4.fromZProperty().setValue(gameObjectXGroup.getTranslateZ());
        transition4.fromZProperty().setValue(randomDouble(-99999999,99999999));
        transition4.durationProperty().setValue(Duration.seconds(12));
        transition4.setNode(gameObjectXGroup);
        transition4.cycleCountProperty().setValue(12);
        transition4.setAutoReverse(enable);
        transition4.play();

//=========================================================================================
        TranslateTransition     transition5 = new TranslateTransition();
        transition5.fromXProperty().setValue(gameObjectXGroup.getTranslateX());
        transition5.toXProperty().setValue(randomDouble(-99999999,99999999));
        transition5.durationProperty().setValue(Duration.seconds(12));
        transition5.setNode(gameObjectXGroup);
        transition5.cycleCountProperty().setValue(12);
        transition5.setAutoReverse(enable);
        transition5.play();
//======================================================================================
        //=======================================================================================
        TranslateTransition     transition6 = new TranslateTransition();
        transition6.fromYProperty().setValue(gameObjectXGroup.getTranslateY());
        transition6.toYProperty().setValue(randomDouble(99999999,-99999999));
        transition6.durationProperty().setValue(Duration.seconds(12));
        transition6.setNode(gameObjectXGroup);
        transition6.cycleCountProperty().setValue(12);
        transition6.setAutoReverse(enable);
        transition6.play();
//======================================================================================

        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        TranslateTransition transition=new TranslateTransition();
        transition.fromZProperty().setValue(gameObjectXGroup.getTranslateZ());
        transition.fromXProperty().setValue(randomDouble(-99999999,99999999));
        transition.durationProperty().setValue(Duration.seconds(12));
        transition.setNode(gameObjectXGroup);
        transition.cycleCountProperty().setValue(12);
        transition.setAutoReverse(enable);
        transition.play();
        //=========================================================================================
        TranslateTransition     transition2 = new TranslateTransition();
        transition2.fromXProperty().setValue(gameObjectXGroup.getTranslateX());
        transition2.toXProperty().setValue(randomDouble(-99999999,99999999));
        transition2.durationProperty().setValue(Duration.seconds(12));
        transition2.setNode(gameObjectXGroup);
        transition2.cycleCountProperty().setValue(12);
        transition2.setAutoReverse(enable);
        transition2.play();
//=========================================================================================
        //=========================================================================================
        TranslateTransition     transition3 = new TranslateTransition();
        transition3.fromYProperty().setValue(gameObjectXGroup.getTranslateY());
        transition3.toYProperty().setValue(randomDouble(-99999999,99999999));
        transition3.durationProperty().setValue(Duration.seconds(12));
        transition3.setNode(gameObjectXGroup);
        transition3.cycleCountProperty().setValue(12);
        transition3.setAutoReverse(enable);
        transition3.play();
//=========================================================================================
        RotateTransition rotatex= new RotateTransition();
        rotatex.setAxis(Rotate.Y_AXIS);
        rotatex.durationProperty().setValue(Duration.seconds(12));
        rotatex.setNode(gameObjectXGroup);
        rotatex.setFromAngle(gameObjectXGroup.ry.getAngle());
        rotatex.setToAngle(gameObjectXGroup.ry.getAngle()+360);
        rotatex.setAutoReverse(enable);
        rotatex.setCycleCount(3);
        rotatex.play();
        //========================================================================================
        ParallelTransition parallelTransition  =new ParallelTransition();
        parallelTransition.getChildren().add(transition);
        am.rotateZ(gameObjectXGroup,0,360,1500,1,true).play();
        sequence0.getChildren().add(transition2);
        sequence0.getChildren().add(transition);
        sequence0.getChildren().add(transition3);
        sequence0.getChildren().add(transition4);
        sequence0.getChildren().add(transition5);
        sequence0.getChildren().add(transition6 );
        sequence0.getChildren().add(rotatex);
        sequence0.getChildren().add( am.rotateZ(gameObjectXGroup,0,360,1500,1,true));
        sequence0.setOnFinished(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                attack3(gameObjectXGroup);

            }
        });

        sequence0.play();

    }

    public void attack8(XGroup gameObjectXGroup){
        SequentialTransition sequence0 = new SequentialTransition();
        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        TranslateTransition transition4=new TranslateTransition();
        transition4.fromZProperty().setValue(gameObjectXGroup.getTranslateZ());
        transition4.fromZProperty().setValue(randomDouble(-99999999,99999999));
        transition4.durationProperty().setValue(Duration.seconds(12));
        transition4.setNode(gameObjectXGroup);
        transition4.cycleCountProperty().setValue(12);
        transition4.setAutoReverse(enable);
        transition4.play();

//=========================================================================================
        TranslateTransition     transition5 = new TranslateTransition();
        transition5.fromXProperty().setValue(gameObjectXGroup.getTranslateX());
        transition5.toXProperty().setValue(randomDouble(-99999999,99999999));
        transition5.durationProperty().setValue(Duration.seconds(12));
        transition5.setNode(gameObjectXGroup);
        transition5.cycleCountProperty().setValue(12);
        transition5.setAutoReverse(enable);
        transition5.play();
//======================================================================================
        //=======================================================================================
        TranslateTransition     transition6 = new TranslateTransition();
        transition6.fromYProperty().setValue(gameObjectXGroup.getTranslateY());
        transition6.toYProperty().setValue(randomDouble(99999999,-99999999));
        transition6.durationProperty().setValue(Duration.seconds(12));
        transition6.setNode(gameObjectXGroup);
        transition6.cycleCountProperty().setValue(12);
        transition6.setAutoReverse(enable);
        transition6.play();
//======================================================================================

        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        TranslateTransition transition=new TranslateTransition();
        transition.fromZProperty().setValue(gameObjectXGroup.getTranslateZ());
        transition.fromXProperty().setValue(randomDouble(-99999999,99999999));
        transition.durationProperty().setValue(Duration.seconds(12));
        transition.setNode(gameObjectXGroup);
        transition.cycleCountProperty().setValue(12);
        transition.setAutoReverse(enable);
        transition.play();
        //=========================================================================================
        TranslateTransition     transition2 = new TranslateTransition();
        transition2.fromXProperty().setValue(gameObjectXGroup.getTranslateX());
        transition2.toXProperty().setValue(randomDouble(-99999999,99999999));
        transition2.durationProperty().setValue(Duration.seconds(12));
        transition2.setNode(gameObjectXGroup);
        transition2.cycleCountProperty().setValue(12);
        transition2.setAutoReverse(enable);
        transition2.play();
//=========================================================================================
        //=========================================================================================
        TranslateTransition     transition3 = new TranslateTransition();
        transition3.fromYProperty().setValue(gameObjectXGroup.getTranslateY());
        transition3.toYProperty().setValue(randomDouble(-99999999,99999999));
        transition3.durationProperty().setValue(Duration.seconds(12));
        transition3.setNode(gameObjectXGroup);
        transition3.cycleCountProperty().setValue(12);
        transition3.setAutoReverse(enable);
        transition3.play();
//=========================================================================================
        RotateTransition rotatex= new RotateTransition();
        rotatex.setAxis(Rotate.Y_AXIS);
        rotatex.durationProperty().setValue(Duration.seconds(12));
        rotatex.setNode(gameObjectXGroup);
        rotatex.setFromAngle(gameObjectXGroup.ry.getAngle());
        rotatex.setToAngle(gameObjectXGroup.ry.getAngle()+360);
        rotatex.setAutoReverse(enable);
        rotatex.setCycleCount(3);
        rotatex.play();
        //========================================================================================
        ParallelTransition parallelTransition  =new ParallelTransition();
        parallelTransition.getChildren().add(transition);
        am.rotateZ(gameObjectXGroup,0,360,1500,1,true).play();
        sequence0.getChildren().add(transition2);
        sequence0.getChildren().add(transition);
        sequence0.getChildren().add(transition3);
        sequence0.getChildren().add(transition4);
        sequence0.getChildren().add(transition5);
        sequence0.getChildren().add(transition6 );
        sequence0.getChildren().add(rotatex);
        sequence0.getChildren().add( am.rotateZ(gameObjectXGroup,0,360,1500,1,true));
        sequence0.setOnFinished(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                attack3(gameObjectXGroup);

            }
        });

        sequence0.play();

    }

    public void attack7(XGroup gameObjectXGroup){
        SequentialTransition sequence0 = new SequentialTransition();
        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        TranslateTransition transition4=new TranslateTransition();
        transition4.fromZProperty().setValue(gameObjectXGroup.getTranslateZ());
        transition4.fromZProperty().setValue(randomDouble(-99999999,99999999));
        transition4.durationProperty().setValue(Duration.seconds(12));
        transition4.setNode(gameObjectXGroup);
        transition4.cycleCountProperty().setValue(12);
        transition4.setAutoReverse(enable);
        transition4.play();

//=========================================================================================
        TranslateTransition     transition5 = new TranslateTransition();
        transition5.fromXProperty().setValue(gameObjectXGroup.getTranslateX());
        transition5.toXProperty().setValue(randomDouble(-99999999,99999999));
        transition5.durationProperty().setValue(Duration.seconds(12));
        transition5.setNode(gameObjectXGroup);
        transition5.cycleCountProperty().setValue(12);
        transition5.setAutoReverse(enable);
        transition5.play();
//======================================================================================
        //=======================================================================================
        TranslateTransition     transition6 = new TranslateTransition();
        transition6.fromYProperty().setValue(gameObjectXGroup.getTranslateY());
        transition6.toYProperty().setValue(randomDouble(99999999,-99999999));
        transition6.durationProperty().setValue(Duration.seconds(12));
        transition6.setNode(gameObjectXGroup);
        transition6.cycleCountProperty().setValue(12);
        transition6.setAutoReverse(enable);
        transition6.play();
//======================================================================================

        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        TranslateTransition transition=new TranslateTransition();
        transition.fromZProperty().setValue(gameObjectXGroup.getTranslateZ());
        transition.fromXProperty().setValue(randomDouble(-99999999,99999999));
        transition.durationProperty().setValue(Duration.seconds(12));
        transition.setNode(gameObjectXGroup);
        transition.cycleCountProperty().setValue(12);
        transition.setAutoReverse(enable);
        transition.play();
        //=========================================================================================
        TranslateTransition     transition2 = new TranslateTransition();
        transition2.fromXProperty().setValue(gameObjectXGroup.getTranslateX());
        transition2.toXProperty().setValue(randomDouble(-99999999,99999999));
        transition2.durationProperty().setValue(Duration.seconds(12));
        transition2.setNode(gameObjectXGroup);
        transition2.cycleCountProperty().setValue(12);
        transition2.setAutoReverse(enable);
        transition2.play();
//=========================================================================================
        //=========================================================================================
        TranslateTransition     transition3 = new TranslateTransition();
        transition3.fromYProperty().setValue(gameObjectXGroup.getTranslateY());
        transition3.toYProperty().setValue(randomDouble(-99999999,99999999));
        transition3.durationProperty().setValue(Duration.seconds(12));
        transition3.setNode(gameObjectXGroup);
        transition3.cycleCountProperty().setValue(12);
        transition3.setAutoReverse(enable);
        transition3.play();
//=========================================================================================
        RotateTransition rotatex= new RotateTransition();
        rotatex.setAxis(Rotate.Y_AXIS);
        rotatex.durationProperty().setValue(Duration.seconds(12));
        rotatex.setNode(gameObjectXGroup);
        rotatex.setFromAngle(gameObjectXGroup.ry.getAngle());
        rotatex.setToAngle(gameObjectXGroup.ry.getAngle()+360);
        rotatex.setAutoReverse(enable);
        rotatex.setCycleCount(3);
        rotatex.play();
        //========================================================================================
        ParallelTransition parallelTransition  =new ParallelTransition();
        parallelTransition.getChildren().add(transition);
        am.rotateZ(gameObjectXGroup,0,360,1500,1,true).play();
        sequence0.getChildren().add(transition2);
        sequence0.getChildren().add(transition);
        sequence0.getChildren().add(transition3);
        sequence0.getChildren().add(transition4);
        sequence0.getChildren().add(transition5);
        sequence0.getChildren().add(transition6 );
        sequence0.getChildren().add(rotatex);
        sequence0.getChildren().add( am.rotateZ(gameObjectXGroup,0,360,1500,1,true));
        sequence0.setOnFinished(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                attack3(gameObjectXGroup);

            }
        });

        sequence0.play();

    }


    public void attack6(XGroup gameObjectXGroup){
        SequentialTransition sequence0 = new SequentialTransition();
        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        TranslateTransition transition4=new TranslateTransition();
        transition4.fromZProperty().setValue(gameObjectXGroup.getTranslateZ());
        transition4.fromZProperty().setValue(randomDouble(-99999999,99999999));
        transition4.durationProperty().setValue(Duration.seconds(12));
        transition4.setNode(gameObjectXGroup);
        transition4.cycleCountProperty().setValue(12);
        transition4.setAutoReverse(enable);
        transition4.play();

//=========================================================================================
        TranslateTransition     transition5 = new TranslateTransition();
        transition5.fromXProperty().setValue(gameObjectXGroup.getTranslateX());
        transition5.toXProperty().setValue(randomDouble(-99999999,99999999));
        transition5.durationProperty().setValue(Duration.seconds(12));
        transition5.setNode(gameObjectXGroup);
        transition5.cycleCountProperty().setValue(12);
        transition5.setAutoReverse(enable);
        transition5.play();
//======================================================================================
        //=======================================================================================
        TranslateTransition     transition6 = new TranslateTransition();
        transition6.fromYProperty().setValue(gameObjectXGroup.getTranslateY());
        transition6.toYProperty().setValue(randomDouble(99999999,-99999999));
        transition6.durationProperty().setValue(Duration.seconds(12));
        transition6.setNode(gameObjectXGroup);
        transition6.cycleCountProperty().setValue(12);
        transition6.setAutoReverse(enable);
        transition6.play();
//======================================================================================

        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        TranslateTransition transition=new TranslateTransition();
        transition.fromZProperty().setValue(gameObjectXGroup.getTranslateZ());
        transition.fromXProperty().setValue(randomDouble(-99999999,99999999));
        transition.durationProperty().setValue(Duration.seconds(12));
        transition.setNode(gameObjectXGroup);
        transition.cycleCountProperty().setValue(12);
        transition.setAutoReverse(enable);
        transition.play();
        //=========================================================================================
        TranslateTransition     transition2 = new TranslateTransition();
        transition2.fromXProperty().setValue(gameObjectXGroup.getTranslateX());
        transition2.toXProperty().setValue(randomDouble(-99999999,99999999));
        transition2.durationProperty().setValue(Duration.seconds(12));
        transition2.setNode(gameObjectXGroup);
        transition2.cycleCountProperty().setValue(12);
        transition2.setAutoReverse(enable);
        transition2.play();
//=========================================================================================
        //=========================================================================================
        TranslateTransition     transition3 = new TranslateTransition();
        transition3.fromYProperty().setValue(gameObjectXGroup.getTranslateY());
        transition3.toYProperty().setValue(randomDouble(-99999999,99999999));
        transition3.durationProperty().setValue(Duration.seconds(12));
        transition3.setNode(gameObjectXGroup);
        transition3.cycleCountProperty().setValue(12);
        transition3.setAutoReverse(enable);
        transition3.play();
//=========================================================================================
        RotateTransition rotatex= new RotateTransition();
        rotatex.setAxis(Rotate.Y_AXIS);
        rotatex.durationProperty().setValue(Duration.seconds(12));
        rotatex.setNode(gameObjectXGroup);
        rotatex.setFromAngle(gameObjectXGroup.ry.getAngle());
        rotatex.setToAngle(gameObjectXGroup.ry.getAngle()+360);
        rotatex.setAutoReverse(enable);
        rotatex.setCycleCount(3);
        rotatex.play();
        //========================================================================================
        ParallelTransition parallelTransition  =new ParallelTransition();
        parallelTransition.getChildren().add(transition);
        am.rotateZ(gameObjectXGroup,0,360,1500,1,true).play();
        sequence0.getChildren().add(transition2);
        sequence0.getChildren().add(transition);
        sequence0.getChildren().add(transition3);
        sequence0.getChildren().add(transition4);
        sequence0.getChildren().add(transition5);
        sequence0.getChildren().add(transition6 );
        sequence0.getChildren().add(rotatex);
        sequence0.getChildren().add( am.rotateZ(gameObjectXGroup,0,360,1500,1,true));
        sequence0.setOnFinished(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                attack3(gameObjectXGroup);

            }
        });

        sequence0.play();

    }



    public void attack4(XGroup gameObjectXGroup){




        SequentialTransition sequence0 = new SequentialTransition();
        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        TranslateTransition transition4=new TranslateTransition();
        transition4.fromZProperty().setValue(gameObjectXGroup.getTranslateZ());
        transition4.fromXProperty().setValue(randomDouble(-99999999,99999999));
        transition4.durationProperty().setValue(Duration.seconds(12));
        transition4.setNode(gameObjectXGroup);
        transition4.cycleCountProperty().setValue(12);
        transition4.setAutoReverse(enable);
        transition4.play();

//=========================================================================================
        TranslateTransition     transition5 = new TranslateTransition();
        transition5.fromXProperty().setValue(gameObjectXGroup.getTranslateX());
        transition5.toXProperty().setValue(randomDouble(-99999999,99999999));
        transition5.durationProperty().setValue(Duration.seconds(12));
        transition5.setNode(gameObjectXGroup);
        transition5.cycleCountProperty().setValue(12);
        transition5.setAutoReverse(enable);
        transition5.play();
//======================================================================================
        //=======================================================================================
        TranslateTransition     transition6 = new TranslateTransition();
        transition6.fromYProperty().setValue(gameObjectXGroup.getTranslateY());
        transition6.toYProperty().setValue(randomDouble(99999999,-99999999));
        transition6.durationProperty().setValue(Duration.seconds(12));
        transition6.setNode(gameObjectXGroup);
        transition6.cycleCountProperty().setValue(12);
        transition6.setAutoReverse(enable);
        transition6.play();
//======================================================================================

        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        TranslateTransition transition=new TranslateTransition();
        transition.fromZProperty().setValue(gameObjectXGroup.getTranslateZ());
        transition.fromXProperty().setValue(randomDouble(-99999999,99999999));
        transition.durationProperty().setValue(Duration.seconds(12));
        transition.setNode(gameObjectXGroup);
        transition.cycleCountProperty().setValue(12);
        transition.setAutoReverse(enable);
        transition.play();
        //=========================================================================================
        TranslateTransition     transition2 = new TranslateTransition();
        transition2.fromXProperty().setValue(gameObjectXGroup.getTranslateX());
        transition2.toXProperty().setValue(randomDouble(-99999999,99999999));
        transition2.durationProperty().setValue(Duration.seconds(12));
        transition2.setNode(gameObjectXGroup);
        transition2.cycleCountProperty().setValue(12);
        transition2.setAutoReverse(enable);
        transition2.play();
//=========================================================================================
        //=========================================================================================
        TranslateTransition     transition3 = new TranslateTransition();
        transition3.fromYProperty().setValue(gameObjectXGroup.getTranslateY());
        transition3.toYProperty().setValue(randomDouble(-99999999,99999999));
        transition3.durationProperty().setValue(Duration.seconds(12));
        transition3.setNode(gameObjectXGroup);
        transition3.cycleCountProperty().setValue(12);
        transition3.setAutoReverse(enable);
        transition3.play();
//=========================================================================================
        RotateTransition rotatex= new RotateTransition();
        rotatex.setAxis(Rotate.Y_AXIS);
        rotatex.durationProperty().setValue(Duration.seconds(12));
        rotatex.setNode(gameObjectXGroup);
        rotatex.setFromAngle(gameObjectXGroup.ry.getAngle());
        rotatex.setToAngle(gameObjectXGroup.ry.getAngle()+360);
        rotatex.setAutoReverse(enable);
        rotatex.setCycleCount(3);
        rotatex.play();
        //========================================================================================
        ParallelTransition parallelTransition  =new ParallelTransition();
        parallelTransition.getChildren().add(transition);
        sequence0.getChildren().add(transition2);
        sequence0.getChildren().add(transition);
        sequence0.getChildren().add(transition3);
        sequence0.getChildren().add(transition4);
        sequence0.getChildren().add(transition5);
        sequence0.getChildren().add(transition6 );
        sequence0.getChildren().add(rotatex);
        sequence0.setOnFinished(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                attack5(gameObjectXGroup);
            }
        });

        sequence0.play();

    }

    public void attack5(XGroup gameObjectXGroup){
        SequentialTransition sequence0 = new SequentialTransition();
        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        TranslateTransition transition4=new TranslateTransition();
        transition4.fromZProperty().setValue(gameObjectXGroup.getTranslateZ());
        transition4.fromXProperty().setValue(randomDouble(-99999999,99999999));
        transition4.durationProperty().setValue(Duration.seconds(12));
        transition4.setNode(gameObjectXGroup);
        transition4.cycleCountProperty().setValue(12);
        transition4.setAutoReverse(enable);
        transition4.play();

//=========================================================================================
        TranslateTransition     transition5 = new TranslateTransition();
        transition5.fromXProperty().setValue(gameObjectXGroup.getTranslateX());
        transition5.toXProperty().setValue(randomDouble(-99999999,99999999));
        transition5.durationProperty().setValue(Duration.seconds(12));
        transition5.setNode(gameObjectXGroup);
        transition5.cycleCountProperty().setValue(12);
        transition5.setAutoReverse(enable);
        transition5.play();
//======================================================================================
        //=======================================================================================
        TranslateTransition     transition6 = new TranslateTransition();
        transition6.fromYProperty().setValue(gameObjectXGroup.getTranslateY());
        transition6.toYProperty().setValue(randomDouble(99999999,-99999999));
        transition6.durationProperty().setValue(Duration.seconds(12));
        transition6.setNode(gameObjectXGroup);
        transition6.cycleCountProperty().setValue(12);
        transition6.setAutoReverse(enable);
        transition6.play();
//======================================================================================

        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        TranslateTransition transition=new TranslateTransition();
        transition.fromZProperty().setValue(gameObjectXGroup.getTranslateZ());
        transition.fromXProperty().setValue(randomDouble(-99999999,99999999));
        transition.durationProperty().setValue(Duration.seconds(12));
        transition.setNode(gameObjectXGroup);
        transition.cycleCountProperty().setValue(12);
        transition.setAutoReverse(enable);
        transition.play();
        //=========================================================================================
        TranslateTransition     transition2 = new TranslateTransition();
        transition2.fromXProperty().setValue(gameObjectXGroup.getTranslateX());
        transition2.toXProperty().setValue(randomDouble(-99999999,99999999));
        transition2.durationProperty().setValue(Duration.seconds(12));
        transition2.setNode(gameObjectXGroup);
        transition2.cycleCountProperty().setValue(12);
        transition2.setAutoReverse(enable);
        transition2.play();
//=========================================================================================
        //=========================================================================================
        TranslateTransition     transition3 = new TranslateTransition();
        transition3.fromYProperty().setValue(gameObjectXGroup.getTranslateY());
        transition3.toYProperty().setValue(randomDouble(-99999999,99999999));
        transition3.durationProperty().setValue(Duration.seconds(12));
        transition3.setNode(gameObjectXGroup);
        transition3.cycleCountProperty().setValue(12);
        transition3.setAutoReverse(enable);
        transition3.play();
//=========================================================================================
        RotateTransition rotatex= new RotateTransition();
        rotatex.setAxis(Rotate.Y_AXIS);
        rotatex.durationProperty().setValue(Duration.seconds(12));
        rotatex.setNode(gameObjectXGroup);
        rotatex.setFromAngle(gameObjectXGroup.ry.getAngle());
        rotatex.setToAngle(gameObjectXGroup.ry.getAngle()+360);
        rotatex.setAutoReverse(enable);
        rotatex.setCycleCount(3);
        rotatex.play();
        //========================================================================================
        ParallelTransition parallelTransition  =new ParallelTransition();
        parallelTransition.getChildren().add(transition);
        am.rotateZ(gameObjectXGroup,0,360,1500,1,true).play();
        am.rotateY(gameObjectXGroup,0,360,1500,1,true).play();
        am.rotateX(gameObjectXGroup,0,360,1500,1,true).play();
        sequence0.getChildren().add(transition2);
        sequence0.getChildren().add(transition);
        sequence0.getChildren().add(transition3);
        sequence0.getChildren().add(transition4);
        sequence0.getChildren().add(transition5);
        sequence0.getChildren().add(transition6 );

        sequence0.getChildren().add(am.rotateZ(gameObjectXGroup,0,360,1500,1,true) );
        sequence0.getChildren().add(am.rotateY(gameObjectXGroup,0,360,1500,1,true) );
        sequence0.getChildren().add(am.rotateX(gameObjectXGroup,0,360,1500,1,true) );
        sequence0.getChildren().add(rotatex);
        sequence0.setOnFinished(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                attack0(gameObjectXGroup);
            }
        });

        sequence0.play();
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



}
