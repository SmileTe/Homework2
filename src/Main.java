public class Main {
    public static void main(String[] args) {

        //Задача 1

        byte SecondsInMinute = 60;
        short SecondsInHour = 3600;
        int SecondsInDay = 86400;
        long SecondsInYear = 31_536_000;

        float CatWeight = 5.5f;
        double CatAge = 1.45;

        boolean CatIsFat = CatWeight >= 5;
        char SadSmile = 40;

        //Задача 2
        float FirstBoxerWeight = 78.2f;
        float SecondBoxerWeight = 82.7f;
        float BoxersWeight = FirstBoxerWeight + SecondBoxerWeight;
        System.out.println("Общий вес двух бойцов " + BoxersWeight);
        float BoxersDifference = SecondBoxerWeight - FirstBoxerWeight ;
        System.out.println("Разница между весами бойцов " + BoxersDifference);

        //Задача 3
        short BananaWeight = 80;
        short MilkWeight = 105;
        short CreamWeight = 100;
        short EggWeight = 70;
        int ProductsWeight = 5*BananaWeight;
        ProductsWeight += MilkWeight*2;
        ProductsWeight+= CreamWeight*2;
        ProductsWeight+=EggWeight*4;

        System.out.println("Вес завтрака " + ProductsWeight + " г.");
        float GeneralProductsWeight = ProductsWeight/1000f;
        System.out.println("Вес завтрака " + GeneralProductsWeight + " кг.");

        //Задача 4
        byte RequiredWeightCg = 7;
        short RequiredWeightGr = 7*1000;
        int NumberDayMinumum = RequiredWeightGr / 250;
        int NumberDayMaximum = RequiredWeightGr / 500;
        System.out.println("Количество дней минимум " + NumberDayMinumum);
        System.out.println("Количество дней максимум " + NumberDayMaximum);
        int AverageNumberDay = NumberDayMaximum + NumberDayMinumum;
        AverageNumberDay /=2;
        System.out.println("Количество дней среднее " + AverageNumberDay);

        //Задача 5
        //месячная зарплата
        int SalaryMashaInMonth = 67_760;
        int SalaryDenisInMonth = 83_690;
        int SalaryCristinaInMonth = 76_230;
        //годовой доход
        int SalaryMashaInYear = SalaryMashaInMonth * 12;
        int SalaryDenisInYear = SalaryDenisInMonth * 12;
        int SalaryCristinaInYear = SalaryCristinaInMonth * 12;

        //месячная зарплата после повышения
        int SalaryMashaInMonthNew = SalaryMashaInMonth * 110/100;
        int SalaryDenisInMonthNew = SalaryDenisInMonth * 110/100;
        int SalaryCristinaInMonthNew = SalaryCristinaInMonth * 110/100;

        //годовой доход после повышения
        int SalaryMashaInYearNew = SalaryMashaInMonthNew * 12;
        int SalaryDenisInYearNew = SalaryDenisInMonthNew * 12;
        int SalaryCristinaInYearNew = SalaryCristinaInMonthNew * 12;

        //разница
        int SalaryMashaDifference =  SalaryMashaInYearNew - SalaryMashaInYear;
        int SalaryDenisDifference =  SalaryDenisInYearNew - SalaryDenisInYear;
        int SalaryCristinaDifference =  SalaryCristinaInYearNew - SalaryCristinaInYear;

        System.out.println("Маша теперь получает " + SalaryMashaInMonthNew +
                " рублей. Годовой доход вырос на " + SalaryMashaDifference + " рублей");
        System.out.println("Денис теперь получает " + SalaryDenisInMonthNew +
                " рублей. Годовой доход вырос на " + SalaryDenisDifference + " рублей");
        System.out.println("Кристина теперь получает " + SalaryCristinaInMonthNew +
                " рублей. Годовой доход вырос на " + SalaryCristinaDifference + " рублей");

    }
}