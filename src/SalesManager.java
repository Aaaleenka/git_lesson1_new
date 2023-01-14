public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int total() {
        int total = 0;
        int qTotal = 0;
        for (int i=0; i < sales.length; i++) {
            if ((sales[i] != min()) & (sales[i] != max())) {
                total += sales[i];
                qTotal++;
            }
        }
        return Math.round(total / qTotal);
    }

}