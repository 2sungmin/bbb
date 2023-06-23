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

import Member.MemberDAO;
import Member.MemberDTO;

public class ModifiyMemberFrame extends JFrame {
	private JPanel contentPane;
	private JLabel lblJoin;
	private JButton joinCompleteBtn;
	private JTextField tfName;
	private JTextField tfGen;
	private JTextField tfPhone;
	private MemberDTO dto;
	private JTextField tfBirth;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifiyMemberFrame frame = new ModifiyMemberFrame(null);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ModifiyMemberFrame(MemberDTO dto) {
		this.dto = dto;
		//setBounds(100, 100, 700, 500);
		setSize(500, 500);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblJoin = new JLabel(Integer.toString(dto.getId())+"��");
		Font f1 = new Font("����", Font.BOLD, 20);
		lblJoin.setFont(f1); 
		lblJoin.setBounds(195, 38, 101, 20);
		contentPane.add(lblJoin);
		
		JLabel lblName = new JLabel("�̸�");
		lblName.setBounds(127, 118, 69, 20);
		contentPane.add(lblName);
		
		JLabel lblbirth = new JLabel("�������");
		lblbirth.setBounds(100, 181, 69, 20);
		contentPane.add(lblbirth);
		
		JLabel lblgender = new JLabel("����");
		lblgender.setBounds(127, 245, 69, 20);
		contentPane.add(lblgender);
		
		JLabel lblPhone = new JLabel("�ڵ��� ��ȣ");
		lblPhone.setBounds(100, 311, 69, 20);
		contentPane.add(lblPhone);
		
		tfName = new JTextField(dto.getName());
		tfName.setColumns(10);
		tfName.setBounds(169, 111, 186, 35);
		contentPane.add(tfName);
		
		tfGen = new JTextField(dto.getGen());
		tfGen.setColumns(10);
		tfGen.setBounds(169, 238, 186, 35);
		contentPane.add(tfGen);
		
		joinCompleteBtn = new JButton("����");
		joinCompleteBtn.setBounds(216, 373, 139, 29);
		contentPane.add(joinCompleteBtn);
		joinCompleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MemberDAO dao = new MemberDAO();
				dto.setName(tfName.getText());
				dto.setBirth(Integer.parseInt(tfBirth.getText()));
				dto.setGen(tfGen.getText());
				dto.setPhone(tfPhone.getText());
				
				dao.UpdateMember(dto);
				
				JOptionPane.showMessageDialog(null, "ȸ�������� �Ϸ�Ǿ����ϴ�.");
				dispose();
			}
		});
		
		tfPhone = new JTextField(dto.getPhone());
		tfPhone.setColumns(10);
		tfPhone.setBounds(169, 304, 186, 35);
		contentPane.add(tfPhone);
		
		tfBirth = new JTextField(Integer.toString(dto.getBirth()));
		tfBirth.setColumns(10);
		tfBirth.setBounds(169, 174, 186, 35);
		contentPane.add(tfBirth);
		
		setVisible(true);
		
	}
}
