#program to find greatest outta 3 numbers.
num1=float(input('enter the 1st number-'))
num2=float(input('enter the 2nd number-'))
num3=float(input('enter the 3rd nubmer-'))
if num1>num2:
    if num1>num3:
        print(num1,"is the greatest number")
    elif num1<num3:
        print(num3,'is the greatest number')
    else:
        print(num1,'and',num3,'are equal numbers and greater than',num2)

elif num1==num2:
    if num1>num3:
        print(num1,'and',num2,'are equal numbers greater than',num3)
    elif num1<num3:
        print(num3,'is greatest number')
    else:
        print('all numbers are equal')
elif num2>num1:
    if num2>num3:
        print(num2,"is the greatest number")
    elif num2<num3:
        print(num3,'is the greatest number')
    else:
        print(num2,'and',num3,'are equal numbers and greater than',num1)
