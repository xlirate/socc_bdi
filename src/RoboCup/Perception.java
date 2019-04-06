/**
 * File:   Perception.java
 * Author: Onyedinma Chidiebere
 * Date:   05/04/19
 * **/
package RoboCup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The Perception class uses all possible perceptions
 * as defined in the PlayerView enum declared in the PlayView class
 * and maps them to their equivalent boolean values
 * **/

public class Perception {
    private Map<PlayView.PlayerView, Boolean> isPerceived = new HashMap<>();
    private long id;


    public Perception(List<PlayView.PlayerView> perceptions){
        this.id = 0;
        for (PlayView.PlayerView perception : perceptions){
            isPerceived.put(perception, false);
        }
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public Map<PlayView.PlayerView, Boolean> getIsPerceived (){
        return isPerceived;
    }
}
