/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

/**
 *
 * @author cpc
 */
public interface MyShape {
   public int getArea();
   public int getStartX();
   public int getStartY();
   public int getEndX();
   public int getEndY();
   public boolean IsFilled();
   public boolean IsDashed();
   public java.awt.Color getForeColor();
   public java.awt.Color getBackColor();
   }
