package com.amadornes.framez.compat.hc;

import com.amadornes.framez.api.IMotorProvider;
import com.amadornes.framez.ref.Dependencies;
import com.amadornes.framez.ref.References;
import com.amadornes.framez.tile.TileMotor;

public class MotorProviderHC implements IMotorProvider {

    public static final MotorProviderHC inst = new MotorProviderHC();

    @Override
    public String getId() {

        return Dependencies.HC;
    }

    @Override
    public String getUnlocalizedName() {

        return References.Names.Unlocalized.MOTOR + ".hydraulic";
    }

    @Override
    public Class<? extends TileMotor> getTileClass() {

        return TileMotorHC.class;
    }

}
