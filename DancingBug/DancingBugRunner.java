import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class DancingBugRunner {

  public static void main(String[] args)
  {
    ActorWorld world = new ActorWorld();
    int[] turns = {3,4,1,2};
    DancingBug danceBug = new DancingBug(turns);
    danceBug.setColor(Color.ORANGE);
    world.add(new Location(6, 3), danceBug);
    world.show();
} }