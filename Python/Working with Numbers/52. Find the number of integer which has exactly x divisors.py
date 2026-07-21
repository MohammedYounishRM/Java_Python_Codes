endValue = int(input("Enter a number :"))
divisors = int(input("Enter how many divisors you want :"))
match = 0

for num in range(1, endValue + 1):
    count = 0
    
    for i in range(1, num + 1):
        if num % i == 0:
            count += 1
            
    if count == divisors:
        match += 1

print("Total count:", match)