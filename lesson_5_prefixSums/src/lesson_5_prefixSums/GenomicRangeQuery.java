package lesson_5_prefixSums;

import java.util.ArrayList;
import java.util.Arrays;
public class GenomicRangeQuery {
	
	
	
	public void lastSeen(String S, int[] last_seen, String C, int index  ) {
		if(S.charAt(index) == C.charAt(0)) {
			last_seen[index] = index;
		}
		else if(index>0) last_seen[index] = last_seen[index-1];
	}
	
	public int[] solution(String S, int[] P, int[] Q) {
		
		int res[] = new int[P.length];
		Arrays.fill(res, 0);
		
		int[] last_seen_A=new int[S.length()];
		int[] last_seen_C=new int[S.length()];
		int[] last_seen_G=new int[S.length()];
		int[] last_seen_T=new int[S.length()];
		Arrays.fill(last_seen_A,-1);
		Arrays.fill(last_seen_C,-1);
		Arrays.fill(last_seen_G,-1);
		Arrays.fill(last_seen_T,-1);
		
		for(int i=0; i<S.length(); i++) {
			lastSeen(S, last_seen_A, "A", i);
			lastSeen(S, last_seen_C, "C", i);
			lastSeen(S, last_seen_G, "G", i);
			lastSeen(S, last_seen_T, "T", i);
		}
		
		for(int i=0; i<P.length; i++) {
			if(last_seen_A[Q[i]] >= P[i]) {
				res[i] = 1;
			}
			else if(last_seen_C[Q[i]] >= P[i]) {
				res[i] = 2;
			}
			else if(last_seen_G[Q[i]] >= P[i]) {
				res[i] = 3;
			}
			else if(last_seen_T[Q[i]] >= P[i]) {
				res[i] = 4;
			}
		}
		return res;
	}
}

//ArrayList<Integer> orglist = new ArrayList<>();
//ArrayList<Integer> reslist = new ArrayList<>();
//
//for(int i=0; i<S.length(); i++) {
//	if(S.charAt(i) == 'A') {
//		orglist.add(1);
//	}
//	if(S.charAt(i) == 'C') {
//		orglist.add(2);
//	}
//	if(S.charAt(i) == 'G') {
//		orglist.add(3);
//	}
//	if(S.charAt(i) == 'T') {
//		orglist.add(4);
//	}
//}
//
//for(int i=0; i<P.length; i++) {
//	int len = Q[i]-P[i];
//	int min =Integer.MAX_VALUE;
//	for(int j=P[i]; j<Q[i]+1; j++) {
//		if(orglist.get(j) < min) min = orglist.get(j);
//	}
//	reslist.add(min);
//}
//
//int[] res = reslist.stream().mapToInt(i -> i).toArray();
//
//
//return res;