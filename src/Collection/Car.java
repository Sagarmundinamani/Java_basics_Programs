package Collection;

public class Car {
    String brand;
    String model;

    Car(String brand,String model){
        this.brand=brand;
        this.model=model;
    }
    public String toString(){
        return "brand:"+brand+" model:"+model;
    }

    @Override
    public boolean equals(Object obj) {
        Car c=(Car) obj;
        return this.brand==c.brand &&this.model==c.model;
    }
}
