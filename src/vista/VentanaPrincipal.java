package vista;

import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.ManejadorEventos;

public class VentanaPrincipal extends JFrame {

	private JLabel etiqueta;
	private JTextField cajaTexto;
	private JButton boton, botonReset;
	
	public VentanaPrincipal () {
		setSize (300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Mi primera GUI");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/logo.jpg")));
        setLayout(null);
        inicializarComponentes();
        
		setVisible(true);
	}

	private void inicializarComponentes() {
		etiqueta = new JLabel ("Nombre");
		etiqueta.setBounds(50, 30, 50, 30);
		add(etiqueta);
		
		cajaTexto = new JTextField();
		cajaTexto.setBounds(110, 30, 110, 30);
		add(cajaTexto);
		
		boton = new JButton("Saludar");
		boton.setBounds(50, 80, 170, 30);
		add(boton);
		
		botonReset = new JButton("Borrar");
		botonReset.setBounds(50, 120, 170, 30);
		add(botonReset);
	}
	
	public void establecerManejador(ManejadorEventos manejador)
	{
		boton.addActionListener(manejador);
		botonReset.addActionListener(manejador);
	}
	
	public JButton getBoton() {
		return boton;
	}

	public JButton getBotonReset() {
		return botonReset;
	}

	public JTextField getCajaTexto() {
		return cajaTexto;
	}
}
