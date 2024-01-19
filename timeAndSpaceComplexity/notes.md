## Time Complexity--
    - Relation between input size & running Time(Operations)

## 3 types of Time Complexity-- 
    1. Best Case  - Omega(1)
    2. Avg Case   - Thita(n+1/2)
    3. worst Case - 0(n)

## Space Complexity --
    - How much space your code takes in memory. 
    - no.of variable stored.
    - Space complexity of an algorithm quantifies the amount of time taken by a program to run as a function of length of the       input. It is directly proportional to the largest memory your program acquires at any instance during run time. 

 #   O(n^n) > O(n!) > O(n3) > O(n2) > O(n.log(n)) > O(n.log(log(n))) > O(n) > O(sqrt(n)) > O(log(n)) > O(1)


 1. int i, j, k = 0;
    for (i = n / 2; i <= n; i++) {
        for (j = 2; j <= n; j = j * 2) {
        k = k + n / 2;
        }
    }
// outer loop (n-n/2 +1) = O(n)
// Inner loop log(n)     = O(log(n))
// Time Complexity = nlog(n)