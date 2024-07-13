package travel.booking.management1;


import java.awt.*;
import javax.swing.*;

public class Splash {
    public static void main(String[] args){
        SplashFrame f1 = new SplashFrame();
        f1.setVisible(true);
        int i;
        int x=1;
        for(i=2; i<=600; i+=10, x+=7){
            f1.setLocation(900 - ((i+x)/2), 500 - (i/2));
            f1.setSize(i+x,i);
        }
        
    }
}
class SplashFrame extends JFrame implements Runnable{
    Thread t1;
    SplashFrame(){
        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/lake.jpg"));
        Image i1 = c1.getImage().getScaledInstance(1000, 600,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        
        JLabel l1 = new JLabel(i2);
        add(l1);
        setUndecorated(true);
        t1 = new Thread(this);
        t1.start();
    }
    @Override
    public void run(){
        try{
            Thread.sleep(3000);
            this.setVisible(false);
            
            Login l = new Login();
            l.setVisible(true);
        }catch(InterruptedException e){
        }
    }
}

