startValue = int(input("Enter the Starting Value:"))
endValue = int(input("Enter the Ending Value:"))
sum = 0

for i in range(startValue, endValue+1):
    sum +=i

print("The Sum of the given range is", sum)

# Formula
print(int((endValue*(endValue+1)/2) - (startValue*(startValue+1)/2) + startValue))