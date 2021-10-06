public class StatisticsBySales {
    // метод сумма всех продаж
    public long sumSale(int[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;

    }

    // метод среднее значение всех продаж
    public double averageSumSale(int[] sales) {
        long sum = sumSale(sales);
        return (double) sum / sales.length;
    }

    // метод месяца с максимально большим  значением продаж
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    // метод месяца с минимально большим  значением продаж
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    //Кол-во месяцев, в которых продажи были ниже среднего
    public double lessThenAverageSumSale(int[] sales) {
        long sum = sumSale(sales);
        long average = sum / sales.length;
        int lessMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (average <= sales[lessMonth]) {
                lessMonth = month;
            }
            month = month + 1;
        }
        return lessMonth + 1;
    }

}

//Кол-во месяцев, в которых продажи были выше среднего


