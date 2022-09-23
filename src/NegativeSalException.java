public class NegativeSalException extends Exception {
    private String empName;
    private int sal;
    private long dateTime;

    public NegativeSalException(String message, String empName, int sal, long dateTime) {
        super(message);
        this.empName = empName;
        this.sal = sal;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "NegativeSalException{" +
                "empName='" + empName + '\'' +
                ", sal=" + sal +
                ", dateTime=" + dateTime +
                '}';
    }
}
