start = int(input("Enter the Starting range of Armstrong:"))
end = int(input("Enter the ending range of Armstrong:"))

for i in range(start, end+1):
    length = len(str(i))
    add = 0
    originalValue = i
    while(originalValue != 0):
        digit = originalValue % 10
        add += pow(digit,length)
        originalValue //= 10

    if(i == add):
        print(i)