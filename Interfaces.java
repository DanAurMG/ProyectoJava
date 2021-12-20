import javax.swing.*;
import java.awt.event.*;

public class Interfaces extends JFrame implements ActionListener{
    private JTextField campotext;
    private JLabel etiqueta;
    private JButton boton1;
    public Interfaces(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
                       
        etiqueta = new JLabel("Me repinga la pinga");
        etiqueta.setBounds(20,20,100,100);
        add(etiqueta);
        
        campotext = new JTextField("Suputu");
        campotext.setBounds(100,100,60,60);
        add(campotext);
        
        boton1 = new JButton("Mostrar");
        boton1.setBounds(260,260,60,60);
        add(boton1);
        boton1.addActionListener(this);       
             
    }
    @Override
    public void actionPerformed(ActionEvent e){ 
        if(e.getSource() == boton1){
            String cadena = campotext.getText();
            JOptionPane.showMessageDialog(null,cadena);
        }
    }
    
    public static void main(String[] args) {
        Interfaces formulario = new Interfaces();
        formulario.setBounds(0,0,500,500);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);        
    }    
}

