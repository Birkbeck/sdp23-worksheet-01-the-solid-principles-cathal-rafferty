public final class PenthouseSuite extends Apartment {
  public PenthouseSuite(){
    this.numberOfBedrooms = 4;
  }

public void setSquareFootage(int sqft){
  this.squareFootage = sqft;
}

  public boolean canAddBedroom(){
    return true;
  }
  
}