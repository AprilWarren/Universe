package BuildingBlocks;

public class Electron {
    double atomicMass;
    double restEnergy;
    double electricCharge;

    public Electron(){
        //atomicMass is in KG
        this.atomicMass = 9.10939*Math.pow(10, -31);
        //restEnergy is in MeV
        this.restEnergy = 0.511;
        //electricCharge is in coulombs
        this.electricCharge = -1.602*Math.pow(10, -19);
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
