number = int(input("Enter the number to check Perfect:"))
add = 0

for i in range(1,number):
    if(number % i == 0):
        add += i

print(f"{number} is a Perfect Number" if((number!=0) and (number == add)) else f"{number} is not a Perfect number")