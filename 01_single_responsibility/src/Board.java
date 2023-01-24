import java.util.ArrayList;
import java.util.List;

public class Board {
    List<String> spots;

    public Board() {
        this.spots = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            this.spots.add(String.valueOf(i));
        }
    }

}


class Display {
  public void display(List<String> spots){
    String formattedSpots = spots.get(0) + " | " + spots.get(1) + " | " + spots.get(2) + "\n"
      + spots.get(3) + " | " + spots.get(4) + " | " + spots.get(5) + "\n"
            + spots.get(6) + " | " + spots.get(7) + " | " + spots.get(8);
        System.out.print(formattedSpots);
  }
}


    
