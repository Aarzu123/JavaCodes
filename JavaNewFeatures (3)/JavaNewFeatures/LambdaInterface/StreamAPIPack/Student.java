package StreamAPIPack;

public class Student {

    private String stdName;
    private int stdAge;
    private double feeAmount;

    public Student() {

    }

    public Student(String stdName, int stdAge, double feeAmount) {
        this.stdName = stdName;
        this.stdAge = stdAge;
        this.feeAmount = feeAmount;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getStdAge() {
        return stdAge;
    }

    public void setStdAge(int stdAge) {
        this.stdAge = stdAge;
    }

    public double getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(double feeAmount) {
        this.feeAmount = feeAmount;
    }

    @Override
    public String toString() {
        return "Student [stdName=" + stdName + ", stdAge=" + stdAge + ", feeAmount=" + feeAmount + "]";
    }
}