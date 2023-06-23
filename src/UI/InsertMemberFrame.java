package UI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import Member.*;

public class InsertMemberFrame extends JFrame {
	private JPanel contentPane;
	private JLabel lblJoin;
	private JButton joinCompleteBtn;
	private JTextField tfName;
	private JTextField tfBirth;
	private JTextField tfGen;
	private JTextField tfPhone;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsertMemberFrame frame = new InsertMemberFrame();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public InsertMemberFrame() {
		//setBounds(100, 100, 700, 500);
		setSize(500, 500);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblJoin = new JLabel("회원가입");
		Font f1 = new Font("돋움", Font.BOLD, 20);
		lblJoin.setFont(f1); 
		lblJoin.setBounds(195, 41, 101, 20);
		contentPane.add(lblJoin);
		
		JLabel lblName = new JLabel("이름");
		lblName.setBounds(115, 121, 69, 20);
		contentPane.add(lblName);
		
		JLabel lblbirth = new JLabel("생년월일");
		lblbirth.setBounds(94, 190, 69, 20);
		contentPane.add(lblbirth);
		
		JLabel lblgender = new JLabel("성별");
		lblgender.setBounds(115, 259, 69, 20);
		contentPane.add(lblgender);
		
		JLabel lblPhone = new JLabel("핸드폰 번호");
		lblPhone.setBounds(78, 332, 69, 20);
		contentPane.add(lblPhone);
		
		tfName = new JTextField();
		tfName.setColumns(10);
		tfName.setBounds(154, 114, 186, 35);
		contentPane.add(tfName);
		
		tfBirth = new JTextField();
		tfBirth.setColumns(10);
		tfBirth.setBounds(154, 183, 186, 35);
		contentPane.add(tfBirth);
		
		tfGen = new JTextField();
		tfGen.setColumns(10);
		tfGen.setBounds(154, 252, 186, 35);
		contentPane.add(tfGen);
		
		joinCompleteBtn = new JButton("회원가입완료");
		joinCompleteBtn.setBounds(179, 384, 139, 29);
		contentPane.add(joinCompleteBtn);
		
		tfPhone = new JTextField();
		tfPhone.setColumns(10);
		tfPhone.setBounds(154, 325, 186, 35);
		contentPane.add(tfPhone);
		
		lblNewLabel = new JLabel("ex) \uB0A8 or \uC5EC");
		lblNewLabel.setBounds(154, 289, 88, 15);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("ex) 생년월일 8자리 ");
		lblNewLabel_1.setBounds(154, 220, 119, 15);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("ex) 010-0000-0000");
		lblNewLabel_2.setBounds(154, 359, 107, 15);
		contentPane.add(lblNewLabel_2);
		

		//회원가입완료 액션
		joinCompleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				MemberDTO dto = new MemberDTO();
				MemberDAO dao = new MemberDAO();
				dto.setName(tfName.getText());
				dto.setBirth(Integer.parseInt(tfBirth.getText()));
				dto.setGen(tfGen.getText());
				dto.setPhone(tfPhone.getText());
				
				int num = dao.RegistrationMember(dto);
				
				if(num == 1) {
					JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "알맞게 작성해 주새요");	
				}
				
				
			}
		});
		setVisible(true);
	}
}
