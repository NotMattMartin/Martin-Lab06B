// Lab06Bst.java
// This is the student, starting version of Lab06B which is divided into 8 cells.
// The first cell -- "Draw Random Points" -- is provided as an example.
// Students need to complete the other 7 cells on their own.


import java.awt.*;
import java.applet.*;


public class Lab06Bst extends Applet
{
    public void paint(Graphics g)
    {
        // Draw Grid
        Expo.drawLine(g,250,0,250,650);
        Expo.drawLine(g,500,0,500,650);
        Expo.drawLine(g,750,0,750,650);
        Expo.drawLine(g,0,325,1000,325);

        // Draw 10,000 Random Points
        for (int count = 1; count <= 10000; count++)
        {
            Expo.setRandomColor(g);
            int x = Expo.random(5,245);
            int y =  Expo.random(5,320);
            Expo.drawPoint(g,x,y);
        }
        
        // Draw 1000 Random Lines
        for (int count = 1; count <= 1000; count++)
        {
            Expo.setRandomColor(g);
            int x = Expo.random(255,495);
            int y = Expo.random(5,320);
            int q = Expo.random(255,495);
            int z = Expo.random(5,320);
            Expo.drawLine(g,x,y,q,z);
        }
        
        // Draw 1000 Random Rectangles
        for (int count = 1; count <= 1000; count++)
        {
            Expo.setRandomColor(g);
            int x = Expo.random(505,745);
            int y = Expo.random(5,320);
            int q = Expo.random(505,745);
            int z = Expo.random(5,320);
            Expo.fillRectangle(g,x,y,q,z);
        }
        
        // Draw 500 Random Triangles
        for (int count = 1; count <= 500; count++)
        {
            Expo.setRandomColor(g);
            int x = Expo.random(745,995);
            int y = Expo.random(5,320);
            int q = Expo.random(745,995);
            int z = Expo.random(5,320);
            int w = Expo.random(745,995);
            int o = Expo.random(5,320);
            Expo.fillPolygon(g,x,y,q,z,w,o);
        }
        
        // Draw 100 Random Initials
        for (int count = 1; count <= 100; count++)
        {
            Expo.setRandomColor(g);
            int x = Expo.random(15,200);
            int y = Expo.random(345,635);
            int q = Expo.random(1,30);
            Expo.setFont(g,"Courier",Font.BOLD,q);
            Expo.drawString(g,"MM",x,y);
        }

        // Draw 500 Random Stars with a constant radius of 30 and a random # of points
        





        // Draw 1000 Random Circles with random radii






        // Draw 250 Random Arcs with 2 random radii, random start and random finish






    }

}




