lengthOfArray = int(input("Enter the length of an Array:"))
array = []

for i in range(lengthOfArray):
    element = int(input(f"Enter {i+1} element :"))
    array.append(element)

if array:
    largest = array[0]

    for element in array:
        if element > largest:
            largest = element
    print("The Largest element is",largest)

else:
    print("No elements are entered")

# Method 2

# lengthOfArray = int(input("Enter the length of an Array:"))
# array = []

# for i in range(lengthOfArray):
#     element = int(input(f"Enter {i+1} element :"))
#     array.append(element)
# array.sort()
# print (array[-1])

# Method 3
# print(max(array))