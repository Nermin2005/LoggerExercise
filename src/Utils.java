public class Utils {//utilities
    public static void runLogger(Logger[] loggers,String message) {//her zaman istifade edirik  deye static veririk
        for(Logger logger:loggers) {
            logger.log(message);
        }
    }
}
