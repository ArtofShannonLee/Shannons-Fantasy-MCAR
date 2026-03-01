package entity.custom;


import forge.net.mca.entity.VillagerEntityMCA;
import forge.net.mca.entity.VillagerLike;
import forge.net.mca.entity.ai.DialogueType;
import forge.net.mca.entity.ai.relationship.AgeState;
import forge.net.mca.entity.ai.relationship.Gender;
import forge.net.mca.server.world.data.PlayerSaveData;
import forge.net.mca.util.network.datasync.CParameter;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.entity.PartEntity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ElfVillager extends VillagerEntityMCA {
    public ElfVillager(EntityType<? extends VillagerEntityMCA> type, World worldIn, Gender gender) {
        super(type, worldIn, gender);
    }
    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 20.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.33D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 13.0D)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 50.0D);
}

    @Override
    public boolean isSpeechImpaired() {
        return super.isSpeechImpaired();
    }

    @Override
    public boolean isToYoungToSpeak() {
        return super.isToYoungToSpeak();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setCustomSkin(String name) {
        super.setCustomSkin(name);
    }

    @Override
    public boolean hasCustomSkin() {
        return super.hasCustomSkin();
    }

    @Override
    public boolean canBeAttractedTo(VillagerLike<?> other) {
        return super.canBeAttractedTo(other);
    }

    @Override
    public boolean canBeAttractedTo(PlayerSaveData other) {
        return super.canBeAttractedTo(other);
    }

    @Override
    public Hand getDominantHand() {
        return super.getDominantHand();
    }

    @Override
    public Hand getOpposingHand() {
        return super.getOpposingHand();
    }

    @Override
    public EquipmentSlotType getSlotForHand(Hand hand) {
        return super.getSlotForHand(hand);
    }

    @Override
    public EquipmentSlotType getDominantSlot() {
        return super.getDominantSlot();
    }

    @Override
    public EquipmentSlotType getOpposingSlot() {
        return super.getOpposingSlot();
    }

    @Override
    public ITextComponent getProfessionName() {
        return super.getProfessionName();
    }

    @Override
    public IFormattableTextComponent getProfessionText() {
        return super.getProfessionText();
    }

    @Override
    public String getClothes() {
        return super.getClothes();
    }

    @Override
    public void setClothes(ResourceLocation clothes) {
        super.setClothes(clothes);
    }

    @Override
    public void setClothes(String clothes) {
        super.setClothes(clothes);
    }

    @Override
    public String getHair() {
        return super.getHair();
    }

    @Override
    public void setHair(String hair) {
        super.setHair(hair);
    }

    @Override
    public void setHairDye(DyeColor color) {
        super.setHairDye(color);
    }

    @Override
    public void clearHairDye() {
        super.clearHairDye();
    }

    @Override
    public float[] getHairDye() {
        return super.getHairDye();
    }

    @Override
    public AgeState getAgeState() {
        return super.getAgeState();
    }

    @Override
    public void updateSpeed() {
        super.updateSpeed();
    }

    @Override
    public float getHorizontalScaleFactor() {
        return super.getHorizontalScaleFactor();
    }

    @Override
    public float getRawScaleFactor() {
        return super.getRawScaleFactor();
    }

    @Override
    public DialogueType getDialogueType(PlayerEntity receiver) {
        return super.getDialogueType(receiver);
    }

    @Override
    public TranslationTextComponent getTranslatable(PlayerEntity target, String phraseId, Object... params) {
        return super.getTranslatable(target, phraseId, params);
    }

    @Override
    public void sendChatToAllAround(String phrase, Object... params) {
        super.sendChatToAllAround(phrase, params);
    }

    @Override
    public void sendChatMessage(PlayerEntity target, String phraseId, Object... params) {
        super.sendChatMessage(target, phraseId, params);
    }

    @Override
    public void sendChatMessage(IFormattableTextComponent message, Entity receiver) {
        super.sendChatMessage(message, receiver);
    }

    @Override
    public void sendEventMessage(ITextComponent message, PlayerEntity receiver) {
        super.sendEventMessage(message, receiver);
    }

    @Override
    public void sendEventMessage(ITextComponent message) {
        super.sendEventMessage(message);
    }

    @Override
    public void initializeSkin(boolean isPlayer) {
        super.initializeSkin(isPlayer);
    }

    @Override
    public void randomizeClothes() {
        super.randomizeClothes();
    }

    @Override
    public void randomizeHair() {
        super.randomizeHair();
    }

    @Override
    public void validateClothes() {
        super.validateClothes();
    }

    @Override
    public CompoundNBT toNbtForConversion(EntityType<?> convertingTo) {
        return super.toNbtForConversion(convertingTo);
    }

    @Override
    public void readNbtForConversion(EntityType<?> convertingFrom, CompoundNBT input) {
        super.readNbtForConversion(convertingFrom, input);
    }

    @Override
    public void copyVillagerAttributesFrom(VillagerLike<?> other) {
        super.copyVillagerAttributesFrom(other);
    }

    @Override
    public void spawnBurntParticles() {
        super.spawnBurntParticles();
    }

    @Override
    public boolean isInfected() {
        return super.isInfected();
    }

    @Override
    public void setInfected(boolean infected) {
        super.setInfected(infected);
    }

    @Override
    public MobEntity asEntity() {
        return super.asEntity();
    }

    @Override
    public <P, TrackedP> void setTrackedValue(CParameter < P, TrackedP > key, P value) {
        super.setTrackedValue(key, value);
    }

    @Override
    public <P, TrackedP> P getTrackedValue(CParameter<P, TrackedP> key) {
        return super.getTrackedValue(key);
    }

    @Override
    public void func_234279_a_(LivingEntity p_234279_1_, LivingEntity p_234279_2_, ProjectileEntity p_234279_3_, float p_234279_4_, float p_234279_5_) {
        super.func_234279_a_(p_234279_1_, p_234279_2_, p_234279_3_, p_234279_4_, p_234279_5_);
    }

    @Override
    public Vector3f func_234280_a_(LivingEntity p_234280_1_, Vector3d p_234280_2_, float p_234280_3_) {
        return super.func_234280_a_(p_234280_1_, p_234280_2_, p_234280_3_);
    }

    @Override
    public void openMerchantContainer(PlayerEntity player, ITextComponent displayName, int level) {
        super.openMerchantContainer(player, displayName, level);
    }

    @Override
    public Entity getEntity() {
        return super.getEntity();
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt) {
        super.deserializeNBT(nbt);
    }

    @Override
    public CompoundNBT serializeNBT() {
        return super.serializeNBT();
    }

    /**
     * Used in model rendering to determine if the entity riding this entity should be in the 'sitting' position.
     *
     * @return false to prevent an entity that is mounted to this entity from displaying the 'sitting' animation.
     */
    @Override
    public boolean shouldRiderSit() {
        return super.shouldRiderSit();
    }

    /**
     * Called when a user uses the creative pick block button on this entity.
     *
     * @param target The full target the player is looking at
     * @return A ItemStack to add to the player's inventory, empty ItemStack if nothing should be added.
     */
    @Override
    public ItemStack getPickedResult(RayTraceResult target) {
        return super.getPickedResult(target);
    }

    /**
     * If a rider of this entity can interact with this entity. Should return true on the
     * ridden entity if so.
     *
     * @return if the entity can be interacted with from a rider
     */
    @Override
    public boolean canRiderInteract() {
        return super.canRiderInteract();
    }

    /**
     * Checks if this entity can continue to be ridden while it is underwater.
     *
     * @param rider The entity that is riding this entity
     * @return {@code true} if the entity can continue to ride underwater. {@code false} otherwise.
     */
    @Override
    public boolean canBeRiddenInWater(Entity rider) {
        return super.canBeRiddenInWater(rider);
    }

    /**
     * Returns The classification of this entity
     *
     * @param forSpawnCount If this is being invoked to check spawn count caps.
     * @return If the creature is of the type provided
     */
    @Override
    public EntityClassification getClassification(boolean forSpawnCount) {
        return super.getClassification(forSpawnCount);
    }

    /**
     * This is used to specify that your entity has multiple individual parts, such as the Vanilla Ender Dragon.
     * <p>
     * See {@link EnderDragonEntity} for an example implementation.
     *
     * @return true if this is a multipart entity.
     */
    @Override
    public boolean isMultipartEntity() {
        return super.isMultipartEntity();
    }

    /**
     * Gets the individual sub parts that make up this entity.
     * <p>
     * The entities returned by this method are NOT saved to the world in nay way, they exist as an extension
     * of their host entity. The child entity does not track its server-side(or client-side) counterpart, and
     * the host entity is responsible for moving and managing these children.
     * <p>
     * Only used if {@link #isMultipartEntity()} returns true.
     * <p>
     * See {@link EnderDragonEntity} for an example implementation.
     *
     * @return The child parts of this entity. The value to be returned here should be cached.
     */
    @Nullable
    @Override
    public PartEntity<?>[] getParts() {
        return super.getParts();
    }

    @Override
    public EntitySize getDimensionsForge(Pose pose) {
        return super.getDimensionsForge(pose);
    }

    @Override
    public float getEyeHeightForge(Pose pose, EntitySize size) {
        return super.getEyeHeightForge(pose, size);
    }

    @Nonnull
    @Override
    public <T> LazyOptional < T > getCapability(@Nonnull Capability < T > cap) {
        return super.getCapability(cap);
    }
}