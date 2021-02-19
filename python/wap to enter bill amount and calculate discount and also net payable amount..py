#WAP to enter Total Bill amount and calculate discount as per given  table and also calculate Net payable amount (total bill – discount)
#            Total Bill         	Discount
#             >=20000                  15% of Total Bill
#              >=15000                 10% of total bill
#             >=10000                  5%of total bill  
#            otherwise                 0% of total bill

a=float(input('Enter total bill amount-'))
if a>=20000:
    discount=a*0.15
    pa=a-discount
elif a>=15000:
    discount=a*0.1
    pa=a-discount
elif a>=10000:
    discount=a*0.05
    pa=a-discount
else:
    discount=0
    pa=a
print("Total discount is-",discount)
print('Net payable amount is-',pa)




