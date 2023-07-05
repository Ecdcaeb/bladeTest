package com.Hileb.moremomostories.mixin.momostories.mixin.cardMixins;

import com.Hileb.moremomostories.mixin.momostories.event.CardFunction;
import com.gq2529.momostories.item.ModItemStoryboards.Scavengers;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Scavengers.class)
public abstract class MixinScavengers extends Item {
    @Overwrite
    @SubscribeEvent
    public static void scavengers(LivingEvent.LivingUpdateEvent event)
    {
        CardFunction.Scavengers.scavengers(event);
    }
}
