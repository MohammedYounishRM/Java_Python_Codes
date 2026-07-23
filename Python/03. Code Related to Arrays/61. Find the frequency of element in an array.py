lengthOfArray = int(input("Enter the length of an Array:"))
array = []

for i in range(lengthOfArray):
    element = int(input(f"Enter {i+1} element :"))
    array.append(element)

size = len(array)
for i in range(size):
        flag = False
        count = 0

        for j in range(i+1, size):
            if array[i] == array[j]:
                flag = True
                break

        if flag == True:
            continue

        for j in range(0, i+1):
            if array[i] == array[j]:
                count += 1

        print("{0}: {1}".format(array[i], count))

# Method 2

# freq={}
# for i in array:
#     if i in freq:
#         freq[i] += 1
#     else:
#         freq[i] = 1

#     # Method 3
#     # freq[i]=freq.get(i,0)+1
# print(freq)