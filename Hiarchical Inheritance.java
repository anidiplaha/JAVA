class Vehicle {

  double basePrice = 100000;

  public void showPrice() {
    System.out.println("The price of Vehicle is: Rs." + basePrice);
  }
}

class TwoWheeler extends Vehicle {

  double increasePriceBy = 0.20; // 0.2 times

  void finalPrice() {
    basePrice = basePrice + (basePrice * increasePriceBy);
    System.out.println(
      "After modification, The price of bike is: Rs." + basePrice
    );
  }
}

class FourWheeler extends Vehicle {

  double increasePriceBy = 1; // 1 times

  void finalPrice() {
    basePrice = basePrice + (basePrice * increasePriceBy);
    System.out.println(
      "After modification, The price of car is: Rs." + basePrice
    );
  }
}

public class Main {

  public static void main(String[] args) {
    TwoWheeler bike = new TwoWheeler();
    FourWheeler car = new FourWheeler();

  
    bike.showPrice();
    bike.finalPrice();
    car.showPrice();
    car.finalPrice();
  }
}
