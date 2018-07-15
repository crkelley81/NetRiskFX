
/**
 * Role of an object that has an id.
 */
public interface Identifiable {
    public String getId();
}

/**
 * Role of an object with a human readable display
 * name.
 */
public interface Displayable {
    public String getDisplayName();
}

/**
 * 
 */
public interface Player extends Identifiable, Serializable, Displayable {
}

public interface Territory extends Identifiable, Serializable, Displayable {
    public Player getOwner();
}

public interface TerritoryMap extends Identifiable, Serializable, Displayable {


    public Stream<Territory> neighborsOf(final Territory territory, final Predicate<Territory> criteria);

default public Stream<Territory> neighborsOf(final Territory territory) {
    return neighborsOf(territory, t -> true);
}

    

}
