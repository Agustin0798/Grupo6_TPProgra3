package vista;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import controlador.Control;
import datos.Factura;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import java.util.ArrayList;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

public class Clientes extends JFrame implements IVista{

	private static final String INICIO = "INICIO";
	private static final String PAGAR = "PAGAR";
	private static final String TARJETA = "TARJETA";
	private static final String CHEQUE = "CHEQUE";
	private static final String EFECTIVO = "EFECTIVO";
	private static final String BAJASERVICIO = "BAJASERVICIO";
	private static final String CAMARAS = "CAMARAS";
	private static final String BOTONANTIPANICO = "BOTONANTIPANICO";
	private static final String VIGILANTE = "VIGILANTE";
	private static final String VIVIENDA = "VIVIENDA";
	private static final String COMERCIO = "COMERCIO";
	private static final String AÑADIRSERVICIO = "AÑADIRSERVICIO";
	private static final String AGREGARADICIONAL = "AGREGARADICIONAL";
	private JPanel contentPane;
	private Object btnModificar;
	private Object btnSolicitar;
	private Object btnContratar;
	private Object btnPagar;
	private ActionListener actionListener;
	private AbstractButton btnBajaCliente;
	private AbstractButton btnNuevoCliente;
	private AbstractButton btnSolicitarTecnico;
	private AbstractButton btnModificarServicio;
	private AbstractButton btnBajaServicio;
	private AbstractButton btnContratarServicio;
	private static Control controlador;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private AbstractButton btnNewButton_3;
	private AbstractButton btnNewButton_4;
	private AbstractButton btnNewButton_5;
	private AbstractButton btnNewButton_6;
	private AbstractButton btnNewButton;
	private JComboBox<String> comboBox;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_11;
	private ButtonGroup buttonGroup2;
	private ButtonGroup buttonGroup1;
	private ButtonGroup buttonGroup;
	private AbstractButton rdbtnNewRadioButton;
	private AbstractButton rdbtnNewRadioButton_1;
	private AbstractButton rdbtnNewRadioButton_2;
	private AbstractButton btnNewButton_1;
	private AbstractButton rdbtnNewRadioButton_5;
	private AbstractButton rdbtnNewRadioButton_7;
	private AbstractButton rdbtnNewRadioButton_6;
	private AbstractButton rdbtnNewRadioButton_3;
	private AbstractButton rdbtnNewRadioButton_4;
	private AbstractButton btnNewButton_2;
	private AbstractButton btnNewButton_8;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes frame = new Clientes(controlador);
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
	public Clientes(Control controlador) {
		
		Clientes.controlador = controlador;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(9, 9, 9, 9));

		setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(0, 1, 0, 0));
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        contentPane.add(tabbedPane);
        
        JPanel panel = new JPanel();
        tabbedPane.addTab("CLIENTES", null, panel, null);
        panel.setLayout(new GridLayout(0, 1, 0, 0));
        
        JPanel panel_11 = new JPanel();
        panel.add(panel_11);
        panel_11.setLayout(new GridLayout(0, 1, 0, 0));
        
        
        JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.BOTTOM);
        panel_11.add(tabbedPane_1);
        
        
        //PAGAR
        
        JPanel panel_91 = new JPanel();
        tabbedPane_1.addTab("Pagar", null, panel_91, null);
        panel_91.setLayout(new GridLayout(5, 6, 0, 0));
            
        JPanel panel_40 = new JPanel();
        panel_91.add(panel_40);
        panel_40.setLayout(new GridLayout(0, 6, 0, 0));
        
        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_40.add(panel_1);
        
        JLabel lblNewLabel_1 = new JLabel("Pagar");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel_1.add(lblNewLabel_1);
        
        JPanel panel_2 = new JPanel();
        panel_40.add(panel_2);
        
        JPanel panel_3 = new JPanel();
        panel_40.add(panel_3);
        
        JPanel panel_5 = new JPanel();
        panel_40.add(panel_5);
        
        JPanel panel_6 = new JPanel();
        panel_40.add(panel_6);
        
        JPanel panel_22 = new JPanel();
        panel_40.add(panel_22);
        
        JButton btnNewButton_3 = new JButton("Inicio");
        panel_22.add(btnNewButton_3);
        btnNewButton_3.setVerticalAlignment(SwingConstants.BOTTOM);
        btnNewButton_3.setActionCommand(INICIO);
        
        JPanel panel_8 = new JPanel();
        panel_91.add(panel_8);
        GridBagLayout gbl_panel_8 = new GridBagLayout();
        gbl_panel_8.columnWidths = new int[]{136, 136, 0, 0};
        gbl_panel_8.rowHeights = new int[] {1};
        gbl_panel_8.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_panel_8.rowWeights = new double[]{0.0};
        panel_8.setLayout(gbl_panel_8);
        
        JPanel panel_13 = new JPanel();
        GridBagConstraints gbc_panel_13 = new GridBagConstraints();
        gbc_panel_13.fill = GridBagConstraints.BOTH;
        gbc_panel_13.insets = new Insets(0, 0, 0, 5);
        gbc_panel_13.gridx = 0;
        gbc_panel_13.gridy = 0;
        panel_8.add(panel_13, gbc_panel_13);
        
        JLabel lblNewLabel_2 = new JLabel("Seleccione la Factura:\r\n");
        panel_13.add(lblNewLabel_2);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
        
        
        //LISTA DESPLEGABLE FACTURAS
        comboBox = new JComboBox<String>();
        GridBagConstraints gbc_comboBox = new GridBagConstraints();
        gbc_comboBox.gridwidth = 2;
        gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
        gbc_comboBox.gridx = 1;
        gbc_comboBox.gridy = 0;
        panel_8.add(comboBox, gbc_comboBox);
        
        ArrayList<Factura> facturas = controlador.getDatos(Clientes.controlador.getNombre());
        
        for (Factura dato : facturas) {
        	LocalDate fecha=dato.getFecha();
        	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Definir el formato deseado
    	    String fechaString = fecha.format(formato);
    	    	       
        	comboBox.addItem(fechaString);
        }
        
        JPanel panel_7 = new JPanel();
        panel_7.setBorder(new TitledBorder(null, "Seleccione Forma de Pago", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_91.add(panel_7);
        panel_7.setLayout(new GridLayout(0, 3, 0, 0));
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("Tarjeta ");
        panel_7.add(rdbtnNewRadioButton);
        rdbtnNewRadioButton.setActionCommand(TARJETA);
        
        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Cheque");
        panel_7.add(rdbtnNewRadioButton_1);
        rdbtnNewRadioButton_1.setActionCommand(CHEQUE);
        
        JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Efectivo");
        panel_7.add(rdbtnNewRadioButton_2);
        rdbtnNewRadioButton_2.setActionCommand(EFECTIVO);
        
        
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rdbtnNewRadioButton);
        buttonGroup.add(rdbtnNewRadioButton_1);
        buttonGroup.add(rdbtnNewRadioButton_2);
        
        JPanel panel_14 = new JPanel();
        panel_91.add(panel_14);
        panel_14.setLayout(new GridLayout(0, 3, 0, 0));
        
        JPanel panel_16 = new JPanel();
        panel_14.add(panel_16);
        panel_16.setLayout(new GridLayout(1, 0, 0, 0));
        
        JPanel panel_17 = new JPanel();
        panel_14.add(panel_17);
        panel_17.setLayout(new GridLayout(1, 0, 0, 0));
        
        JButton btnNewButton = new JButton("Pagar");
        panel_17.add(btnNewButton);
        btnNewButton.setActionCommand(PAGAR);
        
        JPanel panel_15 = new JPanel();
        panel_91.add(panel_15);
        panel_15.setLayout(new GridLayout(0, 1, 0, 0));
        
        lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        panel_15.add(lblNewLabel_3);
        
        
        
        //BAJA SERVICIO
        JPanel panel_92 = new JPanel();
        tabbedPane_1.addTab("Baja Servicio", null, panel_92, null);
        panel_92.setLayout(new GridLayout(3, 1, 0, 0));
            
        JPanel panel_43 = new JPanel();
        panel_92.add(panel_43);
        panel_43.setLayout(new GridLayout(0, 6, 0, 0));
        
        JPanel panel_4 = new JPanel();
        panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_43.add(panel_4);
        
        JLabel lblNewLabel = new JLabel("Baja \r\n");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel_4.add(lblNewLabel);
        
        JLabel lblNewLabel_4 = new JLabel("Servicio");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel_4.add(lblNewLabel_4);
        
        JPanel panel_18 = new JPanel();
        panel_43.add(panel_18);
        
        JPanel panel_19 = new JPanel();
        panel_43.add(panel_19);
        
        JPanel panel_20 = new JPanel();
        panel_43.add(panel_20);
        
        JPanel panel_21 = new JPanel();
        panel_43.add(panel_21);
        
        JPanel panel_23 = new JPanel();
        panel_43.add(panel_23);
        
        JButton btnNewButton_4 = new JButton("Inicio");
        panel_23.add(btnNewButton_4);
        btnNewButton_4.setVerticalAlignment(SwingConstants.BOTTOM);
        btnNewButton_4.setActionCommand(INICIO);
        
        JPanel panel_25 = new JPanel();
        panel_25.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ingrese Domicilio:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panel_92.add(panel_25);
        panel_25.setLayout(new GridLayout(1, 1, 0, 0));
        
        textField = new JTextField();
        panel_25.add(textField);
        textField.setColumns(10);
        
        JPanel panel_24 = new JPanel();
        panel_92.add(panel_24);
        panel_24.setLayout(new GridLayout(2, 0, 0, 0));
        
        JPanel panel_27 = new JPanel();
        panel_24.add(panel_27);
        panel_27.setLayout(new GridLayout(0, 3, 0, 0));
        
        JPanel panel_28 = new JPanel();
        panel_27.add(panel_28);
        
        JPanel panel_29 = new JPanel();
        panel_27.add(panel_29);
        panel_29.setLayout(new GridLayout(0, 1, 0, 0));
        
        JButton btnNewButton_1 = new JButton("Baja Servicio");
        panel_29.add(btnNewButton_1);
        btnNewButton_1.setActionCommand(BAJASERVICIO);
        
        JPanel panel_26 = new JPanel();
        panel_24.add(panel_26);
        panel_26.setLayout(new GridLayout(1, 0, 0, 0));
        
        lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        panel_26.add(lblNewLabel_5);
       
        
        //AÑADIR SERVICIO
        
        JPanel panel_93 = new JPanel();
        tabbedPane_1.addTab("Añadir Servicio", null, panel_93, null);
        panel_93.setLayout(new GridLayout(4, 1, 0, 0));
            
        JPanel panel_44 = new JPanel();
        panel_93.add(panel_44);
        panel_44.setLayout(new GridLayout(0, 6, 0, 0));
        
        JPanel panel_31 = new JPanel();
        panel_31.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_44.add(panel_31);
        
        JLabel lblNewLabel_6 = new JLabel("Añadir");
        lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel_31.add(lblNewLabel_6);
        
        JLabel lblNewLabel_7 = new JLabel("Servicio");
        lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel_31.add(lblNewLabel_7);
        
        JPanel panel_32 = new JPanel();
        panel_44.add(panel_32);
        
        JPanel panel_33 = new JPanel();
        panel_44.add(panel_33);
        
        JPanel panel_34 = new JPanel();
        panel_44.add(panel_34);
        
        JPanel panel_35 = new JPanel();
        panel_44.add(panel_35);
        
        JPanel panel_36 = new JPanel();
        panel_44.add(panel_36);
        panel_36.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        JButton btnNewButton_5 = new JButton("Inicio");
        panel_36.add(btnNewButton_5);
        btnNewButton_5.setVerticalAlignment(SwingConstants.BOTTOM);
        btnNewButton_5.setActionCommand(INICIO);
        	
        
        JPanel panel_37 = new JPanel();
        panel_93.add(panel_37);
        panel_37.setLayout(new GridLayout(1, 0, 0, 0));
        
        JPanel panel_39 = new JPanel();
        panel_39.setBorder(new TitledBorder(null, "Ingrese Domicilio:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_37.add(panel_39);
        panel_39.setLayout(new GridLayout(0, 1, 0, 0));
        
        textField_1 = new JTextField();
        panel_39.add(textField_1);
        textField_1.setColumns(10);
        
        JPanel panel_38 = new JPanel();
        panel_38.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Seleccionar Tipo de Servicio:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panel_93.add(panel_38);
        panel_38.setLayout(new GridLayout(0, 2, 0, 0));
        
        JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Alarma Vivienda");
        panel_38.add(rdbtnNewRadioButton_3);
        rdbtnNewRadioButton_3.setActionCommand(VIVIENDA);
        
        JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Monitoreo Comercio");
        panel_38.add(rdbtnNewRadioButton_4);
        rdbtnNewRadioButton_4.setActionCommand(COMERCIO);
        
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(rdbtnNewRadioButton_3);
        buttonGroup1.add(rdbtnNewRadioButton_4);
       
        
        JPanel panel_45 = new JPanel();
        panel_93.add(panel_45);
        panel_45.setLayout(new GridLayout(2, 0, 0, 0));
        
        JPanel panel_48 = new JPanel();
        panel_45.add(panel_48);
        panel_48.setLayout(new GridLayout(0, 3, 0, 0));
        
        JPanel panel_49 = new JPanel();
        panel_48.add(panel_49);
        
        JPanel panel_50 = new JPanel();
        panel_48.add(panel_50);
        panel_50.setLayout(new GridLayout(1, 0, 0, 0));
        
        JButton btnNewButton_2 = new JButton("Añadir Servicio");
        panel_50.add(btnNewButton_2);
        btnNewButton_2.setActionCommand(AÑADIRSERVICIO);
        
        JPanel panel_47 = new JPanel();
        panel_45.add(panel_47);
        panel_47.setLayout(new GridLayout(0, 1, 0, 0));
        
        lblNewLabel_8 = new JLabel("Operacion Exitosa");
        lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
        panel_47.add(lblNewLabel_8);
        
        
        //AGREGAR ADICIONALES
        
        JPanel panel_30 = new JPanel();
        tabbedPane_1.addTab("Agregar Adicional", null, panel_30, null);
        panel_30.setLayout(new GridLayout(4, 6, 0, 0));
        
        JPanel panel_51 = new JPanel();
        panel_30.add(panel_51);
        panel_51.setLayout(new GridLayout(0, 6, 0, 0));
        
        JPanel panel_55 = new JPanel();
        panel_55.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_51.add(panel_55);
        
        JLabel lblNewLabel_9 = new JLabel("Añadir");
        lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
        panel_55.add(lblNewLabel_9);
        
        JLabel lblNewLabel_10 = new JLabel("Adicional");
        lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 13));
        panel_55.add(lblNewLabel_10);
        
        JPanel panel_56 = new JPanel();
        panel_51.add(panel_56);
        
        JPanel panel_57 = new JPanel();
        panel_51.add(panel_57);
        
        JPanel panel_58 = new JPanel();
        panel_51.add(panel_58);
        
        JPanel panel_59 = new JPanel();
        panel_51.add(panel_59);
        
        JPanel panel_60 = new JPanel();
        panel_51.add(panel_60);
        
        JButton btnNewButton_6 = new JButton("Inicio");
        panel_60.add(btnNewButton_6);
        btnNewButton_5.setVerticalAlignment(SwingConstants.BOTTOM);
        btnNewButton_5.setActionCommand(INICIO);
        
        JPanel panel_52 = new JPanel();
        panel_52.setBorder(new TitledBorder(null, "Ingrese Domicilio:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_30.add(panel_52);
        panel_52.setLayout(new GridLayout(0, 1, 0, 0));
        
        textField_2 = new JTextField();
        panel_52.add(textField_2);
        textField_2.setColumns(10);
        
        JPanel panel_53 = new JPanel();
        panel_53.setBorder(new TitledBorder(null, "Seleccione Adicional:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_30.add(panel_53);
        panel_53.setLayout(new GridLayout(0, 3, 0, 0));
        
        JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Vigilante");
        panel_53.add(rdbtnNewRadioButton_5);
        rdbtnNewRadioButton_5.setActionCommand(VIGILANTE);
        
        JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Boton Antipanico");
        panel_53.add(rdbtnNewRadioButton_6);
        rdbtnNewRadioButton_6.setActionCommand(BOTONANTIPANICO);
        
        JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Camaras");
        panel_53.add(rdbtnNewRadioButton_7);
        rdbtnNewRadioButton_7.setActionCommand(CAMARAS);
        
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(rdbtnNewRadioButton_5);
        buttonGroup2.add(rdbtnNewRadioButton_6);
        buttonGroup2.add(rdbtnNewRadioButton_7);
        
        JPanel panel_54 = new JPanel();
        panel_30.add(panel_54);
        panel_54.setLayout(new GridLayout(2, 0, 0, 0));
        
        JPanel panel_65 = new JPanel();
        panel_54.add(panel_65);
        panel_65.setLayout(new GridLayout(0, 3, 0, 0));
        
        JPanel panel_66 = new JPanel();
        panel_65.add(panel_66);
        
        JPanel panel_67 = new JPanel();
        panel_65.add(panel_67);
        panel_67.setLayout(new GridLayout(0, 1, 0, 0));
        
        JButton btnNewButton_8 = new JButton("Agregar Adicional");
        panel_67.add(btnNewButton_8);
        btnNewButton_8.setActionCommand(AGREGARADICIONAL);
        
        JPanel panel_64 = new JPanel();
        panel_54.add(panel_64);
        panel_64.setLayout(new GridLayout(1, 0, 0, 0));
        
        lblNewLabel_11 = new JLabel("Operacion Exitosa");
        lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
        panel_64.add(lblNewLabel_11);
        
       
	}

	public void cerrar() {
		this.dispose();
	}

	public void mostrar() {
		this.setVisible(true);
	}
	
	public String selectedOption() {
		return (String) comboBox.getSelectedItem();
	}
	
	public void setLabelPagar(String label) {
		lblNewLabel_3.setText(label);
	}
	
	public void setLabelBajaServicio(String label) {
		lblNewLabel_5.setText(label);
	}
	
	public void setLabelAñadirServicio(String label) {
		lblNewLabel_8.setText(label);
	}
	
	public void setLabelAgregarAdicional(String label) {
		lblNewLabel_11.setText(label);
	}
	
	public ButtonModel selectedButtonPagar() {
		return buttonGroup.getSelection();		
	}
	
	public ButtonModel selectedButtonAA() {
		return buttonGroup2.getSelection();		
	}
	
	public ButtonModel selectedButtonAS() {
		return buttonGroup1.getSelection();		
	}
	
	public JTextField getDomicilioBS() {
		return textField;
	}
	
	public JTextField getDomicilioAS() {
		return textField_1;
	}
	
	public JTextField getDomicilioAA() {
		return textField_2;
	}
	
	public void setActionListener(ActionListener actionListener) {
		((AbstractButton) this.btnNewButton).addActionListener(actionListener);
		((AbstractButton) this.btnNewButton_2).addActionListener(actionListener);
		((AbstractButton) this.btnNewButton_3).addActionListener(actionListener);
		((AbstractButton) this.btnNewButton_4).addActionListener(actionListener);
		((AbstractButton) this.btnNewButton_5).addActionListener(actionListener);
		((AbstractButton) this.btnNewButton_8).addActionListener(actionListener);
		((AbstractButton) this.btnNewButton_6).addActionListener(actionListener);
		((AbstractButton) this.rdbtnNewRadioButton).addActionListener(actionListener);
		((AbstractButton) this.rdbtnNewRadioButton_1).addActionListener(actionListener);
		((AbstractButton) this.rdbtnNewRadioButton_2).addActionListener(actionListener);
		((AbstractButton) this.btnNewButton_1).addActionListener(actionListener);
		((AbstractButton) this.rdbtnNewRadioButton_5).addActionListener(actionListener);
		((AbstractButton) this.rdbtnNewRadioButton_6).addActionListener(actionListener);
		((AbstractButton) this.rdbtnNewRadioButton_7).addActionListener(actionListener);
		((AbstractButton) this.rdbtnNewRadioButton_3).addActionListener(actionListener);
		((AbstractButton) this.rdbtnNewRadioButton_4).addActionListener(actionListener);
	
	}

	
}
