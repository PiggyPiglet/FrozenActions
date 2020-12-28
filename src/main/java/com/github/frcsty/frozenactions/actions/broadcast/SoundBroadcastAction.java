package com.github.frcsty.frozenactions.actions.broadcast;

import com.github.frcsty.frozenactions.actions.Action;
import com.github.frcsty.frozenactions.actions.ActionContext;
import org.bukkit.Bukkit;
import org.bukkit.Sound;

public final class SoundBroadcastAction implements Action {

    @Override
    public String getId() {
        return "SOUNDBROADCAST";
    }

    @Override
    public void run(final ActionContext context) {
        final String[] args = context.getDataAsStringArray(";");

        final Sound sound = Sound.valueOf(args[0]);
        final float volume = Float.valueOf(args[1]);
        final float pitch = Float.valueOf(args[2]);

        Bukkit.getOnlinePlayers().forEach(player -> player.playSound(player.getLocation(), sound, volume, pitch));
    }
}
