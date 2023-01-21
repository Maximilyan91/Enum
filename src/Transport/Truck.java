package Transport;

import Drivers.DriverC;

public class Truck extends Transport<DriverC> implements Racing {

    public enum Tonnage {
        N1(null,3.5f),
        N2(3.5f,12f),
        N3(12f, null);


        private final Float MIN_VALUE;
        private final Float MAX_VALUE;

        Tonnage(Float MIN_VALUE, Float MAX_VALUE) {
            this.MIN_VALUE = MIN_VALUE;
            this.MAX_VALUE = MAX_VALUE;
        }

        @Override
        public String toString() {
            if (MIN_VALUE == null) {
                return "Грузоподъемность до: " + MAX_VALUE + " тонн";
            } else if (MAX_VALUE == null) {
                return "Грузоподъемность свыше: " + MIN_VALUE + " тонн";
            }
            return "Грузоподъемность от: " + MIN_VALUE + " тонн, до: " + MAX_VALUE + " тонн";
        }
    }

    public Truck(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    public void getPitStop(Truck truck) {
        System.out.println(truck.getBrand() + " " + truck.getModel() + " - съехал с дистанции на питстоп!");
    }
    public void getBestTimeLap(Truck truck) {
        System.out.println(truck.getBrand() + " " + truck.getModel() + " - Лучшее время круга!");
    }
    public void getMaxSpeed(Truck truck) {
        System.out.println(truck.getBrand() + " " + truck.getModel() + " - Набрал максимальную скорость!");

    }
}
