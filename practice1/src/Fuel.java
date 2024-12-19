// Клас Fuel (Паливо)
class Fuel {
    String type;
    double pricePerLiter;
    double volume;

    // Конструктор для ініціалізації змінних екземпляра
    public Fuel(String type, double pricePerLiter, double volume) {
        this.type = type;
        this.pricePerLiter = pricePerLiter;
        this.volume = volume;
    }

    // Void-метод для відображення вартості палива
    public void showFuelCost() {
        System.out.println("Ціна за літр палива: " + pricePerLiter + " грн.");
    }

    // Типізований метод для обчислення вартості заповнення бака
    public double calculateTotalCost() {
        return pricePerLiter * volume;
    }

    // Метод, що приймає параметр для визначення вартості палива для певної відстані
    public double calculateFuelCostForDistance(int distance) {
        return distance * pricePerLiter;
    }
}