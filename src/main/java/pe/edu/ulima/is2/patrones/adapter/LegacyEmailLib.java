package pe.edu.ulima.is2.patrones.adapter;

public class LegacyEmailLib {
    public void sendEmail(String address, String subject, String body) {
        System.out.println("Se envia mail a  " + address);
    }
}
