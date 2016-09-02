import javax.swing.*;
import java.awt.*;
class MyCanvas extends JComponent{
   public void paint(Graphics g){
      g.drawRect(15,15,150,150);
      g.drawRect(15,200,150,150);
      }
     } 
   


public class DrawBoxes{
   public static void box(){
      System.out.println("+------+");
      System.out.println("|      |");
      System.out.println("|      |");
      System.out.println("+------+");
      System.out.println();
      }
      
      
   
   public static void main(String[] args){
   for(int i = 0; i<3; i++){
      box();
      }
      JFrame swingRectangle = new JFrame();
      swingRectangle.setSize(540,540);
      swingRectangle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      swingRectangle.setTitle("My Boxes");
      
      
      
      
      swingRectangle.getContentPane().add(new MyCanvas());
         
      
      swingRectangle.setVisible(true);
      
      
       
     }
      
    }
    
