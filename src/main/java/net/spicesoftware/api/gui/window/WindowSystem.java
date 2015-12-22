package net.spicesoftware.api.gui.window;

import net.spicesoftware.api.util.AlreadyRegisteredException;

/**
 * @since 2015/12/15
 */
public interface WindowSystem<WS extends WindowSystem<WS>> {

    WindowDispatcher<WS> getDispatcher();
}