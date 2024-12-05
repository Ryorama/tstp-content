package com.ryorama.tstpcontent.mixins.hamster;

import com.ryorama.tstpcontent.init.TstpContentModBlocks;
import com.starfish_studios.hamsters.block.HamsterWheelBlock;
import com.starfish_studios.hamsters.entity.Hamster;
import com.starfish_studios.hamsters.entity.SeatEntity;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.control.LookControl;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Hamster.HamsterLookControl.class)
public abstract class HamsterLookControlMixin extends LookControl {
    @Shadow(remap = false) @Final private Hamster this$0;

    public HamsterLookControlMixin(Mob mob) {
        super(mob);
    }

    @Inject(at = @At("HEAD"), method = "tick")
    public void tick(CallbackInfo ci) {
        if (this$0 != null) {
            if (!(this$0.getVehicle() instanceof SeatEntity)) {
                super.tick();
            } else {
                BlockState state = this$0.level().getBlockState(this$0.blockPosition());
                if (state.is(TstpContentModBlocks.HAMSTER_WHEEL_GENERATOR.get())) {
                    BlockPos pos1;
                    if (state.getValue(HamsterWheelBlock.FACING) == Direction.SOUTH) {
                        pos1 = this$0.blockPosition().east(1);
                    } else if (state.getValue(HamsterWheelBlock.FACING) == Direction.NORTH) {
                        pos1 = this$0.blockPosition().west(1);
                    } else if (state.getValue(HamsterWheelBlock.FACING) == Direction.EAST) {
                        pos1 = this$0.blockPosition().north(1);
                    } else {
                        pos1 = this$0.blockPosition().south(1);
                    }

                    this$0.setSleeping(false);
                    this$0.setInSittingPose(false);
                    this$0.lookAt(EntityAnchorArgument.Anchor.FEET, new Vec3(((float) pos1.getX() + 0.5F), ((float) pos1.getY() + 0.5F), ((float) pos1.getZ() + 0.5F)));
                }
            }
        }
    }
}