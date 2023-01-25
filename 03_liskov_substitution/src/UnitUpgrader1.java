public class UnitUpgrader {
  public void upgrade (Apartment apartment){
    apartment.squareFootage += 40;
    
    if (apartment.canAddBedroom()){
      apartment.numberOfBedrooms +=1;
      }
  }
}