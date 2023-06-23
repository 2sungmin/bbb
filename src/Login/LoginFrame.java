package Login;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import UI.*;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class LoginFrame extends JFrame {

   private JPanel contentPane;
   private JTextField tfUsername;
   private JButton loginBtn;
   private JPasswordField tfPassword;

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               LoginFrame frame = new LoginFrame();
               
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   public LoginFrame() {
	  Image img = new ImageIcon("C:/Users/sungm/eclipse-workspace/DBProject/src/Login/cafe.jpeg").getImage();
	  img = img.getScaledInstance(700, 500, Image.SCALE_DEFAULT);
	  ImageIcon icon = new ImageIcon(img);
	  //setBounds(100, 100, 700, 500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(700, 500);
      setLocationRelativeTo(null);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JLabel lblLogin = new JLabel("아이디");
      lblLogin.setBounds(52, 156, 69, 35);
      contentPane.add(lblLogin);
      
      JLabel lblPassword = new JLabel("비밀번호");
      lblPassword.setBounds(52, 201, 69, 35);
      contentPane.add(lblPassword);
      
      tfUsername = new JTextField();
      tfUsername.setBounds(105, 161, 176, 29);
      contentPane.add(tfUsername);
      tfUsername.setColumns(10);
      
      loginBtn = new JButton("로그인");
      loginBtn.setBounds(175, 257, 106, 29);
      contentPane.add(loginBtn);
      loginBtn.addActionListener(event -> {
    	  
    	  String id = "sungmin";
		  String pa = "1234";

		  if(id.equals(tfUsername.getText())&&pa.equals(new String(tfPassword.getPassword()))) {
			  JOptionPane.showMessageDialog(null, "로그인이 완료되었습니다.");
			  MainUI m = new MainUI();
			  dispose();
		  }
          
      });
      

      JLabel lblNewLabel = new JLabel(icon);
      lblNewLabel.setBounds(0, 0, 686, 463);
      contentPane.add(lblNewLabel);
      
      tfPassword = new JPasswordField();
      tfPassword.setBounds(105, 200, 176, 28);
      contentPane.add(tfPassword);
      
      setVisible(true);
      
      //로그인 액션
      
   }
}