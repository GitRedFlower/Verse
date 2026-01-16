package net.redflower.verse.worldgen.minersdream.generation;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.DensityFunction;
import net.minecraft.world.level.levelgen.DensityFunctions;
import net.minecraft.world.level.levelgen.NoiseRouter;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.synth.NormalNoise;


public class MinersDreamNoiseRouter {
    private static final ResourceKey<DensityFunction> SHIFT_X = createKey("shift_x");
    private static final ResourceKey<DensityFunction> SHIFT_Z = createKey("shift_z");

    public static NoiseRouter minersDream(HolderGetter<DensityFunction> density, HolderGetter<NormalNoise.NoiseParameters> noise) {
        DensityFunction shiftX = new DensityFunctions.HolderHolder(density.getOrThrow(SHIFT_X));
        DensityFunction shiftZ = new DensityFunctions.HolderHolder(density.getOrThrow(SHIFT_Z));
        DensityFunction temperature = DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 2.7, noise.getOrThrow(Noises.TEMPERATURE));
        DensityFunction vegetation = DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.9, noise.getOrThrow(Noises.VEGETATION));

        DensityFunction finalDensity = DensityFunctions.mul(
                DensityFunctions.constant(0.64),
                DensityFunctions.interpolated(DensityFunctions.blendDensity(DensityFunctions.add(
                        DensityFunctions.constant(2.5),
                        DensityFunctions.mul(
                                DensityFunctions.yClampedGradient(-20, 60, 0, 1),
                                DensityFunctions.add(
                                        DensityFunctions.constant(-1.4),
                                        DensityFunctions.mul(
                                                DensityFunctions.yClampedGradient(-64, 320, 1, 0),
                                                DensityFunctions.add(
                                                        DensityFunctions.constant(-0.85),
                                                        DensityFunctions.noise(noise.getOrThrow(Noises.GRAVEL), 5, 9)
                                                )
                                        )
                                )
                        )
                )))
        ).squeeze();

        return new NoiseRouter(
                DensityFunctions.zero(),
                DensityFunctions.zero(),
                DensityFunctions.zero(),
                DensityFunctions.zero(),
                temperature,
                vegetation,
                DensityFunctions.zero(),
                DensityFunctions.zero(),
                DensityFunctions.zero(),
                DensityFunctions.zero(),
                DensityFunctions.zero(),
                finalDensity,
                DensityFunctions.zero(),
                DensityFunctions.zero(),
                DensityFunctions.zero()
        );
    }

    private static ResourceKey<DensityFunction> createKey(String location) {
        return ResourceKey.create(Registries.DENSITY_FUNCTION, ResourceLocation.withDefaultNamespace(location));
    }
}
