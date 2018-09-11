package KnownElements;

import BuildingBlocks.Electron;
import BuildingBlocks.Neutron;
import BuildingBlocks.Proton;

public class Beryllium {
    private int amountOfElectrons = 3;
    private int amountOfProtons = 3;
    private int amountOfNeutrons = 3;

    public Beryllium(){
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
