package BuildingBlocks;

public class Proton {
    double atomicMass;
    double restEnergy;
    double electricCharge;

    public Proton(){
        //atomicMass is in KG
        this.atomicMass = 1.672623*Math.pow(10, -27);
        //restEnergy is in MeV
        this.restEnergy = 938.28;
        //electricCharge is in Coulombs
        this.electricCharge = 1.602*Math.pow(10, -19);
    }

    public double getAtomicMass(){
        return this.atomicMass;
    }
    public double getRestEnergy(){
        return this.restEnergy;
    }
    public double getElectricCharge(){
        return this.electricCharge;
    }
}
