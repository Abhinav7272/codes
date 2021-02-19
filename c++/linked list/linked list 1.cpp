#include <iostream>
using namespace std;
struct node{
    int data ;
     node * next;
};
class linkedlist{
    private :
    node *head , *tail;
    public:
    linkedlist(){
        head=0;
        tail=0;
    }
    void add(int n ){
        node *temp = new node;
        temp->data =n;
        temp-> next = 0;
        if(head==0){
            head=temp;
            tail=temp;
        }
        else{
            tail->next = temp;
            tail = tail->next;
        }
    }
     void display(){
         node *temp = head;
         while( temp!=0){
             cout<<temp->data;
             temp=temp->next;
         }
     }
};
int main() {
    linkedlist l;
    l.add(10);
    l.add(50);
    l.add(40);
    l.add(55);
    l.add(44);
    l.display();

}
