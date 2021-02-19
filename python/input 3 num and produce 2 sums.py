#program to imnput three numbers and calculates two sums as per this.
#Sum1=sum of all input numbers. Sum2= as the sum of non duplicate number;if there are duplicate numbers in the input, ignores them.
a=float(input('1st number-'))
b=float(input('2nd number-'))
c=float(input('3rd number-'))
print('Sum1=',a+b+c)
if a==b:
   if a==c:
       sum2=0
   else:
       sum2=c
elif a==c:
    sum2=b
elif b==c:
    sum2=a
else:
    sum2=a+b+c
print('Sum2=',sum2)
