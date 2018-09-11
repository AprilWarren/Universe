package KnownElements;
import BuildingBlocks.*;


public class Hydrogen {
    private int amountOfElectrons = 1;
    private int amountOfProtons = 1;
    private int amountOfNeutrons = 0;

    public Hydrogen(){
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
