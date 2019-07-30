ALPQueue
instert 5000 entries : 4.0 ms
remove 5000 entries : 155.0 ms
HeapPQueue
insert 5000 entries : 2.0 ms
remove 5000 entries : 5.0 ms


This is the result of the performance test of insert and remove operations between ALPQueue and HeapPQueue.
As you can see, the time consuming of ALPQueue is longer than HeapPQueue.

First, create new ALPQueue object "alpQueue" and new HeapPQueue object "heapQueue".
And create 5,000 elements randomly using Math.random() function and add these elements to int array "aList".

Next, obtain time and perform an insert and remove operations 5,000 times to alpQueue, and obtain time respectively.
Then, Calculate the elapsed time between "start" and "mid", "mid" and "last", and print it. It takes 4 ms and 155ms respectively.

Finally, repeat same course in heapQueue's case. It takes 2ms and 5ms respectively.

Consequently, we can know HeapPQueue is better than ALPQueue.