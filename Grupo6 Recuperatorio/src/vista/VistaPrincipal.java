package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import controlador.Control;

import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.border.MatteBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class VistaPrincipal extends JFrame implements IVista{

	private static final String INGRESAR = "INGRESAR";
	private static final String DARDEBAJA = "DARDEBAJA";
	private static final String AGREGAR = "AGREGAR";
	private static final String JURIDICA = "JURIDICA";
	private static final String FISICA = "FISICA";
	private static final String FACTURAR = "FACTURAR";
	private static final String DORADA = "DORADA";
	private static final String PLATINO = "PLATINO";
	private static final String APLICAR = "APLICAR";
	private static final String QUITAR = "QUITAR";
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private Object btnNewButton_2;
	private Object btnNewButton_3;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_2;
	private AbstractButton btnNewButton_1;
	private static Control controlador;
	private ButtonGroup buttonGroup3;
	private ButtonGroup buttonGroup4;
	private AbstractButton rdbtnNewRadioButton;
	private AbstractButton rdbtnNewRadioButton_1;
	private AbstractButton btnNewButton;
	private AbstractButton rdbtnNewRadioButton_2;
	private AbstractButton rdbtnNewRadioButton_3;
	private AbstractButton btnNewButton_4;
	private AbstractButton btnNewButton_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPrincipal frame = new VistaPrincipal(controlador);
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
	public VistaPrincipal(Control controlador) {
		
		VistaPrincipal.controlador = controlador;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Fecha:", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		//FECHA
        
        JLabel lblNewLabel_2 = new JLabel(VistaPrincipal.controlador.getFecha());
        panel_1.add(lblNewLabel_2);
        
        //
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton = new JButton("Facturar");
		panel_2.add(btnNewButton);
		btnNewButton.setActionCommand(FACTURAR);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_25 = new JPanel();
		panel_3.add(panel_25);
		panel_25.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_25.add(panel_4);
		panel_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192)));
		panel_4.setLayout(new GridLayout(1, 1, 0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_4.add(panel_7);
		panel_7.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Ingreso Cliente");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JPanel panel_26 = new JPanel();
		panel_25.add(panel_26);
		panel_26.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_26.add(panel_6);
		panel_6.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_2 = new JButton("Ingresar");
		panel_6.add(btnNewButton_2);
		btnNewButton_2.setActionCommand(INGRESAR);
		
		JPanel panel_8 = new JPanel();
		panel_26.add(panel_8);
		panel_8.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_3 = new JButton("Dar de Baja");
		panel_8.add(btnNewButton_3);
		btnNewButton_3.setActionCommand(DARDEBAJA);
		
		JPanel panel_21 = new JPanel();
		panel_3.add(panel_21);
		panel_21.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_21.add(panel_5);
		panel_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192)));
		panel_5.setLayout(new GridLayout(1, 1, 0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_5.add(panel_9);
		panel_9.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Nuevo Cliente");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JPanel panel_22 = new JPanel();
		panel_21.add(panel_22);
		panel_22.setLayout(new GridLayout(1, 1, 0, 0));
		
		JPanel panel_24 = new JPanel();
		panel_22.add(panel_24);
		panel_24.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_1 = new JButton("Agregar");
		panel_24.add(btnNewButton_1);
		btnNewButton_1.setActionCommand(AGREGAR);
		
		JPanel panel_10 = new JPanel();
		contentPane.add(panel_10);
		panel_10.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new TitledBorder(null, "Ingrese Nombre:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.add(panel_11);
		
		textField_1 = new JTextField();
		panel_11.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new TitledBorder(null, "Ingrese Nombre:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.add(panel_12);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(textField);
		textField.setColumns(10);
		
		JPanel panel_13 = new JPanel();
		contentPane.add(panel_13);
		panel_13.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_14 = new JPanel();
		panel_13.add(panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new TitledBorder(null, "Ingrese DNI:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_13.add(panel_15);
		
		textField_2 = new JTextField();
		panel_15.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_16 = new JPanel();
		contentPane.add(panel_16);
		panel_16.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Promo:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_16.add(panel_17);
		panel_17.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_19 = new JPanel();
		panel_17.add(panel_19);
		panel_19.setLayout(new GridLayout(2, 0, 0, 0));
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Dorada");
		panel_19.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setActionCommand(DORADA);
		
		JButton btnNewButton_4 = new JButton("Aplicar");
		panel_19.add(btnNewButton_4);
		btnNewButton_4.setActionCommand(APLICAR);
		
		JPanel panel_20 = new JPanel();
		panel_17.add(panel_20);
		panel_20.setLayout(new GridLayout(2, 0, 0, 0));
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Platino");
		panel_20.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setActionCommand(PLATINO);
		
		buttonGroup4 = new ButtonGroup();
        buttonGroup4.add(rdbtnNewRadioButton_2);
        buttonGroup4.add(rdbtnNewRadioButton_3);
		
		JButton btnNewButton_5 = new JButton("Quitar");
		panel_20.add(btnNewButton_5);
		btnNewButton_5.setActionCommand(QUITAR);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(lblNewLabel_3);
		
		
		JPanel panel_18 = new JPanel();
		panel_18.setBorder(new TitledBorder(null, "Seleccionar:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_16.add(panel_18);
		panel_18.setLayout(new GridLayout(0, 2, 0, 0));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Persona Juridica");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		panel_18.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Persona Fisica");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		panel_18.add(rdbtnNewRadioButton_1);
		
	    buttonGroup3 = new ButtonGroup();
        buttonGroup3.add(rdbtnNewRadioButton);
        rdbtnNewRadioButton.setActionCommand(JURIDICA);
        buttonGroup3.add(rdbtnNewRadioButton_1);
        rdbtnNewRadioButton_1.setActionCommand(FISICA);
	}

	public void cerrar() {
		this.dispose();
	}

	public void mostrar() {
		this.setVisible(true);
	}
	
	public JTextField getCliente() {
		return textField_1;
	}
	
	public JTextField getNuevoCliente() {
		return textField;
	}
	
	public JTextField getDNI() {
		return textField_2;
	}
	
	public void setLabel(String label) {
		lblNewLabel_3.setText(label);
	}
	
	public void setFecha(String label) {
		lblNewLabel_2.setText(label);
	}
	
	public ButtonModel selectedButton() {
		return buttonGroup3.getSelection();		
	}
	
	public ButtonModel selectedButtonPromo() {
		return buttonGroup4.getSelection();		
	}

	public void setActionListener(ActionListener actionListener) {
		((AbstractButton) this.btnNewButton).addActionListener(actionListener);
		((AbstractButton) this.btnNewButton_2).addActionListener(actionListener);
		((AbstractButton) this.btnNewButton_4).addActionListener(actionListener);
		((AbstractButton) this.btnNewButton_5).addActionListener(actionListener);
		((AbstractButton) this.btnNewButton_3).addActionListener(actionListener);
		((AbstractButton) this.btnNewButton_1).addActionListener(actionListener);
		((AbstractButton) this.rdbtnNewRadioButton).addActionListener(actionListener);
		((AbstractButton) this.rdbtnNewRadioButton_1).addActionListener(actionListener);
		((AbstractButton) this.rdbtnNewRadioButton_2).addActionListener(actionListener);
		((AbstractButton) this.rdbtnNewRadioButton_3).addActionListener(actionListener);
		
		
	}


}
