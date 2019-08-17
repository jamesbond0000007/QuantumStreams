package boot.Code.Java.Animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.util.Duration;
import boot.Code.Java.Support.XGroup;

public class Zanimation {
    double from_=0;
    double to_=0;
    int time_=0;
    int repeat_=0;
    XGroup model;

    Timeline     animation = new Timeline();
    public Timeline intoScreenZ(XGroup rect, double from, double to, int time , int repeat){
        animation = new Timeline();
        time_=time;
       from_=from;
       to_=to;
       repeat_=repeat;
        animation.getKeyFrames().addAll
                (new KeyFrame(Duration.ZERO,
                                new KeyValue(rect.translateZProperty(),from)),

                        new KeyFrame(Duration.seconds(time),
                                new KeyValue(rect.translateZProperty(),to)));


        animation.cycleCountProperty().setValue(repeat);
        animation.setAutoReverse(false);
        // animation.play();


        return animation;

    }


    public void handle(){
        animation.setOnFinished(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent me) {


                System.out.println("Finished");
            }
        });

    }
    public void setAutoReverse(boolean s){
        animation.setAutoReverse(s);
    }
    public Timeline getAnimation(){
        return animation;
    }
public double getTime(){
        return time_;
}
    public double getFrom_() {
        return from_;
    }

    public double getTo_() {
        return to_;
    }

    public void setFrom_(double from_) {
        this.from_ = from_;
    }

    public void setRepeat_(int repeat_) {
        this.repeat_ = repeat_;
    }
    public void setTo_(int t){
        to_=t;
    }
}
