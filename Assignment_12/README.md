# Assignment_12
Implement Queue as ADT using linked list or array. Use Queue ADT to simulate Pizza delivery operations for a 'Pizza Parlor system'.

## Algorithms
1.Queue using array:
1. IsFull()
1. If rear ==MaxSize-1
1.1return 1
2. otherwise
2.1return 0
2.2
2. Is Empty()
1. If front==(rear+1)
1.1return 1
2. otherwise
1.2return 0
3. Enqueue()
1. If queue is full print message
2. Otherwise

2.1 Increment rear
2.2 Add element in rear

4. Remove()
1. If Qempty()==1
1.1 Print "Queue empty";
2. Otherwise
2.1 Increment front
5. Display()
1. if Qempty()==1
1.1 Print "\nQueue empty"
2. Repeat from i=front;to i<=rear;
2.1 Print Queue[i]
Queue Using Linked List:

1. Enqueue()
int value;
1. Accept a value to be inserted in node from user.
2. Create a new node.
3. Check if (front==NULL)//Queue empty
3.1 Store address of first node in front.
4. Otherwise
4.1 rear->next=ptr; //add node at last
4.2 Increment rear at new node
5. stop

2. Delete()
1. If frnt==NULL
1.1 Print "\nQueue is empty!!";
2. Set temp=frnt;
3. Increment frnt
4. Print Deleted value is "<<temp->data;
5. delete temp;
6. Stop
3. Display()
1. Set pointer ptr1 to frnt;
2. If frnt==NULL
2.1Print "The Queue is empty!!"
3. Otherwise
4. Traverse ptr1 till end
4.1 Print ptr1->data
4.2 Increment ptr1 to next node
5.Stop
  
  
## Test Cases:
1. Queue is full.
2. Queue is empty.
