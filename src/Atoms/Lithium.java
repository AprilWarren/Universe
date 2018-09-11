package Atoms;

import BuildingBlocks.Electron;
import BuildingBlocks.Neutron;
import BuildingBlocks.Proton;

public class Lithium {
    private int amountOfElectrons = 2;
    private int amountOfProtons = 2;
    private int amountOfNeutrons = 0;

    public Lithium(){
        for(int i = 0; i < this.amountOfElectrons; i++){
            Electron electron = new Electron();
        }
        for(int i = 0; i < this.amountOfProtons; i++){
            Proton proton = new Proton();
        }
        for(int i = 0; i < this.amountOfNeutrons; i++){
            Neutron neutron = new Neutron();
        }
    }
}
