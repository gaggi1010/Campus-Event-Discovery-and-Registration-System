package com.campusevents;
import com.campusevents.ui.LoginFrame;import com.campusevents.util.DatabaseInitializer;import javax.swing.*;
public class Main { public static void main(String[] args){try{DatabaseInitializer.initialize();UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}catch(Exception e){JOptionPane.showMessageDialog(null,"Startup failed: "+e.getMessage());return;}SwingUtilities.invokeLater(()->new LoginFrame().setVisible(true));} }
