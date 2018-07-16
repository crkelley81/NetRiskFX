package netriskfx.engine.model;

import java.io.Serializable;
import java.util.function.Predicate;
import java.util.stream.Stream;

import netriskfx.util.role.Displayable;
import netriskfx.util.role.Identifiable;

public interface TerritoryMap extends Identifiable, Serializable, Displayable {

	public Stream<Territory> neighborsOf(final Territory territory, final Predicate<Territory> criteria);

	default public Stream<Territory> neighborsOf(final Territory territory) {
		return neighborsOf(territory, t -> true);
	}

}
