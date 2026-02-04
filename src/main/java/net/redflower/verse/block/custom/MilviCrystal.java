package net.redflower.verse.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.redflower.verse.util.VerseTags;

public class MilviCrystal extends BushBlock {

    public static final MapCodec<MilviCrystal> CODEC = simpleCodec(MilviCrystal::new);

    //Sets The Block Size From Corner to Corner
    private static final VoxelShape SHAPE = Block.box(2.0,0.0,2.0, 14.0, 12.0, 14.0);

    public MilviCrystal(Properties properties) {
        super(properties);
    }

    //Returns and sets the Block Size
    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    protected MapCodec<? extends BushBlock> codec() {
        return CODEC;
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockState stateBelow = level.getBlockState(pos.below());
        return stateBelow.is(VerseTags.Blocks.MILVI_PLACEABLES);
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        return state.is(VerseTags.Blocks.MILVI_PLACEABLES);
    }
}
