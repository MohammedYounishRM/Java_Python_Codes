number = int(input("Enter the number to find Factor:"))

for i in range(1,number):
    if(number % i == 0):
        print(i)