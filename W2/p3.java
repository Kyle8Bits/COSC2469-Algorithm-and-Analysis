// package W2;
// Input = [P1, P2,...] = P[0..N-1]
// P[i].A = arrival time of plane i
// P[i].D = departure time of plane i

// E = []
// for i = 0 to N - 1
//   E[2*i] = (P[i].A, Arrival)
//   E[2*i + 1] = (P[i].D, Departure)
// Sort (E) according to value
// minGateRequired = 0
// currentGate = 0
// for i = 0 to 2*N - 1
//   if (E[i].type == “Arrival”)
//     currentGate++
//   else
//     currentGate—
//   minGateRequired = max(minGateRequired, currentGate)
// return minGate

