# Assignment_15
Implement heap data structure.
Perform following operation on Min heap or Max Heap
1. Insert an element
2. Delete an element from heap
3. Build Heap
4. Delete Heap
Extra- Heap sort

## Algorithms
I. Insert element in heap (Upadjacement) :
1. Accept new element
2. Store it at last index.
3. Increment number of elements of heap.
4. Set i to last index.
5. Repeat until root has not processed
1. Check data at index i and data at its parent
2. If data at parent is greater/ smaller than data at index i then
1. Exchange data at i and data at parent
3. Set i to its parent index

II. Build heap using bottom up approach :
1. Read all elements in array.
2. Store number of elements at first index.
3. Repeat for i = n/2 downto 1
1. call Downadjustment for every element at ( i)
III. Reheapify using downadjustment for element at index i:
1. Repeate till i not reaches to last level
1. Set l to left child of i
2. Set r to right child of i
3. Find largest/smallest from l and r , store resultant index in largest/smallest
4. Compare element at largest/smallest and element at i
5. If element at i is less than /greater than element at largest/smallest
1. Exchange elements
6. Set i to largest/smallest

IV: Delete element
1. Display at second index of array (data at root)
2. Store last element of heap at first element of heap
3. Decrement number of elements of heap.
4. Call downadjustment to reheapify.
V: Heap Sort
1. First = 1 and last = n
2. Build a Heap X [first] to X [last]
3. Interchange X [first] and X [last]
4. Rehepify X[first]
5. Last = last-1
6. Repeat from step 3 to 5 as long as last &gt; 0


## Test Cases:

1. Heap is not created.
2. Max heap is created
3. Min heap is created.
4. New element is inserted in heap.
5. Finding largest/smallest element at root(first).
6. Elements are arranged in ascending/descending order.