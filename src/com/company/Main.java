package com.company;

import com.company.classes.MyObject;
import com.company.classes.drives.CombustionEngine;
import com.company.classes.drives.ElectricEngine;
import com.company.classes.drives.BicycleDrive;
import com.company.classes.model.CombustionEngineVehicle;
import com.company.classes.model.EngineVehicle;
import com.company.classes.model.FlyingVehicle;
import com.company.classes.model.Vehicle;
import com.company.classes.model.vehicleTypes.Aerial;
import com.company.classes.model.vehicleTypes.Aquatic;
import com.company.classes.model.vehicleTypes.Terrestrial;
import com.company.classes.vehicles.classes.*;

import java.util.ArrayList;

import static com.company.classes.model.Colour.*;

public class Main {

    public static void main(String[] args) {
        Sedan sedan1 = new Sedan(3000, BLUE, "sedan", 100, new CombustionEngine(2), 300);
        Bus bus1 = new Bus(12000, BLUE, "bus", 50, new CombustionEngine(4), 700);
        Tram tram1 = new Tram(900000, RED, "tram", 12, new ElectricEngine());
        DeliveryVan deliveryVan1 = new DeliveryVan(130000, GREEN, "delivery van", 90, new CombustionEngine(5), 500);
        FloatPlane floatPlane1 = new FloatPlane(1000000, RED, "float plane", 300, new CombustionEngine(5), 600, 1000);
        JetFighter jetFighter1 = new JetFighter(2000000, GREEN, "jet plane", 2000, new CombustionEngine(9), 1200, 4000);
        Bulldozer bulldozer1 = new Bulldozer( 900000, RED, "bulldozer", 13, new CombustionEngine(10), 800);
        Motobike motobike1 = new Motobike(30000, PURPLE, "motobike", 90, new CombustionEngine(1), 40);
        Bicycle bicycle1 = new Bicycle(300, CYAN, "bike", 20, new BicycleDrive());
        Helicopter helicopter1 = new Helicopter(2500000, YELLOW, "helicopter", 90, new CombustionEngine(20), 1000, 900);
        CarAmphibia carAmfibia1 = new CarAmphibia(2000000, PURPLE, "car amphibia", 200, new CombustionEngine(3), 600);
        CombustionEngine combustionEngine1 = new CombustionEngine(4);
        ElectricEngine electricEngine1 = new ElectricEngine();
        BicycleDrive bicycleDrive1 = new BicycleDrive();

        Sedan sedan2 = new Sedan(2000, RED, "sedan", 90, new CombustionEngine(1), 200);
        Bus bus2 = new Bus(13000, BLUE, "bus", 55, new CombustionEngine(5), 750);
        Tram tram2 = new Tram(930000, CYAN, "tram", 16, new ElectricEngine());
        DeliveryVan deliveryVan2 = new DeliveryVan(110000, GREEN, "delivery van", 60, new CombustionEngine(4), 400);
        FloatPlane floatPlane2 = new FloatPlane(1000100, PURPLE, "float plane", 302, new CombustionEngine(5), 610, 1000);
        JetFighter jetFighter2 = new JetFighter(2200000, GREEN, "jet plane", 2000, new CombustionEngine(10), 1230, 4200);
        Bulldozer bulldozer2 = new Bulldozer( 120000, YELLOW, "bulldozer", 20, new CombustionEngine(12), 1300);
        Motobike motobike2 = new Motobike(30540, PURPLE, "motobike", 90, new CombustionEngine(1), 40);
        Bicycle bicycle2 = new Bicycle(300, CYAN, "bike", 31, new BicycleDrive());
        Helicopter helicopter2 = new Helicopter(2100000, GREEN, "helicopter", 86, new CombustionEngine(16), 980, 600);
        CarAmphibia carAmfibia2 = new CarAmphibia(2000210, PURPLE, "car amphibia", 202, new CombustionEngine(4), 651);
        CombustionEngine combustionEngine2 = new CombustionEngine(7);
        ElectricEngine electricEngine2 = new ElectricEngine();
        BicycleDrive bicycleDrive2 = new BicycleDrive();

        Object[] tab1 = new Object[]{
                sedan1, bus1, tram1, deliveryVan1, floatPlane1, jetFighter1, bulldozer1, motobike1, bicycle1, helicopter1, carAmfibia1, combustionEngine1,
                electricEngine1, bicycleDrive1, sedan2, bus2, tram2, deliveryVan2, floatPlane2, jetFighter2, bulldozer2, motobike2, bicycle2, helicopter2,
                carAmfibia2, combustionEngine2, electricEngine2, bicycleDrive2};

        ArrayList<EngineVehicle> arrayList2 = new ArrayList<>();
        ArrayList<Terrestrial> arrayList3 = new ArrayList<>();
        ArrayList<Aerial> arrayList4 = new ArrayList<>();
        ArrayList<Aquatic> arrayList5 = new ArrayList<>();
        ArrayList<CombustionEngineVehicle> arrayList6 = new ArrayList<>();

        for(Object currentObject : tab1){
            if(currentObject instanceof Vehicle currentVehicle){
                if(currentVehicle instanceof EngineVehicle)
                    arrayList2.add((EngineVehicle) currentVehicle);
                if(currentVehicle instanceof Terrestrial)
                    arrayList3.add((Terrestrial) currentVehicle);
                if(currentVehicle instanceof Aerial)
                    arrayList4.add((Aerial) currentVehicle);
                if(currentVehicle instanceof Aquatic)
                    arrayList5.add((Aquatic) currentVehicle);
                if(currentVehicle instanceof CombustionEngineVehicle)
                    arrayList6.add((CombustionEngineVehicle) currentVehicle);
            }
        }

        EngineVehicle[] tab2 = arrayList2.toArray(new EngineVehicle[0]);
        Terrestrial[] tab3 = arrayList3.toArray(new Terrestrial[0]);
        Aerial[] tab4 = arrayList4.toArray(new Aerial[0]);
        Aquatic[] tab5 = arrayList5.toArray(new Aquatic[0]);
        CombustionEngineVehicle[] tab6 = arrayList6.toArray(new CombustionEngineVehicle[0]);
        Bulldozer[] tab7 = new Bulldozer[]{bulldozer1, bulldozer2};

        System.out.println("ITERATING OVER tab1");

        for(Object currentObject : tab1){
            System.out.println("\nNEXT OBJECT");
            if(currentObject instanceof MyObject currentMyObject){
                currentMyObject.buy(currentMyObject.getPrice().toString());
                currentMyObject.printParentClassName();
                if(currentMyObject instanceof Vehicle currentVehicle)
                    currentVehicle.printCarName();
                currentMyObject.buy(currentMyObject.getPrice().toString());
                currentMyObject.sell(currentMyObject.getPrice().toString());
            }
        }

        System.out.println("\n\n\nITERATING OVER tab2");

        for(EngineVehicle currentEngineVehicle : tab2){
            System.out.println("\nNEXT OBJECT");
            currentEngineVehicle.buy(currentEngineVehicle.getPrice().toString());
            if(currentEngineVehicle instanceof CombustionEngineVehicle currentCombustionEngineVehicle)
                currentCombustionEngineVehicle.launchEngine();
        }

        System.out.println("\n\n\nITERATING OVER tab3");

        for(Terrestrial currentTerrestrial : tab3){
            System.out.println("\nNEXT OBJECT");
            if(currentTerrestrial instanceof MyObject currentMyObject)
                currentMyObject.buy(currentMyObject.getPrice().toString());
            if(currentTerrestrial instanceof Vehicle currentVehicle)
                currentTerrestrial.drive(currentVehicle.getMaxSpeed());
        }

        System.out.println("\n\n\nITERATING OVER tab4");

        int i = 0;
        while (i < tab4.length){
            System.out.println("\nNEXT OBJECT");
            Aerial currentAerial = tab4[i];
            if(currentAerial instanceof MyObject currentMyObject)
                currentMyObject.buy(currentMyObject.getPrice().toString());
            if(currentAerial instanceof FlyingVehicle currentFlyingVehicle)
                currentAerial.fly(currentFlyingVehicle.getMaxSpeed(), currentFlyingVehicle.getMaxHeight());
            currentAerial.land();
            i++;
        }

        System.out.println("\n\n\nITERATING OVER tab5");

        i = 0;
        while (i < tab5.length){
            System.out.println("\nNEXT OBJECT");
            Aquatic currentAquatic = tab5[i];
            if(currentAquatic instanceof MyObject currentMyObject)
                currentMyObject.buy(currentMyObject.getPrice().toString());
            if(currentAquatic instanceof Vehicle currentVehicle)
                currentAquatic.swim(currentVehicle.getMaxSpeed());
            i++;
        }

        System.out.println("\n\n\nITERATING OVER tab6");

        i = 0;
        while (i < tab6.length){
            System.out.println("\nNEXT OBJECT");
            CombustionEngineVehicle currentCombustionEngineVehicle = tab6[i];
            currentCombustionEngineVehicle.buy(currentCombustionEngineVehicle.getPrice().toString());
            currentCombustionEngineVehicle.refuel(currentCombustionEngineVehicle.getDrive().getEngineCapacity());
            i++;
        }

        System.out.println("\n\n\nITERATING OVER tab7");

        i = 0;
        while (i < tab7.length){
            System.out.println("\nNEXT OBJECT");
            Bulldozer currentBulldozer = tab7[i];
            currentBulldozer.buy(currentBulldozer.getPrice().toString());
            currentBulldozer.dig();
            i++;
        }
    }
}