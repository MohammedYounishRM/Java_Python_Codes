lengthOfArray = int(input("Enter the length of an Array:"))
array = []

for i in range(lengthOfArray):
    element = int(input(f"Enter {i+1} element :"))
    array.append(element)

if array:
    smallest = float('inf') # Initially set as Infinity for avoid break cases
    secondSmallest = float('inf')
    for element in array:
        if element < smallest:
            secondSmallest = smallest
            smallest = element
        elif element < secondSmallest and element != smallest:
            secondSmallest = element

    print("The Second Smallest element is", secondSmallest)

# Method 2

# lengthOfArray = int(input("Enter the length of an Array:"))
# array = []

# for i in range(lengthOfArray):
#     element = int(input(f"Enter {i+1} element :"))
#     array.append(element)
# array.sort()
# print (array[1])