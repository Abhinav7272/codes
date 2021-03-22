#include <bits/stdc++.h>
using namespace std;
struct node {
    int data;
    node *next;
};
void insert ( node **head , int a){
    node *temp = new node();
    temp->data = a;
    temp->next = 0;
    if(*head == 0){
        *head = temp;
        return ;
    }
    else {
        node * itr =*head;
        while( itr ->next != 0){
            itr= itr->next;
        }
        itr->next = temp;
    }
}
void display (node * head ){
    node * temp = head;
    while ( temp !=0){
        cout<< temp->data;
        temp= temp->next ;
    }
}
int main() {
    int arr[] ={1,2,3,2,4,5,3,5,6};
    node *head =0;
    for( int i=0;i<9;i++){
        insert(&head, arr[i]);

    }
    display ( head);
}
