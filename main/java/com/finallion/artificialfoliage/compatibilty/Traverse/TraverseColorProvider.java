package com.finallion.artificialfoliage.compatibilty.Traverse;

import com.finallion.artificialfoliage.ArtificialFoliageClient;
import com.finallion.artificialfoliage.utils.ColorUtils;
import com.finallion.artificialfoliage.utils.FluidUtils;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.BlockState;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.system.CallbackI;

public class TraverseColorProvider {

    private static final BlockColorProvider ARID_HIGHLANDS_GRASS = new BlockColorProvider() {
        @Override
        public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
            return 0xBACD78;
        }
    };

    private static final BlockColorProvider ARID_HIGHLANDS_LEAVES = new BlockColorProvider() {
        @Override
        public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
            return 0x80A02E;
        }
    };

    private static final BlockColorProvider AUTUMNAL_WOODS_GRASS = new BlockColorProvider() {
        @Override
        public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
            return 0xD6C23D;
        }
    };

    private static final BlockColorProvider AUTUMNAL_WOODS_LEAVES = new BlockColorProvider() {
        @Override
        public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
            return 0xD2D31F;
        }
    };

    private static final BlockColorProvider CLIFFS = ColorUtils.setDynamicBlockColorProvider(0.3F, 0.4F);
    private static final BlockColorProvider SNOWY_CLIFFS = ColorUtils.setDynamicBlockColorProvider(0.22F, 0.4F);

    private static final BlockColorProvider CONIFEROUS_FOREST_GRASS = new BlockColorProvider() {
        @Override
        public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
            return 0x338235;
        }
    };

    private static final BlockColorProvider CONIFEROUS_FOREST_LEAVES = new BlockColorProvider() {
        @Override
        public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
            return 0x338235;
        }
    };

    private static final BlockColorProvider SNOWY_CONIFEROUS_FOREST_GRASS = new BlockColorProvider() {
        @Override
        public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
            return 0x338251;
        }
    };

    private static final BlockColorProvider SNOWY_CONIFEROUS_FOREST_LEAVES = new BlockColorProvider() {
        @Override
        public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
            return 0x338251;
        }
    };

    private static final BlockColorProvider TRAVERSE_LUSH_SWAMP_GRASS = new BlockColorProvider() {
        @Override
        public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
            return 0x7FE03E;
        }
    };

    private static final BlockColorProvider TRAVERSE_LUSH_SWAMP_LEAVES = new BlockColorProvider() {
        @Override
        public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
            return 0x58EA33;
        }
    };

    private static final BlockColorProvider MEADOW_GRASS = new BlockColorProvider() {
        @Override
        public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
            return 0x65CC53;
        }
    };

    private static final BlockColorProvider MEADOW_LEAVES = new BlockColorProvider() {
        @Override
        public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
            return 0x5DD64A;
        }
    };

    private static final BlockColorProvider PLAINS_PLATEAU = ColorUtils.setDynamicBlockColorProvider(0.8F, 0.2F);

    private static final BlockColorProvider ROLLING_HILLS_GRASS = new BlockColorProvider() {
        @Override
        public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
            return 0x7FE03E;
        }
    };

    private static final BlockColorProvider ROLLING_HILLS_LEAVES = new BlockColorProvider() {
        @Override
        public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
            return 0x58EA33;
        }
    };

    private static final BlockColorProvider WOODED_ISLAND = ColorUtils.setDynamicBlockColorProvider(0.8F, 0.8F);

    private static final BlockColorProvider WOODLANDS_GRASS = new BlockColorProvider() {
        @Override
        public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
            return 0x99A955;
        }
    };


    private static final BlockColorProvider WOODLANDS_LEAVES = new BlockColorProvider() {
        @Override
        public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
            return 0x849E4A;
        }
    };


    // item color provider
    public static final ItemColorProvider ARID_HIGHLANDS_ITEM = new ItemColorProvider() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 0xBACD78;
        }
    };
    public static final ItemColorProvider AUTUMNAL_WOODS_ITEM = new ItemColorProvider() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 0xD6C23D;
        }
    };
    public static final ItemColorProvider CLIFFS_ITEM = (item, layer) -> GrassColors.getColor(0.3, 0.4);
    public static final ItemColorProvider SNOWY_CLIFFS_ITEM = (item, layer) -> GrassColors.getColor(0.22, 0.4);
    public static final ItemColorProvider CONIFEROUS_FOREST_ITEM = new ItemColorProvider() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 0x338235;
        }
    };
    public static final ItemColorProvider SNOWY_CONIFEROUS_FOREST_ITEM = new ItemColorProvider() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 0x338251;
        }
    };
    public static final ItemColorProvider TRAVERSE_LUSH_SWAMP_ITEM = new ItemColorProvider() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 0x7FE03E;
        }
    };
    public static final ItemColorProvider MEADOW_ITEM = (item, layer) -> GrassColors.getColor(0.8, 0.7);
    public static final ItemColorProvider ROLLING_HILLS_ITEM = new ItemColorProvider() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 0x7FE03E;
        }
    };
    public static final ItemColorProvider PLAINS_PLATEAU_ITEM = (item, layer) -> GrassColors.getColor(0.8, 0.2);
    public static final ItemColorProvider WOODED_ISLAND_ITEM = (item, layer) -> GrassColors.getColor(0.8, 0.8);
    public static final ItemColorProvider WOODLANDS_ITEM = new ItemColorProvider() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 0x99A955;
        }
    };


    public static void init() {
        FluidUtils.registerFluidColor(0x3F76E4, TraverseFluids.STILL_TRAVERSE_CLIFFS_WATER, TraverseFluids.FLOWING_TRAVERSE_CLIFFS_WATER);
        FluidUtils.registerFluidColor(0x617B64, TraverseFluids.STILL_TRAVERSE_LUSH_SWAMP_WATER, TraverseFluids.FLOWING_TRAVERSE_LUSH_SWAMP_WATER);
        FluidUtils.registerFluidColor(0x003320, TraverseFluids.STILL_TRAVERSE_MINI_JUNGLE_WATER, TraverseFluids.FLOWING_TRAVERSE_MINI_JUNGLE_WATER);


        BlockRenderLayerMap.INSTANCE.putBlocks(ColorUtils.LEAVE_BLOCK_LAYER,
                TraverseBlocks.TRAVERSE_RED_AUTUMNAL_LEAVES_CARPET,
                TraverseBlocks.TRAVERSE_YELLOW_AUTUMNAL_LEAVES_CARPET,
                TraverseBlocks.TRAVERSE_ORANGE_AUTUMNAL_LEAVES_CARPET,
                TraverseBlocks.TRAVERSE_BROWN_AUTUMNAL_LEAVES_CARPET);


        ColorUtils.registerGrassBlockColor(ARID_HIGHLANDS_GRASS, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_ARID_HIGHLANDS_GRASS_BLOCK, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_GRASS_SLAB, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_GRASS, TraverseBlocks.TALL_TRAVERSE_ARID_HIGHLANDS_GRASS, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_FERN, TraverseBlocks.LARGE_TRAVERSE_ARID_HIGHLANDS_FERN, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_SUGAR_CANE, TraverseBlocks.POTTED_ARID_HIGHLANDS_FERN);
        ColorUtils.registerLeaveBlockColor(ARID_HIGHLANDS_LEAVES, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_OAK_LEAVES, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_VINE);

        ColorUtils.registerGrassBlockColor(AUTUMNAL_WOODS_GRASS, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_AUTUMNAL_WOODS_GRASS_BLOCK, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_GRASS_SLAB, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_GRASS, TraverseBlocks.TALL_TRAVERSE_AUTUMNAL_WOODS_GRASS, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_FERN, TraverseBlocks.LARGE_TRAVERSE_AUTUMNAL_WOODS_FERN, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_SUGAR_CANE, TraverseBlocks.POTTED_AUTUMNAL_WOODS_FERN);
        ColorUtils.registerLeaveBlockColor(AUTUMNAL_WOODS_LEAVES, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_OAK_LEAVES, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_VINE);

        ColorUtils.registerGrassBlockColor(CLIFFS, TraverseBlocks.TRAVERSE_CLIFFS_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_CLIFFS_GRASS_BLOCK, TraverseBlocks.TRAVERSE_CLIFFS_GRASS_SLAB, TraverseBlocks.TRAVERSE_CLIFFS_GRASS, TraverseBlocks.TALL_TRAVERSE_CLIFFS_GRASS, TraverseBlocks.TRAVERSE_CLIFFS_FERN, TraverseBlocks.LARGE_TRAVERSE_CLIFFS_FERN, TraverseBlocks.TRAVERSE_CLIFFS_SUGAR_CANE, TraverseBlocks.POTTED_CLIFFS_FERN);
        ColorUtils.registerLeaveBlockColor(CLIFFS, TraverseBlocks.TRAVERSE_CLIFFS_OAK_LEAVES, TraverseBlocks.TRAVERSE_CLIFFS_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_CLIFFS_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_CLIFFS_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_CLIFFS_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_CLIFFS_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_CLIFFS_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_CLIFFS_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_CLIFFS_VINE);

        ColorUtils.registerGrassBlockColor(SNOWY_CLIFFS, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_SNOWY_CLIFFS_GRASS_BLOCK, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_GRASS_SLAB, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_GRASS, TraverseBlocks.TALL_TRAVERSE_SNOWY_CLIFFS_GRASS, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_FERN, TraverseBlocks.LARGE_TRAVERSE_SNOWY_CLIFFS_FERN, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_SUGAR_CANE, TraverseBlocks.POTTED_SNOWY_CLIFFS_FERN);
        ColorUtils.registerLeaveBlockColor(SNOWY_CLIFFS, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_OAK_LEAVES, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_VINE);

        ColorUtils.registerGrassBlockColor(CONIFEROUS_FOREST_GRASS, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_CONIFEROUS_FOREST_GRASS_BLOCK, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_GRASS_SLAB, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_GRASS, TraverseBlocks.TALL_TRAVERSE_CONIFEROUS_FOREST_GRASS, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_FERN, TraverseBlocks.LARGE_TRAVERSE_CONIFEROUS_FOREST_FERN, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_SUGAR_CANE, TraverseBlocks.POTTED_CONIFEROUS_FOREST_FERN);
        ColorUtils.registerLeaveBlockColor(CONIFEROUS_FOREST_LEAVES, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_OAK_LEAVES, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_VINE);

        ColorUtils.registerGrassBlockColor(SNOWY_CONIFEROUS_FOREST_GRASS, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_BLOCK, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_SLAB, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS, TraverseBlocks.TALL_TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_FERN, TraverseBlocks.LARGE_TRAVERSE_SNOWY_CONIFEROUS_FOREST_FERN, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_SUGAR_CANE, TraverseBlocks.POTTED_SNOWY_CONIFEROUS_FOREST_FERN);
        ColorUtils.registerLeaveBlockColor(SNOWY_CONIFEROUS_FOREST_LEAVES, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OAK_LEAVES, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_VINE);

        ColorUtils.registerGrassBlockColor(TRAVERSE_LUSH_SWAMP_GRASS, TraverseBlocks.TRAVERSE_LUSH_SWAMP_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_LUSH_SWAMP_GRASS_BLOCK, TraverseBlocks.TRAVERSE_LUSH_SWAMP_GRASS_SLAB, TraverseBlocks.TRAVERSE_LUSH_SWAMP_GRASS, TraverseBlocks.TALL_TRAVERSE_LUSH_SWAMP_GRASS, TraverseBlocks.TRAVERSE_LUSH_SWAMP_FERN, TraverseBlocks.LARGE_TRAVERSE_LUSH_SWAMP_FERN, TraverseBlocks.TRAVERSE_LUSH_SWAMP_SUGAR_CANE, TraverseBlocks.POTTED_TRAVERSE_LUSH_SWAMP_FERN);
        ColorUtils.registerLeaveBlockColor(TRAVERSE_LUSH_SWAMP_LEAVES, TraverseBlocks.TRAVERSE_LUSH_SWAMP_OAK_LEAVES, TraverseBlocks.TRAVERSE_LUSH_SWAMP_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_LUSH_SWAMP_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_LUSH_SWAMP_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_LUSH_SWAMP_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_LUSH_SWAMP_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_LUSH_SWAMP_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_LUSH_SWAMP_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_LUSH_SWAMP_VINE);

        ColorUtils.registerGrassBlockColor(PLAINS_PLATEAU, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_PLAINS_PLATEAU_GRASS_BLOCK, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_GRASS_SLAB, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_GRASS, TraverseBlocks.TALL_TRAVERSE_PLAINS_PLATEAU_GRASS, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_FERN, TraverseBlocks.LARGE_TRAVERSE_PLAINS_PLATEAU_FERN, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_SUGAR_CANE, TraverseBlocks.POTTED_PLAINS_PLATEAU_FERN);
        ColorUtils.registerLeaveBlockColor(PLAINS_PLATEAU, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_OAK_LEAVES, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_VINE);

        ColorUtils.registerGrassBlockColor(MEADOW_GRASS, TraverseBlocks.TRAVERSE_MEADOW_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_MEADOW_GRASS_BLOCK, TraverseBlocks.TRAVERSE_MEADOW_GRASS_SLAB, TraverseBlocks.TRAVERSE_MEADOW_GRASS, TraverseBlocks.TALL_TRAVERSE_MEADOW_GRASS, TraverseBlocks.TRAVERSE_MEADOW_FERN, TraverseBlocks.LARGE_TRAVERSE_MEADOW_FERN, TraverseBlocks.TRAVERSE_MEADOW_SUGAR_CANE, TraverseBlocks.POTTED_MEADOW_FERN);
        ColorUtils.registerLeaveBlockColor(MEADOW_LEAVES, TraverseBlocks.TRAVERSE_MEADOW_OAK_LEAVES, TraverseBlocks.TRAVERSE_MEADOW_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_MEADOW_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_MEADOW_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_MEADOW_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_MEADOW_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_MEADOW_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_MEADOW_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_MEADOW_VINE);

        ColorUtils.registerGrassBlockColor(ROLLING_HILLS_GRASS, TraverseBlocks.TRAVERSE_ROLLING_HILLS_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_ROLLING_HILLS_GRASS_BLOCK, TraverseBlocks.TRAVERSE_ROLLING_HILLS_GRASS_SLAB, TraverseBlocks.TRAVERSE_ROLLING_HILLS_GRASS, TraverseBlocks.TALL_TRAVERSE_ROLLING_HILLS_GRASS, TraverseBlocks.TRAVERSE_ROLLING_HILLS_FERN, TraverseBlocks.LARGE_TRAVERSE_ROLLING_HILLS_FERN, TraverseBlocks.TRAVERSE_ROLLING_HILLS_SUGAR_CANE, TraverseBlocks.POTTED_ROLLING_HILLS_FERN);
        ColorUtils.registerLeaveBlockColor(ROLLING_HILLS_LEAVES, TraverseBlocks.TRAVERSE_ROLLING_HILLS_OAK_LEAVES, TraverseBlocks.TRAVERSE_ROLLING_HILLS_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_ROLLING_HILLS_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_ROLLING_HILLS_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_ROLLING_HILLS_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_ROLLING_HILLS_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_ROLLING_HILLS_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_ROLLING_HILLS_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_ROLLING_HILLS_VINE);

        ColorUtils.registerGrassBlockColor(WOODED_ISLAND, TraverseBlocks.TRAVERSE_WOODED_ISLAND_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_WOODED_ISLAND_GRASS_BLOCK, TraverseBlocks.TRAVERSE_WOODED_ISLAND_GRASS_SLAB, TraverseBlocks.TRAVERSE_WOODED_ISLAND_GRASS, TraverseBlocks.TALL_TRAVERSE_WOODED_ISLAND_GRASS, TraverseBlocks.TRAVERSE_WOODED_ISLAND_FERN, TraverseBlocks.LARGE_TRAVERSE_WOODED_ISLAND_FERN, TraverseBlocks.TRAVERSE_WOODED_ISLAND_SUGAR_CANE, TraverseBlocks.POTTED_WOODED_ISLAND_FERN);
        ColorUtils.registerLeaveBlockColor(WOODED_ISLAND, TraverseBlocks.TRAVERSE_WOODED_ISLAND_OAK_LEAVES, TraverseBlocks.TRAVERSE_WOODED_ISLAND_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_WOODED_ISLAND_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_WOODED_ISLAND_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_WOODED_ISLAND_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_WOODED_ISLAND_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_WOODED_ISLAND_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_WOODED_ISLAND_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_WOODED_ISLAND_VINE);

        ColorUtils.registerGrassBlockColor(WOODLANDS_GRASS, TraverseBlocks.TRAVERSE_WOODLANDS_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_WOODLANDS_GRASS_BLOCK, TraverseBlocks.TRAVERSE_WOODLANDS_GRASS_SLAB, TraverseBlocks.TRAVERSE_WOODLANDS_GRASS, TraverseBlocks.TALL_TRAVERSE_WOODLANDS_GRASS, TraverseBlocks.TRAVERSE_WOODLANDS_FERN, TraverseBlocks.LARGE_TRAVERSE_WOODLANDS_FERN, TraverseBlocks.TRAVERSE_WOODLANDS_SUGAR_CANE, TraverseBlocks.POTTED_WOODLANDS_FERN);
        ColorUtils.registerLeaveBlockColor(WOODLANDS_LEAVES, TraverseBlocks.TRAVERSE_WOODLANDS_OAK_LEAVES, TraverseBlocks.TRAVERSE_WOODLANDS_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_WOODLANDS_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_WOODLANDS_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_WOODLANDS_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_WOODLANDS_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_WOODLANDS_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_WOODLANDS_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_WOODLANDS_VINE);

        ColorUtils.registerItemColor(ARID_HIGHLANDS_ITEM, TraverseItems.TRAVERSE_ARID_HIGHLANDS_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_ARID_HIGHLANDS_GRASS_BLOCK, TraverseItems.TRAVERSE_ARID_HIGHLANDS_GRASS_SLAB, TraverseItems.TRAVERSE_ARID_HIGHLANDS_GRASS, TraverseItems.TALL_TRAVERSE_ARID_HIGHLANDS_GRASS, TraverseItems.TRAVERSE_ARID_HIGHLANDS_FERN, TraverseItems.LARGE_TRAVERSE_ARID_HIGHLANDS_FERN, TraverseItems.TRAVERSE_ARID_HIGHLANDS_SUGAR_CANE, TraverseItems.TRAVERSE_ARID_HIGHLANDS_OAK_LEAVES, TraverseItems.TRAVERSE_ARID_HIGHLANDS_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_ARID_HIGHLANDS_ACACIA_LEAVES, TraverseItems.TRAVERSE_ARID_HIGHLANDS_JUNGLE_LEAVES, TraverseItems.TRAVERSE_ARID_HIGHLANDS_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_ARID_HIGHLANDS_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_ARID_HIGHLANDS_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_ARID_HIGHLANDS_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_ARID_HIGHLANDS_VINE);
        ColorUtils.registerItemColor(AUTUMNAL_WOODS_ITEM, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_AUTUMNAL_WOODS_GRASS_BLOCK, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_GRASS_SLAB, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_GRASS, TraverseItems.TALL_TRAVERSE_AUTUMNAL_WOODS_GRASS, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_FERN, TraverseItems.LARGE_TRAVERSE_AUTUMNAL_WOODS_FERN, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_SUGAR_CANE, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_OAK_LEAVES, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_ACACIA_LEAVES, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_JUNGLE_LEAVES, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_VINE);
        ColorUtils.registerItemColor(CLIFFS_ITEM, TraverseItems.TRAVERSE_CLIFFS_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_CLIFFS_GRASS_BLOCK, TraverseItems.TRAVERSE_CLIFFS_GRASS_SLAB, TraverseItems.TRAVERSE_CLIFFS_GRASS, TraverseItems.TALL_TRAVERSE_CLIFFS_GRASS, TraverseItems.TRAVERSE_CLIFFS_FERN, TraverseItems.LARGE_TRAVERSE_CLIFFS_FERN, TraverseItems.TRAVERSE_CLIFFS_SUGAR_CANE, TraverseItems.TRAVERSE_CLIFFS_OAK_LEAVES, TraverseItems.TRAVERSE_CLIFFS_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_CLIFFS_ACACIA_LEAVES, TraverseItems.TRAVERSE_CLIFFS_JUNGLE_LEAVES, TraverseItems.TRAVERSE_CLIFFS_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_CLIFFS_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_CLIFFS_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_CLIFFS_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_CLIFFS_VINE);
        ColorUtils.registerItemColor(SNOWY_CLIFFS_ITEM, TraverseItems.TRAVERSE_SNOWY_CLIFFS_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_SNOWY_CLIFFS_GRASS_BLOCK, TraverseItems.TRAVERSE_SNOWY_CLIFFS_GRASS_SLAB, TraverseItems.TRAVERSE_SNOWY_CLIFFS_GRASS, TraverseItems.TALL_TRAVERSE_SNOWY_CLIFFS_GRASS, TraverseItems.TRAVERSE_SNOWY_CLIFFS_FERN, TraverseItems.LARGE_TRAVERSE_SNOWY_CLIFFS_FERN, TraverseItems.TRAVERSE_SNOWY_CLIFFS_SUGAR_CANE, TraverseItems.TRAVERSE_SNOWY_CLIFFS_OAK_LEAVES, TraverseItems.TRAVERSE_SNOWY_CLIFFS_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_SNOWY_CLIFFS_ACACIA_LEAVES, TraverseItems.TRAVERSE_SNOWY_CLIFFS_JUNGLE_LEAVES, TraverseItems.TRAVERSE_SNOWY_CLIFFS_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_SNOWY_CLIFFS_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_SNOWY_CLIFFS_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_SNOWY_CLIFFS_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_SNOWY_CLIFFS_VINE);
        ColorUtils.registerItemColor(CONIFEROUS_FOREST_ITEM, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_CONIFEROUS_FOREST_GRASS_BLOCK, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_GRASS_SLAB, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_GRASS, TraverseItems.TALL_TRAVERSE_CONIFEROUS_FOREST_GRASS, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_FERN, TraverseItems.LARGE_TRAVERSE_CONIFEROUS_FOREST_FERN, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_SUGAR_CANE, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_OAK_LEAVES, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_ACACIA_LEAVES, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_JUNGLE_LEAVES, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_VINE);
        ColorUtils.registerItemColor(SNOWY_CONIFEROUS_FOREST_ITEM, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_BLOCK, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_SLAB, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS, TraverseItems.TALL_TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_FERN, TraverseItems.LARGE_TRAVERSE_SNOWY_CONIFEROUS_FOREST_FERN, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_SUGAR_CANE, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OAK_LEAVES, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_ACACIA_LEAVES, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_JUNGLE_LEAVES, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_VINE);
        ColorUtils.registerItemColor(TRAVERSE_LUSH_SWAMP_ITEM, TraverseItems.TRAVERSE_LUSH_SWAMP_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_LUSH_SWAMP_GRASS_BLOCK, TraverseItems.TRAVERSE_LUSH_SWAMP_GRASS_SLAB, TraverseItems.TRAVERSE_LUSH_SWAMP_GRASS, TraverseItems.TALL_TRAVERSE_LUSH_SWAMP_GRASS, TraverseItems.TRAVERSE_LUSH_SWAMP_FERN, TraverseItems.LARGE_TRAVERSE_LUSH_SWAMP_FERN, TraverseItems.TRAVERSE_LUSH_SWAMP_SUGAR_CANE, TraverseItems.TRAVERSE_LUSH_SWAMP_OAK_LEAVES, TraverseItems.TRAVERSE_LUSH_SWAMP_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_LUSH_SWAMP_ACACIA_LEAVES, TraverseItems.TRAVERSE_LUSH_SWAMP_JUNGLE_LEAVES, TraverseItems.TRAVERSE_LUSH_SWAMP_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_LUSH_SWAMP_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_LUSH_SWAMP_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_LUSH_SWAMP_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_LUSH_SWAMP_VINE);
        ColorUtils.registerItemColor(PLAINS_PLATEAU_ITEM, TraverseItems.TRAVERSE_PLAINS_PLATEAU_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_PLAINS_PLATEAU_GRASS_BLOCK, TraverseItems.TRAVERSE_PLAINS_PLATEAU_GRASS_SLAB, TraverseItems.TRAVERSE_PLAINS_PLATEAU_GRASS, TraverseItems.TALL_TRAVERSE_PLAINS_PLATEAU_GRASS, TraverseItems.TRAVERSE_PLAINS_PLATEAU_FERN, TraverseItems.LARGE_TRAVERSE_PLAINS_PLATEAU_FERN, TraverseItems.TRAVERSE_PLAINS_PLATEAU_SUGAR_CANE, TraverseItems.TRAVERSE_PLAINS_PLATEAU_OAK_LEAVES, TraverseItems.TRAVERSE_PLAINS_PLATEAU_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_PLAINS_PLATEAU_ACACIA_LEAVES, TraverseItems.TRAVERSE_PLAINS_PLATEAU_JUNGLE_LEAVES, TraverseItems.TRAVERSE_PLAINS_PLATEAU_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_PLAINS_PLATEAU_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_PLAINS_PLATEAU_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_PLAINS_PLATEAU_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_PLAINS_PLATEAU_VINE);
        ColorUtils.registerItemColor(MEADOW_ITEM, TraverseItems.TRAVERSE_MEADOW_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_MEADOW_GRASS_BLOCK, TraverseItems.TRAVERSE_MEADOW_GRASS_SLAB, TraverseItems.TRAVERSE_MEADOW_GRASS, TraverseItems.TALL_TRAVERSE_MEADOW_GRASS, TraverseItems.TRAVERSE_MEADOW_FERN, TraverseItems.LARGE_TRAVERSE_MEADOW_FERN, TraverseItems.TRAVERSE_MEADOW_SUGAR_CANE, TraverseItems.TRAVERSE_MEADOW_OAK_LEAVES, TraverseItems.TRAVERSE_MEADOW_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_MEADOW_ACACIA_LEAVES, TraverseItems.TRAVERSE_MEADOW_JUNGLE_LEAVES, TraverseItems.TRAVERSE_MEADOW_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_MEADOW_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_MEADOW_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_MEADOW_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_MEADOW_VINE);
        ColorUtils.registerItemColor(ROLLING_HILLS_ITEM, TraverseItems.TRAVERSE_ROLLING_HILLS_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_ROLLING_HILLS_GRASS_BLOCK, TraverseItems.TRAVERSE_ROLLING_HILLS_GRASS_SLAB, TraverseItems.TRAVERSE_ROLLING_HILLS_GRASS, TraverseItems.TALL_TRAVERSE_ROLLING_HILLS_GRASS, TraverseItems.TRAVERSE_ROLLING_HILLS_FERN, TraverseItems.LARGE_TRAVERSE_ROLLING_HILLS_FERN, TraverseItems.TRAVERSE_ROLLING_HILLS_SUGAR_CANE, TraverseItems.TRAVERSE_ROLLING_HILLS_OAK_LEAVES, TraverseItems.TRAVERSE_ROLLING_HILLS_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_ROLLING_HILLS_ACACIA_LEAVES, TraverseItems.TRAVERSE_ROLLING_HILLS_JUNGLE_LEAVES, TraverseItems.TRAVERSE_ROLLING_HILLS_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_ROLLING_HILLS_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_ROLLING_HILLS_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_ROLLING_HILLS_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_ROLLING_HILLS_VINE);
        ColorUtils.registerItemColor(WOODED_ISLAND_ITEM, TraverseItems.TRAVERSE_WOODED_ISLAND_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_WOODED_ISLAND_GRASS_BLOCK, TraverseItems.TRAVERSE_WOODED_ISLAND_GRASS_SLAB, TraverseItems.TRAVERSE_WOODED_ISLAND_GRASS, TraverseItems.TALL_TRAVERSE_WOODED_ISLAND_GRASS, TraverseItems.TRAVERSE_WOODED_ISLAND_FERN, TraverseItems.LARGE_TRAVERSE_WOODED_ISLAND_FERN, TraverseItems.TRAVERSE_WOODED_ISLAND_SUGAR_CANE, TraverseItems.TRAVERSE_WOODED_ISLAND_OAK_LEAVES, TraverseItems.TRAVERSE_WOODED_ISLAND_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_WOODED_ISLAND_ACACIA_LEAVES, TraverseItems.TRAVERSE_WOODED_ISLAND_JUNGLE_LEAVES, TraverseItems.TRAVERSE_WOODED_ISLAND_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_WOODED_ISLAND_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_WOODED_ISLAND_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_WOODED_ISLAND_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_WOODED_ISLAND_VINE);
        ColorUtils.registerItemColor(WOODLANDS_ITEM, TraverseItems.TRAVERSE_WOODLANDS_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_WOODLANDS_GRASS_BLOCK, TraverseItems.TRAVERSE_WOODLANDS_GRASS_SLAB, TraverseItems.TRAVERSE_WOODLANDS_GRASS, TraverseItems.TALL_TRAVERSE_WOODLANDS_GRASS, TraverseItems.TRAVERSE_WOODLANDS_FERN, TraverseItems.LARGE_TRAVERSE_WOODLANDS_FERN, TraverseItems.TRAVERSE_WOODLANDS_SUGAR_CANE, TraverseItems.TRAVERSE_WOODLANDS_OAK_LEAVES, TraverseItems.TRAVERSE_WOODLANDS_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_WOODLANDS_ACACIA_LEAVES, TraverseItems.TRAVERSE_WOODLANDS_JUNGLE_LEAVES, TraverseItems.TRAVERSE_WOODLANDS_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_WOODLANDS_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_WOODLANDS_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_WOODLANDS_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_WOODLANDS_VINE);

    }




}
