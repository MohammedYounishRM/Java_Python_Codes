number = int(input("Enter the number to find Prime Factor:"))
factor = 2

while (factor <= number):
    if(number % factor == 0):
        print(factor)
        number //= factor
    else:
        factor+=1