import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.*;

class FirstGUIclass extends JFrame{
    public static final int width = 300;
    public static final int height = 200;
    
    public FirstGUIclass(){
        super();
        
        setSize(width,height);
        setTitle("First GUI App");
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        JButton endButton = new JButton("Click Here to End Program");
        
        EndingListener buttonEar = new EndingListener();
        endButton.addActionListener(buttonEar); 
        add(endButton);
    }
}

class EndingListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
}

public class Example1{
    public static void main(String[]args){
         FirstGUIclass  obj1 =  new FirstGUIclass();
         obj1.setVisible(true);
    }
}