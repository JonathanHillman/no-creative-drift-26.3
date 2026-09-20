package com.jonathan.nocreativedrift.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayerEntity.class)
public abstract class LocalPlayerMixin {
    @Inject(method = "tick", at = @At("TAIL"))
    private void noCreativeFlightDrift(CallbackInfo ci) {
        ClientPlayerEntity player = (ClientPlayerEntity) (Object) this;
        MinecraftClient client = MinecraftClient.getInstance();

        if (!player.getAbilities().flying || client.options == null) {
            return;
        }

        boolean movingHorizontally =
                client.options.forwardKey.isPressed()
                || client.options.backKey.isPressed()
                || client.options.leftKey.isPressed()
                || client.options.rightKey.isPressed();

        if (!movingHorizontally) {
            Vec3d velocity = player.getVelocity();
            player.setVelocity(0.0D, velocity.y, 0.0D);
        }
    }
}
