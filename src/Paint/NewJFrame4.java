/* to be done "fill , eraser , clear all"
 * optional "dashed , undo , size of painting"
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import javax.swing.*;
import java.awt.Graphics;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author 3201105846
 */
public class NewJFrame4 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame4
     */
    ArrayList<MyLine> Linees = new ArrayList<MyLine>();
    ArrayList<MyRect> Rect = new ArrayList<MyRect>();
    ArrayList<myOval> oval = new ArrayList<myOval>();
    ArrayList<MyDot> dot = new ArrayList<MyDot>();
    ArrayList<MyTriangle> triangle = new ArrayList<MyTriangle>();
    java.awt.Color c=new java.awt.Color(0,0,0);
    int currentx,currenty,Intx,Inty,endx,endy;
    public NewJFrame4() {
        
        initComponents();
        this.shp = jComboBox1.getSelectedItem().toString();
        ButtonGroup b1=new ButtonGroup();
        b1.add(jRadioButton1);
        b1.add(jRadioButton2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyPaint");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(450, 370));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setText("  current Position is :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Line", "Circle", "Rectangle", "Triangle", "Free" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Color 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 51, 204));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Color 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 153, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Color 3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 0, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Color 4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("OutLine");
        jRadioButton1.setOpaque(true);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Fill");
        jRadioButton2.setOpaque(true);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/1.png"))); // NOI18N
        jToggleButton1.setText("Eraser");
        jToggleButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jToggleButton1StateChanged(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("Clear all");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addGap(1, 1, 1)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(4, 4, 4)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        button1.setLabel("Save");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setLabel("Open");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formKeyPressed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseClicked
    
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        currentx=evt.getX();
        currenty=evt.getY();
            
        System.out.println("x="+currentx+"and y="+currenty);
        jLabel1.setText("Current position is :("+currentx+","+currenty+").");
        //repaint();//
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        // 7 edit text,2 busy,
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        if (jComboBox1.getSelectedItem().toString().equals("Triangle"))
        {
            Intx=evt.getX();
            Inty=evt.getY();
            endx=currentx;
            endy=Inty;
            xPoints[0]=currentx;
            xPoints[1]=Intx;
            xPoints[2]=endx;
            yPoints[0]=currenty;
            yPoints[1]=Inty;
            yPoints[2]=endy;    
             
            }
        else
        {
            if (jComboBox1.getSelectedItem().toString().equals("Free")){
                currentx=evt.getX();
                currenty=evt.getY(); 
                storeObj();
            }
            else{
                if (jComboBox1.getSelectedItem().toString().equals("Rectangle")|jComboBox1.getSelectedItem().toString().equals("Circle"))
            {
                endx=evt.getX()-currentx;
                endy=evt.getY()-currenty;
                }
            else{
                endx=evt.getX();
                endy=evt.getY();
            }
            
            }
        }
        System.out.println("x="+endx+"and y="+endy);
        jLabel1.setText("  Current position is :("+endx+","+endy+").");
        repaint();
          
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
        if (jToggleButton1.isSelected()) {
            endx=evt.getX();
            endy=evt.getY();
        } else {
        
        if (jComboBox1.getSelectedItem().toString().equals("Triangle"))
        {
            xPoints[0]=currentx;
            xPoints[1]=Intx;
            xPoints[2]=endx;
            yPoints[0]=currenty;
            yPoints[1]=Inty;
            yPoints[2]=endy;    
            }
        else
        {
            if (jComboBox1.getSelectedItem().toString().equals("Rectangle")|jComboBox1.getSelectedItem().toString().equals("Circle"))
            {
                endx=evt.getX()-currentx;
                endy=evt.getY()-currenty;
                }
            else{
                endx=evt.getX();
                endy=evt.getY();
            }
            
            }
            }
        shp=jComboBox1.getSelectedItem().toString();
        repaint();
        storeObj();
        
    }//GEN-LAST:event_formMouseReleased

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        
        shp=jComboBox1.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         c=new java.awt.Color(0,0,0);
         if (jRadioButton1.isSelected()) {
            jRadioButton1.setBackground(c);
        } else {
            jRadioButton2.setBackground(c);
        }
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        c=new java.awt.Color(0,0,255);
        if (jRadioButton1.isSelected()) {
            jRadioButton1.setBackground(c);
        } else {
            jRadioButton2.setBackground(c);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        c=new java.awt.Color(0,255,0);
        if (jRadioButton1.isSelected()) {
            jRadioButton1.setBackground(c);
        } else {
            jRadioButton2.setBackground(c);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        c=new java.awt.Color(255,0,0);
        if (jRadioButton1.isSelected()) {
            jRadioButton1.setBackground(c);
        } else {
            jRadioButton2.setBackground(c);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    private void WriteFile(java.io.File f){
        try {
                java.io.FileOutputStream  fos;
                java.io.ObjectOutputStream  fr;
                fos = new java.io.FileOutputStream(f);
                fr = new java.io.ObjectOutputStream(fos);
                System.out.println(f.toString()+" is the File Choosed to write. ");
                fr.writeObject("//");
                //Linees,Rect,oval,dot,triangle
                for (int i = 0; i < Linees.size(); i++) 
                {
                    fr.writeObject((Object)Linees.get(i));
                    System.out.println("Writing "+Linees.get(i));
                    
                    }
                fr.flush();
                fr.close();
                fos.close();
                
     
     
    
        }catch (IOException ioe){
        }
        catch (Exception e) {
        }

    }
    
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showSaveDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
            String fileName = chooser.getSelectedFile().getName();
            WriteFile(new java.io.File(fileName));
            System.out.println("File selected to Save is :"+fileName);

        }

        //javax.swing.JFileChooser chooser = new javax.swing.JFileChooser(new java.io.File("c://"));
        //chooser.showDialog(this, null);
    }//GEN-LAST:event_button1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Linees.clear();
        Rect.clear();
        oval.clear();
        dot.clear();
        triangle.clear();
        reset=true;
        repaint();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jToggleButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jToggleButton1StateChanged
        // TODO add your handling code here:
        if (jToggleButton1.isSelected()) {
            shp="eraser";
        }
        else{
            shp=jComboBox1.getSelectedItem().toString();
        }
    }//GEN-LAST:event_jToggleButton1StateChanged

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton1.isSelected()) {
            shp="eraser";
            System.out.println("shape is :"+shp);
            this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            
        }
        else{
            shp=jComboBox1.getSelectedItem().toString();
            System.out.println("shape is :"+shp);
            this.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed
    boolean reset;
    public void paint(java.awt.Graphics g){
        super.paint(g);
        g.setColor(java.awt.Color.WHITE);
        int x1=jPanel1.getWidth()+10,x2=jPanel1.getWidth()+(jLabel1.getY()-50),y1=60,y2=60+jLabel1.getY()-50;
        g.fill3DRect(130, 60,
                300,
                jLabel1.getY()-50, true);
        if (reset){
                        }
        else{
            
        if (jRadioButton1.isSelected()) {
            
            g.setColor(c);
        // drawing out of area if ((x2>currentx&currentx>x1)&(y2<currenty&currenty<y1)){
           switch (shp)
        {
            case "Line":
            g.drawLine(currentx, currenty, endx, endy);
            
            break;
            case "Rectangle":
            g.drawRect(currentx, currenty, endx, endy);
            break;
            case "Circle":
            g.drawOval(currentx, currenty, endx, endy);
            break;
            case "Free":
            g.drawLine(currentx, currenty, currentx+1, currenty+1);
            break;
            case "Triangle":
            g.drawPolygon(xPoints, yPoints, 3);
            break;
            case "eraser":
            {
                System.out.println("eraser is selected :"+jToggleButton1.isSelected());
                //this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                g.setColor(java.awt.Color.WHITE);
                g.fillOval(currentx, currenty, 25, 25);
                }
            }
        } else {
                    g.setColor(c);
                    // drawing out of area if ((x2>currentx&currentx>x1)&(y2<currenty&currenty<y1)){
                    switch (shp)
                    {
                        case "Line":
                        g.drawLine(currentx, currenty, endx, endy);
                        break;
                        case "Rectangle":
                        g.fillRect(currentx, currenty, endx, endy);
                        break;
                        case "Circle":
                        g.fillOval(currentx, currenty, endx, endy);
                        break;
                        case "Free":
                        g.drawLine(currentx, currenty, currentx+1, currenty+1);
                        break;
                        case "Triangle":
                        g.fillPolygon(xPoints, yPoints, 3);
                        break;
                        case "eraser":
                        {
                            System.out.println("eraser is selected :"+jToggleButton1.isSelected());
                            //this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                            g.setColor(java.awt.Color.WHITE);
                            g.fillOval(currentx, currenty, 15, 15);
                            }
                        break;
                        }
            }
        }
        //}else{}
        
        
        drawObj( g); 
        
        
        
    }
    int[] xPoints=new int[3];
    int[] yPoints=new int[3];
    public void drawObj(Graphics g){
        
        for (int i = 0; i < Linees.size(); i++) {
            g.setColor(Linees.get(i).getForeColor());
            g.drawLine(Linees.get(i).getStartX(), Linees.get(i).getStartY(), Linees.get(i).getEndX(), Linees.get(i).getEndY());
            }
        for (int i = 0; i < Rect.size(); i++) {
            g.setColor(Rect.get(i).getForeColor());
            if (Rect.get(i).IsFilled()) 
            {
                g.setColor(Rect.get(i).getBackColor());
                g.fillRect(Rect.get(i).getStartX(), Rect.get(i).getStartY(), Rect.get(i).getEndX(), Rect.get(i).getEndY());
            
                }else{
                g.setColor(Rect.get(i).getForeColor());
                g.drawRect(Rect.get(i).getStartX(), Rect.get(i).getStartY(), Rect.get(i).getEndX(), Rect.get(i).getEndY());
                
                }
        } 
        for (int i = 0; i < oval.size(); i++) {
            g.setColor(oval.get(i).getForeColor());
            if (oval.get(i).IsFilled()) 
            {
                g.setColor(oval.get(i).getBackColor());
                g.fillOval(oval.get(i).getStartX(), oval.get(i).getStartY(), oval.get(i).getEndX(), oval.get(i).getEndY());
                
                }else
            {
                g.setColor(oval.get(i).getForeColor());
                g.drawOval(oval.get(i).getStartX(), oval.get(i).getStartY(), oval.get(i).getEndX(), oval.get(i).getEndY());
                
                }
            } 
        for (int i = 0; i < dot.size(); i++) {
            g.setColor(dot.get(i).getForeColor());
            g.fillOval(dot.get(i).getStartX(), dot.get(i).getStartY(), 5, 5);
        } 
        for (int i = 0; i < triangle.size(); i++) {
            xPoints[0]=triangle.get(i).getStartX();
            yPoints[0]=triangle.get(i).getStartY();
            xPoints[1]=triangle.get(i).getIntX();
            yPoints[1]=triangle.get(i).getIntY();
            xPoints[2]=triangle.get(i).getEndX();
            yPoints[2]=triangle.get(i).getEndY();
            g.setColor(triangle.get(i).getForeColor());
            if (triangle.get(i).IsFilled()) 
            {
                g.setColor(triangle.get(i).getBackColor());
                g.fillPolygon(xPoints, yPoints, 3);
                }else
            {
                g.setColor(triangle.get(i).getForeColor());
                g.drawPolygon(xPoints, yPoints, 3);
            
                 }
            }
        // g.drawOval(currentx, currenty, endx, endy);
    }
    
    String shp;
    public void storeLine(){
        MyLine ml=new MyLine();
        ml.setBackColor(jRadioButton2.getBackground());
        ml.setForeColor(jRadioButton1.getBackground());
        
        //ml.setDashed();
        ml.setEndX(endx);
        ml.setEndY(endy);
        ml.setStartX(currentx);
        ml.setStartY(currenty);
        Linees.add(ml);
        for (int i = 0; i < Linees.size(); i++) {
            System.out.println("Array Lines no"+i+" is from x= "+Linees.get(i).getStartX()+
                    "to x= "+Linees.get(i).getEndX()+" and y= "+Linees.get(i).getStartY()+
                    "to y= "+Linees.get(i).getEndY());
        }
    }
    public void storeRect(){
      MyRect m2=new MyRect();
        m2.setBackColor(jRadioButton2.getBackground());
        m2.setForeColor(jRadioButton1.getBackground());
        if (jRadioButton2.isSelected()) {
                m2.setFilled();
                m2.setBackColor(jRadioButton2.getBackground());
            } else {
                
            }

        m2.setEndX(endx);
        m2.setEndY(endy);
        m2.setStartX(currentx);
        m2.setStartY(currenty);
        Rect.add(m2);
        for (int i = 0; i < Rect.size(); i++) {
            System.out.println("Array Rectangle no"+i+"is from x= "+Rect.get(i).getStartX()+
                    "to x= "+Rect.get(i).getEndX()+"and y= "+Rect.get(i).getStartY()+
                    "to y= "+Rect.get(i).getEndY());
        }
    }
    public void storeOval(){
        myOval m3=new myOval();
        
        m3.setForeColor(jRadioButton1.getBackground());
        
        if (jRadioButton2.isSelected()) {
                m3.setFilled();
                m3.setBackColor(jRadioButton2.getBackground());
            } else {
                
            }
        m3.setEndX(endx);
        m3.setEndY(endy);
        m3.setStartX(currentx);
        m3.setStartY(currenty);
        oval.add(m3);
        for (int i = 0; i < oval.size(); i++) {
            System.out.println("Array Oval no"+i+"is from x= "+oval.get(i).getStartX()+
                    "to x= "+oval.get(i).getEndX()+"and y= "+oval.get(i).getStartY()+
                    "to y= "+oval.get(i).getEndY());
        }
    }
    MyDot m4;
    public void storeDot(){
        m4=new MyDot();
        m4.setBackColor(jRadioButton2.getBackground());
        m4.setForeColor(jRadioButton1.getBackground());
        
        if (jRadioButton2.isSelected()) {
                m4.setFilled();
            } else {
                
            }
        m4.setEndX(endx);
        m4.setEndY(endy);
        m4.setStartX(currentx);
        m4.setStartY(currenty);
        dot.add(m4);
        for (int i = 0; i < oval.size(); i++) {
            System.out.println("Array Dot no"+i+"is from x= "+dot.get(i).getStartX()+
                    "to x= "+(dot.get(i).getStartX()+2)+"and y= "+dot.get(i).getStartY()+
                    "to y= "+(dot.get(i).getStartY()+2));
        }
    }
    public void storeTriangle(){
        MyTriangle m5=new MyTriangle();
        m5.setBackColor(jRadioButton2.getBackground());
        m5.setForeColor(jRadioButton1.getBackground());
        
        if (jRadioButton2.isSelected()) {
                m5.setFilled();
                m5.setBackColor(jRadioButton2.getBackground());
            } else {
                
            }
        m5.setEndX(xPoints[2]);
        m5.setEndY(yPoints[2]);
        m5.setIntX(xPoints[1]);
        m5.setIntY(yPoints[1]);
        m5.setStartX(xPoints[0]);
        m5.setStartY(yPoints[0]);
        triangle.add(m5);
        for (int i = 0; i < triangle.size(); i++) {
            System.out.println("Array Triangle no"+i+" is from x= "+triangle.get(i).getStartX()+
                    " and x= "+triangle.get(i).getIntX()+" to x= "+triangle.get(i).getEndX()+
                    " and y= "+triangle.get(i).getStartY()+" and y= "+triangle.get(i).getIntY()+
                    " to y= "+triangle.get(i).getEndY());
        }
    }
    public void storeObj(){
          switch (shp)
        {
            case "Line":
            storeLine();            
            break;
            case "Rectangle":
            storeRect();
            break;
            case "Circle":
            storeOval();
            break;
            case "Free":
            storeDot();
            break;
            case "Triangle":
            storeTriangle();
            break;
       
            }
 
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJFrame4 njf=  new NewJFrame4();
                njf.setVisible(true);
                //njf.setSize(800, 600);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
