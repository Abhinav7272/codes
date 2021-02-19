print('enter marks out of 100')
a=int(input('enter the marks in 1st subject-'))
b=int(input('enter the marks in 2nd subject-'))
c=int(input('enter the marks in 3rd subject-'))
d=int(input('enter the marks in 4th subject-'))
e=int(input('enter the marks in 5th subject-'))
total=a+b+c+d+e
print('Total marks = ',total)
percentage=(total/500)*100
print('Percentage=',percentage,'%')
if percentage>=60:
    print('First divison')
elif percentage>=45:
    print('Second division')
elif percentage>=3:
    print('Third division')
else:
    print('Failed')
