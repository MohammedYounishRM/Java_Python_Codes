number = int(input("Enter the number to check Abundant:"))
sum = 0

for i in range(1,number):
    if(number % i == 0):
        sum += i
    
print(f"{number} is an Abundant Number" if(sum > number) else f"{number} is not a Abundant number")