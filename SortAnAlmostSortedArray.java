package epi;

import java.util.PriorityQueue;

public class SortAnAlmostSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sequence = {3,2,-1,6,4,5,8}; 
		sortedArray(sequence, 2);
	}
	public static void sortedArray(int[] sequence, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int i=0;
		while(i<k+1 && i<sequence.length) {
			pq.add(sequence[i]);
			i++;
		}
		while(!pq.isEmpty() && i<sequence.length) {
			System.out.println(pq.poll());
			pq.add(sequence[i]);
			i++;
		}
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}
