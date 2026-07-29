lengthOfArray = int(input("Enter the length of an Array:"))
array = []

for i in range(lengthOfArray):
    element = input(f"Enter {i+1} element :")
    array.append(element)
    
nonrepeat = []

for i in range(lengthOfArray):
    unique = True
    for j in range(lengthOfArray):
        if (( i != j ) and (array[i] == array[j])):
            unique = False
            break

    if unique:
        nonrepeat.append(array[i])
        
print("The non repeated elements are", nonrepeat)