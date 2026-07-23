lengthOfArray = int(input("Enter the length of an Array:"))
array = []

for i in range(lengthOfArray):
    element = int(input(f"Enter {i+1} element :"))
    array.append(element)

if array:
    smallest = array[0]

    for element in array:
        if element < smallest:
            smallest = element
    print("The Smallest element is",smallest)

else:
    print("No elements are entered")

# Method 2

# lengthOfArray = int(input("Enter the length of an Array:"))
# array = []

# for i in range(lengthOfArray):
#     element = int(input(f"Enter {i+1} element :"))
#     array.append(element)
# array.sort()
# print (array[0])

# Method 3
# print(min(array))