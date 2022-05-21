
import java.lang.*;

import java.awt.*;//AbstrACT wINDOWING TOOLKIT  
import java.awt.event.*; //Listeners

class Demo{
    public String DataDe(){
        return "Jay Ganesh";
    }
}

class MarvellousFrame extends WindowAdapter implements ActionListener
{
    public Frame fobj; //Reference
    public Button bobj;
    public TextField tobj;
    public MarvellousFrame(String name) 
    {
        fobj =new Frame(name);
        bobj=new Button("Marvellous");
       tobj=new TextField();
        tobj.setBounds(60,60,170,20);
        bobj.setBounds(110,130,60,20);

        fobj.add(bobj);
       fobj.add(tobj);

        fobj.setSize(600,600);
        fobj.setVisible(true);
        fobj.setLayout(null);

        bobj.addActionListener(this);
        fobj.addWindowListener(this);
    }
   public void windowClosing(WindowEvent obj)
    {
      //  System.out.println("Inside windowClosing");
      System.exit(0);
    }
    public void actionPerformed(ActionEvent obj) {
        Demo dobj=new Demo();
        String str=dobj.DataDe();
        

      tobj.setText("Jay Ganesh");
    }
}
class FrameDemo5
{
    public static void main(String arg[])
    {
        System.out.println("Print the data on console");

        MarvellousFrame mobj = new MarvellousFrame("PPA");

    }
}