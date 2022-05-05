public class minHeap
{
        private int[] Heap;
        private int size;
        private int maxsize;
        private static  int front = 1;
        private int parent(int position) 
        { 
                return position / 2;
        }
        
        public static void main(String[] arg)
        {
                System.out.println("The Min Heap is :");
                Part1 minHeap = new Part1(15);
                minHeap.insert(5);
                minHeap.insert(3);
                minHeap.insert(17);
                minHeap.insert(10);
                minHeap.insert(84);
                minHeap.insert(19);
                minHeap.insert(6);
                minHeap.insert(22);
                minHeap.insert(9);
                minHeap.print();
                System.out.println("The Min value is: "+ minHeap.remove());
        }
        public Part1(int maxsize)
        {
                this.maxsize = maxsize;
                this.size = 0;
                Heap = new int[this.maxsize + 1];
                Heap[0] = Integer.MIN_VALUE;
        }
        public void insert(int element)
        {
                if (size >= maxsize) {
                        return;
                }
                Heap[++size] = element;
                int current = size;
                while (Heap[current] < Heap[parent(current)]){
                        swap(current, parent(current));
                        current = parent(current);
                }
        }
        public int remove()
        {
                int pop= Heap[front];
                Heap[front] = Heap[size--];
                minHeapify(front);
                return pop;
        }
        public void print()
        {
         for (int a= 1; a<= size/2; a++) {
              System.out.print(" Parent: " + Heap[a]+ " Left Child: " + Heap[2*a]+ " Right Child:" + Heap[2*a+1]);
              System.out.println();
                }
        }
        private int rightChild(int position)
        {
                return (2 * position) + 1;
        }
        private int leftChild(int position) 
        {
                return (2*position);
        }
        private boolean isLeaf(int position)
        {
            if (position > (size / 2) && position <= size)   {
                return true;
                }
                return false;
        }    
        private void swap(int fposition, int sposition)
        {
                int tmp;
                tmp = Heap[fposition];
                Heap[fposition] = Heap[sposition];
                Heap[sposition] = tmp;
        }
        private void minHeapify(int position){
                if (!isLeaf(position)){
                  if (Heap[position] > Heap[leftChild(position)]|| Heap[position] > Heap[rightChild(position)]){
                     if (Heap[leftChild(position)]< Heap[rightChild(position)]){
                          swap(position, leftChild(position));
                          minHeapify(leftChild(position));
                      }
                     else {
                          swap(position, rightChild(position));
                         minHeapify(rightChild(position));
                          }
                   }
             }
        }
  
}
