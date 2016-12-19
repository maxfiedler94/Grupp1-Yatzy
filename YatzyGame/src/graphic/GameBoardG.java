package graphic;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import com.jensen.model.Dice;
import com.jensen.model.SetScoreByYahtzeeRules;
/**
 * 
 * GboardG contains the gameboard and player
 */
public class GameBoardG implements MouseListener, ConstantForYatzyGame
{
	private DefaultTableModel tableModel;
	private int playerCount = 1;
	private int currentPlayer = 1;
	private int playerAmount;
	private String[][] data1;
	private String[] col;
	private static final int SIZE =5;
	private com.jensen.model.Dice[] diceArray = new Dice[SIZE];
	private int[] diceValueHolder = new int [SIZE];
	private int value;
	JButton rollButton = new JButton("");
	private JPanel panelGame;
	private JButton diceButton[] = new JButton[SIZE];
	private JButton dice1Button;
	private JButton dice2Button;
	private JButton dice3Button;
	private JButton dice4Button;
	private JButton dice5Button;
	private JTable table;
	private JFrame devFrame;
	private JTextField textField;
	private String[] playerName;
	private JPanel panel;
	private String getCurrentPlayer = "";
	private JButton exitButton;
	int playerTableCounter = 0;
	
	
	private JCheckBox checkBox,checkBox2,checkBox3,checkBox4,checkBox5;
	int counter = 0;
	
