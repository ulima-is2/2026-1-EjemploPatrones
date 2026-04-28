package pe.edu.ulima.is2.patrones.adapter;

public class FastSMS_Adaptee {
    public void sendInstantMessage(String phone, String msg) {
        System.out.println("Se enviara SMS a " + phone);
    }
}
