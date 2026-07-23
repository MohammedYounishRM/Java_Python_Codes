start = int(input("Enter a Start value:"))
end = int(input("Enter a End value:"))
finalResult = []

for i in range(start,end+1):
    result = True
    if( i < 2 ):
        continue
    if ( i == 2 ):
        finalResult.append(2)
        continue
    for j in range(2,i):
        if( i % j == 0):
            result = False
            break
        
    if ( result == True ):
        finalResult.append(i)

print("The Prime Number within the given range is :",finalResult)