/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boot.Code.Java.Support;

import boot.Os;

import boot.Interface.Stateable;

import java.util.Observable;

/**
 *
 * @author Richardo
 */
public class Message extends Observable implements Stateable {

    static String message;
    String state="";
    public void send(String g){
        
             setChanged() ;
                     
        message=g; 
              
             notifyObservers(this);
    }

    public static String getMessage(){
        return message;
    }
    public String getState(){
return state;
    }

    @Override
    public boolean setState(String st) {
        this.state = st;
        return true;

    }

    public void getQuantumLanguage(String gu){

    }
    public void getQuantumLanguage(Os os ){

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
