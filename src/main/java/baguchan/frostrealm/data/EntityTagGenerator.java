package baguchan.frostrealm.data;

import baguchan.frostrealm.FrostRealm;
import baguchan.frostrealm.registry.FrostEntities;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.tags.EntityTypeTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class EntityTagGenerator extends EntityTypeTagsProvider {
	public EntityTagGenerator(DataGenerator generator, ExistingFileHelper exFileHelper) {
		super(generator, FrostRealm.MODID, exFileHelper);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void addTags() {
		tag(EntityTypeTags.FREEZE_IMMUNE_ENTITY_TYPES).add(FrostEntities.FROST_WRAITH.get(), FrostEntities.CLUST_WRAITH.get(), FrostEntities.YETI.get(), FrostEntities.GOKKUR.get(), FrostEntities.GOKKUDILLO.get(), FrostEntities.CRYSTAL_TORTOISE.get()
				, FrostEntities.MARMOT.get(), FrostEntities.SNOWPILE_QUAIL.get(), FrostEntities.FROST_WOLF.get(), FrostEntities.CRYSTAL_FOX.get(), FrostEntities.FROST_BEASTER.get());
	}
}