import java.util.ArrayList;

public class DogBoarder {
  int total_slots = 10;
  double daily_rate = 3.50;
  int shots = 0;
  boolean full = false;
  ArrayList<String> list = new ArrayList<>();

  public int slots_occupied() {
    return shots;
  }

  public boolean is_full() {
    if (shots >= 10) {
      full = true;
    }
    return full;
  }

  public String board(String one, String two, String three) {
    if (is_full()) {
      return "Error: No available slots.";
    } else {
      list.add(one);
      list.add(two);
      list.add(three);
      shots++;

      return "Buddy has been boarded";
    }
  }

  public String pick_up(String one, String two, String three, int days) {
    if (list.contains(one) && list.contains(two) && list.contains(three)) {
      shots--;
      String cost = "You owe $" + (days * daily_rate) + "0.";
      System.out.println(cost);
      return cost;
    } else {
      return ("Error: Dog not found.");
    }
  }
}
