# Advanced Data Structures in Java

## Introduction
This folder covers advanced data structures used to solve algorithmic problems efficiently.

## Key Concepts
- **Fenwick Tree:** Calculates prefix sums efficiently.
- **Segment Tree:** Answers range queries, such as range sums.
- **Union-Find:** Tracks groups of connected elements.

## Files
- `FenwickTree.java` – Updates values and calculates prefix sums.
- `SegmentTree.java` – Calculates the sum of a range.
- `UnionFind.java` – Joins groups and checks whether elements belong to the same group.

## Time Complexity
- Fenwick Tree update and prefix sum: O(log n)
- Segment Tree build: O(n); range sum query: O(log n)
- Union-Find: Nearly O(1) amortized per operation with path compression and union by rank or size. This basic version uses path compression only.

## Conclusion
These data structures help solve range-query and connectivity problems efficiently.