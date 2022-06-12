import java.util.HashMap;

public class StepTracker {
    int step;
    String month;
    int monthDay;
    int normStep = 10000;
    HashMap<String, MonthDate> monthToDate = new HashMap<>();
    Converter converter = new Converter();
    MonthDate monthDate = new MonthDate();

    public StepTracker() {


            }

    void putMothDate(String month, int monthDay, int step) {
        if (monthDay > 0 && monthDay < 31) {
            monthToDate.put(month, new MonthDate());
            monthDate.putMonthDays(monthDay, step);
        } else {
            System.out.println("Не верное значение дней в месяце");

        }
        }


        public class MonthDate {
            HashMap<Integer, Integer> monthDate = new HashMap<>();

            public MonthDate() {
                for (int i = 1; i < 31; i++) {
                    monthDate.put(i, 0);
                }
            }

            public void putMonthDays(int monthDay, int step) {

                monthDate.put(monthDay, step);

            }

            void saveMonthDate() {

                System.out.println(monthDate.entrySet());
            }

            void getSumStep() {
                int sum = 0;
                int mean = 0;
                for (int step : monthDate.values()) {
                    sum += step;
                    mean = sum / 30;

                }
                System.out.println("Общее количество шагов за месяц :" + sum);
                System.out.println("Среднее колличество за месяц :" + mean);
                converter.convert(sum);

            }

            void getMaxStepMonth() {
                int maxStep = 0;

                for (int step : monthDate.values()) {
                    if (step > maxStep) {
                        maxStep = step;

                    }
                }

                System.out.println("Максимальное пройденное количество шагов в месяце :" + maxStep);
            }

            void bestSerias() {
                int days = 0;
                int bestSeries = 0;
                for (int step : monthDate.values()) {
                    if (step > 1) {
                        days++;
                    }
                    if (bestSeries < days) {
                        bestSeries = days;
                    }
                }
                System.out.println("Лучшая серия :" + bestSeries);
            }
        }

        void statisticMonth () {
            monthDate.getMaxStepMonth();
            monthDate.getSumStep();
            monthDate.bestSerias();
        }

        void printStepToDate (String month){
            for (String months : monthToDate.keySet()) {
                if (month.equalsIgnoreCase(months)) {
                    System.out.println("Месяц :" + month + ":");
                    monthDate.saveMonthDate();
                } else {
                    System.out.println("Статистики за такой месяц нет");
                }
            }
        }

        void dailyStepLimit ( int limit){
            if (limit >= 0) {
                System.out.println("Норма шагов изменена :" + limit + "шагов");
            } else if (limit < 0) {
                System.out.println("Норма не может быть отрицательной");
            }

        }


    }











