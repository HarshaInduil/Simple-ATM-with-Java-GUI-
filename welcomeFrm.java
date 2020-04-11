import java.awt.EventQueue;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.imageio.ImageIO;
import java.io.*;
class welcomeFrm{

    private JFrame frmWelcome;
    
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcomeFrm window = new welcomeFrm();
					window.frmWelcome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }

    

    public welcomeFrm(){
        frmWelcome = new JFrame();
		frmWelcome.setTitle("Welcome");
		frmWelcome.setBounds(100, 100, 800, 500);
		frmWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmWelcome.getContentPane().setLayout(null);

        JLabel lblwelcomenote = new JLabel("Welcome to SRILANKAN's BANK ATM");
		lblwelcomenote.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblwelcomenote.setForeground(Color.white);
		lblwelcomenote.setBounds(100, 25, 700, 25);
        frmWelcome.getContentPane().add(lblwelcomenote);
        
		JLabel lblcardin = new JLabel("Please Insert Your ATM card");
		lblcardin.setForeground(Color.white);
		lblcardin.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblcardin.setBounds(250, 100, 700, 25);
        frmWelcome.getContentPane().add(lblcardin);


		
        JButton btnNewButton = new JButton("Submit\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(btnNewButton, "Hello");
				pinEnterFrm nwfr = new pinEnterFrm();
				nwfr.setVisible(true);
            }

         });
		btnNewButton.setBounds(650, 350, 150, 50);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setOpaque(true);
        frmWelcome.getContentPane().add(btnNewButton);
        
        JButton btnNewButton2 = new JButton("Exit\r\n");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton2, "Thank You Come Again ! Remove Debit Card");}
				
         });
		btnNewButton2.setBounds(0, 350, 150, 50);
		btnNewButton2.setBackground(Color.YELLOW);
		btnNewButton2.setOpaque(true);
        frmWelcome.getContentPane().add(btnNewButton2);



		JLabel ba2=new JLabel();
		ImageIcon im2=new ImageIcon("resources\\giphy.gif");
		ba2=new JLabel("",im2,JLabel.CENTER);
		ba2.setBounds(0,0,800,500);
		frmWelcome.getContentPane().add(ba2);


		JLabel ba=new JLabel();
		ImageIcon im=new ImageIcon("resources\\grs.jpg");
		ba=new JLabel("",im,JLabel.CENTER);
		ba.setBounds(0,0,800,500);
		frmWelcome.getContentPane().add(ba);
 


        /*JLabel ba=new JLabel();
		ImageIcon im=new ImageIcon("giphy.gif");
		ba=new JLabel("",im,JLabel.CENTER);
		ba.setBounds(0,0,800,500);
		frmWelcome.getContentPane().add(ba);
		*/
    }
}