#WAP to enter Bill amount and ask the user the payment  mode and give the discount based on payment mode. Also  display net payable amount
#   Mode	     Discount
#   credit card      10% of bill amount
#   Debit card       5% of bill amount
#   Net banking      2% fo bill amount
#   otherwise        0

a=float(input('enter the Bill amount-'))
print('''Enter payment mode-
Type  1  for 'Credit card'
type  2  for 'Debit card'
type  3  for 'net banking'
type  0  for nothing.''')
b=int(input('Enter here-'))
if b==1:
    discount=a*0.1
    pa=a-a*0.1
elif b==2:
    discount=a*0.05
    pa=a-a*0.05
elif b==3:
    discount=a*0.02
    pa=a-a*0.02
else:
    discount=0
    pa=a
print('Total discount is-',discount)
print('Net payable amount is-',pa)
