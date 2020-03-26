
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class enviar extends JFrame {

    JLabel lblCorreo, lblContra, lblPara;
    JTextField txtCorreo, txtContra, txtPara;
    JButton aceptar, cancelar;
    
    String correo, contra, para;

    enviar(String mensaje) {
        setLayout(null);
        setBounds(100, 50, 315, 200);

        lblCorreo = new JLabel("Correo: ");
        lblCorreo.setBounds(10, 10, 100, 30);
        add(lblCorreo);

        lblContra = new JLabel("Contraseña: ");
        lblContra.setBounds(10, 40, 100, 30);
        add(lblContra);

        lblPara = new JLabel("Para: ");
        lblPara.setBounds(10, 70, 100, 30);
        add(lblPara);

        txtCorreo = new JTextField();
        txtCorreo.setBounds(90, 10, 190, 30);
        add(txtCorreo);

        txtContra = new JTextField();
        txtContra.setBounds(90, 40, 190, 30);
        add(txtContra);

        txtPara = new JTextField();
        txtPara.setBounds(90, 70, 190, 30);
        add(txtPara);

        aceptar = new JButton("Aceptar");
        aceptar.setBounds(90, 120, 75, 25);
        aceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(txtCorreo.getText().equals("") || txtContra.getText().equals("") || txtPara.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Ingresa los datos correspondientes en los espacios");
                }else{
                    correo = txtCorreo.getText();
                    contra = txtContra.getText();
                    para = txtPara.getText();
                    
                    mailSender enviar = new mailSender(correo, contra, para, mensaje);
                    enviar.enviar();
                    
                    setVisible(false);
                }
            }
        });
        add(aceptar);

        cancelar = new JButton("Cancelar");
        cancelar.setBounds(175, 120, 85, 25);
        cancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        add(cancelar);
        
        setVisible(true);
    }
    
    
    
    public String getCorreo(){
        return correo;
    }
    
    public String getContra(){
        return contra;
    }
    
    public String getPara(){
        return para;
    }
}
