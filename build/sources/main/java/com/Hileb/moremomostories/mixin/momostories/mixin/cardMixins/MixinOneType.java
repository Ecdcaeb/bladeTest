package com.Hileb.moremomostories.mixin.momostories.mixin.cardMixins;

import com.Hileb.moremomostories.mixin.momostories.event.CardFunction;
import com.gq2529.momostories.item.tools.Bleeding.OneType;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(OneType.class)
public abstract class MixinOneType extends Item {
//    @Overwrite
//    @SubscribeEvent
//    public static void One_type(LivingHurtEvent event) {
//        CardFunction.OneType.One_type(event);
//    }
}
