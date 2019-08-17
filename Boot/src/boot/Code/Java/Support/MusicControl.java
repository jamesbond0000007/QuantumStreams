/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Support;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import boot.Os;
/**
 *
 * @author Richardo
 */
public class MusicControl {
    TimeUnit SECONDS;
 private final ScheduledExecutorService scheduler =
Executors.newScheduledThreadPool(1);
public void playMusic(Os os) {
final Runnable beeper = new Runnable() {
public void run() { os.getMusicResource().select(0).setPriority(0);
        os.getMusicResource().select(0).play(10); }
};
final ScheduledFuture<?> beeperHandle =
scheduler.scheduleAtFixedRate(beeper, 10, 10, SECONDS.SECONDS);
scheduler.schedule(new Runnable() {
public void run() { beeperHandle.cancel(false); }
}, 60 * 60, SECONDS.SECONDS);
}
}