// Input: A[0..N-1]
// Output: (i, j) such that i != j and abs(A[i] + A[j]) is smallest

// bestI = -1, bestJ = -1
// smallest = Infinity
// for i = 0 to N-2
//   for j = i+1 to N-1
//     if (abs(A[i] + A[j]) < smallest)
//       bestI = i, bestJ = j, smallest = abs(A[i] + A[j])
// return (bestI, bestJ)

