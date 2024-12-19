// Клас Engine (Двигун)
class Engine {
    double horsepower;
    int cylinders;
    double fuelConsumptionPer100Km;  // Витрата палива на 100 км

    // Конструктор для ініціалізації змінних екземпляра
    public Engine(double horsepower, int cylinders, double fuelConsumptionPer100Km) {
        this.horsepower = horsepower;
        this.cylinders = cylinders;
        this.fuelConsumptionPer100Km = fuelConsumptionPer100Km;
    }

    // Void-метод для відображення потужності двигуна
    public void showPower() {
        System.out.println("Двигун має потужність: " + horsepower + " к.с.");
    }

    // Типізований метод для розрахунку витрати палива
    public double calculateFuelConsumption(int distance) {
        return (fuelConsumptionPer100Km / 100) * distance;
    }

    // Метод, що приймає параметр для розрахунку об'єму палива на 100 км
    public double calculateFuelPer100Km(double distance) {
        return (fuelConsumptionPer100Km / distance) * 100;
    }
}