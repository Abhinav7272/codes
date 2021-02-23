#include <iostream>
using namespace std;
struct stack{
    int size ;
    int top ;
    int *s;
};
void push (stack* st , int x){
    if ( st->top == st->size-1){
        cout<<"stack is full";
    }
    else{
        st->top++;
        st->s[st->top]=x;
    }
}
int pop(stack *st){
    int x=-1;
    if(st->top==-1){
        cout<<"underflow";
    }
    else{
        x=st->s[st->top];
        st->top--;

    }
    return x ;
}
void display(stack *st){
    while(st->top!=-1){
        cout<<pop(st);
    }
}
int main() {
    struct stack st;
    // int s;
    // cin>>st.size;
    st.size=6;
    st.s=new int[st.size];
    st.top =-1;
    push(&st,10);
        push(&st,60);
            push(&st,20);
                push(&st,30);
                    push(&st,40);
                        push(&st,50);
                        display(&st);
    }
