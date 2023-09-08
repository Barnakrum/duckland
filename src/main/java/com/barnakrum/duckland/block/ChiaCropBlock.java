package com.barnakrum.duckland.block;

import com.barnakrum.duckland.Duckland;
import com.barnakrum.duckland.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;

public class ChiaCropBlock extends CropBlock {

    public static final IntProperty AGE = IntProperty.of("age",0,15);


    public ChiaCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    public Item getSeedsItem() {
        return ModItems.CHIA_SEEDS;
    }

//    @Override
//    public int getMaxAge(){
//        return 15;
//    }
//
//    @Override
//    public IntProperty getAgeProperty()
//    {
//        return AGE;
//    }

//    @Override
//    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
//    {
//        builder.add(AGE);
//    }


}
