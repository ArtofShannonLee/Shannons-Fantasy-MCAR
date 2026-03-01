package entity;

import com.artofshannonlee.shannonsfantasymcar.ShannonsFantasyMCAR;
import forge.net.mca.entity.VillagerEntityMCA;
import forge.net.mca.entity.ai.relationship.Gender;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
//import MCA stuff
package net.mca.entity;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
        = DeferredRegister.create(ForgeRegistries.ENTITIES, ShannonsFantasyMCAR.MOD_ID);

    public static final RegistryObject<EntityType<ElfVillagerEntity>> ELF_VILLAGER =
            ENTITY_TYPES.register(name: "elf_villager",
                            () EntityType.Builder.create(ElfVillager::new,
                                    EntityClassification.AMBIENT).size(width: 1f, height: 3f)
                            .build(new ResourceLocation(ShannonsFantasyMCAR.MOD_ID, pathIn: "elf_villager").toString()));
    public static void register(IEventBus eventBus) {
            ENTITY_TYPES.register(eventBus);
    }
}