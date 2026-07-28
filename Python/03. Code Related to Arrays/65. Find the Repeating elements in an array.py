lengthOfArray = int(input("Enter the length of an Array:"))
array = []

for i in range(lengthOfArray):
    element = input(f"Enter {i+1} element :")
    array.append(element)
    
repeat = []

for i in range(lengthOfArray):
    for j in range( i + 1, lengthOfArray):
        if array[i] == array[j]:
            repeat.append(array[i])

print("The Repeated elements are", repeat)