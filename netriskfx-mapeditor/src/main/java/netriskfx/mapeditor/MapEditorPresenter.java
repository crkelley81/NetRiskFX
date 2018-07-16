package netriskfx.mapeditor;

import java.util.Objects;

import javax.inject.Inject;

/**
 * Main (top-level) presenter for the MapEditor.
 * 
 * @author christopher
 *
 */
public class MapEditorPresenter {
	private final MapEditorScope scope;
	
	@Inject MapEditorPresenter(final MapEditorScope scope) {
		this.scope = Objects.requireNonNull(scope);
	}
}
