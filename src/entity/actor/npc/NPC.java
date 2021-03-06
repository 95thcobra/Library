package entity.actor.npc;

import entity.Entity;
import entity.actor.ActionQueue;
import entity.actor.Actor;
import entity.geometry.Location;
import entity.geometry.path.Mobile;
import game.loot.DropTableHolder;

/**
 * 
 * @author Albert Beaupre
 */
public abstract class NPC extends Entity implements Actor, DropTableHolder, Mobile {

	private final ActionQueue<NPC> actions = new ActionQueue<>();

	/**
	 * Constructs a new {@code NPC} located at the specified {@code location}.
	 * 
	 * @param location
	 *            the location to create this {@code NPC} at.
	 */
	public NPC(Location location) {
		super.setLocation(location);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see entity.actor.Actor#getActions()
	 */
	public ActionQueue<NPC> getActions() {
		return actions;
	}

}
