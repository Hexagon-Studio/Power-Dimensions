
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.powerdimensions.init;

import power.powerdimensions.client.model.Modeltyrannosaurus_rex;
import power.powerdimensions.client.model.Modeltornadocc;
import power.powerdimensions.client.model.Modelshadow;
import power.powerdimensions.client.model.Modelrocket;
import power.powerdimensions.client.model.Modelmagic_arrow;
import power.powerdimensions.client.model.Modelglow;
import power.powerdimensions.client.model.ModelRaptor;
import power.powerdimensions.client.model.ModelPterodactyl;
import power.powerdimensions.client.model.ModelPlesiosaurus;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PowerDimensionsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeltyrannosaurus_rex.LAYER_LOCATION, Modeltyrannosaurus_rex::createBodyLayer);
		event.registerLayerDefinition(ModelPlesiosaurus.LAYER_LOCATION, ModelPlesiosaurus::createBodyLayer);
		event.registerLayerDefinition(Modeltornadocc.LAYER_LOCATION, Modeltornadocc::createBodyLayer);
		event.registerLayerDefinition(Modelshadow.LAYER_LOCATION, Modelshadow::createBodyLayer);
		event.registerLayerDefinition(ModelRaptor.LAYER_LOCATION, ModelRaptor::createBodyLayer);
		event.registerLayerDefinition(Modelmagic_arrow.LAYER_LOCATION, Modelmagic_arrow::createBodyLayer);
		event.registerLayerDefinition(Modelrocket.LAYER_LOCATION, Modelrocket::createBodyLayer);
		event.registerLayerDefinition(Modelglow.LAYER_LOCATION, Modelglow::createBodyLayer);
		event.registerLayerDefinition(ModelPterodactyl.LAYER_LOCATION, ModelPterodactyl::createBodyLayer);
	}
}
