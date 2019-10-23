package ru.itpark.model;

public class SmartPhone extends Product {
    private SmartphoneType smartphoneType;
    private MaterialOfCase materialOfCase;
    private SimCardType simCardType;
    private OperationSystem operationSystem;

    public SmartPhone(long id, String name, int price, SmartphoneType smartphoneType, MaterialOfCase materialOfCase, SimCardType simCardType, OperationSystem operationSystem) {
        super(id, name, price);
        this.smartphoneType = smartphoneType;
        this.materialOfCase = materialOfCase;
        this.simCardType = simCardType;
        this.operationSystem = operationSystem;
    }

    public enum SmartphoneType {
        MONOBLOCK,
        SLIDER,
        OTHER
    }

    public enum MaterialOfCase {
        PLASTIC,
        METAL,
        GLASS,
        OTHER
    }

    public enum SimCardType {
        NANO,
        MICRO,
        OTHER

    }

    public enum OperationSystem {
        ANDROID,
        IOS,
        WINDOWS,
        OTHER
    }

    public SmartphoneType getSmartphoneType() {
        return smartphoneType;
    }

    public void setSmartphoneType(SmartphoneType smartphoneType) {
        this.smartphoneType = smartphoneType;
    }

    public MaterialOfCase getMaterialOfCase() {
        return materialOfCase;
    }

    public void setMaterialOfCase(MaterialOfCase materialOfCase) {
        this.materialOfCase = materialOfCase;
    }

    public SimCardType getSimCardType() {
        return simCardType;
    }

    public void setSimCardType(SimCardType simCardType) {
        this.simCardType = simCardType;
    }

    public OperationSystem getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(OperationSystem operationSystem) {
        this.operationSystem = operationSystem;
    }
}
