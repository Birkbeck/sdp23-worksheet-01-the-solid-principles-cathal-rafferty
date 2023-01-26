public class Eagle1 implements Flyable, Moltable{
  String currentLocation;
  int numberOfFeathers;


  public Eagle1(int initialFeatherCount){
    this.numberOfFeathers = initialFeatherCount;
      
  }

  @Override
  public void fly(){
    this.currentLocation = "In the Air";
  }

  @Override
  public void molt(){
    this.numberOfFeathers -= 1
  }
}