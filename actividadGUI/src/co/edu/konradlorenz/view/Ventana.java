package co.edu.konradlorenz.view;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Ventana extends JFrame {
    JPanel jpnDatos, jpnResp, jpnEjecuta;
    JLabel lblMedida;
    JTextField txtMedida;
    JButton btnEjecutar;
    JTextArea txtaResp;
    
    public Ventana () {
    	this.jpnDatos = new JPanel (new FlowLayout());
    	this.lblMedida = new JLabel ("Valor en Metros: ");
    	this.txtMedida = new JTextField(15);
    	this.jpnDatos.add(this.lblMedida);
    	this.jpnDatos.add(this.txtMedida);
    	this.jpnEjecuta = new JPanel (new FlowLayout());
    	this.btnEjecutar = new JButton ("Convertir");
    	this.jpnEjecuta.add(this.btnEjecutar);
    	this.jpnResp = new JPanel (new FlowLayout());
    	this.txtaResp = new JTextArea();
    	this.jpnResp.add(this.txtaResp);
    	this.setTitle("Conversión de Medidas");
    	this.getContentPane().setLayout(new BorderLayout());
    	add(jpnDatos,BorderLayout.NORTH);
    	add(jpnEjecuta,BorderLayout.CENTER);
    	add(jpnResp,BorderLayout.SOUTH);
    }

	public JPanel getJpnDatos() {
		return jpnDatos;
	}

	public void setJpnDatos(JPanel jpnDatos) {
		this.jpnDatos = jpnDatos;
	}

	public JPanel getJpnResp() {
		return jpnResp;
	}

	public void setJpnResp(JPanel jpnResp) {
		this.jpnResp = jpnResp;
	}

	public JPanel getJpnEjecuta() {
		return jpnEjecuta;
	}

	public void setJpnEjecuta(JPanel jpnEjecuta) {
		this.jpnEjecuta = jpnEjecuta;
	}

	public JLabel getLblMedida() {
		return lblMedida;
	}

	public void setLblMedida(JLabel lblMedida) {
		this.lblMedida = lblMedida;
	}

	public JTextField getTxtMedida() {
		return txtMedida;
	}

	public void setTxtMedida(JTextField txtMedida) {
		this.txtMedida = txtMedida;
	}

	public JButton getBtnEjecutar() {
		return btnEjecutar;
	}

	public void setBtnEjecutar(JButton btnEjecutar) {
		this.btnEjecutar = btnEjecutar;
	}

	public JTextArea getTxtaResp() {
		return txtaResp;
	}

	public void setTxtaResp(JTextArea txtaResp) {
		this.txtaResp = txtaResp;
	}
    
}
