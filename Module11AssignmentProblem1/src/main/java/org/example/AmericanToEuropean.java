package org.example;

public class AmericanToEuropean implements EuropeanPowerSocket{ //Adapter
    private AmericanPlug americanplug;

    public AmericanToEuropean(AmericanPlug americanplug){
        this.americanplug = americanplug;
    }

    @Override
    public void plugIsIn(){
        System.out.println("Adapter for American Plug -> European Outlet");
        americanplug.plugIsIn();
    }


}
