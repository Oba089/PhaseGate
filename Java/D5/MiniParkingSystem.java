public boolean isCarParked(int car) {
    return parkingMap.containsKey(carId);
}

public int getSlotNumber(int car) {
    return parkingMap.getOrDefault(car, -1);
}

public boolean isSlotFree(int slotNumber) {
    if (slotNumber < 1 || slotNumber > totalSlots) return false;
    return !slots[slotNumber - 1];
}


