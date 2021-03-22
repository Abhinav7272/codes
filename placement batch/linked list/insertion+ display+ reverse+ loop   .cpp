#include <bits/stdc++.h>
using namespace std;
struct node {
    int data;
    node *next;
};
// class Solution {
// public:
//     bool hasCycle(ListNode *head) {
//  struct ListNode *f=head;
//   struct  ListNode *s=head;
//     while(f&&f->next){
//         s=s->next;
//         f=f->next->next;
//         if(f==s){
//             return true;
//         }
//     }
//     return false;
//     }
// };
void reverse (node **head){
    node *prev =0 , *cur = *head , * nxt = cur->next;
    while(cur!=0){
        cur->next = prev ;
        prev =cur;
        cur = nxt;
        nxt = nxt? nxt->next:0;
    }
    *head = prev ;
}
void insert ( node **head , int a)
{
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
    display (head);
   
    reverse(&head);
    display(head);
}
