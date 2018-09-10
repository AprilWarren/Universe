package BuildingBlocks;

public class Neutron {
    double atomicMass;
    double restEnergy;
    double electricCharge;

    public Neutron(){
        //atomicMass is in KG
        this.atomicMass = 1.674929*Math.pow(10, -27);
        //restEnergy is in MeV
        this.restEnergy = 939.57;
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
