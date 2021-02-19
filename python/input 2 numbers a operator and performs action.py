a=float(input('enter 1st number-'))
b=float(input('enter 2nd number-'))
print('Enter any one of the four operators-[ * , + , - , / ]')
op=input('enter-')
if op=='/':
    print( a,'/',b,'=',a/b)
elif op=='+':
    print(a,'+',b,'=',a+b)
elif op=='*':
    print(a,'*',b,'=',a*b)
elif op=='-':
    print(a,'-',b,'=',a-b)
else:
    print('you have entered a invalid operator')

