public class Penguin1 implements Moltable1{
  String currentLocation;
  int numberOfFeathers;


  public Penguin1(int initialFeatherCount){
    this.numberOfFeathers = initialFeatherCount;
  }

  @Override
  public void molt(){
    this.numberOfFeathers -= 1;
  }

  public void swim(){
    this.currentLocation = "in the water";
  }
}