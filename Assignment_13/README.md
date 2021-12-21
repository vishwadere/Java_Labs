# Assignment_13
Implement Binary Tree and perform recursive and non-recursive traversals on it.

## Algorithms
1.Create:
1. Create new temp node
2. If root is empty attach temp node as root
3. Else
1. ptr=root

2. if ptr not null find place to attach node:
1. Ask the direction and if direction is left then
1. if (ptr .lc= =NULL)
1. Ptr. lc =temp;
2. goto step no.4
2. else ptr = ptr.lc
3. 2. else
1. if (ptr . rc= =NULL)
1. Ptr. rc=temp;
2. goto step no. 4
2. else ptr = ptr.rc
4. Ask any other node to attach
5. if answer is yes goto step 1.

2.Inorder recursive traversal:
1. traverse the left subtree of the root node in inorder
2. Visit thr root node
3.traverse the right subtree of the root node in inorder

3.Inorder non-recursive traversal:
1. S is an empty stack used to store NODE pointers.
2. ptr is a NODE pointer and is equal root.
3. As long as ptr is not NULL
3.1 PUSH ptr in stack.
3.2 Move ptr to its left.
4. If stack is not empty
4.1 POP ptr from stack.
4.2 Display data of node ptr.
4.3 Move ptr to its right.
5. If stack is not empty goto step 3.
6. stop
4.Post order non-recursive traversal:
1.S is an empty stack used to store NODE pointers.
2.ptr is a NODE pointer and is equal root.
3.loop ptr is not NULL
3.1PUSH ptr in stack.
3.2Push flag ‘L’ to indicate right child is not processed
3.3Move ptr to its left.

4.If stack is not empty
4.1POP ptr from stack.
4.2Pop flag form stack
4.3If flag is ‘L’ then
4.3.1Push ptr
4.3.2.Push Flag ’R’
4.3.3 Move ptr to its right
4.4 Else print data.
5. If stack is not empty goto step 3.
6. stop
5. Preorder non-recursive traversal:
1.S is an empty stack used to store NODE pointers.
2. ptr is a NODE pointer and is equal root.
3. As long as ptr is not NULL
- Display data of ptr
- PUSH ptr in stack.
- Move ptr to its left.

4. If stack is not empty

- POP ptr from stack.
- Move ptr to its right.
5. If stack is not empty goto step 3.
6. stop

## Test Cases:
1. Check for empty tree.
2. Check output of recursive and non recursive traversal is same.
