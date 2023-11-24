package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class VentanaSecundaria extends JDialog {

    private static final long serialVersionUID = 1L;
    private final JPanel contentPanel = new JPanel();
    JLabel etiquetaSaludo = new JLabel("new label");

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            VentanaSecundaria dialog = new VentanaSecundaria();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Create the dialog.
     */
    public VentanaSecundaria() {
        setBounds(100, 100, 285, 445);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setLayout(new FlowLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        {
            etiquetaSaludo.setHorizontalAlignment(SwingConstants.CENTER);
            etiquetaSaludo.setForeground(new Color(0, 0, 0));
            etiquetaSaludo.setFont(new Font("Tahoma", Font.BOLD, 18));

            contentPanel.add(etiquetaSaludo);
        }
        {
            JPanel buttonPane = new JPanel();
            buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
            getContentPane().add(buttonPane, BorderLayout.SOUTH);
            {
                JButton okButton = new JButton("OK");
                okButton.setActionCommand("OK");
                buttonPane.add(okButton);
                getRootPane().setDefaultButton(okButton);
            }
            {
                JButton botonCerrar = new JButton("Volver");
                botonCerrar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        dispose();
                    }
                });
                botonCerrar.setActionCommand("Cancel");
                buttonPane.add(botonCerrar);
            }
        }
    }

    public void establecerTexto(String nombreUsuario) {
        etiquetaSaludo.setText(nombreUsuario);
    }
}
