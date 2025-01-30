class Parent:
    def __init__(self):
        print('parent')
        self.parent_attribute = "I am a parent attribute"

class Child(Parent):

    #Explicitly call parent constructor
    def __init__(self):
        print('child')
        # self.parent_attribute = "I am a parent attribute"
        super().__init__()   #Equivalent to : Parent.__init()

    def get_parent_attribute(self):
        return self.parent_attribute

    @classmethod
    def get_advice()

child = Child()
print(child.get_parent_attribute()) 
Child.get_advice()   #CLASS METHOD

#ORDER:
# 1) child class constructor is called.
# 2) Then the child class constructor should call parent class constructor,  super().__init__()


