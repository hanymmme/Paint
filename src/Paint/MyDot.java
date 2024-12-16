
package paint;

import java.awt.Color;


/**
 *
 * @author Jdev
 */
public class MyDot implements  MyShape {
     int x1,y1,x2,y2 ;
     java.awt.Color backg=new java.awt.Color(0,0,0);
     java.awt.Color foreg=new java.awt.Color(0,0,0);
     boolean dashed,filled;
   public int getArea(){
       int a=0;
       a=x2-x1;
       a=Math.abs(a);
       return a;
   }
   public int getStartX(){
       
       return x1;
   }
   public int getStartY(){
       return y1;
   }
   public int getEndX(){
       return x2;
   }
   public int getEndY(){
       return y2;
   }
   
   public boolean IsFilled(){
       return filled;
   }
   public boolean IsDashed(){
       return dashed;
   }
   public java.awt.Color getForeColor(){
       return foreg;
   }
   public java.awt.Color getBackColor(){
       return backg;
   }
   public int setStartX(int a){
       x1=a;
       return x1;
   }
   public int setStartY(int a){
       y1=a;
       return y1;
   }
   public int setEndX(int a){
       x2=a;
       return x2;
   }
   public int setEndY(int a){
       y2=a;
       return y2;
   }
   
   public boolean setFilled(){
       filled =true;
       return true;
   }
   public boolean setDashed(){
       dashed=true;
       return true;
   }
   public boolean setForeColor(Color c){
       foreg=c;
       return true;
   }
   public boolean setBackColor(Color c){
       backg=c;
       return true;
   }
   
}