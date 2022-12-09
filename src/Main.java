public class Main {
    public static void main(String[] args) {

        //HW1. Task №1
        System.out.println("ДЗ-1. Задание №1");

        int monthlyDeposit = 15000;
        int numberMonth = 1;
        int amountSaving = 0;
        while (amountSaving < 2_459_000) {
            amountSaving += amountSaving / 100;
            amountSaving += monthlyDeposit;
            System.out.println("На конец " + numberMonth + "-го месяца сумма накоплений равна " + amountSaving + " рублей.");
            numberMonth++;
        }

        //HW1. Task №2
        System.out.println("");
        System.out.println("ДЗ-1. Задание №2");

        int number1 = 1;
        while (number1 <= 10) {
            System.out.print(number1 + " ");
            number1++;
        }
        System.out.println("");
        for (int number2 = 10; number2 >= 1; number2--) {
            System.out.print(number2 + " ");
        }

        //HW1. Task №3
        System.out.println("\n");
        System.out.println("ДЗ-1. Задание №3");

        int populationSize = 12000000;
        int birthRate = 17;
        int deathRate = 8;
        int year = 1;
        while (year <= 10) {
            populationSize += populationSize * (birthRate - deathRate)/ 1000;
            System.out.println(year + "-й год численность населения составляет " + populationSize + " человек");
            year++;
        }

        //HW2. Task №1
        System.out.println("");
        System.out.println("ДЗ-2. Задание №1");

        int numberOfMonth = 1;
        int amountOfSaving = 15_000;
        while (amountOfSaving < 12_000_000) {
            amountOfSaving += amountOfSaving * 7 / 100;
            System.out.println("На конец " + numberOfMonth + "-го месяца сумма накоплений равна " + amountOfSaving + " рублей.");
            numberOfMonth++;
        }

        //HW2. Task №2
        System.out.println("");
        System.out.println("ДЗ-2. Задание №2");

        int numberMonth1 = 0;
        int amountSaving1 = 15_000;
        while (amountSaving1 < 12_000_000) {
            amountSaving1 = amountSaving1 + amountSaving1 * 7 / 100;
            numberMonth1++;
            if (numberMonth1 % 6 == 0) {
                System.out.println("На конец " + numberMonth1 + "-го месяца сумма накоплений равна " + amountSaving1 + " рублей.");
            }
        }

        //HW2. Task №3
        System.out.println("");
        System.out.println("ДЗ-2. Задание №3");

        int numberMonth2 = 0;
        int amountSaving2 = 15_000;
        while (numberMonth2 <= 108) {
            amountSaving2 = amountSaving2 + amountSaving2 * 7 / 100;
            numberMonth2++;
            if (numberMonth2 % 6 == 0) {
                System.out.println("На конец " + numberMonth2 + "-го месяца сумма накоплений равна " + amountSaving2 + " рублей.");
            }
        }

        //HW2. Task №4
        System.out.println("");
        System.out.println("ДЗ-2. Задание №4");

        int dateFirstFriday = 1;
        while (dateFirstFriday <= 31) {
            System.out.println("Сегодня пятница, " + dateFirstFriday + "-е число. Необходимо подготовить отчет.");
            dateFirstFriday +=7;
            }

        //HW3. Task №1
        System.out.println("");
        System.out.println("ДЗ-3. Задание №1");

        int currentYear = 2022;
        int year1 = 0;
        while (year1 <= currentYear) {
            year1 += 79;
            if (year1 >= currentYear - 200 && year1 <= currentYear) {
                System.out.println("Кометы пролетали над Землей в " + year1 + " году.");
            } else if (year1 >= currentYear && year1 <= currentYear + 100) {
                System.out.println("Кометы пролетают над Землей в " + year1 + " году.");
            }
        }

        //HW3. Task №2
        System.out.println("");
        System.out.println("ДЗ-3. Задание №2");
        System.out.println("Таблица умножения на 2:");
        int multiplyable = 2;
        int multiplier = 1;
        for (; multiplier <= 10; multiplier++) {
            System.out.println(multiplyable + "*" + multiplier + "=" + (multiplyable * multiplier));
        }


    }
}