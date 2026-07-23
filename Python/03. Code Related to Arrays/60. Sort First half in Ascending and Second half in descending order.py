lengthOfArray = int(input("Enter the length of an Array:"))
array = []

for i in range(lengthOfArray):
    element = int(input(f"Enter {i+1} element :"))
    array.append(element)

n = len(array)

for i in range(0, n//2):
    for j in range(i + 1, n//2):
        if array[i] > array[j]:
            array[i], array[j] = array[j], array[i]

for i in range(n//2,n):
    for j in range(i + 1, n):
        if array[i] < array[j]:
            array[i], array[j] = array[j], array[i]

print(array)

# Simple Method

# length = len(array)
# mid = length//2
# firstHalf = array[:mid]
# secondHalf = array[mid:]
# part1 = sorted(firstHalf)
# part2 = sorted(secondHalf,reverse=True)
# res = part1 + part2
# print(res)