/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
/**
 *
 * @author bmmar
 */
public class Frame{

    private final Dimension btnSize = new Dimension(120, 30);

    public JFrame window;
    public JPanel display;
    public JPanel welcome;
    public JPanel sidebar;
    private CardLayout cardLayout = new CardLayout();
    

    public Frame(){
        initFrame();
    }
    
    public void initFrame(){
        window = new JFrame();
        window.setSize(600,400);
        
        sidebar = new JPanel();
        sidebar.setPreferredSize(new Dimension(110,500));
        sidebar.setLayout(new GridLayout(10,2,5,5));
        JButton b1 = new JButton("Grade Avg.");
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                GradeCalcActionPerformed(evt);
            }
        });
        sidebar.add(b1);
        JButton b2 = new JButton("Temperature");
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                TempConvertActionPerformed(evt);
            }
        });
        sidebar.add(b2);
        
        JButton b3 = new JButton("Interest");
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                InterestCalcActionPerformed(evt);
            }
        });
        sidebar.add(b3);
        
        JButton b4 = new JButton("Statistics");
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                StatCalcActionPerformed(evt);
            }
        });
        sidebar.add(b4);
        
        window.add(sidebar, BorderLayout.WEST);
        
        display = new JPanel();
        display.setLayout(cardLayout);
        display.add(new Begin(), "0");
        display.add(new GradeCalculator(), "1");
        display.add(new TempConvert(), "2");
        display.add(new InterestCalculator(), "3");
        display.add(new StatCalculator(), "4");
        
        window.add(display, BorderLayout.CENTER);
        
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setVisible(true);
    }
    
    private void GradeCalcActionPerformed(ActionEvent evt){
        cardLayout.show(display, "1");
    }
    
    private void TempConvertActionPerformed(ActionEvent evt){
        cardLayout.show(display, "2");
    }
    
    private void InterestCalcActionPerformed(ActionEvent evt){
        cardLayout.show(display, "3");
    }
    
    private void StatCalcActionPerformed(ActionEvent evt){
        cardLayout.show(display, "4");
    }
    
    public static void main(String[] args) {
        new Frame();
    }
    
}
