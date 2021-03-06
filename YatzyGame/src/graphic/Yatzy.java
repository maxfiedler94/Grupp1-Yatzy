package graphic;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import AppPackage.AnimationClass;
import java.awt.event.MouseAdapter;
/**
 * Yatzy class contains the startscreen
 * Tutorial, source: https://www.youtube.com/watch?v=QA8V80WiZ6I
 */

public class Yatzy
{

	public static JFrame frame;
	private JPanel panelChoose;
	private JTextField EnterPlayer21;
	private JTextField EnterPlayer22;
	private JTextField EnterPlayer31;
	private JTextField EnterPlayer32;
	private JTextField EnterPlayer33;
	private JTextField EnterPlayer41;
	private JTextField EnterPlayer42;
	private JTextField EnterPlayer43;
	private JTextField EnterPlayer44;
    private String[] players;
    private JPanel panel;
	JButton btn3PlayerButton = new JButton("");
	JButton btn4PlayerButton = new JButton("");
	JButton btnPlay2Button = new JButton("");
	JButton btnPlay3Button = new JButton("");
	JButton btnPlay4Button = new JButton("");
	JButton rollButton = new JButton("");
	private JPanel panelGame;
	
	
	/**
	 * Makes 3 player choice and 4 player choice slide down 
	 * when 2 player choice is clicked
	 * @param evt
	 */
	public void AnimationSlide(java.awt.event.ActionEvent evt)
	{
		AnimationClass slide = new AnimationClass();
		slide.jTextFieldYDown(235, 263, 18, 1, EnterPlayer21);
		AnimationClass slide2 = new AnimationClass();
		slide2.jTextFieldYDown(235, 298, 8, 1, EnterPlayer22);
		AnimationClass play2 = new AnimationClass();
		play2.jButtonYDown(235, 343, 6, 1, btnPlay2Button);
		AnimationClass button3 = new AnimationClass();
		button3.jButtonYDown(323, 373, 15, 2, btn3PlayerButton);
	}
	/**
	 * Makes 2 player choice slide back 
	 * @param evt
	 */
	public void AnimationSlideBack(java.awt.event.ActionEvent evt)
	{
		AnimationClass slideBack = new AnimationClass();
		slideBack.jTextFieldYUp(263, 235, 5, 1, EnterPlayer21);
		AnimationClass slideBack2 = new AnimationClass();
		slideBack2.jTextFieldYUp(298, 235, 5, 1, EnterPlayer22);
		AnimationClass play2Back = new AnimationClass();
		play2Back.jButtonYUp(343, 235, 5, 1, btnPlay2Button);
		AnimationClass buttonBack3 = new AnimationClass();
		buttonBack3.jButtonYUp(373, 323, 5, 2, btn3PlayerButton);
	}
	
