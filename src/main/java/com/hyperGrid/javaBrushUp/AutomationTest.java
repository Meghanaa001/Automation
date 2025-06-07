package com.hyperGrid.javaBrushUp;

import org.testng.annotations.Test;

public class AutomationTest {

    @Test
    public void verifyAbstraction(){
        AbstractImplement abstractImplement = new AbstractImplement();
        abstractImplement.register();

        AbstractDef abstractDef = new AbstractImplement();
        abstractDef.register();
    }
}
