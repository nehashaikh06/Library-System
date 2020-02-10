/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryDealing;

import java.awt.Color;

/**
 *
 * @author Admin
 */
public class Initialize {
    public static void main(String[] args) throws InterruptedException
    {
        Splash splash=new Splash();
        splash.setVisible(true);
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(40);
                splash.loadingnum.setText(Integer.toString(i)+"%");
                splash.loadingbar.setValue(i);
                splash.loadingbar.setStringPainted(true);
                splash.loadingbar.setForeground(Color.ORANGE);
            //    splash.loadingbar.setString("10%");
                if(i==100){
                    splash.dispose();
                    new loginForm().setVisible(true);
                
                
            }
            }}catch(Exception e){}
    }
    
}

