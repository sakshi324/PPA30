import java.lang.*;
import java.awt.*;//AbstrACT wINDOWING TOOLKIT  
import java.awt.event.*; //Listeners

class MarvellousFrame
{
    public Frame fobj; //Reference

    public MarvellousFrame(String name) 
    {
        fobj = new Frame(name);
        fobj.setSize(600,600);
        fobj.setVisible(true);

        fobj.addWindowListener(new MarvellousListener());
    }
}

class MarvellousListener extends WindowAdapter //implements WindowListener
{
  
    public void windowClosing(WindowEvent obj)
    {
      //  System.out.println("Inside windowClosing");
      System.exit(0);
    }
   
}

class FrameDemo4
{
    public static void main(String arg[])
    {
        System.out.println("Print the data on console");

        MarvellousFrame mobj = new MarvellousFrame("PPA");

    }
}