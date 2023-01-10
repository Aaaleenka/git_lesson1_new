# Лучшая продажа у менеджера #
###### Класс  *SalesManager* создает менеджера у которого есть определенные продажи ###### 
###### Метод *max()* определяет максимальную продажу среди них ###### 
```Java
    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
```