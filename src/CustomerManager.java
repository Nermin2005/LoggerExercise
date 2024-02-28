public class CustomerManager {
    private Logger[] loggers;
    public CustomerManager(Logger[] loggers) {
        this.loggers=loggers;
    }
    public void add(Customer customer) {
        System.out.println("Elave edildi:"+customer.getFirstName());
         Utils.runLogger(loggers, customer.getFirstName());
    }
    public void delete(Customer customer) {
        System.out.println("Silindi:"+customer.getFirstName());
        Utils.runLogger(loggers, customer.getFirstName());

    }
}
