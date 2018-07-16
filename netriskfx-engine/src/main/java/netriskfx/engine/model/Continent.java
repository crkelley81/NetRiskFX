package netriskfx.engine.model;

import java.io.Serializable;
import java.util.Set;

public interface Continent extends Identifiable, Serializable, Displayable {
    /**
     * Returns the value of this territory if owned by a single
     * player.
     * @returns value value of territory if owned by single player
     */
    public int getValue();
    
    /**
     * Returns player who owns all territories in this contintent,
     * or Player.NONE if not owned by a single player.
     */
    public Player getOwner();
    
    /**
     * Returns true if all territories in this continent owned by
     * specified player.
     *
     * @param player the player
     * @returns true iff player owns all territories
     */
    public boolean isOwnedBy(final Player player);

    /**
     * Returns unmodifiable view of the territories in this
     * continent.
     *
     * @returns unmodifiable view of territories
     */
    public Set<Territory> territories();
}

