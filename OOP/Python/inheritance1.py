class Vehicle:
    def __init__(self,vehicle_type, manufacturer):
        self.vehicle_type = vehicle_type
        self.manufacturer = manufacturer
    
    def display_info(self):
        return f"Vehicle: {self.vehicle_type}{self.manufacturer}"
    
class Car(Vehicle):
    def __init__(self, manufacturer, car_type):
        super().__init__("CAR", manufacturer)
        self.car_type = car_type

    def display_car_info(self):
        return f"{self.display_info()}, Type: {self.car_type}"
    
    # Method overriding (parents display_info() method)
    def display_info(self):
        return f"Car: {self.vehicle_type}{self.manufacturer}"

my_car = Car("Swift","Dezire")
print(my_car.display_car_info())