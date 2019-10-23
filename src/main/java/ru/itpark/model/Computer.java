package ru.itpark.model;

public class Computer extends Product {
    private CPUType cpuType;
    private int RAMSize;
    private OperationSystemType operationSystemType;

    public Computer(long id, String name, int price, CPUType cpuType, int RAMSize, OperationSystemType operationSystemType) {
        super(id, name, price);
        this.cpuType = cpuType;
        this.RAMSize = RAMSize;
        this.operationSystemType = operationSystemType;
    }

    public enum  CPUType {
        AMD,
        INTEL,
        OTHER
    }

    public enum OperationSystemType {
        WINDOWS,
        APPLE_OS,
        LINUX,
        OTHER
    }

    public CPUType getCpuType() {
        return cpuType;
    }

    public void setCpuType(CPUType cpuType) {
        this.cpuType = cpuType;
    }

    public int getRAMSize() {
        return RAMSize;
    }

    public void setRAMSize(int RAMSize) {
        this.RAMSize = RAMSize;
    }

    public OperationSystemType getOperationSystemType() {
        return operationSystemType;
    }

    public void setOperationSystemType(OperationSystemType operationSystemType) {
        this.operationSystemType = operationSystemType;
    }
}
