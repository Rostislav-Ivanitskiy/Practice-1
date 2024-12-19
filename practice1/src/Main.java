public class Main {
    public static void main(String[] args) {

        Engine carEngine = new Engine(200, 4, 8.5); // Потужність, кількість циліндрів, витрата палива
        Fuel carFuel = new Fuel("Бензин", 52, 50); // Тип палива, ціна за літр, об'єм палива
        Car myCar = new Car("Toyota Corolla", carEngine, carFuel); // Модель автомобіля, двигун, паливо


        myCar.showCarInfo();

        int tripDistance = 75; // Відстань поїздки
        System.out.println("Вартість поїздки на відстань " + tripDistance + " км: " + myCar.calculateTripCost(tripDistance) + " грн.");
        System.out.println("Витрата палива на поїздку: " + myCar.calculateFuelUsage(tripDistance) + " л.");


        System.out.println("Витрати палива на 100 км: " + carEngine.calculateFuelPer100Km(100) + " л.");
    }
}