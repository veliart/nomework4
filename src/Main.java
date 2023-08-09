public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
        public static void task1() {
            System.out.println("Задание 1");
            int personAge = 15;
            if (personAge >= 18) {
                System.out.println("Если возраст человека равен " + personAge + ", то он совершеннолетний.");
            }
            else {
                System.out.println("Если возраст человека равен " + personAge + ", он не достиг совершеннолетия, нужно немного подождать.");
            }
        }
        public static void task2() {
            System.out.println("Задание 2");
            int airTemperature = 10;
            if (airTemperature < 5) {
                System.out.println("На улице холодно, нужно надеть шапку.");
            }
            else {
                System.out.println("Сегодня тепло, можно идти без шапки.");
            }
        }
        public static void task3() {
            System.out.println("Задание 3");
            int driverSpeed = 80;
            if (driverSpeed > 60) {
                System.out.println("Если скорость " + driverSpeed + ", то придется заплатить штраф.");
            }
            else {
                System.out.println("Если скорость " + driverSpeed + ", то можно ездить спокойно.");
            }
        }
        public static void task4() {
            System.out.println("Задание 4");
            int personAge = 33;
            if (personAge < 2) {
                System.out.println("Если возраст человека равен " + personAge + " то ему пора спать.");
            }
            else if (personAge >= 2 && personAge <= 6) {
                System.out.println("Если возраст человека равен " + personAge + " то ему нужно ходить в детский сад.");
            }
            else if (personAge > 6 && personAge <=18) {
                System.out.println("Если возраст человека равен " + personAge + " то ему нужно ходить в школу.");
            }
            else if (personAge > 18 && personAge <= 24) {
                System.out.println("Если возраст человека равен " + personAge + " то ему нужно ходить в университет.");
            }
            else if (personAge > 24 && personAge < 60) {
                System.out.println("Если возраст человека равен " + personAge + " то ему нужно ходить на работу.");
            }
            else {
                System.out.println("Если возраст человека равен " + personAge + " то он может отдохнуть.");
            }
        }
        public static void task5() {
            System.out.println("Задание 5");
            int childrenAge = 7;
            if (childrenAge < 5) {
                System.out.println("Если возраст ребенка равен " + childrenAge + ", то ему нельзя кататься на аттракционе.");
            }
            else if (childrenAge >= 5 && childrenAge < 14) {
                System.out.println("Если возраст ребенка равен " + childrenAge + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
            }
            else {
                System.out.println("Если возраст ребенка равен " + childrenAge + ", то ему можно кататься на аттракционе без сопровождении взрослого.");
            }
        }
        public static void task6() {
            System.out.println("Задание 6");
            int wagonCapacity = 120; // Вместимость вагона.
            int sittingPosition = 60; // Количество сидячих мест.
            int soldTicket = 44;
            if (soldTicket <= sittingPosition) {
                System.out.println("Ваше место в вагоне сидячее. Поздравляем!");
            }
            else if (soldTicket > sittingPosition && soldTicket <= wagonCapacity) {
                System.out.println("У Вас стоячее место. Держитесь!");
            }
            else {
                System.out.println("В этом вагоне мест больше нет. Может оно и к лучшему.");
            }
        }
        public static void task7() {
            System.out.println("Задание 7");
            int one;
            int two;
            int three;
            one = 5;
            two = -10;
            three = 20;
            if (one >= two && one >= three) { // Условие "больше или равно" на случай, если введенные числа будут равны
                System.out.println("Число " + one + " - самое большое из " + one + ", " + two + ", " + three + ".");
            }
            else if (two >= one && two >= three) {
                System.out.println("Число " + two + " - самое большое из " + one + ", " + two + ", " + three + ".");
            }
            else if (three >= one && three >= two) {
                System.out.println("Число " + three + " - самое большое из " + one + ", " + two + ", " + three + ".");
            }
        }
}