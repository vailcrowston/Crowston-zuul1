/**
 *  An updated variation of World of Zuul called, Girly World. 
 *  Here in Girly World, we have six rooms: 
 *  a makeup studio, a boutique, a flower garden, a spa, a coffee shop, and a fashion runway.
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 * @author  Vail Crowston
 */

public class Room 
{
    private String description;
    private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east exit.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExits(Room north, Room east, Room south, Room west) 
    {
        this.northExit = north;
        this.eastExit = east;
        this.southExit = south;
        this.westExit = west;
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Get the exit in the specified direction.
     * @param direction The direction to get the exit (north, south, east, west).
     * @return The room that is in the specified direction, or null if there is no exit.
     */
    public Room getExit(String direction) 
    {
        switch(direction.toLowerCase()) {
            case "north":
                return northExit;
            case "south":
                return southExit;
            case "east":
                return eastExit;
            case "west":
                return westExit;
            default:
                return null;  // Invalid direction
        }
    }
}
