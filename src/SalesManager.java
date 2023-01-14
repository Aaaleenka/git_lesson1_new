public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long total() {
        long total = 0;
        long qTotal = 0;
        for (int i=0; i < sales.length; i++) {
            if ((sales[i] != min()) & (sales[i] != max())) {
                total += sales[i];
                qTotal++;
            }
        }
        return Math.round(total / qTotal);
    }

}