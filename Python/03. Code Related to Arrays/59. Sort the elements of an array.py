lengthOfArray = int(input("Enter the length of an Array:"))
array = []

for i in range(lengthOfArray):
    element = int(input(f"Enter {i+1} element :"))
    array.append(element)

n = len(array)
for i in range(0, n):
    for j in range(i + 1, n):
        if array[i] > array[j]:
            temp = array[i]
            array[i] = array[j]
            array[j] = temp
print(array)

# Simple Method

# print(sorted(array))
# print(sorted(array,reverse=True))