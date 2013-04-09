import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Random;
import java.applet.*;

public class BinaryTeacher extends JApplet {
    public void init(){
        Container c = getContentPane();
        TextField commands = new TextField("Welcome",30);
        Panel P = new Panel();
        P.add("North", commands);
        c.add(P);
    }

}

