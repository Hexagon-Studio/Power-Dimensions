package power.keepeersofthestones.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class PointTPProcedure {
	public static void execute(LevelAccessor world, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if (world.isClientSide() == false) {
			{
				Entity _ent = entity;
				_ent.teleportTo(new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:tpX") ? ((EditBox) guistate.get("text:tpX")).getValue() : ""), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:tpY") ? ((EditBox) guistate.get("text:tpY")).getValue() : ""), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:tpZ") ? ((EditBox) guistate.get("text:tpZ")).getValue() : ""));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(guistate.containsKey("text:tpX") ? ((EditBox) guistate.get("text:tpX")).getValue() : ""), new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(guistate.containsKey("text:tpY") ? ((EditBox) guistate.get("text:tpY")).getValue() : ""), new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(guistate.containsKey("text:tpZ") ? ((EditBox) guistate.get("text:tpZ")).getValue() : ""), _ent.getYRot(),
							_ent.getXRot());
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
	}
}
