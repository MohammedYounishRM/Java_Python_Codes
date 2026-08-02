string = input("Enter the brackets:")

while( len(string) != 0 ):
        original = len(string)

        string = string.replace('(','')
        string = string.replace('[','')
        string = string.replace('{','')
        string = string.replace(')','')
        string = string.replace(']','')
        string = string.replace('}','')

        if( len(string) == original ):
             break

if ( len(string) == 0):
   print("The Entered String has Balanced brackets")
   
else:
    print("The entered string does not have balanced brackets")