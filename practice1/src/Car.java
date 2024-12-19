
class Car {
    String model;
    Engine engine;
    Fuel fuel;


    public Car(String model, Engine engine, Fuel fuel) {
        this.model = model;
        this.engine = engine;
        this.fuel = fuel;
    }


    public void showCarInfo() {
        System.out.println("Модель автомобіля: " + model);
        engine.showPower();
        fuel.showFuelCost();
    }


    public double calculateTripCost(int distance) {
        double fuelCost = fuel.calculateFuelCostForDistance(distance);
        return fuelCost + engine.calculateFuelConsumption(distance);
    }


    public double calculateFuelUsage(int distance) {
        return engine.calculateFuelConsumption(distance);
    }
}