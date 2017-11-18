package pregunta5;

public class Logger {
    private String subsystem;
    
    public Logger(String subsystem) {
        this.subsystem = subsystem;
    }
    
    public void log(String message, LogType logType) {
        System.out.println(message + " via " + logType.toString() + " - " + subsystem);
    }
}
