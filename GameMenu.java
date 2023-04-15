import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameMenu extends JFrame
{
    // declare GUI components
    JButton playButton;
    JButton instructionsButton;
    JButton quitButton;
    
    //create the constructor
    public GameMenu()
    { 
        setTitle("Game Introduction");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
        
       // Create buttons
       playButton = new JButton("Play");
       instructionsButton = new JButton("Instructions");
       quitButton = new JButton("Quit");
       
       // Set up layout
       setLayout(new GridLayout(4, 4));
       add(playButton);
       add(instructionsButton);
       add(quitButton);
       
       // Pack and center window
       pack();
       setLocationRelativeTo(null);
       
       setVisible(true);
       
       //add action listners to the buttons 
       playButton.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {   
               if (e.getSource() == playButton) 
               {   
                       // Create game window
                       JFrame gameWindow = new JFrame();
                       gameWindow.setTitle("Game");
                       gameWindow.setSize(400, 400);
                       gameWindow.setLocationRelativeTo(null);
                       
                       // Add back button
                   JButton backButton = new JButton("Back");
                   backButton.addActionListener(new ActionListener() 
                   {
                       public void actionPerformed(ActionEvent e) 
                       {
                           gameWindow.dispose();
                           setVisible(true);
                       }
               
           
                   });
                   
                   gameWindow.add(backButton, BorderLayout.SOUTH);
                   gameWindow.add(backButton, BorderLayout.SOUTH);
                   gameWindow.setVisible(true);
                   setVisible(false);
               }
               
              
           }   
       });
       
       
       //add action listners to the buttons 
       instructionsButton.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {   
               if (e.getSource() == instructionsButton) 
               {   
                   // Create instructions window
                   JFrame instructionsWindow = new JFrame();
                   instructionsWindow.setTitle("Instructions");
                   instructionsWindow.setSize(400, 200);
                   instructionsWindow.setLocationRelativeTo(null);
                       
                   // Add instructions text and back button
                   JTextArea instructionsText = new JTextArea("These are the instructions.");
                   instructionsText.setEditable(false);
                   JButton backButton = new JButton("Back");
                   backButton.addActionListener(new ActionListener() 
                   {
                       public void actionPerformed(ActionEvent e) 
                       {
                           instructionsWindow.dispose();
                           setVisible(true);
                       }
               
           
                   });
                   
                   // Set up layout
                   JPanel panel = new JPanel();
                   panel.setLayout(new BorderLayout());
                   panel.add(instructionsText, BorderLayout.CENTER);
                   panel.add(backButton, BorderLayout.SOUTH);
                   instructionsWindow.add(panel);
                   
                   instructionsWindow.setVisible(true);
                   setVisible(false);
                   
               }
               
              
           }   
       });
       
       
       //add action listners to the buttons 
       quitButton.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {   
               if (e.getSource() == quitButton) 
               {   
                   // Close all windows and exit program
                   dispose();
                   System.exit(0);
               }
               
              
           }   
       });
       }
}