/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Support;
import java.util.concurrent.Executor;;
/**
 *
 * @author Richardo
 */
public class CoreGenerator implements Executor{
   public void execute(Runnable r) {
r.run();

}
} 

