#program to find greatest outta 3 numbers.
num1=float(input('enter the 1st number-'))
num2=float(input('enter the 2nd number-'))
num3=float(input('enter the 3rd nubmer-'))
max=num1
if max<num2:
    max=num2
if max<num3:
    max=num3
print('the largest number is-',max)
