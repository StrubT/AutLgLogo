// $Author: beo1 $
//
// $Id: LogoPrimitives.java 1352 2012-12-05 14:23:29Z beo1 $
//
// Contains all the required primitives of our Logo language

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class LogoPrimitives {

   private Applet applet;             // the applet
   private double orient,             // turtle's orientation (degrees)
                  x, y,               // turtle's position
                  x1, y1,             // auxiliary coordinates
                  sizeX, sizeY;       // sheet's size
   private boolean pendown=true,      // some default values
                   showturtle=false;  // pen is down and no turtle
   private Graphics h;                // copy of current Graphics object, avoids
                                      // to give it as parameter all the time

   public LogoPrimitives (Applet applet) {
      this.applet = applet;
      h = applet.getGraphics();
      this.sizeX = applet.getSize().width;
      this.sizeY = applet.getSize().height;
      x = sizeX / 2;                  // default values
      y = sizeY / 2;                  // origin in the middle
      orient = 0;                     // orientation = 0 degree
      cs();                           // clears screen
      pd();
   }

   // Convert degrees into radians
   private double radian(double deg) {
      return ( 2 * 3.141592 * deg / 360);
   }

   // dt() and et() are two auxiliary method
   // called by each primitive if necessary
   // Display Turtle
   private void dt() {
      if (showturtle) {
         boolean pen = pendown;       // saves pen state
         boolean turtle = showturtle; // saves turtle state
         showturtle = false;
         pd();
         rt(90);
         fd(10);
         lt(120);
         fd(20);
         lt(120);
         fd(20);
         lt(120);
         fd(10);
         lt(90);
         pendown = pen;               // restores pen state
         showturtle = turtle;
      }
   }

   // Erase Turtle
   private void et() {
      if (showturtle) {
        h.setColor(Color.white);
        dt();
        h.setColor(Color.black);
      }
   }

   // Privitives of the Logo Language

   // Clear Screen
   public void cs() {
      orient = 0;
      x = sizeX / 2;
      y = sizeY / 2;
      h.setColor(Color.white);
      h.fillRect(0,0,(int)sizeX,(int)sizeY);
      h.setColor(Color.black);
      if (showturtle) dt();
   }

   // Pen Up
   public void pu() {
      pendown = false;
   }

   // Pen Down
   public void pd() {
      h.setColor(Color.black);
      pendown = true;
   }

   // Forward
   public void fd(double d) { 
      if (showturtle) et();
      x1 = x + d * Math.cos(radian(orient));
      y1 = y + d * Math.sin(radian(orient));
      if (pendown) h.drawLine((int)x,(int)y,(int)x1,(int)y1);
      x = x1;
      y = y1;
      if (showturtle) dt();
   }

   // Backward
   public void bk(double d) { 
      if (showturtle) et();
      x1 = x - d * Math.cos(radian(orient));
      y1 = y - d * Math.sin(radian(orient));
      if (pendown) h.drawLine((int)x,(int)y,(int)x1,(int)y1);
      x = x1;
      y = y1;
      if (showturtle) dt();
   }

    // Right Turn
    public void rt(double alpha) {
      if (showturtle) et();
      orient = (orient + alpha) % 360;
      if (showturtle) dt();
    }

    // Left Turn
    public void lt(double alpha) {
      if (showturtle) et();
      orient = (orient - alpha) % 360;
      if (showturtle) dt();
    }

    // Shows Turtle
    public void st() {
      showturtle=true;
      dt();
    }

    // Hides turtle
    public void ht() {
      et();
      showturtle=false;
    }

   // Wait
   public void wait(int mSec){
      try { Thread.sleep(mSec); }
      catch(InterruptedException ie){
         System.out.println(ie);
      }
   }
}