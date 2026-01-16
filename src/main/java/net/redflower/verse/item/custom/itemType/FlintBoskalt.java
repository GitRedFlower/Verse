package net.redflower.verse.item.custom.itemType;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.redflower.verse.block.VerseBlocks;
import net.redflower.verse.worldgen.minersdream.MinersDreamDimension;

@SuppressWarnings("NullableProblems")
public class FlintBoskalt extends Item {

    public FlintBoskalt(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        if(context.getPlayer() != null) {
            if(context.getPlayer().level().dimension() == MinersDreamDimension.MINERS_DREAM_LEVEL || context.getPlayer().level().dimension() == Level.OVERWORLD) {
                BlockPos clickedPos = context.getClickedPos().relative(context.getClickedFace());

                if(VerseBlocks.MINERS_DREAM_PORTAL.get().spawnPortal(context.getLevel(), clickedPos)) {
                    context.getLevel().playSound(context.getPlayer(), clickedPos, SoundEvents.END_PORTAL_FRAME_FILL, SoundSource.BLOCKS, 6f, 0.8f);
                    if(!context.getPlayer().isCreative()) context.getPlayer().setItemInHand(context.getHand(), ItemStack.EMPTY);
                    return InteractionResult.sidedSuccess(context.getLevel().isClientSide);
                } else return InteractionResult.FAIL;
            }
        }

        return InteractionResult.FAIL;
    }
}
