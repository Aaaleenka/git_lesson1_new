public class Main {
    public static void main(String[] args)
    {
        long[] sales = {500, 3000, 3100, 5300, 5400, 4200 };
        SalesManager manager = new SalesManager(sales);
        System.out.println("Лучшая продажа у менеджера = " + manager.max());
        System.out.println("Обрезанное среднее  = " + manager.total());
    }
}