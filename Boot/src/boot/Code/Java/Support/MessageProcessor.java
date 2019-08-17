/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Support;
import java.util.Observable;
import java.util.Observer;
import java.util.Stack;
import boot.Os;
/**
 *
 * @author Richardo
 */
public class MessageProcessor implements Observer{
    Message message=new Message(); 
     private Stack<String> messageMatrix=new Stack<String>();  //st
 public String getState(){

return "State";
}
 public Stack<String> getMessageMatrix(){
     return messageMatrix;
 }
    public boolean setState(String f){
      return true;  
    }   
    public  void process(Os os){
        int num=os.randomInt(8, os.countOpponents(true));
 if(messageMatrix.peek()=="space"){
    messageMatrix.pop();
  }  
else
     if(messageMatrix.peek()=="backOffFromPlayer"){
     messageMatrix.pop();
  }
 else   if(messageMatrix.peek()=="space"){
      messageMatrix.pop();
   }
 else   if(messageMatrix.peek()=="space"){
      messageMatrix.pop();
   }
  } 
 public void update(Observable obj, Object arg) {


message=(Message)arg;


 messageMatrix.add(message.getMessage());
 
   }   
 }  
    

