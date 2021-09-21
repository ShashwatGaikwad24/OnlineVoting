package pages;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.Component;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Mini_proj {
	private String x1;
	private String x2;
	private String x3;
	private String Shivsena;
	private String Manse;
	private String BJP;
	private String Congress;
	private String NCP;
	private String SS;
	private String CP;
	private String MNS;
	private String party;
	private String Vid;
	private String Vname;
	private String mob;
	private String winner;
	private JFrame frame;
	private JPanel Home;
	private JPanel Admin_login;
	private JPanel User_login;
	private JPanel vote_page;
	private JTextField user_field;
	private JTextField mobile_no;
	private JPasswordField pass_field;
	private JTextField Vname_field;
	private JTextField Vid_field;
	private JTextField mobile_field;
	private JTextField shivsena_field;
	private JTextField manse_field;
	private JTextField bjp_field;
	private JTextField rashtravadi_field;
	private JTextField congress_field;
	private JTextField winner_field;
	private JButton U_login_btn;

	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mini_proj window = new Mini_proj();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mini_proj() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 910, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		final JPanel Home = new JPanel();
		Home.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Home.setBackground(Color.LIGHT_GRAY);
		Home.setForeground(Color.DARK_GRAY);
		frame.getContentPane().add(Home, "name_582230608978800");
		Home.setLayout(null);
		Home.setVisible(true);

		final JPanel Admin_login = new JPanel();
		Admin_login.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(Admin_login, "name_582235062878600");
		Admin_login.setVisible(false);

		final JPanel User_login = new JPanel();
		User_login.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(User_login, "name_582275516393000");
		User_login.setLayout(null);
		User_login.setVisible(false);

		final JPanel admin_menu = new JPanel();
		admin_menu.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(admin_menu, "name_587244558266100");
		admin_menu.setLayout(null);
		admin_menu.setVisible(false);

		final JPanel Final_result = new JPanel();
		Final_result.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(Final_result, "name_587546413510400");
		Final_result.setLayout(null);
		Final_result.setVisible(false);

		final JPanel vote_page = new JPanel();
		vote_page.setBackground(Color.LIGHT_GRAY);
		vote_page.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
			}
		});
		frame.getContentPane().add(vote_page, "name_600339086604500");
		vote_page.setLayout(null);
		vote_page.setVisible(false);

		JButton Admin_btn = new JButton("Admin Login");
		Admin_btn.setBorder(null);
		Admin_btn.setAlignmentX(Component.CENTER_ALIGNMENT);
		Admin_btn.setFont(new Font("Verdana", Font.BOLD, 16));
		Admin_btn.setBackground(Color.CYAN);
		Admin_btn.setForeground(Color.BLACK);
		Admin_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_login.setVisible(true);
				Home.setVisible(false);
			}
		});
		Admin_btn.setBounds(313, 218, 250, 57);
		Home.add(Admin_btn);

		JButton User_btn = new JButton("User Login");
		User_btn.setBorder(null);
		User_btn.setAlignmentX(Component.CENTER_ALIGNMENT);
		User_btn.setBackground(Color.CYAN);
		User_btn.setFont(new Font("Verdana", Font.BOLD, 16));
		User_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				User_login.setVisible(true);
				Home.setVisible(false);
			}
		});
		User_btn.setBounds(313, 346, 250, 57);
		Home.add(User_btn);
		
		JLabel Topic_1 = new JLabel("Voting System For Local Elections");
		Topic_1.setHorizontalAlignment(SwingConstants.CENTER);
		Topic_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		Topic_1.setBounds(186, 45, 527, 89);
		Home.add(Topic_1);
		
		JLabel bg_img_1 = new JLabel("New label");
		bg_img_1.setIcon(new ImageIcon("C:\\Users\\Admin\\OneDrive\\Pictures\\Screenshots\\vote_4.jpg"));
		bg_img_1.setBounds(0, 0, 896, 583);
		Home.add(bg_img_1);
		Admin_login.setLayout(null);

		user_field = new JTextField();
		user_field.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		user_field.setBounds(409, 213, 176, 28);
		Admin_login.add(user_field);
		user_field.setColumns(10);

		pass_field = new JPasswordField();
		pass_field.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		pass_field.setBounds(409, 286, 176, 28);
		Admin_login.add(pass_field);
		pass_field.setColumns(10);

		JButton A_login_btn = new JButton("Login");
		A_login_btn.setBackground(Color.CYAN);
		A_login_btn.setBorder(null);
		A_login_btn.setFont(new Font("Tahoma", Font.BOLD, 15));
		A_login_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {

				String uname = user_field.getText();
				String pass = pass_field.getText();

				if (uname.equals("admin") && pass.equals("admin123")) {
					Admin_login.setVisible(false);
					admin_menu.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(A_login_btn, "Invalid User");
					user_field.setText("");
					pass_field.setText("");
				}

			}
		});
		A_login_btn.setBounds(360, 365, 108, 36);
		Admin_login.add(A_login_btn);

		JLabel User_name = new JLabel("Username :");
		User_name.setFont(new Font("Verdana", Font.BOLD, 15));
		User_name.setBounds(258, 212, 141, 29);
		Admin_login.add(User_name);

		JLabel Pass_word = new JLabel("Password :");
		Pass_word.setFont(new Font("Verdana", Font.BOLD, 15));
		Pass_word.setBounds(258, 289, 123, 22);
		Admin_login.add(Pass_word);

		JButton admin_home = new JButton("Back");
		admin_home.setBorder(null);
		admin_home.setBackground(Color.CYAN);
		admin_home.setFont(new Font("Tahoma", Font.BOLD, 15));
		admin_home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_login.setVisible(false);
				Home.setVisible(true);
				user_field.setText("");
				pass_field.setText("");
			}
		});
		admin_home.setBounds(488, 365, 108, 36);
		Admin_login.add(admin_home);
		
		JLabel Topic_2 = new JLabel("Voting System For Local Elections");
		Topic_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		Topic_2.setHorizontalAlignment(SwingConstants.CENTER);
		Topic_2.setBounds(229, 54, 537, 74);
		Admin_login.add(Topic_2);
		
		JLabel bg_img_2 = new JLabel("New label");
		bg_img_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		bg_img_2.setIcon(new ImageIcon("C:\\Users\\Admin\\OneDrive\\Pictures\\Screenshots\\vote_4.jpg"));
		bg_img_2.setBounds(0, 0, 896, 583);
		Admin_login.add(bg_img_2);

		JTextField Vname_field = new JTextField(30);
		Vname_field.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Vname_field.setBounds(458, 204, 203, 35);
		User_login.add(Vname_field);
		Vname_field.setColumns(10);

		JTextField Vid_field = new JTextField(8);
		Vid_field.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Vid_field.setBounds(458, 271, 203, 35);
		User_login.add(Vid_field);
		Vid_field.setColumns(10);

		JTextField mobile_field = new JTextField(10);
		mobile_field.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		mobile_field.setBounds(458, 342, 203, 35);
		User_login.add(mobile_field);
		mobile_field.setColumns(10);

		System.out.println(x3);

		JLabel voter_name = new JLabel("Voter Name :");
		voter_name.setFont(new Font("Verdana", Font.BOLD, 15));
		voter_name.setBounds(228, 203, 138, 32);
		User_login.add(voter_name);

		JLabel voter_id = new JLabel("Voter ID :");
		voter_id.setFont(new Font("Verdana", Font.BOLD, 15));
		voter_id.setBounds(228, 270, 111, 32);
		User_login.add(voter_id);

		JLabel mobile_no = new JLabel("Mobile No :");
		mobile_no.setFont(new Font("Verdana", Font.BOLD, 15));
		mobile_no.setBounds(228, 345, 111, 32);
		User_login.add(mobile_no);

		JButton U_login_btn = new JButton("Login");
		U_login_btn.setBackground(Color.CYAN);
		U_login_btn.setBorder(null);
		U_login_btn.setFont(new Font("Tahoma", Font.BOLD, 15));
		U_login_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				boolean empty = false;

				Vid = Vid_field.getText();
				Vname = Vname_field.getText();
				mob = mobile_field.getText();			
				if (Vid_field.getText().trim().isEmpty() || Vname_field.getText().trim().isEmpty()
						|| mobile_field.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(U_login_btn, "Please Fill All Details");
					Vname_field.setText("");
					Vid_field.setText("");
					mobile_field.setText("");
					System.out.println("Invalid User");
				} else {
					try {

						// STEP 2: Register JDBC driver
						Class.forName(JDBC_DRIVER);
						// STEP 3: Open a connection
						System.out.println("Connecting to database...");
						conn = DriverManager.getConnection(DB_URL, USER, PASS);
						// STEP 4: Execute a query
						System.out.println("Executing a query");
						stmt = conn.createStatement();
						ResultSet ed = stmt.executeQuery("select * from vote_count where voting_id='" + Vid + "'");
						ed.next();
						String ID1 = ed.getString("status");
						String ID2 = ed.getString("voting_id");
						String ID3 = ed.getString("voters_name");
						String ID4 = ed.getString("mobile_no");
						String nu = null;
						if (Vid.equals(ID2) && Vname.equals(ID3) && mob.equals(ID4) && ID1 == nu) {
							User_login.setVisible(false);
							vote_page.setVisible(true);
							System.out.println("Login Successful");
							System.out.println("Query executed successfully...!!");
							stmt.close();
							conn.close();  }
						
					/*	else if ((Vid.equals(ID2) && (Vname != (ID3) || mob != (ID4)))) {
							JOptionPane.showMessageDialog(U_login_btn,"Please Fill All Details Correctly");
							Vname_field.setText("");
						    Vid_field.setText(""); 
						    mobile_field.setText(""); 
						}*/
						else {
							JOptionPane.showMessageDialog(U_login_btn,"Already Voted");
							System.out.println("Query executed successfully...!!");
							Vname_field.setText("");
						    Vid_field.setText(""); 
						    mobile_field.setText(""); }
						
					}
					catch (Exception e) {
						JOptionPane.showMessageDialog(U_login_btn,"Please Fill All Details Correctly");
						//System.err.println(e.getClass().getName() + ": " + e.getMessage());
						//System.exit(0);
						Vname_field.setText("");
					    Vid_field.setText(""); 
					    mobile_field.setText("");
						
					}
				}
			}

		});
		U_login_btn.setBounds(318, 434, 106, 35);
		User_login.add(U_login_btn);

		JButton user_home = new JButton("Back");
		user_home.setBackground(Color.CYAN);
		user_home.setBorder(null);
		user_home.setFont(new Font("Tahoma", Font.BOLD, 15));
		user_home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				User_login.setVisible(false);
				Home.setVisible(true);
				Vname_field.setText("");
				Vid_field.setText("");
				mobile_field.setText("");
			}
		});
		user_home.setBounds(463, 434, 106, 35);
		User_login.add(user_home);
		
		JLabel Topic_3 = new JLabel("Voting System For Local Elections");
		Topic_3.setHorizontalAlignment(SwingConstants.CENTER);
		Topic_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		Topic_3.setBounds(210, 63, 518, 91);
		User_login.add(Topic_3);
		
		JLabel bg_img_3 = new JLabel("New label");
		bg_img_3.setIcon(new ImageIcon("C:\\Users\\Admin\\OneDrive\\Pictures\\Screenshots\\vote_4.jpg"));
		bg_img_3.setBounds(0, 0, 896, 583);
		User_login.add(bg_img_3);

		JButton result_btn = new JButton("View Result");
		result_btn.setBackground(Color.CYAN);
		result_btn.setBorder(null);
		result_btn.setFont(new Font("Verdana", Font.BOLD, 15));
		result_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin_menu.setVisible(false);
				Final_result.setVisible(true);
			}
		});
		result_btn.setBounds(355, 247, 170, 47);
		admin_menu.add(result_btn);

		JButton admin_menu_back_btn = new JButton("Back");
		admin_menu_back_btn.setBackground(Color.CYAN);
		admin_menu_back_btn.setBorder(null);
		admin_menu_back_btn.setFont(new Font("Verdana", Font.BOLD, 15));
		admin_menu_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin_menu.setVisible(false);
				Admin_login.setVisible(true);
				user_field.setText("");
				pass_field.setText("");

			}
		});
		admin_menu_back_btn.setBounds(355, 366, 170, 47);
		admin_menu.add(admin_menu_back_btn);
		
		JLabel Topic_6 = new JLabel("Voting System For Local Elections");
		Topic_6.setFont(new Font("Tahoma", Font.BOLD, 30));
		Topic_6.setHorizontalAlignment(SwingConstants.CENTER);
		Topic_6.setBounds(195, 65, 523, 96);
		admin_menu.add(Topic_6);
		
		JLabel bg_img_4 = new JLabel("New label");
		bg_img_4.setIcon(new ImageIcon("C:\\Users\\Admin\\OneDrive\\Pictures\\Screenshots\\vote_4.jpg"));
		bg_img_4.setBounds(0, 0, 896, 583);
		admin_menu.add(bg_img_4);

		JLabel lblShivsena = new JLabel("Shivsena");
		lblShivsena.setFont(new Font("Verdana", Font.BOLD, 15));
		lblShivsena.setBounds(145, 171, 165, 31);
		Final_result.add(lblShivsena);

		JLabel lblBjp = new JLabel("BJP");
		lblBjp.setFont(new Font("Verdana", Font.BOLD, 15));
		lblBjp.setBounds(145, 297, 165, 31);
		Final_result.add(lblBjp);

		JLabel lblManse = new JLabel("Manse");
		lblManse.setFont(new Font("Verdana", Font.BOLD, 15));
		lblManse.setBounds(145, 234, 165, 31);
		Final_result.add(lblManse);

		JLabel lblNCP = new JLabel("NCP");
		lblNCP.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNCP.setBounds(145, 361, 165, 31);
		Final_result.add(lblNCP);

		JLabel lblCongress = new JLabel("Congress");
		lblCongress.setFont(new Font("Verdana", Font.BOLD, 15));
		lblCongress.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblCongress.setBounds(145, 422, 165, 31);
		Final_result.add(lblCongress);

		shivsena_field = new JTextField();
		shivsena_field.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		shivsena_field.setBounds(402, 173, 116, 31);
		Final_result.add(shivsena_field);
		shivsena_field.setColumns(10);

		manse_field = new JTextField();
		manse_field.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		manse_field.setColumns(10);
		manse_field.setBounds(402, 237, 116, 30);
		Final_result.add(manse_field);

		bjp_field = new JTextField();
		bjp_field.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		bjp_field.setColumns(10);
		bjp_field.setBounds(402, 300, 116, 30);
		Final_result.add(bjp_field);

		rashtravadi_field = new JTextField();
		rashtravadi_field.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		rashtravadi_field.setColumns(10);
		rashtravadi_field.setBounds(402, 364, 116, 30);
		Final_result.add(rashtravadi_field);

		congress_field = new JTextField();
		congress_field.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		congress_field.setColumns(10);
		congress_field.setBounds(402, 425, 116, 30);
		Final_result.add(congress_field);

		JLabel lblNewLabel = new JLabel("The Party Obtained Maximum Votes :");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel.setBounds(57, 111, 323, 31);
		Final_result.add(lblNewLabel);

		winner_field = new JTextField();
		winner_field.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		winner_field.setBounds(402, 113, 194, 31);
		Final_result.add(winner_field);
		winner_field.setColumns(10);

		JButton result_back_btn = new JButton("Back");
		result_back_btn.setBackground(Color.CYAN);
		result_back_btn.setBorder(null);
		result_back_btn.setFont(new Font("Verdana", Font.BOLD, 15));
		result_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				winner_field.setText("");
				shivsena_field.setText("");
				manse_field.setText("");
				bjp_field.setText("");
				rashtravadi_field.setText("");
				congress_field.setText("");

				Final_result.setVisible(false);
				admin_menu.setVisible(true);
			}
		});
		result_back_btn.setBounds(445, 494, 151, 38);
		Final_result.add(result_back_btn);

		JButton current_score_btn = new JButton("Current Score");
		current_score_btn.setBackground(Color.CYAN);
		current_score_btn.setBorder(null);
		current_score_btn.setFont(new Font("Verdana", Font.BOLD, 15));
		current_score_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					// STEP 2: Register JDBC driver
					Class.forName(JDBC_DRIVER);
					// STEP 3: Open a connection
					System.out.println("Connecting to database...");
					conn = DriverManager.getConnection(DB_URL, USER, PASS);
					// STEP 4: Execute a query
					System.out.println("Executing a query");
					stmt = conn.createStatement();
					ResultSet A = stmt
							.executeQuery("select count(*) as count from vote_count where voted_to='SS'");
					A.next();
					Shivsena = A.getString("count");
					shivsena_field.setText(Shivsena);
					ResultSet B = stmt.executeQuery("select count(*) as count from vote_count where voted_to='MNS'");
					B.next();
					Manse = B.getString("count");
					manse_field.setText(Manse);
					ResultSet C = stmt.executeQuery("select count(*) as count from vote_count where voted_to='BJP'");
					C.next();
					BJP = C.getString("count");
					bjp_field.setText(BJP);
					ResultSet D = stmt.executeQuery("select count(*) as count from vote_count where voted_to='NCP'");
					D.next();
					NCP = D.getString("count");
					rashtravadi_field.setText(NCP);
					ResultSet E = stmt
							.executeQuery("select count(*) as count from vote_count where voted_to='CP'");
					E.next();
					Congress = E.getString("count");
					congress_field.setText(Congress);
					int F = stmt.executeUpdate(
							"create table max_vote as select voted_to, count(*) from vote_count where voted_to is not null group by voted_to;");
					ResultSet G = stmt
							.executeQuery("SELECT * FROM max_vote WHERE count = ( SELECT MAX (count) FROM max_vote);");
					G.next();
					winner = G.getString("voted_to");
					winner_field.setText(winner);
					int H = stmt.executeUpdate("drop table max_vote");

					System.out.println("Query executed successfully...!!" + Manse);
					stmt.close();
					conn.close();
				} catch (Exception e1) {
					System.err.println(e1.getClass().getName() + ": " + e1.getMessage());
					System.exit(0);
				}
				System.out.println(Manse);

				bjp_field.setText(BJP);
				rashtravadi_field.setText(NCP);
				congress_field.setText(Congress);
			}
		});
		current_score_btn.setBounds(197, 494, 151, 38);
		Final_result.add(current_score_btn);
		
		JLabel Topic_4 = new JLabel("Voting System For Local Elections");
		Topic_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		Topic_4.setHorizontalAlignment(SwingConstants.CENTER);
		Topic_4.setBounds(213, 38, 526, 63);
		Final_result.add(Topic_4);
		
		JLabel bg_img_5 = new JLabel("New label");
		bg_img_5.setIcon(new ImageIcon("C:\\Users\\Admin\\OneDrive\\Pictures\\Screenshots\\vote_4.jpg"));
		bg_img_5.setBounds(0, 0, 896, 583);
		Final_result.add(bg_img_5);

		JLabel lblSelectTheParty = new JLabel("Select the Party");
		lblSelectTheParty.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectTheParty.setFont(new Font("Verdana", Font.BOLD, 16));
		lblSelectTheParty.setBounds(253, 98, 405, 54);
		vote_page.add(lblSelectTheParty);

		JRadioButton rdbtnshivsena = new JRadioButton("Shivsena");
		rdbtnshivsena.setFont(new Font("Verdana", Font.BOLD, 13));
		buttonGroup.add(rdbtnshivsena);
		rdbtnshivsena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				party = "SS";
			}
		});
		rdbtnshivsena.setBounds(388, 173, 127, 25);
		vote_page.add(rdbtnshivsena);

		JRadioButton rdbtnmanse = new JRadioButton("Manse");
		rdbtnmanse.setFont(new Font("Verdana", Font.BOLD, 13));
		buttonGroup.add(rdbtnmanse);
		rdbtnmanse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				party = "MNS";
			}
		});
		rdbtnmanse.setBounds(388, 226, 127, 25);
		vote_page.add(rdbtnmanse);

		JRadioButton rdbtnbjp = new JRadioButton("BJP");
		rdbtnbjp.setFont(new Font("Verdana", Font.BOLD, 13));
		rdbtnbjp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				party = "BJP";
			}
		});
		buttonGroup.add(rdbtnbjp);
		rdbtnbjp.setBounds(388, 286, 127, 25);
		vote_page.add(rdbtnbjp);

		JRadioButton rdbtnNCP = new JRadioButton("NCP");
		rdbtnNCP.setFont(new Font("Verdana", Font.BOLD, 13));
		rdbtnNCP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				party = "NCP";
			}
		});
		buttonGroup.add(rdbtnNCP);
		rdbtnNCP.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
			}
		});
		rdbtnNCP.setBounds(388, 348, 127, 25);
		vote_page.add(rdbtnNCP);

		JRadioButton rdbtncongress = new JRadioButton("Congress");
		rdbtncongress.setFont(new Font("Verdana", Font.BOLD, 13));
		rdbtncongress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				party = "CP";
			}
		});
		buttonGroup.add(rdbtncongress);
		rdbtncongress.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
			}
		});
		rdbtncongress.setBounds(388, 406, 127, 25);
		vote_page.add(rdbtncongress);

		JButton btnvote = new JButton("Vote");
		btnvote.setBackground(Color.CYAN);
		btnvote.setBorder(null);
		btnvote.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnvote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getActionCommand().equals("Vote")) {
					// System.out.println("Selected Radio Button: " +
					// buttonGroup.getSelection().getActionCommand());
					System.out.println("Selected Radio Button: " + party);
					System.out.println("Selected Radio Button: " + Vid);
					JOptionPane.showMessageDialog(btnvote, "Voted Successfully");
					vote_page.setVisible(false);
					Home.setVisible(true);
					/*
					 * rdbtnshivsena.setActionCommand(SS); rdbtnmanse.setActionCommand(MNS);
					 * rdbtnbjp.setActionCommand(BJP); rdbtnNCP.setActionCommand(NCP);
					 * rdbtncongress.setActionCommand(CP);
					 * System.out.println("Selected Radio Button: " +
					 * buttonGroup.getSelection().getActionCommand());
					 */

					try {

						// STEP 2: Register JDBC driver
						Class.forName(JDBC_DRIVER);
						// STEP 3: Open a connection
						System.out.println("Connecting to database...");
						conn = DriverManager.getConnection(DB_URL, USER, PASS);
						// STEP 4: Execute a query
						System.out.println("Executing a query");
						stmt = conn.createStatement();
						// ResultSet vte = stmt.executeQuery("UPDATE vote_count SET voted_to = '"+ party
						// +"' WHERE voting_id='"+ Vid +"';");
						int vte = stmt.executeUpdate(
								"UPDATE vote_count SET voted_to = '" + party + "' WHERE voting_id='" + Vid + "';");
						int sts = stmt
								.executeUpdate("UPDATE vote_count SET status = ' Y' WHERE voting_id='" + Vid + "';");
						System.out.println("Query executed successfully...!!");
						Vname_field.setText("");
						Vid_field.setText("");
						mobile_field.setText("");
						stmt.close();
						conn.close();
					} catch (Exception e) {
						System.err.println(e.getClass().getName() + ": " + e.getMessage());
						System.exit(0);
					}
				}
			}
		});
		btnvote.setBounds(399, 456, 106, 37);
		vote_page.add(btnvote);
		
		JLabel Topic_5 = new JLabel("Voting System For Local Elections");
		Topic_5.setHorizontalAlignment(SwingConstants.CENTER);
		Topic_5.setFont(new Font("Tahoma", Font.BOLD, 30));
		Topic_5.setBounds(204, 33, 528, 69);
		vote_page.add(Topic_5);
		
		JLabel bg_img_6 = new JLabel("New label");
		bg_img_6.setIcon(new ImageIcon("C:\\Users\\Admin\\OneDrive\\Pictures\\Screenshots\\vote_4.jpg"));
		bg_img_6.setBounds(0, 0, 896, 583);
		vote_page.add(bg_img_6);

	}

	// ----
	static final String JDBC_DRIVER = "org.postgresql.Driver";
	static final String DB_URL = "jdbc:postgresql://localhost/voters_details";
	// Database credentials
	static final String USER = "postgres";
	static final String PASS = "1756";

	public Connection conn = null;
	public Statement stmt = null;
}
