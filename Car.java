public class Car {

  //variables
  private String makeOfCar;
  private String modelOfCar;

  public Car(String make, String model) {
      this.makeOfCar = make;
      this.modelOfCar = model;
  }


  public String getMake() {
    return makeOfCar;
  }

  public String getModel() {
    return modelOfCar;
  }

  public static void main(String[] args) {
    Car car1 = new Car("BWM", "X1");
    System.out.println(car1.modelOfCar);
  }
}
