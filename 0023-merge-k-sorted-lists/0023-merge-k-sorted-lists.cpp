/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        priority_queue<int,vector<int>,greater<int>>pq;
        int k=lists.size();
        for(int i=0;i<k;i++){
            ListNode* head=lists[i];
            while(head){
                pq.push(head->val);
                head=head->next;
            }
        }
         if (pq.empty()) {
            return nullptr; // If there are no nodes, return nullptr
        }
        ListNode* ans=new ListNode(pq.top());
        ListNode* temp=ans;
        pq.pop();
        while(!pq.empty()){
            ListNode* new_node=new ListNode(pq.top());
            temp->next=new_node;
            temp=temp->next;
            pq.pop();
        }
        return ans;
    }
};