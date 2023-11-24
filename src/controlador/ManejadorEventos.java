package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VentanaPrincipal;
import vista.VentanaSecundaria;

public class ManejadorEventos implements ActionListener {

	private VentanaPrincipal ventana;
	
	public ManejadorEventos(VentanaPrincipal ventana) {
		this.ventana = ventana;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==ventana.getBoton())
		{
//			ventana.setTitle("Hola " + ventana.getCajaTexto().getText());
			VentanaSecundaria ventana2 = new VentanaSecundaria();
			ventana2.establecerTexto("Hola " + ventana.getCajaTexto().getText());
			ventana2.setVisible(true);
		}
		if (e.getSource()==ventana.getBotonReset())
		{
			ventana.setTitle("Mi primera Ventana ");
			ventana.getCajaTexto().setText("");
			ventana.getCajaTexto().requestFocus();
		}
	}

}
