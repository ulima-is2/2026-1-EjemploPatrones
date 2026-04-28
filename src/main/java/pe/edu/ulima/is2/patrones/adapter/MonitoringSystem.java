package pe.edu.ulima.is2.patrones.adapter;

public class MonitoringSystem {
    private LegacyEmailLib emailService;
    private FastSMS_Adaptee smsService;

    private int notificationType = 0; // EMAIL

    public MonitoringSystem() {
        this.emailService = new LegacyEmailLib();
        this.smsService = new FastSMS_Adaptee();
    }

    public void processAlerts() {
        if (notificationType == 0) {
            emailService.sendEmail("aron@ulima.edu.pe",
                    "Titulo",
                    "Contenido");
        }else {
            smsService.sendInstantMessage("4565464", "Hola");
        }

    }

    public int getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(int notificationType) {
        this.notificationType = notificationType;
    }
}