	/**
	 * Makes 3 player choice slide down
	 * @param evt
	 */
	public void AnotherAnimationSlide(java.awt.event.ActionEvent evt)
	{
		AnimationClass slide3 = new AnimationClass();
		slide3.jTextFieldYDown(323, 361, 18, 1, EnterPlayer31);
		AnimationClass slide4 = new AnimationClass();
		slide4.jTextFieldYDown(323, 397, 9, 1, EnterPlayer32);
		AnimationClass slide5 = new AnimationClass();
		slide5.jTextFieldYDown(323, 433, 7, 1, EnterPlayer33);
		AnimationClass play3 = new AnimationClass();
		play3.jButtonYDown(323, 479, 5, 1, btnPlay3Button);
		AnimationClass button4 = new AnimationClass();
		button4.jButtonYDown(409, 512, 6, 1, btn4PlayerButton);
		
	}
	/**
	 * Makes 3 player choice slide back
	 * @param evt
	 */
	public void AnotherAnimationSlideBack(java.awt.event.ActionEvent evt)
	{
		AnimationClass slideBack3 = new AnimationClass();
		slideBack3.jTextFieldYUp(361, 323, 5, 1, EnterPlayer31);
		AnimationClass slideBack4 = new AnimationClass();
		slideBack4.jTextFieldYUp(397, 323, 5, 1, EnterPlayer32);
		AnimationClass slideBack5 = new AnimationClass();
		slideBack5.jTextFieldYUp(433, 323, 5, 1, EnterPlayer33);
		AnimationClass play3Back = new AnimationClass();
		play3Back.jButtonYUp(479, 323, 5, 1, btnPlay3Button);
		AnimationClass button4Back = new AnimationClass();
		button4Back.jButtonYUp(512, 409, 0, 1, btn4PlayerButton);
	}	
	/**
	 * Makes 4 player choice slide down
	 * @param evt
	 */
	public void YetAnotherAnimationSlide(java.awt.event.ActionEvent evt)
	{
		AnimationClass slide6 = new AnimationClass();
		slide6.jTextFieldYDown(409, 440, 20, 1, EnterPlayer41);
		AnimationClass slide7 = new AnimationClass();
		slide7.jTextFieldYDown(409, 476, 10, 1, EnterPlayer42 );
		AnimationClass slide8 = new AnimationClass();
		slide8.jTextFieldYDown(409, 512, 7, 1, EnterPlayer43 );
		AnimationClass slide9 = new AnimationClass();
		slide9.jTextFieldYDown(409, 548, 5, 1, EnterPlayer44 );
		AnimationClass play4 = new AnimationClass();
		play4.jButtonYDown(409, 594, 3, 1, btnPlay4Button);
	}
	/**
	 * Makes 4 player choice slide back
	 * @param evt
	 */
	public void YetAnotherAnimationSlideBack(java.awt.event.ActionEvent evt)
	{
		AnimationClass slideBack6 = new AnimationClass();
		slideBack6.jTextFieldYUp(440, 409, 5, 1, EnterPlayer41);
		AnimationClass slideBack7 = new AnimationClass();
		slideBack7.jTextFieldYUp(476, 409, 5, 1, EnterPlayer42 );
		AnimationClass slideBack8 = new AnimationClass();
		slideBack8.jTextFieldYUp(512, 409, 5, 1, EnterPlayer43 );
		AnimationClass slideBack9 = new AnimationClass();
		slideBack9.jTextFieldYUp(548, 409, 5, 1, EnterPlayer44 );
		AnimationClass play4back = new AnimationClass();
		play4back.jButtonYUp(594, 409, 5, 1, btnPlay4Button);
		
	}
	

	/**
	 * Create the application.
	 */
	public Yatzy() 
	{
		
		initialize();

	}
	

