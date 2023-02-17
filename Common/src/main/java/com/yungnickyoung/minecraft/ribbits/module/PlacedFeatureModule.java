package com.yungnickyoung.minecraft.ribbits.module;

import com.yungnickyoung.minecraft.ribbits.RibbitsCommon;
import com.yungnickyoung.minecraft.yungsapi.api.autoregister.AutoRegister;
import com.yungnickyoung.minecraft.yungsapi.api.autoregister.AutoRegisterPlacedFeature;

import java.util.List;

@AutoRegister(RibbitsCommon.MOD_ID)
public class PlacedFeatureModule {
    @AutoRegister("veg_patch")
    public static final AutoRegisterPlacedFeature VEG_PATCH = AutoRegisterPlacedFeature.of(
            ConfiguredFeatureModule.VEG_PATCH,
            List.of());
}
