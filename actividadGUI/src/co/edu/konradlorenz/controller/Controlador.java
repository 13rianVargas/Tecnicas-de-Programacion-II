package co.edu.konradlorenz.controller;

import java.awt.event.*;

import javax.swing.*;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.Ventana;

public class Controlador implements ActionListener {

	private final Ventana objV;
	private final Medida objM;
	
	public Controlador (Ventana frmV, Medida objM) {
		this.objV = frmV;
		this.objM = objM;
		this.objV.getBtnEjecutar().addActionListener(this);
	}
	public Controlador() {
		this.objV = new Ventana();
		this.objM = new Medida();
		this.objV.getBtnEjecutar().addActionListener(this);
	}
	public void setVisible(boolean bln) {
		this.objV.pack();
		this.objV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.objV.setLocationRelativeTo(null);
		objV.setVisible(bln);
	}
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(this.objV.getBtnEjecutar() == evento.getSource()) {
			this.objM.setValor(Double.parseDouble(this.objV.getTxtMedida().getText()));
			this.objV.getTxtaResp().append("El valor de " + objM.getValor() + " en centímetros es " + objM.convEnCm() + "cms");
		} else {
			this.objV.getTxtaResp().append("El valor digitado no es correcto!...");
		}
	}
}
