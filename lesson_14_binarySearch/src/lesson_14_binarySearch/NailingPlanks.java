package lesson_14_binarySearch;

public class NailingPlanks {
    public int solution(int[] A, int[] B, int[] C) {
        int[] ends = getPlankEnds(A, B, C);
        int[] starts = getPlankStarts(ends);
        int[] nails = getNailPositions(C, ends);

        int result = -1;
        Queue queue = new Queue(ends.length);
        for (int i = 1; i < ends.length; i++) {
            if (ends[i] > 0) {
                if (!queue.isEmpty() && ends[queue.last()] == -1) {
                     queue.removeLast();
                }
                ends[i] = -1;
                queue.addLast(i);
            } else if (queue.isEmpty()) {
                continue;
            }
            if (nails[i] != 0) {
                if (ends[queue.last()] == -1 || nails[i] < ends[queue.last()]) {
                    ends[queue.last()] = nails[i];
                    while (queue.size() > 1 && ends[queue.nextToLast()] > nails[i]) {
                        queue.removeNextToLast();
                    }
                }
            }
            if (starts[i] != 0) {
                int min = ends[queue.first()];
                if (min == -1) {
                    return -1;
                }
                if (starts[i] == queue.first()) {
                    queue.removeFirst();
                }
                if (result == -1 || min > result) {
                    result = min;
                }
            }
        }
        return result;
    }

    private int[] getPlankEnds(int[] A, int[] B, int[] C) {
        int[] planks = new int[2 * C.length + 1];
        for (int i = 0; i < A.length; i++) {
            if (planks[A[i]] == 0 || B[i] < planks[A[i]]) {
                planks[A[i]] = B[i];
            }
        }

        Queue stack = new Queue(2 * C.length);
        for (int i = 1; i < planks.length; i++) {
            if (planks[i] != 0) {
                while (!stack.isEmpty() && planks[i] <= planks[stack.last()]) {
                    stack.removeLast();
                }
                stack.addLast(i);
            }
        }

        int[] ends = new int[planks.length];
        while (!stack.isEmpty()) {
            int start = stack.removeLast();
            ends[start] = planks[start];
        }
        return ends;
    }

    private int[] getPlankStarts(int[] ends) {
		int[] starts = new int[ends.length];
		for (int i = 1; i < ends.length; i++) {
		    if (ends[i] > 0) {
		        starts[ends[i]] = i;
		    }
		}
        return starts;
    }

    private int[] getNailPositions(int[] C, int[] starts) {
        int[] nails = new int[starts.length];
        for (int i = 0; i < C.length; i++) {
            if (nails[C[i]] == 0) {
                nails[C[i]] = i + 1;
            }
        }
        return nails;
    }

    private static class Queue {
        private int[] array;
        private int start = 0;
        private int end = -1;
        private int size = 0;

        Queue(int capacity) {
            this.array = new int[capacity];
        }
        void addLast(int element) {
            size++;
            end++;
            if (end == array.length) {
                end = 0;
            }
            array[end] = element;
        }
        int removeLast() {
            size--;
            int result = array[end--];
            if (end < 0) {
                end = array.length - 1;
            }
            return result;
        }
        int removeFirst() {
            size--;
            int result = array[start++];
            if (start == array.length) {
                start = 0;
            }
            return result;
        }
        int removeNextToLast() {
            size--;
            int index = nextToLastIndex();
            int result = array[index];
            array[index] = array[end];
            end = index;
            return result;
        }
        int last() {
            return array[end];
        }
        int first() {
            return array[start];
        }
        int nextToLast() {
            return array[nextToLastIndex()];
        }
        boolean isEmpty() {
            return size == 0;
        }
        int size() {
            return size;
        }
        int nextToLastIndex() {
            return end > 0 ? end - 1 : array.length - 1;
        }
    }
}
