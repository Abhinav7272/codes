#Wap to enter any character and print it is Uppe Case, Lower Case, Digit or a other character.
a=input('Enter a single character only:-')
if a>='A'and a<='Z':
    print('It is a Upper Case letter')
elif a>='a' and a<='z':
    print('It is a Lower Case letter')
elif a>='0' and a<='9':
    print('it is a Digit')
else:
    print('You have entered a special character')