	/**
	 * Initializes the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("Resourses/y6.jpg"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1176,800);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		frame.setVisible(true);
		
		//startpanel
		JPanel panelYatzy = new JPanel();
		frame.getContentPane().add(panelYatzy, "name_989956785704721");
		panelYatzy.setLayout(null);
		// Number of players panel
		panelChoose = new JPanel();
		frame.getContentPane().add(panelChoose, "name_989961417393328");
		panelChoose.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		//Button 2 actionevent
		JButton btn2PlayerButton = new JButton("");
		btn2PlayerButton.setMinimumSize(new Dimension(30, 9));
		btn2PlayerButton.setMaximumSize(new Dimension(35, 9));
		btn2PlayerButton.setBorderPainted(false);
		btn2PlayerButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				AnotherAnimationSlideBack(e);
				EnterPlayer31.setText("ENTER NAME");
				EnterPlayer32.setText("ENTER NAME");
				EnterPlayer33.setText("ENTER NAME");
				EnterPlayer41.setText("ENTER NAME");
				EnterPlayer42.setText("ENTER NAME");
				EnterPlayer43.setText("ENTER NAME");
				EnterPlayer44.setText("ENTER NAME");
				EnterPlayer31.setVisible(false);
				EnterPlayer32.setVisible(false);
				EnterPlayer33.setVisible(false);
				btnPlay3Button.setVisible(false);
				YetAnotherAnimationSlideBack(e);
				EnterPlayer41.setVisible(false);
				EnterPlayer42.setVisible(false);
				EnterPlayer43.setVisible(false);
				EnterPlayer44.setVisible(false);
				btnPlay4Button.setVisible(false);
				EnterPlayer21.setVisible(true);
				EnterPlayer22.setVisible(true);
				btnPlay2Button.setVisible(true);
				AnimationSlide(e);	
			}
		});
		btn2PlayerButton.setPressedIcon(new ImageIcon("Resourses/2Players_Click.jpg"));
		btn2PlayerButton.setRolloverIcon(new ImageIcon("Resourses/2Players_Hover.jpg"));
		btn2PlayerButton.setIcon(new ImageIcon("Resourses/2Players_Default.jpg"));
		btn2PlayerButton.setBounds(442, 235, 285, 25);
		panelChoose.add(btn2PlayerButton);
		//Button 3 action event
		btn3PlayerButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				EnterPlayer21.setText("ENTER NAME");
				EnterPlayer22.setText("ENTER NAME");
				EnterPlayer41.setText("ENTER NAME");
				EnterPlayer42.setText("ENTER NAME");
				EnterPlayer43.setText("ENTER NAME");
				EnterPlayer44.setText("ENTER NAME");
				AnimationSlideBack(e);
				EnterPlayer21.setVisible(false);
				EnterPlayer22.setVisible(false);
				btnPlay2Button.setVisible(false);
				YetAnotherAnimationSlideBack(e);
				EnterPlayer41.setVisible(false);
				EnterPlayer42.setVisible(false);
				EnterPlayer43.setVisible(false);
				EnterPlayer44.setVisible(false);
				btnPlay4Button.setVisible(false);
				EnterPlayer31.setVisible(true);
				EnterPlayer32.setVisible(true);
				EnterPlayer33.setVisible(true);
				btnPlay3Button.setVisible(true);
				AnotherAnimationSlide(e);
			}
		});
		btn3PlayerButton.setBorderPainted(false);
		btn3PlayerButton.setPressedIcon(new ImageIcon("Resourses/3Players_Click.jpg"));
		btn3PlayerButton.setRolloverIcon(new ImageIcon("Resourses/3Players_Hover.jpg"));
		btn3PlayerButton.setIcon(new ImageIcon("Resourses/3Players_Default.jpg"));
		btn3PlayerButton.setBounds(442, 323, 285, 25);
		panelChoose.add(btn3PlayerButton);
		
		//Button 4 action event
		btn4PlayerButton.setBorderPainted(false);
		btn4PlayerButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				EnterPlayer21.setText("ENTER NAME");
				EnterPlayer22.setText("ENTER NAME");
				EnterPlayer31.setText("ENTER NAME");
				EnterPlayer32.setText("ENTER NAME");
				EnterPlayer33.setText("ENTER NAME");
				AnotherAnimationSlideBack(e);
				EnterPlayer31.setVisible(false);
				EnterPlayer32.setVisible(false);
				EnterPlayer33.setVisible(false);
				btnPlay3Button.setVisible(false);
				AnimationSlideBack(e);
				EnterPlayer21.setVisible(false);
				EnterPlayer22.setVisible(false);
				btnPlay2Button.setVisible(false);
				EnterPlayer41.setVisible(true);
				EnterPlayer42.setVisible(true);
				EnterPlayer43.setVisible(true);
				EnterPlayer44.setVisible(true);
				btnPlay4Button.setVisible(true);
				YetAnotherAnimationSlide(e);
				btnPlay4Button.setVisible(true);
			}
		});
		//Button for 4 players
		btn4PlayerButton.setPressedIcon(new ImageIcon("Resourses/4Players_Click.jpg"));
		btn4PlayerButton.setRolloverIcon(new ImageIcon("Resourses/4Players_Hover.jpg"));
		btn4PlayerButton.setIcon(new ImageIcon("Resourses/4Players_Default.jpg"));
		btn4PlayerButton.setBounds(442, 409, 285, 27);
		panelChoose.add(btn4PlayerButton);
		
		
		
		//Play button, 2 players
		btnPlay2Button.setBorderPainted(false);
		btnPlay2Button.setRolloverIcon(new ImageIcon("Resourses/Play_Hover.jpg"));
		btnPlay2Button.setPressedIcon(new ImageIcon("Resourses/Play_Click.jpg"));
		btnPlay2Button.setIcon(new ImageIcon("Resourses/Play_Default.jpg"));
		btnPlay2Button.setBounds(508, 235, 143, 27);
		panelChoose.add(btnPlay2Button);
		btnPlay2Button.setVisible(false);
		
		//Action event play button, 2 players
		btnPlay2Button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				int amountOfplayer = 2;
				players = new String[amountOfplayer];
				
				players[0] = EnterPlayer21.getText();
				players[1] = EnterPlayer22.getText();
				
                GameBoardG g2Board = new GameBoardG(players,amountOfplayer);
                panelChoose.setVisible(false);
				g2Board.iniGUI();
				panelGame = g2Board.getPanelGame();
				panelGame.setVisible(true);
               
                
                
			}
		});
		//Action event play button, 3 players
		btnPlay3Button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				int amountOfplayer = 3;
				players = new String[amountOfplayer];
				
				players[0] = EnterPlayer31.getText();
				players[1] = EnterPlayer32.getText();
				players[2] = EnterPlayer33.getText();
			
				
                GameBoardG gBoard = new GameBoardG(players,amountOfplayer);
                panelChoose.setVisible(false);
				gBoard.iniGUI();
				panelGame = gBoard.getPanelGame();
				panelGame.setVisible(true);

                
			}
		});
		
		//Play button, 3 players
		btnPlay3Button.setBorderPainted(false);
		btnPlay3Button.setRolloverIcon(new ImageIcon("Resourses/Play_Hover.jpg"));
		btnPlay3Button.setPressedIcon(new ImageIcon("Resourses/Play_Click.jpg"));
		btnPlay3Button.setIcon(new ImageIcon("Resourses/Play_Default.jpg"));
		btnPlay3Button.setBounds(508, 323, 143, 27);
		panelChoose.add(btnPlay3Button);
		btnPlay3Button.setVisible(false);
		
		
		btnPlay4Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				int amountOfplayer = 4;
				players = new String[amountOfplayer];
				
				players[0] = EnterPlayer41.getText();
				players[1] = EnterPlayer42.getText();
				players[2] = EnterPlayer43.getText();
				players[3] = EnterPlayer44.getText();
				
                GameBoardG gBoard = new GameBoardG(players,amountOfplayer);
                panelChoose.setVisible(false);
				gBoard.iniGUI();
				panelGame = gBoard.getPanelGame();
				panelGame.setVisible(true);
              
			}
		});
		
		//Play button, 4 players
		btnPlay4Button.setBorderPainted(false);
		btnPlay4Button.setRolloverIcon(new ImageIcon("Resourses/Play_Hover.jpg"));
		btnPlay4Button.setPressedIcon(new ImageIcon("Resourses/Play_Click.jpg"));
		btnPlay4Button.setIcon(new ImageIcon("Resourses/Play_Default.jpg"));
		btnPlay4Button.setBounds(508, 409, 143, 27);
		panelChoose.add(btnPlay4Button);
		btnPlay4Button.setVisible(false);
		
		
		EnterPlayer21 = new JTextField();
		EnterPlayer21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				EnterPlayer21.setText("");
			}
		});
		
		EnterPlayer21.setHorizontalAlignment(SwingConstants.CENTER);
		EnterPlayer21.setForeground(new Color(0, 102, 255));
		EnterPlayer21.setFont(new Font("GAMECUBEN", Font.PLAIN, 18));
		EnterPlayer21.setText("ENTER NAME");
		EnterPlayer21.setBackground(new Color(0, 0, 0));
		EnterPlayer21.setBounds(442, 235, 285, 33);
		panelChoose.add(EnterPlayer21);
		EnterPlayer21.setColumns(10);
		EnterPlayer21.setVisible(false);
		
		EnterPlayer22 = new JTextField();
		EnterPlayer22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				EnterPlayer22.setText("");
			}
		});
		EnterPlayer22.setHorizontalAlignment(SwingConstants.CENTER);
		EnterPlayer22.setText("ENTER NAME");
		EnterPlayer22.setForeground(new Color(0, 102, 255));
		EnterPlayer22.setFont(new Font("GAMECUBEN", Font.PLAIN, 18));
		EnterPlayer22.setDisabledTextColor(Color.BLUE);
		EnterPlayer22.setBackground(new Color(0, 0, 0));
		EnterPlayer22.setBounds(442, 235, 285, 33);
		panelChoose.add(EnterPlayer22);
		EnterPlayer22.setColumns(10);
		EnterPlayer22.setVisible(false);
		
		EnterPlayer31 = new JTextField();
		EnterPlayer31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				EnterPlayer31.setText("");
			}
		});
		EnterPlayer31.setHorizontalAlignment(SwingConstants.CENTER);
		EnterPlayer31.setForeground(new Color(0, 102, 255));
		EnterPlayer31.setText("ENTER NAME");
		EnterPlayer31.setFont(new Font("GAMECUBEN", Font.PLAIN, 18));
		EnterPlayer31.setBackground(new Color(0, 0, 0));
		EnterPlayer31.setBounds(442, 323, 285, 33);
		panelChoose.add(EnterPlayer31);
		EnterPlayer31.setColumns(10);
		EnterPlayer31.setVisible(false);
		
		EnterPlayer32 = new JTextField();
		EnterPlayer32.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				EnterPlayer32.setText("");
			}
		});
		EnterPlayer32.setHorizontalAlignment(SwingConstants.CENTER);
		EnterPlayer32.setForeground(new Color(0, 102, 255));
		EnterPlayer32.setFont(new Font("GAMECUBEN", Font.PLAIN, 18));
		EnterPlayer32.setText("ENTER NAME");
		EnterPlayer32.setBackground(new Color(0, 0, 0));
		EnterPlayer32.setBounds(442, 323, 285, 33);
		panelChoose.add(EnterPlayer32);
		EnterPlayer32.setColumns(10);
		EnterPlayer32.setVisible(false);
		
		EnterPlayer33 = new JTextField();
		EnterPlayer33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				EnterPlayer33.setText("");
			}
		});
		EnterPlayer33.setHorizontalAlignment(SwingConstants.CENTER);
		EnterPlayer33.setForeground(new Color(0, 102, 255));
		EnterPlayer33.setText("ENTER NAME");
		EnterPlayer33.setFont(new Font("GAMECUBEN", Font.PLAIN, 18));
		EnterPlayer33.setBackground(new Color(0, 0, 0));
		EnterPlayer33.setBounds(442, 323, 285, 33);
		panelChoose.add(EnterPlayer33);
		EnterPlayer33.setColumns(10);
		EnterPlayer33.setVisible(false);
		
		EnterPlayer41 = new JTextField();
		EnterPlayer41.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				EnterPlayer41.setText("");
			}
		});
		EnterPlayer41.setHorizontalAlignment(SwingConstants.CENTER);
		EnterPlayer41.setForeground(new Color(0, 102, 255));
		EnterPlayer41.setFont(new Font("GAMECUBEN", Font.PLAIN, 18));
		EnterPlayer41.setText("ENTER NAME");
		EnterPlayer41.setBackground(new Color(0, 0, 0));
		EnterPlayer41.setBounds(442, 409, 285, 33);
		panelChoose.add(EnterPlayer41);
		EnterPlayer41.setColumns(10);
		EnterPlayer41.setVisible(false);
		
		EnterPlayer42 = new JTextField();
		EnterPlayer42.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				EnterPlayer42.setText("");
			}
		});
		EnterPlayer42.setHorizontalAlignment(SwingConstants.CENTER);
		EnterPlayer42.setSelectedTextColor(new Color(0, 0, 0));
		EnterPlayer42.setForeground(new Color(0, 102, 255));
		EnterPlayer42.setText("ENTER NAME");
		EnterPlayer42.setFont(new Font("GAMECUBEN", Font.PLAIN, 18));
		EnterPlayer42.setBackground(new Color(0, 0, 0));
		EnterPlayer42.setBounds(442, 409, 285, 33);
		panelChoose.add(EnterPlayer42);
		EnterPlayer42.setColumns(10);
		EnterPlayer42.setVisible(false);
		
		EnterPlayer43 = new JTextField();
		EnterPlayer43.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				EnterPlayer43.setText("");
			}
		});
		EnterPlayer43.setHorizontalAlignment(SwingConstants.CENTER);
		EnterPlayer43.setForeground(new Color(0, 102, 255));
		EnterPlayer43.setFont(new Font("GAMECUBEN", Font.PLAIN, 18));
		EnterPlayer43.setText("ENTER NAME");
		EnterPlayer43.setBackground(new Color(0, 0, 0));
		EnterPlayer43.setBounds(442, 409, 285, 33);
		panelChoose.add(EnterPlayer43);
		EnterPlayer43.setColumns(10);
		EnterPlayer43.setVisible(false);
		
		EnterPlayer44 = new JTextField();
		EnterPlayer44.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				EnterPlayer44.setText("");
			}
		});
		EnterPlayer44.setHorizontalAlignment(SwingConstants.CENTER);
		EnterPlayer44.setForeground(new Color(0, 102, 255));
		EnterPlayer44.setText("ENTER NAME");
		EnterPlayer44.setFont(new Font("GAMECUBEN", Font.PLAIN, 18));
		EnterPlayer44.setBackground(new Color(0, 0, 0));
		EnterPlayer44.setBounds(442, 409, 285, 33);
		panelChoose.add(EnterPlayer44);
		EnterPlayer44.setColumns(10);
		EnterPlayer44.setVisible(false);
		
		
		//Label for amount of player choice
		JLabel background2 = new JLabel("");
		background2.setIcon(new ImageIcon("Resourses/Choose.jpg"));
		background2.setBounds(0, 0, 1178, 800);
		panelChoose.add(background2);
		
		
	
		//Start button
		JButton btnStartButton = new JButton("");
		btnStartButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				panelYatzy.setVisible(false);
				panelChoose.setVisible(true);
				
			}
		});
		btnStartButton.setBorderPainted(false);
		btnStartButton.setFocusable(false);
		btnStartButton.setBounds(528, 697, 110, 19);
		panelYatzy.add(btnStartButton);
		btnStartButton.setPressedIcon(new ImageIcon("Resourses/Start_Click.jpg"));
		btnStartButton.setRolloverIcon(new ImageIcon("Resourses/Start_Hover.jpg"));
		btnStartButton.setIcon(new ImageIcon("Resourses/StartDefault.jpg"));
		
		//First startscreen
		JLabel background = new JLabel("");
		background.setFocusCycleRoot(true);
		background.setIgnoreRepaint(true);
		background.setFocusTraversalPolicyProvider(true);
		background.setBounds(-9, -12, 1200, 817);
		background.setIcon(new ImageIcon("Resourses/Yatzy.jpg"));
		panelYatzy.add(background);
		
		panel = new JPanel();
		frame.getContentPane().add(panel, "name_148599686377348");
		panel.setLayout(null);
		
	
	}	
	
}	
