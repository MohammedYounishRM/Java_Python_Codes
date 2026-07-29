lengthOfArray = int(input("Enter the length of an Array:"))
array = []

for i in range(lengthOfArray):
    element = input(f"Enter {i+1} element :")
    array.append(element)

print(list(set(array)))

# Method 2

# visited = set()
# withoutDuplicate = []
# for i in array:
#     if i not in withoutDuplicate:
#         withoutDuplicate.append(i)
#         visited.add(i)
# print(withoutDuplicate)