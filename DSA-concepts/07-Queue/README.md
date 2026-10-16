# Queue in Java

## Introduction
A queue is a data structure that follows **FIFO (First In, First Out)**. The first item added is the first item removed.

## Types
- **Queue:** Adds items at the rear and removes them from the front.
- **Circular Queue:** Reuses empty spaces by connecting the end of the array to the beginning.
- **Deque:** Allows adding and removing items from both ends.

## Files
- `QueueUsingArray.java` – Implements a basic queue using an array.
- `CircularQueue.java` – Implements a circular queue.
- `DequeBasics.java` – Demonstrates Java's built-in deque.

## Time Complexity
- Enqueue: O(1)
- Dequeue: O(1)
- Display: O(n)

## Conclusion
Queues are useful in task scheduling, printer queues, and processing requests in order.