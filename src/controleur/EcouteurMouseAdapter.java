package controleur;
import utilitaire.*;
import vue.*;
import model.*;
import vue.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.sql.*;
import java.awt.*;



public class EcouteurMouseAdapter extends MouseAdapter {

	private FenetrePrincipale fp;
	
	public EcouteurMouseAdapter(FenetrePrincipale fp){
		this.fp=fp;
		addListener();

	}
	

	public void mousePressed(MouseEvent e) {
		JButton jb = (JButton) e.getComponent();
		System.out.println("jb");
		if(jb.getName().equals("nouvRequ")){
			
		}
		else if(jb.getName().equals("tuple")){
			fp.getTupleMenu().show(e.getComponent(), e.getComponent().getX()+e.getComponent().getWidth(), e.getComponent().getY()-2*(e.getComponent().getHeight()));
		}
		else if(jb.getName().equals("trigger")){
			fp.getTriggerMenu().show(e.getComponent(), e.getComponent().getX()+e.getComponent().getWidth(), e.getComponent().getY()-3*(e.getComponent().getHeight()));
		}
		else if(jb.getName().equals("table")){
			fp.getTableMenu().show(e.getComponent(), e.getComponent().getX()+e.getComponent().getWidth(), e.getComponent().getY()-(e.getComponent().getHeight()));
		}
		else if(jb.getName().equals("vue")){
			fp.getVueMenu().show(e.getComponent(), e.getComponent().getX()+e.getComponent().getWidth(), e.getComponent().getY()-4*(e.getComponent().getHeight()));
		}
	}


	

	public void addListener(){
		fp.getBouttonNouvRequ().addMouseListener(this);
		fp.getBouttonTable().addMouseListener(this);
		fp.getBouttonTrigger().addMouseListener(this);
		fp.getBouttonTuple().addMouseListener(this);
		fp.getBouttonVue().addMouseListener(this);
	}

}