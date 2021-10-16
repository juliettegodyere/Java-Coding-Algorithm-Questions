package Greedy.problems;

import java.util.*;

public class NMeetingsInOneRoom {
    //Question: https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1
    //Solution: https://github.com/krishnakannan/DS-Algorithms/blob/master/GeeksForGeeks/Greedy/NMeetingRooms.java
    //Exceeded the time limit
    public static int maxMeetings(int start[], int end[], int K) {
        // add your code here
        int[] order = new int[start.length];
		for (int i = 0; i < order.length; i++) {
			order[i] = i + 1;
		}
		sort(start, end, order);
		List<Integer> meetings = new ArrayList<>();
		int endIndex = 0;
		meetings.add(order[0]);
		for (int i = 1; i < start.length; i++) {
			if (start[i] > end[endIndex]) {
				meetings.add(order[i]);
				endIndex = i;
			}
		}
		return meetings.size();
    }
    public static void sort(int start[], int end[], int order[]) {
		for (int i = 0; i < start.length; i++) {
			for (int j = 0; j < end.length; j++) {
				if (end[i] > end[j] && i < j) {
					int sTemp = start[i];
					int eTemp = end[i];
					int oTemp = order[i];

					start[i] = start[j];
					end[i] = end[j];
					order[i] = order[j];

					start[j] = sTemp;
					end[j] = eTemp;
					order[j] = oTemp;
				}
			}
		}
	}


    public static void main(String[] s) {
        int[] arrival = {1,3,0,5,8,5}; //0, 1, 3, 5, 5, 8
        int[] departure = {2,4,6,7,9,9}; //2, 4, 6, 7, 9, 9
        int K = 1;
        System.out.print(maxMeetings(arrival, departure, K));
    }

}
