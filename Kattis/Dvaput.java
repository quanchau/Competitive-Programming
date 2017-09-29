import java.util.*;

public class Dvaput { 

	static char T[];                        // the input string, up to 100K characters

  static int n;                                             // the length of input string



  static int[] tempRA;             // rank array and temporary rank array
  static int[] RA;
  static int[] tempSA;     
  static int[] SA;   // suffix array and temporary suffix array

  static int[] c;                                         // for counting/radix sort



  static char P[];     // the pattern string (for string matching)

  static int m;             // the length of pattern string



  static int[] Phi;    // for computing longest common prefix

  static int[] PLCP;

  static int[] LCP;    // LCP[i] stores the LCP between previous suffix "T + SA[i-1]" and current suffix "T + SA[i]"



  static void countingSort(int k) {

    int i, sum, maxi = Math.max(300, n);   // up to 255 ASCII chars or length of n

    for (i = 0; i < 900010; i++) c[i] = 0;                // clear frequency table

    for (i = 0; i < n; i++)                    // count the frequency of each rank

      c[i + k < n ? RA[i + k] : 0]++;

    for (i = sum = 0; i < maxi; i++) {

      int t = c[i]; c[i] = sum; sum += t;

    }

    for (i = 0; i < n; i++)               // shuffle the suffix array if necessary

      tempSA[c[SA[i] + k < n ? RA[SA[i] + k] : 0]++] = SA[i];

    for (i = 0; i < n; i++)                          // update the suffix array SA

      SA[i] = tempSA[i];

  }



  static void constructSA() {              // this version can go up to 100000 characters

    int i, k, r;

    for (i = 0; i < n; i++) RA[i] = T[i];                      // initial rankings

    for (i = 0; i < n; i++) SA[i] = i;          // initial SA: {0, 1, 2, ..., n-1}

    for (k = 1; k < n; k <<= 1) {            // repeat sorting process log n times

      countingSort(k);       // actually radix sort: sort based on the second item

      countingSort(0);               // then (stable) sort based on the first item

      tempRA[SA[0]] = r = 0;                  // re-ranking; start from rank r = 0

      for (i = 1; i < n; i++)                         // compare adjacent suffices

        tempRA[SA[i]] =      // if same pair => same rank r; otherwise, increase r

          (RA[SA[i]] == RA[SA[i-1]] && RA[SA[i]+k] == RA[SA[i-1]+k]) ? r : ++r;

      for (i = 0; i < n; i++)                          // update the rank array RA

        RA[i] = tempRA[i];

  } }



  static void computeLCP() {

    int i, L;

    Phi[SA[0]] = -1;                                              // default value

    for (i = 1; i < n; i++)                                 // compute Phi in O(n)

      Phi[SA[i]] = SA[i-1];         // remember which suffix is behind this suffix

    for (i = L = 0; i < n; i++) {                  // compute Permuted LCP in O(n)

      if (Phi[i] == -1) { PLCP[i] = 0; continue; }                 // special case

      while (i + L < T.length && Phi[i] + L < T.length && T[i + L] == T[Phi[i] + L]) L++; // L will be increased max n times

      PLCP[i] = L;

      L = Math.max(L-1, 0);                          // L will be decreased max n times

    }

    for (i = 1; i < n; i++)                                 // compute LCP in O(n)

      LCP[i] = PLCP[SA[i]];   // put the permuted LCP back to the correct position

  }



  static int strncmp(char[] a, int i, char[] b, int j, int n){

    for (int k=0; i+k < a.length && j+k < b.length; k++){

      if (a[i+k] != b[j+k]) return a[i+k] - b[j+k];

    }

    return 0;

  }






  static void LRS() {                          // print out the length and the actual LRS

    int i, idx = 0, maxLCP = 0;



    for (i = 1; i < n; i++)                                                // O(n)

      if (LCP[i] > maxLCP) {

        maxLCP = LCP[i];

        idx = i;

      }



    System.out.println(maxLCP);

  }





  public static void main(String[] args){
	    int MAX_N = 900010;

	    c = new int[MAX_N];

	    RA = new int[MAX_N];

	    tempRA = new int[MAX_N];

	    SA = new int[MAX_N];

	    tempSA = new int[MAX_N];

	    Phi = new int[MAX_N];

	    PLCP = new int[MAX_N];

	    LCP = new int[MAX_N];
	  Scanner in = new Scanner(System.in);
	  n = in.nextInt();
	  String s = in.next();
	  T= s.toCharArray();
	  constructSA();
	  computeLCP();
	  LRS();
	  
	  
    

  }
  

}