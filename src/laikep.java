public class laikep {
    public void calculate(int p, int t, double r, int n) {
        double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Lãi kép sau " + t + " năm là : "+cinterest);
        System.out.println("Số tiền có được sau " + t + " năm là: "+amount);
    }
    public static void main(String args[]) {
        laikep obj = new laikep();
        obj.calculate(1500, 5, .07, 12);
    }
}