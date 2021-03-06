package com.amadornes.framez.compat.rc;

import com.amadornes.framez.api.FramezApi;
import com.amadornes.framez.compat.CompatModule;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CompatModuleRC extends CompatModule {

    @Override
    public void preInit(FMLPreInitializationEvent ev) {

    }

    @Override
    public void init(FMLInitializationEvent ev) {

    }

    @Override
    public void postInit(FMLPostInitializationEvent ev) {

        FramezApi.inst().getMovementApi().registerMovementHandler(new MovementHandlerRC());
    }

    @SideOnly(Side.CLIENT)
    private void postInitClient() {

    }

    @Override
    public void registerBlocks() {

    }

    @Override
    public void registerItems() {

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerRenders() {

    }

}
