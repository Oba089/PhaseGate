def parked_car(slot_number):
    if 1 <= slot_number <= 20:
        return f"Slot {slot_number} is occupied."
    else:
        return "Invalid slot number. Please choose a number between 1 and 20."

parking_slots = 0

def park_car(slot_number, car_plate):
    if slot_number < 1 or slot_number > 20:
        return "Invalid slot number. Choose between 1 and 20."

    if parking_slots[slot_number - 1] is None:
        parking_slots[slot_number - 1] = car
        return f"Car {car} parked in slot {slot_number}."
    else:
        return f"Slot {slot_number} is already occupied."

def car_leaving(slot_number):
    if slot_number < 1 or slot_number > 20:
        return "Invalid slot number. Choose between 1 and 20."

    if parking_slots[slot_number - 1] is None:
        return f"Slot {slot_number} is already empty."
    car = parking_slots[slot_number - 1]
    parking_slots[slot_number - 1] = None
    return f"Car {car} left slot {slot_number}."

def show_status():
    print("\nParking Lot Status:")
    for j, car in enumerate(parking_slots):
        if car:
            print(f"Slot {j}: {car}")
        else:
            print(f"Slot {j}: Empty")
    print()

print(park_car(4, "Jeep"))
print(park_car(5, "Sport Car"))
print(car_leaving(4))
display_status()



