package netriskfx.engine.model;

import java.io.Serializable;
import java.util.function.Predicate;
import java.util.stream.Stream;

import netriskfx.util.role.Displayable;
import netriskfx.util.role.Identifiable;



public interface Territory extends Identifiable, Serializable, Displayable {
    public Player getOwner();
}
