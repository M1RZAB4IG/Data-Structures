import java.util.Scanner;

public class heapArray {
        private int[] heap;
        private int size;

        public static void main(String[] args) {
            Part2 heap = new Part2();
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter k value: ");
            int k = scan.nextInt();
            scan.nextLine();

            System.out.println("Enter array values separated by commas: ");
            String line = scan.nextLine();
            String[] num = line.split(",");
            int[] input = new int[num.length];

            for (int a=0; a<num.length; a++) {
                    input[a] = Integer.parseInt(num[a]);
            }
            int[] result = heap.kthMinValues(input, k);
            
            System.out.print("[");
            for (int b=0; b<result.length; b++) {
                    System.out.print(result[b] + ",");
            }
            System.out.print("]");
    }
        public Part2() {
                this.size = 0;
                heap = new int[20];
        }

        public int[] kthMinValues(int[] arr, int k) {
                int[] val = new int[k];
                this.heap = arr;
                size = arr.length;

                for (int a=0; a<k; a++) {
                        val[a] = remove();
                }
                return val;
        }

        public int size() {
                return size;
        }

        public void add(int element) {
                if (size >= heap.length) {
                        return;
                }
                heap[size] = element;
                int current = size;
                while (heap[current] < heap[parent(current)]) {
                        swap(current, parent(current));
                        current = parent(current);
                }
                size++;
        }
        public int remove() {
                if (size > 0) {
                        int pop = heap[0];
                        heap[0] = heap[--size];
                        heapify(0);
                        return pop;
                }
                return -1;
        }
        private void heapify(int m) {
           if (!isLeaf(m)) {
               if (heap[m] > heap[leftChild(m)] || heap[m] > heap[rightChild(m)]) {
                  if (heap[leftChild(m)] < heap[rightChild(m)]) {
                      swap(m, leftChild(m));
                      heapify(leftChild(m));
                                } else {
                                        swap(m, rightChild(m));
                                        heapify(rightChild(m));
                                }
                        }
                }
        }
        public void minHeap() {
                for (int a= (size-1/2); a>= 1; a--) {
                        heapify(a);
                }
        }
        private void swap(int x, int y) {
                int temp;
                temp = heap[x];
                heap[x] = heap[y];
                heap[y] = temp;
        }
        private int parent(int i) {
                return (i - 1) / 2;
        }
        public int getItem(int i) {
                return heap[i];
        }
        private int leftChild(int i) {
                return (i*2) + 1;
        }
        private int rightChild(int i) {
                return (i*2) + 2;
        }
        private boolean isLeaf(int i) {
                if (rightChild(i) >= size || leftChild(i) >= size) {
                        return true;
                }
                return false;
        }
}
