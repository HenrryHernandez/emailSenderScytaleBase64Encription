
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class mailSender {

    String correo, contra, para, mensaje;
    /*El constructor añade los valores a las variables que se usaran para enviar el mail, cuando se haga una referencia a esta 
    clase es porque queremos enciar un mail y en los valores que se pasen por parametro al constructor seran la informacion del 
    usuario interesado en enviar el mail*/
    public mailSender(String correo, String contra, String para, String mensaje) {
        this.correo = correo;
        this.contra = contra;
        this.para = para;
        this.mensaje = mensaje;
    }

    public void enviar() {
        
        //Se hacen los ajustes necesarios para enviar el mail
        Properties propies = new Properties();

        propies.put("mail.smtp.auth", "true");
        propies.put("mail.smtp.starttls.enable", "true");
        propies.put("mail.smtp.host", "smtp.gmail.com");
        propies.put("mail.smtp.port", "587");

        Session sesion = Session.getInstance(propies, new Authenticator() { //Se crea la sesion del usuario que quiere enviar el mail
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(correo, contra);
            }

        });

        MimeMessage msg = new MimeMessage(sesion);
        
        try { //Se intenta enviar el mail
            JOptionPane.showMessageDialog(null, "Enviando... Esto puede tardar");
            msg.setFrom(new InternetAddress(correo));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(para));
            msg.setSubject("Mensaje desde app de Java");
            msg.setText(mensaje);
            Transport.send(msg);

            JOptionPane.showMessageDialog(null, "Enviado");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
