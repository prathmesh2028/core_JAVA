package OOPs_in_java.ENum;

public enum Day {
    SUNDAY("Sunday") , MONDAY("Moday") , TUESDAY("Tuesday");

    public void display()
    {
        System.out.println("Today is " + this.name());
    }
    Day(String lower)
    {
        this.lower = lower;
    }
    private String lower;

}
