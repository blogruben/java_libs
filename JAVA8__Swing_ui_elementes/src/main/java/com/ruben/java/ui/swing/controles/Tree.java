package com.ruben.java.ui.swing.controles;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tree {

    public Tree() {
        JFrame f;  
        f=new JFrame();   
        DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");  
        DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");  
        DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");  
        style.add(color);  
        style.add(font);  
        DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");  
        DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");  
        DefaultMutableTreeNode black=new DefaultMutableTreeNode("black");  
        DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");  
        color.add(red); color.add(blue); color.add(black); color.add(green);      
        JTree jt=new JTree(style);  
        f.add(jt);  
        f.setSize(200,200);  
        f.setVisible(true);   
    }
}
