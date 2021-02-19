print('for quadratic equation- ax**2+bx+c , Enter values for:')
import math
a=float(input('Enter a:'))
b=float(input('enter b:'))
c=float(input('enter c:'))
if a==0:
    print('value of a cannot be zero'
          'Aborting the program!!!!!')
else:
    d=b*b-4*a*c
    if d>0:
        r1=(-b-math.sqrt(d))/(2*a)
        r2=(-b+math.sqrt(d))/(2*a)
        print('roots are real and distinct')
        print('Roots of quadratic equation are',r1,'and',r2)
    elif d==0:
        r=(-b)/(2*a)
        print('roots are real and equal')
        print('roots are-',r,'and',r)
    else:
        print('Roots are complex and imaginary')
        
