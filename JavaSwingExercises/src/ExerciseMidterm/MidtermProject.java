package ExerciseMidterm;

import java.awt.EventQueue;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;

public class MidtermProject
		extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MidtermProject frame = new MidtermProject();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MidtermProject() {
		setTitle("Pizza Ordering System");
		 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		///////////////FRAME BACKGROUND///////////////
		
		
		/////////////////PIZZA PANEL INITIALIZATION/////////////////
		JPanel panelPizzas = new JPanel();
		panelPizzas.setBackground(new Color(255, 175, 75));
		panelPizzas.setBorder(new LineBorder(Color.BLACK));
		panelPizzas.setBounds(10, 95, 242, 88);
		contentPane.add(panelPizzas);
		panelPizzas.setLayout(null);
		
		
		/////////////////SIZE PANEL INITIALIZATION/////////////////
		JPanel panelSizes = new JPanel();
		panelSizes.setBackground(new Color(255, 175, 75));
		panelSizes.setBorder(new LineBorder(Color.BLACK));
		panelSizes.setLayout(null);
		panelSizes.setBounds(10, 219, 242, 88);
		contentPane.add(panelSizes);
		
		JRadioButton rdoSmall = new JRadioButton("Small-Sized");
		rdoSmall.setBackground(new Color(255, 175, 75));
		rdoSmall.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdoSmall.setIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/DARK -S.png")));
		rdoSmall.setPressedIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/DD-S.png")));
		rdoSmall.setSelected(true);
		rdoSmall.setFocusable(false);
		rdoSmall.setBounds(6, 7, 105, 23);
		panelSizes.add(rdoSmall);
		
		JRadioButton rdoMedium = new JRadioButton("Medium-Sized");
		rdoMedium.setBackground(new Color(255, 172, 75));
		rdoMedium.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdoMedium.setIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/DARK - M.png")));
		rdoMedium.setPressedIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/DD-M.png")));
		rdoMedium.setFocusable(false);
		rdoMedium.setBounds(6, 33, 124, 23);
		panelSizes.add(rdoMedium);
		
		JRadioButton rdoLarge = new JRadioButton("Large-Sized");
		rdoLarge.setBackground(new Color(255, 175, 75));
		rdoLarge.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdoLarge.setIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/DARK - L.png")));
		rdoLarge.setPressedIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/DD-L.png")));
		rdoLarge.setFocusable(false);
		rdoLarge.setBounds(6, 59, 109, 23);
		panelSizes.add(rdoLarge);
		
		ButtonGroup sizeGroup = new ButtonGroup();
		sizeGroup.add(rdoSmall);
		sizeGroup.add(rdoMedium);
		sizeGroup.add(rdoLarge);
		
		
		
		//////////////PRICES LABEL//////////////////////////
		
		JLabel lblSmallPrice = new JLabel("90.00");
		lblSmallPrice.setBackground(new Color(255, 175, 75));
		lblSmallPrice.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSmallPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblSmallPrice.setBounds(190, 7, 46, 23);
		panelSizes.add(lblSmallPrice);
		
		JLabel lblMediumPrice = new JLabel("110.00");
		lblMediumPrice.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMediumPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblMediumPrice.setBounds(190, 33, 46, 23);
		panelSizes.add(lblMediumPrice);
		
		JLabel lblLargePrice = new JLabel("130.00");
		lblLargePrice.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLargePrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblLargePrice.setBounds(190, 59, 46, 23);
		panelSizes.add(lblLargePrice);
		
/////////////////////PIZZA FLAVORS AND THEIR PRICES///////////////////////////////////
		///////////////HAWAIIAN////////////////////
		JRadioButton rdoHawaiian = new JRadioButton("Hawaiian");
		rdoHawaiian.setBackground(new Color(255, 172, 75));
		rdoHawaiian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdoHawaiian.isSelected()) {
					lblSmallPrice.setText("90.00");
					lblMediumPrice.setText("110.00");
					lblLargePrice.setText("130.00");
				}
			}
		});
		rdoHawaiian.setIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/HAWA.png")));
		rdoHawaiian.setPressedIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/HAW-ON.png")));
		rdoHawaiian.setSelected(true);
		rdoHawaiian.setBounds(6, 7, 107, 23);
		rdoHawaiian.setFocusable(false);
		panelPizzas.add(rdoHawaiian);
		
		
		
		
		///////////////HAM AND CHEESE////////////////////
		JRadioButton rdoHamAndCheese = new JRadioButton("Ham and Cheese");
		rdoHamAndCheese.setBackground(new Color(255, 172, 75));
		rdoHamAndCheese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdoHamAndCheese.isSelected()) {
					lblSmallPrice.setText("110.00");
					lblMediumPrice.setText("130.00");
					lblLargePrice.setText("150.00");
				}
			}
		});
		rdoHamAndCheese.setIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/HAM.png")));
		rdoHamAndCheese.setPressedIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/HAM-ON.png")));
		rdoHamAndCheese.setBounds(6, 33, 138, 23);
		rdoHamAndCheese.setFocusable(false);		
		panelPizzas.add(rdoHamAndCheese);
		
		
		///////////////PEPPERONI////////////////////
		JRadioButton rdoPepperoni = new JRadioButton("Pepperoni");
		rdoPepperoni.setBackground(new Color(255, 172, 75));
		rdoPepperoni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdoPepperoni.isSelected()) {
					lblSmallPrice.setText("130.00");
					lblMediumPrice.setText("150.00");
					lblLargePrice.setText("170.00");
				}
			}
		});
		rdoPepperoni.setIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/PEP.png")));
		rdoPepperoni.setPressedIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/PEP-ON.png")));
		rdoPepperoni.setBounds(6, 59, 107, 23);
		rdoPepperoni.setFocusable(false);
		panelPizzas.add(rdoPepperoni);
		
		
		
		////////////////PIIZA RADIO BUTTON GROUP//////////////
		ButtonGroup flavorGroup = new ButtonGroup();
		flavorGroup.add(rdoHawaiian);
		flavorGroup.add(rdoHamAndCheese);
		flavorGroup.add(rdoPepperoni);
		
		
		
		
		
	
		/////////////////////////ADD ONS//////////////////////
		JPanel panelAddOns = new JPanel();
		panelAddOns.setBackground(new Color(255, 175, 75));
		panelAddOns.setBorder(new LineBorder(Color.BLACK));
		panelAddOns.setLayout(null);
		panelAddOns.setBounds(10, 341, 242, 147);
		contentPane.add(panelAddOns);
		
		JCheckBox chkPepper = new JCheckBox("Pepper");
		chkPepper.setBackground(new Color(255, 175, 75));
		chkPepper.setFocusable(false);
		chkPepper.setIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/PPR.png")));
		chkPepper.setPressedIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/PPR-ON.png")));
		chkPepper.setBounds(6, 7, 97, 23);
		panelAddOns.add(chkPepper);
		
		JCheckBox chkOnions = new JCheckBox("Onions");
		chkOnions.setBackground(new Color(255, 175, 75));
		chkOnions.setFocusable(false);
		chkOnions.setIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/ONIONS.png")));
		chkOnions.setPressedIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/ONION-ON.png")));
		chkOnions.setBounds(6, 33, 97, 23);
		panelAddOns.add(chkOnions);
		
		JCheckBox chkBlackOlives = new JCheckBox("Black Olives");
		chkBlackOlives.setBackground(new Color(255, 175, 75));
		chkBlackOlives.setFocusable(false);
		chkBlackOlives.setIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/OLIVES.png")));
		chkBlackOlives.setPressedIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/Olives-ON.png")));
		chkBlackOlives.setBounds(6, 59, 138, 23);
		panelAddOns.add(chkBlackOlives);
		
		JCheckBox chkGreenPeppers = new JCheckBox("Green Peppers");
		chkGreenPeppers.setBackground(new Color(255, 175, 75));
		chkGreenPeppers.setFocusable(false);
		chkGreenPeppers.setIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/GPEP.png")));
		chkGreenPeppers.setPressedIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/GPEP-ON.png")));
		chkGreenPeppers.setBounds(6, 85, 138, 23);
		panelAddOns.add(chkGreenPeppers);
		
		JCheckBox chkExtraCheese = new JCheckBox("Extra Cheese");
		chkExtraCheese.setBackground(new Color(255, 175, 75));
		chkExtraCheese.setFocusable(false);
		chkExtraCheese.setIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/CHEESE.png")));
		chkExtraCheese.setPressedIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/CHEESE-ON.png")));
		chkExtraCheese.setBounds(6, 111, 138, 23);
		panelAddOns.add(chkExtraCheese);
		
		///////////////////JRADIOBUTTON/JCHECKBOX ARRAYS///////////////////////////////////
		JRadioButton[] flavorArr = {rdoHawaiian, rdoHamAndCheese, rdoPepperoni};
		JRadioButton[] sizeArr = {rdoSmall, rdoMedium, rdoLarge};
		JCheckBox[] addOnArr = {chkPepper, chkOnions, chkBlackOlives, chkGreenPeppers, chkExtraCheese};
		
		
		///////////////////RECIEPT//////////////////
		JTextArea txtAOrderSummary = new JTextArea();
		txtAOrderSummary.setBackground(new Color(255, 172, 75));
		txtAOrderSummary.setFont(new Font("Arial", Font.BOLD, 14));
		txtAOrderSummary.setBorder(null);
		txtAOrderSummary.setBounds(262, 95, 242, 393);
		contentPane.add(txtAOrderSummary);
		
		///////////////////////CREATE ORDER BUTTON/////////////////
		JButton btnCreateOrder = new JButton("Create Order");
		btnCreateOrder.setBackground(new Color(255, 175, 75));
		btnCreateOrder.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCreateOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String pizza = " ";
				String size = " ";
				String addOns = " ";
				double pricePizza = 0.0;
				double[] priceAddOn = {5.0, 10.0, 15.0, 20.0, 25.0};
				int addButton = 0;
				
				if(flavorArr[0].isSelected() && sizeArr[0].isSelected()) {
					pizza = flavorArr[0].getText();
					size = sizeArr[0].getText();
					pricePizza = 90.0;
					
					
				} else if(flavorArr[0].isSelected() && sizeArr[1].isSelected()) {
					pizza = flavorArr[0].getText();
					size = sizeArr[1].getText();
					pricePizza = 110.0;
					
					
				} else if(flavorArr[0].isSelected() && sizeArr[2].isSelected()) {
					pizza = flavorArr[0].getText();
					size = sizeArr[2].getText();
					pricePizza = 130.0;
					
					
				} else if(flavorArr[1].isSelected() && sizeArr[0].isSelected()) {
					pizza = flavorArr[1].getText();
					size = sizeArr[0].getText();
					pricePizza = 150.0;
					
					
				} else if(flavorArr[1].isSelected() && sizeArr[1].isSelected()) {
					pizza = flavorArr[1].getText();
					size = sizeArr[1].getText();
					pricePizza = 130.0;
					
					
				} else if(flavorArr[1].isSelected() && sizeArr[2].isSelected()) {
					pizza = flavorArr[1].getText();
					size = sizeArr[2].getText();
					pricePizza = 150.0;
					
					
				} else if(flavorArr[2].isSelected() && sizeArr[0].isSelected()) {
					pizza = flavorArr[2].getText();
					size = sizeArr[0].getText();
					pricePizza = 130.0;
					
					
				} else if(flavorArr[2].isSelected() && sizeArr[1].isSelected()) {
					pizza = flavorArr[2].getText();
					size = sizeArr[1].getText();
					pricePizza = 150.0;
					
					
				} else if(flavorArr[2].isSelected() && sizeArr[2].isSelected()) {
					pizza = flavorArr[2].getText();
					size = sizeArr[2].getText();
					pricePizza = 170.0;
					
					
				} else {
					txtAOrderSummary.append("Choose your Pizza and Size");
				}
				
				
				
				
				for(int i=0; i < addOnArr.length; i++) {
					if(addOnArr[i].isSelected()) { 
						addOns = addOns + addOnArr[i].getText() + "\n	 ";
					}
				}
				
				
				
				for(int i=0; i < addOnArr.length; i++) {
					if(addOnArr[i].isSelected()) {
						pricePizza += priceAddOn[i];
					}
				}
				
				
				
				
				txtAOrderSummary.append("PIZZA FLAVOR : " + pizza + "\n\nPIZZA SIZE : " + size);
				txtAOrderSummary.append("\n\n" + "ADD-ONS : \n	" + addOns);
				txtAOrderSummary.append("\n\nTOTAL PRICE : P" + pricePizza + " pesos");
				
				if(addButton < 1) 
					btnCreateOrder.setEnabled(false);
				
			}
		});
		btnCreateOrder.setBounds(10, 499, 242, 51);
		contentPane.add(btnCreateOrder);
		
		

		
		//////////////////Reset Button//////////////////////////////
		JButton btnResetButton = new JButton("Reset");
		btnResetButton.setFocusable(false);
		btnResetButton.setBackground(new Color(255, 175, 75));
		btnResetButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				
				flavorArr[0].setSelected(true);  
				sizeArr[0].setSelected(true);  
				lblSmallPrice.setText("90.00");
				lblMediumPrice.setText("110.00");
				lblLargePrice.setText("130.00");
				for(int i=0; i < addOnArr.length; i++) {
					addOnArr[i].setSelected(false);  
				}
				txtAOrderSummary.setText(null);
				btnCreateOrder.setEnabled(true);
			}
		});
		btnResetButton.setBounds(262, 499, 242, 51);
		contentPane.add(btnResetButton);
		
		
		
		////////////NOT IMPORTATNT LABELS////////////////
		JLabel lblNewLabel = new JLabel("Add-ons");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(255, 175, 75));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 321, 242, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblSize = new JLabel("Select Size");
		lblSize.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSize.setBounds(10, 200, 121, 22);
		contentPane.add(lblSize);
		
		JLabel lblFlavor = new JLabel("Select Flavor");
		lblFlavor.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlavor.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFlavor.setBounds(10, 75, 242, 22);
		contentPane.add(lblFlavor);
		
		JLabel lblOrderSummary = new JLabel("Order Summary");
		lblOrderSummary.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrderSummary.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOrderSummary.setBounds(262, 75, 242, 22);
		contentPane.add(lblOrderSummary);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrice.setBounds(188, 200, 64, 22);
		contentPane.add(lblPrice);
		
		
		
		////////////////////////top panel///////////////		
		JPanel BAR = new JPanel();
		BAR.setBackground(new Color(255, 172, 75));
		BAR.setBorder(null);
		BAR.setBounds(0, 11, 514, 51);
		contentPane.add(BAR);
		BAR.setLayout(null);


		JLabel lblTagline1 = new JLabel("A Smile So Bright!!");
		lblTagline1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		lblTagline1.setBounds(78, 26, 189, 14);
		BAR.add(lblTagline1);
		
		JLabel lblTagline2 = new JLabel("With Each Slice,");
		lblTagline2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		lblTagline2.setBounds(78, 11, 158, 14);
		BAR.add(lblTagline2);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/LOGO.png")));
		lblLogo.setBounds(10, 0, 68, 51);
		BAR.add(lblLogo);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/BAR.png")));
		lblNewLabel_1.setBounds(0, 0, 514, 51);
		BAR.add(lblNewLabel_1);
		
		JLabel lblBG = new JLabel("");
		lblBG.setIcon(new ImageIcon(MidtermProject.class.getResource("/ExerciseMidterm/BG 2.png")));
		lblBG.setBounds(0, 0, 515, 560);
		contentPane.add(lblBG);
		
		
	}	
}