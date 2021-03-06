package baguchan.frostrealm.client.render;

import baguchan.frostrealm.FrostRealm;
import baguchan.frostrealm.client.FrostModelLayers;
import baguchan.frostrealm.client.model.FrostWolfModel;
import baguchan.frostrealm.client.render.layer.FrostWolfCollarLayer;
import baguchan.frostrealm.entity.FrostWolf;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FrostWolfRenderer extends MobRenderer<FrostWolf, FrostWolfModel<FrostWolf>> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(FrostRealm.MODID, "textures/entity/frost_wolf/frost_wolf.png");
	private static final ResourceLocation TAMED_TEXTURE = new ResourceLocation(FrostRealm.MODID, "textures/entity/frost_wolf/frost_wolf_tamed.png");


	public FrostWolfRenderer(EntityRendererProvider.Context p_173952_) {
		super(p_173952_, new FrostWolfModel<>(p_173952_.bakeLayer(FrostModelLayers.FROST_WOLF)), 0.5F);
		this.addLayer(new FrostWolfCollarLayer(this));
	}

	@Override
	protected void scale(FrostWolf p_115314_, PoseStack p_115315_, float p_115316_) {
		float size = p_115314_.getScale();
		p_115315_.scale(size, size, size);
		super.scale(p_115314_, p_115315_, p_115316_);
	}

	@Override
	public ResourceLocation getTextureLocation(FrostWolf p_110775_1_) {
		if (p_110775_1_.isTame()) {
			return TAMED_TEXTURE;
		}
		return TEXTURE;
	}
}