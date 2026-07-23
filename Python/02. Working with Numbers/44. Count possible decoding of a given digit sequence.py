number = input("Enter the number :")

if( number[0] == "0" ):
    ways = 0
else:
    prev = 1
    current = 1

    for i in range(1, len(number)):
        nextStep = 0
        
        if(number[i] != "0"):
            nextStep += current
        
        twoDigits = int(number[i-1:i+1]) # Check for pairing of digits
        if(9< twoDigits < 27):
            nextStep += prev
        
        if(nextStep == 0):
            current = 0
            break
        
        prev = current
        current = nextStep
    
    ways = current
print("Total ways to Decode : ",ways)