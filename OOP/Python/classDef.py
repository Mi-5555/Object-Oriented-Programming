class Person:
    def __init__(self, name, age):   '''Class Constructor'''
        self.name = name             '''Instance variables'''
        self.age = age

    def describe(self):              '''Instance Method'''
        return f"{self.name} is {self.age} years old."
    
    def celebrate_bday(self):
        self.age += 1                   
        return f"Happy Birthday {self.name}! You are now {self.age} years old."

person1 = Person("Alice", 20)        '''Instantiation'''  
person1.describe()