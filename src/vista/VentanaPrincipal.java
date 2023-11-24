package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controlador.ManejadorEventos;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame {

	private JLabel etiqueta, logo, nombreApp;
	private JTextField cajaTexto;
	private JButton boton, botonReset, botonAnadir;
	
	public VentanaPrincipal () {
		setSize (265,445);
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
		
		getContentPane().setBackground(new Color(26,54,104)); 			// pone color al fondo de la pantalla
		
		Image img= new ImageIcon("src/imagenes/3.jpg").getImage();
		logo = new JLabel(new ImageIcon(img.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setBounds(95, 20, 80, 80);
		add(logo);

// Añadimos un texto debajo del logo
// Para cambiar de font podemos encontrar un monton de ellas en dafont.com
		
		try {
			Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("antropof.ttf"));
			
			nombreApp = new JLabel("Mi APP");
			nombreApp.setHorizontalAlignment(SwingConstants.CENTER);
			nombreApp.setFont(font.deriveFont(Font.BOLD, 40f));
			nombreApp.setBounds(0,120,285,30);
			nombreApp.setForeground(Color.WHITE);
			add(nombreApp);
			
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
// Etiqueta del nombre
// Normalmente se utiliza JLabel para escribir el icono, pero si queremos cambiarla por un icono 
//		lo realizamos como la linea descomentada.
// Para encontrar iconos gratuitos tenemos:
//		- https://fonts.google.com/icons
// 		- https://pictogrammers.com/
//		
//		etiqueta = new JLabel ("Nombre");
		etiqueta = new JLabel (new ImageIcon("src/imagenes/person.png")); 	// Sustituimos el texto por un icono										
		etiqueta.setBounds(50, 210, 50, 30);
		etiqueta.setFont(new Font("Dialog",Font.PLAIN, 14));
		etiqueta.setForeground(Color.WHITE);
		add(etiqueta);
		
		cajaTexto = new JTextField();
		cajaTexto.setBounds(100, 210, 120, 30);
		cajaTexto.setBorder(null);
		cajaTexto.setFont(new Font("Dialog",Font.PLAIN, 12));
		cajaTexto.setForeground(new Color(26,54,104));
		add(cajaTexto);
		
		boton = new JButton("Entrar");
		boton.setBounds(50, 260, 170, 30);
		boton.setFont(new Font("Dialog",Font.BOLD, 14));
		boton.setForeground(new Color(26,54,104));
		boton.setBackground(Color.WHITE);
		add(boton);
		
		botonReset = new JButton("Borrar");
		botonReset.setBounds(50, 300, 170, 30);
		botonReset.setFont(new Font("Dialog",Font.BOLD, 14));
		botonReset.setForeground(new Color(26,54,104));
		botonReset.setBackground(Color.WHITE);
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