	/**
	 * @wbp.parser.constructor
	 * Constructor
	 */
	public GameBoardG(String[] players, int playerCount)
	{
		panelGame = new JPanel();
		playerAmount = playerCount;
		playerName = new String[playerAmount];
		
		checkBox = new JCheckBox();
		checkBox2 = new JCheckBox();
		checkBox3 = new JCheckBox();
		checkBox4 = new JCheckBox();
		checkBox5 = new JCheckBox();
		
		for(int i = 0; i < playerAmount;i++)
		{
			playerName[i] = players[i];
		}		
	}
	/**
	 * Initializes the gameboard along with the graphics
	 */
	void iniGUI()
	{
		
		panelGame.setBackground(Color.BLACK);

		panelGame.setLayout(null);
		
		rollButton.setPressedIcon(new ImageIcon("Resourses/RollClick.jpg"));
		rollButton.setDisabledIcon(new ImageIcon("Resourses/rolldisable.jpg"));
		rollButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rollButton.setFocusPainted(false);
		rollButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				if(e.getSource()==rollButton)
				{
					
					for(int i = 0; i<diceButton.length;i++)
					{
						if(checkBox.isSelected())
						{
							if(i == 0)
							{
								continue;
							}
							
						}
						if(checkBox2.isSelected())
						{
							if(i == 1)
							{
								continue;
							}
							
						}
						if(checkBox3.isSelected())
						{
							if(i == 2)
							{
								continue;
							}
							
						}
						if(checkBox4.isSelected())
						{
							if(i == 3)
							{
								continue;
							}
							
						}
						if(checkBox5.isSelected())
						{
							if(i == 4)
							{
								continue;
							}
							
						}
						
						diceArray[i] = new Dice();
						rollButtonDice(i);
					}
					
					table.setEnabled(true);
					
					
				}
				
				if(counter == 2)
				{
					rollButton.setEnabled(false);
				}	
				counter++;
				
				//Changes player
				for(currentPlayer = 1; currentPlayer <= playerAmount; currentPlayer++ )
				{
					if(currentPlayer == playerCount)
					{
						currentPlayer = playerCount;
						
						
						break;
					}
				}
				
				
				
			}
		});
		
		createBoard();
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("GAMECUBEN", Font.PLAIN, 18));
		textField.setForeground(new Color(0, 0, 255));
		textField.setBackground(Color.BLACK);
		textField.setEnabled(false);
		textField.setBounds(480, 510, 350, 58);
		panelGame.add(textField);
		textField.setColumns(10); 
		panel = new JPanel();
		JPanel panel1 = new JPanel();
		
		
		rollButton.setIcon(new ImageIcon("Resourses/RollDefault.jpg"));
		rollButton.setBorderPainted(false);
		rollButton.setBounds(80, 32, 115, 50);
		panelGame.add(rollButton);
		
		dice1Button = new JButton();
		dice1Button.setBorderPainted(false);
		dice1Button.setIcon(new ImageIcon("Resourses/diceQ.jpg"));
		dice1Button.setBounds(84, 130, 100, 100);
		panelGame.add(dice1Button);
		
		
		dice2Button = new JButton();
		dice2Button.setBorderPainted(false);
		dice2Button.setIcon(new ImageIcon("Resourses/diceQ.jpg"));
		dice2Button.setBounds(84, 243, 100, 100);
		panelGame.add(dice2Button);
		
		dice3Button = new JButton();
		dice3Button.setBorderPainted(false);
		dice3Button.setIcon(new ImageIcon("Resourses/diceQ.jpg"));
		dice3Button.setBounds(84, 356, 100, 100);
		panelGame.add(dice3Button);
		
		dice4Button = new JButton();
		dice4Button.setBorderPainted(false);
		dice4Button.setIcon(new ImageIcon("Resourses/diceQ.jpg"));
		dice4Button.setBounds(84, 469, 100, 100);
		panelGame.add(dice4Button);
		
		dice5Button = new JButton();
		dice5Button.setBorderPainted(false);
		dice5Button.setIcon(new ImageIcon("Resourses/diceQ.jpg"));
		dice5Button.setBounds(84, 582, 100, 100);
		panelGame.add(dice5Button);
		
		diceButton[0] = dice1Button;
		diceButton[1] = dice2Button;
		diceButton[2] = dice3Button;
		diceButton[3] = dice4Button;
		diceButton[4] = dice5Button;
		
		checkBox = new JCheckBox("");
		checkBox.setBackground(Color.BLACK);
		checkBox.setBounds(196, 168, 25, 25);
		panelGame.add(checkBox);
		
		checkBox2 = new JCheckBox("");
		checkBox2.setBackground(Color.BLACK);
		checkBox2.setBounds(196, 280, 25, 25);
		panelGame.add(checkBox2);
		
		checkBox3 = new JCheckBox("");
		checkBox3.setBackground(Color.BLACK);
		checkBox3.setBounds(196, 395, 25, 25);
		panelGame.add(checkBox3);
		
		checkBox4 = new JCheckBox("");
		checkBox4.setBackground(Color.BLACK);
		checkBox4.setBounds(196, 507, 25, 25);
		panelGame.add(checkBox4);
		
		checkBox5 = new JCheckBox("");
		checkBox5.setBackground(Color.BLACK);
		checkBox5.setBounds(196, 622, 25, 25);
		panelGame.add(checkBox5);
		
		setCheckBoxToFalse();
		
		//Button for developer
		JButton devTeamButton = new JButton("");
		devTeamButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		devTeamButton.setBorderPainted(false);
		devTeamButton.setPressedIcon(new ImageIcon("Resourses/devClick.jpg"));
		devTeamButton.setIcon(new ImageIcon("Resourses/devDefault.jpg"));
		devTeamButton.setBounds(1051, 237, 80, 80);
		panelGame.add(devTeamButton);
		devTeamButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				devFrame.setVisible(true);
			}
		});
		devFrame = new JFrame();
		devFrame.setResizable(false);
		devFrame.setIconImage(Toolkit.getDefaultToolkit().getImage("Resourses/y6.jpg"));
		devFrame.setBounds(100, 100, 500, 500);
		devFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		devFrame.setSize(500,328);
		devFrame.getContentPane().setLayout(new CardLayout(0, 0));
		devFrame.setVisible(false);
		JPanel panelDev = new JPanel();
		devFrame.getContentPane().add(panelDev, "name_989956785704721");
		panelDev.setLayout(null);
		devFrame.setLocationRelativeTo(null);
		
		JLabel background3 = new JLabel("");
		background3.setIcon(new ImageIcon("Resourses/devs.jpg"));
		background3.setBounds(0, 0, 500, 300);
		panelDev.add(background3);
		devTeamButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				devFrame.setVisible(true);
			}
		});
		
		
		
		showCurrentPlayer(playerCount);
		
		JButton infoButton = new JButton("");
		infoButton.setBorderPainted(false);
		infoButton.setPressedIcon(new ImageIcon("Resourses/infoClick.jpg"));
		infoButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		infoButton.setIcon(new ImageIcon("Resourses/infoDefault.jpg"));
		infoButton.setBounds(1051, 109, 80, 80);
		panelGame.add(infoButton);
		JFrame infoFrame = new JFrame();
		infoFrame.setResizable(false);
		infoFrame.setIconImage(Toolkit.getDefaultToolkit().getImage("Resourses/y6.jpg"));
		infoFrame.setBounds(100, 100, 450, 300);
		infoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		infoFrame.setSize(800,935);
		infoFrame.getContentPane().setLayout(new CardLayout(0, 0));
		infoFrame.setVisible(false);
		JPanel panelInfo = new JPanel();
		infoFrame.getContentPane().add(panelInfo, "name_989956785704721");
		panelInfo.setLayout(null);
		infoFrame.setLocationRelativeTo(null);
		JLabel background4 = new JLabel("");
		background4.setIcon(new ImageIcon("Resourses/yatzyRules.jpg"));
		background4.setBounds(0, 0, 800, 900);
		panelInfo.add(background4);
		infoButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				infoFrame.setVisible(true);
		    }
		});
		//Exit button
		exitButton = new JButton("");
		exitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exitButton.setPressedIcon(new ImageIcon("Resourses/exitClick.jpg"));
		exitButton.setRolloverIcon(new ImageIcon("Resourses/exitHover.jpg"));
		exitButton.setIcon(new ImageIcon("Resourses/exitDefault.jpg"));
		exitButton.setBounds(590, 630, 120, 30);
		exitButton.setBorderPainted(false);
		exitButton.setVisible(false);
		panelGame.add(exitButton);
		exitButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		
		tableModel = new DefaultTableModel(data1,col);
		table = new JTable(tableModel);
		table.setCellSelectionEnabled(false);
		table.getTableHeader().setReorderingAllowed(false);
		table.setPreferredScrollableViewportSize(new Dimension(720, 720));
		table.setBackground(Color.GRAY);
		table.setGridColor(Color.BLACK);
		table.setRowHeight(23);
		table.setFont(new Font("OCR A Extended", Font.PLAIN, 15));
		table.setEnabled(false);
		
		String tempValue = "?";
		for(int i = 1; i <= playerAmount; i++)
		{
			table.setValueAt(tempValue, UPPER_SCORE-1, i);
			table.setValueAt(tempValue, UPPER_BONUS-1, i);
			table.setValueAt(tempValue, LOWER_SCORE-1, i);
			table.setValueAt(tempValue, TOTAL-1, i);
		}
		
		
		
		JScrollPane scrollPane = new JScrollPane(table);
		panel1.setFont(new Font("OCR A Extended", Font.PLAIN, 15));
		panel1.setPreferredSize(new Dimension(400,350));
		panel1.setBounds(295, 32, 731, 475);
		panel1.add(scrollPane);
	
		panel1.setForeground(Color.WHITE);
		panelGame.add(panel1);
		
		
		
		table.addMouseListener(this);
		Yatzy.frame.getContentPane().add(panelGame, "name_531936123301123");
	}
	
	/**
	 * Disables checkboxes
	 */
	private void setCheckBoxToFalse() {
		checkBox.setEnabled(false);
		checkBox2.setEnabled(false);
		checkBox3.setEnabled(false);
		checkBox4.setEnabled(false);
		checkBox5.setEnabled(false);
		
	}
	
	/**
	 * Enables checkboxes
	 */
	private void setCheckBoxToTrue() {
		checkBox.setEnabled(true);
		checkBox2.setEnabled(true);
		checkBox3.setEnabled(true);
		checkBox4.setEnabled(true);
		checkBox5.setEnabled(true);
		
	}
	/**
	 * Shows current player
	 * @param count current player
	 */
	private void showCurrentPlayer(int count){
		getCurrentPlayer = playerName[count-1]+"'S turn";
		textField.setText(getCurrentPlayer);
	}
	
	
	/**
	 * Creates the gameboard
	 */
	private void createBoard() {
		col = new String[playerAmount+1];
		col[0]="Categories";
		for(int y = 1; y <= playerAmount; y++)
		{
			col[y]= playerName[y-1];
		}
		
		data1 = new String[19][playerAmount+1]; 
		data1[0][0] = "Ones";
		data1[1][0] = "Twos";
		data1[2][0] = "Threes";
		data1[3][0] = "Fours";
		data1[4][0] = "Fives";
		data1[5][0] = "Sixes";
		data1[6][0] = "Upper Score";
		data1[7][0] = "Upper B";
		data1[8][0] = "Pair";
		data1[9][0] = "Two Pair";
		data1[10][0] = "Three Of Kind";
		data1[11][0] = "Four Of Kind";
		data1[12][0] = "Full House";
		data1[13][0] = "Small Straight[15]";
		data1[14][0] = "Large Straight[20]";
		data1[15][0] = "Chance";
		data1[16][0] = "Yahtzee[50]";
		data1[17][0] = "Lower Score";
		data1[18][0] = "Total";
		
		for(int i = 0; i <19;i++)
		{
			for(int j = 1; j<=playerAmount;j++)
			{
				data1[i][j] = "";
			
			}
		}
		
	}
	/**
	 * Get's the gamepanel
	 * @return gamepanel
	 */
	public JPanel getPanelGame()
	{
		return panelGame;
	}

	/**
	 * Creates the dice object
	 */
	public void createAndRollDice()
	{
		for(int i = 0; i<diceArray.length;i++)
		{
			
			diceArray[i] = new Dice();
			diceButton[i] = new JButton();
			
			resetDice(i);
			panel.add(diceButton[i]);
			
		}
		
	}
	/**
	 * Sets the value of the dice
	 * @param _value dice value
	 */
	
	void rollButtonDice(int _value)
	{
		value= diceArray[_value].rollDice();
		//diceButton[_value].setText(String.valueOf(value));
		diceButton[_value].setIcon(new ImageIcon("Resourses/dice"+value+".jpg"));
		diceValueHolder[_value]= value;
		
		setCheckBoxToTrue();
	}
	/**
	 * Resets after players turn
	 * @param _value returns null value
	 */
	void resetDice(int _value)
	{
		value= diceArray[_value].getDice();
		diceButton[_value].setIcon(new ImageIcon("Resourses/diceQ.jpg"));
		diceValueHolder[_value]= value;
		
		setCheckBoxToFalse();
		
	}
	
	
	/**
	 * Sets and calculates score. Sets the winner
	 */
	public void mouseClicked(MouseEvent e) 
	{
		if(e.getSource()==table)
		{
			int value=0,getTableRow=0;
			getTableRow = table.getSelectedRow()+1;
			SetScoreByYahtzeeRules setScore = new SetScoreByYahtzeeRules(diceValueHolder,getTableRow);
			
			for(int i=0; i<6;i++)
			{
				if(getTableRow == i)
				{
					value = setScore.upperScoreSet();
				}
			}
			
			if(getTableRow == PAIR)
			{
				value = setScore.pair();
			}
			if(getTableRow == TWO_PAIR)
			{
				value = setScore.twoPair();
			}
			
			if(getTableRow == THREE_OF_KIND)
			{
				value = setScore.threeOfKind();
			}
			if(getTableRow == FOUR_OF_KIND)
			{
				value = setScore.fourOfKind();
			}
			if(getTableRow == FULL_HOUSE)
			{
				value = setScore.fullHouse();
			}
			if(getTableRow == SMALL_STRAIGHT)
			{
				value = setScore.smallStraight();
			}
			if(getTableRow == LARGE_STRAIGHT)
			{
				value = setScore.largeStraight();
			}
			if(getTableRow == CHANCE)
			{
				value = setScore.chance();
			}
			if(getTableRow == YAHTZEE)
			{
				value = setScore.yahtzee();
			}
			
			
			if(isRowEmpty(getTableRow))
			{
				
				table.setValueAt(value, getTableRow-1, currentPlayer);
				
				
				for(int i=0;i<diceArray.length;i++)
				{
					diceArray[i] = new Dice();
					resetDice(i);
				}
				
				rollButton.setEnabled(true);
				
				if(playerCount == playerAmount)
				{
					playerCount = 0;
				}
				
				playerCount++;
				
				checkBox.setSelected(false);
				checkBox2.setSelected(false);
				checkBox3.setSelected(false);
				checkBox4.setSelected(false);
				checkBox5.setSelected(false);
				table.setEnabled(false);
				
				
				showCurrentPlayer(playerCount);			
			}
			
			
			int upperScore = 0;
			int bonusPoint = 0;
			if(!isRowEmpty(ONES) && !isRowEmpty(TWOS) && !isRowEmpty(THREES) && !isRowEmpty(FOURS) && !isRowEmpty(FIVES) && !isRowEmpty(SIXES))
			{
				upperScore = getUpperScore();
				table.setValueAt(upperScore, UPPER_SCORE-1, currentPlayer);
				if(upperScore >= 63)
				{
					bonusPoint = 50;
					table.setValueAt(bonusPoint, UPPER_BONUS-1, currentPlayer);
				}
				else
				{
					bonusPoint = 0;
					table.setValueAt(bonusPoint, UPPER_BONUS-1, currentPlayer);
				}
			}
			
			
			int lowerScore = 0;
			if(!isRowEmpty(PAIR) && !isRowEmpty(TWO_PAIR) && !isRowEmpty(THREE_OF_KIND) && !isRowEmpty(FOUR_OF_KIND) && !isRowEmpty(FULL_HOUSE) && !isRowEmpty(SMALL_STRAIGHT) && !isRowEmpty(LARGE_STRAIGHT)&&!isRowEmpty(CHANCE)&&!isRowEmpty(YAHTZEE))
			{
				lowerScore = getLowerScore();
				table.setValueAt(lowerScore, LOWER_SCORE-1, currentPlayer);
			}
			
			if(!isRowEmpty(ONES) && !isRowEmpty(TWOS) && !isRowEmpty(THREES) && !isRowEmpty(FOURS) && !isRowEmpty(FIVES) && !isRowEmpty(SIXES) && !isRowEmpty(PAIR) && !isRowEmpty(TWO_PAIR) && !isRowEmpty(THREE_OF_KIND) && !isRowEmpty(FOUR_OF_KIND) && !isRowEmpty(FULL_HOUSE) && !isRowEmpty(SMALL_STRAIGHT) && !isRowEmpty(LARGE_STRAIGHT) && !isRowEmpty(CHANCE) && !isRowEmpty(YAHTZEE))
			{
				int total = bonusPoint + lowerScore + upperScore;
				table.setValueAt(total, TOTAL-1, currentPlayer);
				
				int[] playerPoint;
				String[] temp;
				
				playerTableCounter++;
				if(playerTableCounter == playerAmount)
				{
					if(playerTableCounter == 2)
					{
						playerPoint = new int[playerTableCounter];
						temp = new String[playerTableCounter];
						
						for(int i = 0; i < playerTableCounter; i++)
						{
							temp[i] = table.getValueAt(TOTAL-1, i+1).toString();
							playerPoint[i] = Integer.parseInt(temp[i]);
						}
						
						
						if(playerPoint[0] < playerPoint[1])
						{
							textField.setText(playerName[1]+" IS THE WINNER");
						}
						else if(playerPoint[0] == playerPoint[1])
						{
							textField.setText("IT'S A DRAW!");
						}
						else
						{
							textField.setText(playerName[0]+" IS THE WINNER");
						}
					}
					
					if(playerTableCounter == 3)
					{
						playerPoint = new int[playerTableCounter];
						temp = new String[playerTableCounter];
						
						for(int i = 0; i < playerTableCounter; i++)
						{
							temp[i] = table.getValueAt(TOTAL-1, i+1).toString();
							playerPoint[i] = Integer.parseInt(temp[i]);
						}
						
						
						if(playerPoint[0] < playerPoint[1] && playerPoint[1] > playerPoint[2])
						{
							textField.setText(playerName[1]+" IS THE WINNER");
						}
						else if(playerPoint[0] > playerPoint[1] && playerPoint[0] > playerPoint[2])
						{
							textField.setText(playerName[0]+" IS THE WINNER");
						}
						else
						{
							textField.setText(playerName[2]+" IS THE WINNER");
						}
					}
					
					if(playerTableCounter == 4)
					{
						playerPoint = new int[playerTableCounter];
						temp = new String[playerTableCounter];
						
						for(int i = 0; i < playerTableCounter; i++)
						{
							temp[i] = table.getValueAt(TOTAL-1, i+1).toString();
							playerPoint[i] = Integer.parseInt(temp[i]);
						}
						
						
						if( playerPoint[1] > playerPoint[0] && playerPoint[1] > playerPoint[2] && playerPoint[1] > playerPoint[3] )
						{
							textField.setText(playerName[1]+" IS THE WINNER");
						}
						else if(playerPoint[0] > playerPoint[1] && playerPoint[0] > playerPoint[2] && playerPoint[0] > playerPoint[3])
						{
							textField.setText(playerName[0]+" IS THE WINNER");
						}
						else if(playerPoint[2] > playerPoint[0] && playerPoint[2] > playerPoint[1] && playerPoint[2] > playerPoint[3])
						{
							textField.setText(playerName[2]+" IS THE WINNER");
						}
						else
						{
							textField.setText(playerName[3]+" IS THE WINNER");
						}
					}
					
					rollButton.setEnabled(false);
					table.setEnabled(false);
					exitButton.setVisible(true);
					setCheckBoxToFalse();
					
					
				}
				
			}
			
			counter = 0;
		}
		
	}
	
	/**
	 * Gets and calculates lower score
	 * @return lower score value
	 */
	private int getLowerScore() 
	{
		int returnValue = 0,newValue = 0;
		
		String getValueAsString = "";
		
		for(int i = 8; i < 16; i++)
		{
			getValueAsString = table.getValueAt(i, currentPlayer).toString();
			returnValue = Integer.parseInt(getValueAsString);
			newValue += returnValue; 
		}
		
		return newValue;
	}
	/**
	 * Gets and calculates upper score
	 * @return upper score value
	 */
	private int getUpperScore() 
	{
		int returnValue = 0,newValue = 0;
		
		String getValueAsString = "";
		
		for(int i = 0; i < 6; i++)
		{
			getValueAsString = table.getValueAt(i, currentPlayer).toString();
			returnValue = Integer.parseInt(getValueAsString);
			newValue += returnValue; 
		}
		
		return newValue;
	}

	/**
	 * Checks if the row is taken
	 * @param currentClickedRow Checks current clicked row
	 * @return if column is taken or not
	 */
	boolean isRowEmpty(int currentClickedRow)
	{
		boolean isTrue = false;
		String getValueInRow = "";
		
		try
		{
			getValueInRow = table.getValueAt(currentClickedRow-1, currentPlayer).toString();
			
			if(getValueInRow == "")
			{
				isTrue = true;
			}
			else
			{
				isTrue = false;
			}
		
		}
		catch (Exception e)
		{
			JOptionPane opPane = new JOptionPane();
			opPane.showMessageDialog(null,"Roll the dice first");
		}
		
		return isTrue;
	}

	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
			
}


