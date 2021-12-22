# Assignment_14
Create a Dictionary that stores keywords and its meanings, using appropriate data structure.
Implement its operations such as add, delete, display, search and update its values.

## Algorithms
Create:

• Repeat
• 1. Accept Keyword and meaning from user and Create new temp node with this
data.
• 2.If root is empty attach temp node as root
• 3.Else
• 3.1 ptr=root
• 3.2 if ptr not null find place to attach node:
• 3.2.1 if(ptr.word.compareTo(temp.word)>0)
• 3.2.1.1 if (ptr .lc= =null)

• Ptr. lc =temp;
• goto step no.4
• 3.2.1.2 else ptr = ptr.lc
• 3.2.2 else if(ptr.word.compareTo(temp.word)<0)
• 3.2.2.1 if (ptr . rc= =null)
• Ptr. rc=temp;
• goto step no. 4
• 3.2.2.2 else ptr = ptr.rc
• 3.3 Ask any other node to attach
• 3.4 if answer is yes goto step 1.
• 3.5 Stop

Search:

• 1. Accept data to be search
• 2. Set ptr to root of tree
• 3. Loop Till ptr not null

3.1 Compare data at node with key to be search

• 3.1.1If both are same return ptr
• 3.3 If key to be search is smaller then move ptr to its left child
• 3.4 Otherwise move ptr to its right child.

4. Stop
Update:

• 1. Accept data to be search
• 2.Set ptr to root of tree
• 3.Loop Till ptr not null

3.1 Compare data at node with key to be search

3.1.1 If both are same
3.1.2 Accept data to be updated
• Replace new data with original data
• 3.1.3 If key to be search is smaller then move ptr to its left child
• Otherwise move ptr to its right child.
• 4.Return data not found
• 5.Stop

Delete:

• 1.Accept data to be deleted
• 2. Set ptr to root of tree
• 3.Loop Till ptr not null

3.1 Compare data at node with key to be search

• 3.1.1 If both are same
• 3.1.1.1 If node to be deleted is leaf node
• If it is left child of parent then update left link of parent to null
• If it is right child of parent then update right link of parent to Null
• 3.1.1.2 If node to be deleted has only left child
• If it is left child of parent then copy left link of ptr to left link of parent

• If it is right child of parent then copy left link of ptr to right link of parent
• 3.1.1.3 If node to be deleted has only right child
• If it is left child of parent then copy right link of ptr to left link of parent
• If it is right child of parent then copy right link of ptr to right link of parent
• 3.1.1.4 If node to be deleted has both children
• 1.Assign p to left child of ptr
• 2.Find rightmost child of p. Also track parent of p.
• 3.Copy data at p to data at ptr
• Attach left sub tree of p to parent

• 3.2 Set parent to ptr
• 3.3 If key to be search is smaller then move ptr to its left child
• 3.4 Otherwise move ptr to its right child.
• 4 Return data not found
• 5. Stop


## Test Cases:

• 1.For searching

• Keyword present in the tree
• Keyword not present in the tree

• 2.For Deleting node

• Node has both children
• Node has only one child
• Node is leaf node
