/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidormain2;

/**
 *
 * @author Axel
 */
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame{
    public Ventana(){
		setTitle("Convertidor de Peso a Dolar");        
        	setSize(250,300);        
        	setResizable(false);        
        	setLocationRelativeTo(null);        
        	setDefaultCloseOperation(EXIT_ON_CLOSE);      
                init(); 
		setVisible(true);
     	}
	JPanel panel_principal;
    	JPanel panel_botones;
    	JTextField caja;
        private void init(){
		panel_principal = new JPanel();
        	panel_principal.setLayout(new BorderLayout());
        	caja = new JTextField();
        	panel_principal.add("North",caja);
        	panel_botones = new JPanel();
        	panel_botones.setLayout(new GridLayout(5,4,8,8));
        	convertir();
        	panel_principal.add("Center",panel_botones);
        	getContentPane().add(panel_principal);	
	}
	JButton boton[]= new JButton[14];
	double op1 = 0.0;
        double op2 = 19.0;
        boolean nueva = true;
	String operacion="";
	
        public void convertir(){
		boton[0] = new JButton("9");
		boton[1] = new JButton("8");
		boton[2] = new JButton("7");
		boton[3] = new JButton("6");
		boton[4] = new JButton("5");
		boton[5] = new JButton("4");
		boton[6] = new JButton("3");
		boton[7] = new JButton("2");
		boton[8] = new JButton("1");
		boton[9] = new JButton("0");
		boton[10] = new JButton(".");
		boton[11] = new JButton("CE");
		boton[12] = new JButton("conv");
		boton[13] = new JButton("=");
		for(int i=0; i<=12; i++){
                    panel_botones.add(boton[i]);
       		}		
		boton[11].addActionListener(new ActionListener(){
            		@Override
            		public void actionPerformed(ActionEvent evt){
                		caja.setText("");
                		op1=0;
                		operacion="";
            		}
        	});		
		boton[0].addActionListener(new ActionListener(){
            		@Override
            		public void actionPerformed(ActionEvent evt){
                		if(nueva){
					caja.setText("");
					nueva=false;
				}
                		caja.setText(caja.getText()+"9");
           		}
        	});
		boton[1].addActionListener(new ActionListener(){
            		@Override
            		public void actionPerformed(ActionEvent evt){
                		if(nueva){
					caja.setText("");
					nueva=false;
				}
                		caja.setText(caja.getText()+"8");
           		}
        	});
		boton[2].addActionListener(new ActionListener(){
            		@Override
            		public void actionPerformed(ActionEvent evt){
                		if(nueva){
					caja.setText("");
					nueva=false;
				}
                		caja.setText(caja.getText()+"7");
           		}
        	});
		boton[3].addActionListener(new ActionListener(){
            		@Override
            		public void actionPerformed(ActionEvent evt){
                		if(nueva){
					caja.setText("");
					nueva=false;
				}
                		caja.setText(caja.getText()+"6");
           		}
        	});
		boton[4].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evt){
				if(nueva){
					caja.setText("");
					nueva=false;
				}
				caja.setText(caja.getText()+"5");
			}
		});
		boton[5].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evt){
				if(nueva){
					caja.setText("");
					nueva=false;
				}
				caja.setText(caja.getText()+"4");
			}
		});
		boton[6].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evt){
				if(nueva){
					caja.setText("");
					nueva=false;
				}
				caja.setText(caja.getText()+"3");
			}
		});
		boton[7].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evt){
				if(nueva){
					caja.setText("");
					nueva=false;
				}
				caja.setText(caja.getText()+"2");
			}
		});
		boton[8].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evt){
				if(nueva){
					caja.setText("");
					nueva=false;
				}
				caja.setText(caja.getText()+"1");
			}
		});
		boton[9].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evt){
				if(nueva){
					caja.setText("");
					nueva=false;
				}
				caja.setText(caja.getText()+"0");
			}
		});
		boton[10].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evt){
				if(nueva){
					caja.setText("");
					nueva=false;
				}		
				caja.setText(caja.getText()+".");
			}
		});
                boton[12].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evt){
                                operacion = "conv";
                                try{
                                    op1=Double.parseDouble(caja.getText());
				}catch(Exception err){}
					if(operacion.equals("conv")){
                                            double res=op1/op2;
                                            caja.setText(String.valueOf(res));
                                            op1=0;
                                            operacion="";
					}
                                        nueva=true;
				}
							
			});
	}
        
	
}
