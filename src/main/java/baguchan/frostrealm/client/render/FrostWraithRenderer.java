package baguchan.frostrealm.client.render;

import baguchan.frostrealm.FrostRealm;
import baguchan.frostrealm.client.FrostModelLayers;
import baguchan.frostrealm.client.model.FrostWraithModel;
import baguchan.frostrealm.entity.FrostWraith;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FrostWraithRenderer<T extends FrostWraith> extends MobRenderer<T, FrostWraithModel<T>> {
	private static final ResourceLocation WRAITH = new ResourceLocation(FrostRealm.MODID, "textures/entity/frost_wraith/frost_wraith.png");
	private static final RenderType WRAITH_GLOW = RenderType.eyes(new ResourceLocation(FrostRealm.MODID, "textures/entity/frost_wraith/frost_wraith_glow.png"));


	public FrostWraithRenderer(EntityRendererProvider.Context p_173952_) {
		super(p_173952_, new FrostWraithModel<>(p_173952_.bakeLayer(FrostModelLayers.FROST_WRAITH)), 0.5F);
		this.addLayer(new EyesLayer<T, FrostWraithModel<T>>(this) {
			@Override
			public RenderType renderType() {
				return WRAITH_GLOW;
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(T p_110775_1_) {
		return WRAITH;
	}
}