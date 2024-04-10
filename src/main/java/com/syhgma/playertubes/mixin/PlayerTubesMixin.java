package com.syhgma.playertubes.mixin;

import net.minecraft.client.Minecraft;

import net.minecraft.client.main.GameConfig;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.syhgma.playertubes.PlayerTubes;

@Mixin(Minecraft.class)
public class PlayerTubesMixin {
	@Inject(method = "<init>", at = @At("TAIL"))
	private void playertubes$init(GameConfig gameConfig, CallbackInfo ci) {
		PlayerTubes.LOGGER.info("Hello from {}", PlayerTubes.NAME);
	}
}
