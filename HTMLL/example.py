List = [1, 2, 3.15, 7, 9, "Hello", "World", 5.19, True, False]
List.append("Python")
List.pop(3)
print(List)

Set = set()
Set.add(2)
Set.add(1)
print(Set)

Dictonary = {"Name": "John", "Age": 30, "City": "New York"}
for key, value in Dictonary.items():
    print(key, ":", value)

def my_function():
    return "Hello from my_function!"
print(my_function())

class MyClass:
    def __init__(self, name):
        self.name = name
    def my_function(self):
        print("Hello from", self.name)
    def my_function2(self, age):
        print("Hello from", self.name, "who is", age, "years old")
object = MyClass("Menega")
object.my_function()
object.my_function2(15)