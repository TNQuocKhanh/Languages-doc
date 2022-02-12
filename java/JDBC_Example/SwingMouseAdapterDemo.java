package mypack;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SwingAdapterDemo {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public SwingAdapterDemo(){
      prepareGUI();
   }

   public static void main(String[] args){
	   SwingAdapterDemo  swingAdapterDemo = new SwingAdapterDemo();  
      swingAdapterDemo.showMouseAdapterDemo();
   }

   private void prepareGUI(){
      mainFrame = new JFrame("Java SWING Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));

      headerLabel = new JLabel("",JLabel.CENTER );
      statusLabel = new JLabel("",JLabel.CENTER);        

      statusLabel.setSize(350,100);
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
	        System.exit(0);
         }        
      });    
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showMouseAdapterDemo(){
      headerLabel.setText("Listener in action: MouseAdapter");      

      JPanel panel = new JPanel();      
      panel.setBackground(Color.magenta);
      panel.setLayout(new FlowLayout());        
      panel.addMouseListener(new MouseAdapter(){
         public void mouseClicked(MouseEvent e) {
            statusLabel.setText("Mouse Clicked: ("
            +e.getX()+", "+e.getY() +")");
         }                
      });

      JLabel msglabel 
      = new JLabel("Welcome to TutorialsPoint SWING Tutorial."
      ,JLabel.CENTER);
      
      msglabel.addMouseListener(new MouseAdapter(){
         public void mouseClicked(MouseEvent e) {
            statusLabel.setText("Mouse Clicked: ("
            +e.getX()+", "+e.getY() +")");
         }                
      });
      panel.add(msglabel);
      controlPanel.add(panel);
      mainFrame.setVisible(true);  
   }
}