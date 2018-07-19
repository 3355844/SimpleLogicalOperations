public class Main {
    public static void main(String[] args) {
        Xbox check = new Xbox();
        check.checking(12,11,65,65);
        System.out.println(" ");
        System.out.println(" ");

        TwoNames names = new TwoNames();
        names.enterName("Jane", "Jane");
        names.enterName("Ann", "Jane");
        System.out.println(" ");
        System.out.println(" ");

        Seasons month = new Seasons();
        month.numberOfMonth(2);
        month.numberOfMonth(6);
        month.numberOfMonth(12);
        month.numberOfMonth(-1);
        month.numberOfMonth(22);
        }
}
