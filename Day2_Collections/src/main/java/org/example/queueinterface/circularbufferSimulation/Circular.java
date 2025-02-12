package org.example.queueinterface.circularbufferSimulation;


    import java.util.Arrays;
public class Circular {


        private int[] buffer;
        private int front, rear, size, capacity;

        public Circular(int capacity) {
            this.capacity = capacity;
            this.buffer = new int[capacity];
            this.front = 0;
            this.rear = 0;
            this.size = 0;
        }

        // Enqueue an element
        public void enqueue(int value) {
            if (size == capacity) {
                // Overwrite oldest element
                front = (front + 1) % capacity;
            } else {
                size++;
            }
            buffer[rear] = value;
            rear = (rear + 1) % capacity;
        }

        // Dequeue an element
        public int dequeue() {
            if (isEmpty()) {
                throw new RuntimeException("Buffer is empty");
            }
            int removed = buffer[front];
            front = (front + 1) % capacity;
            size--;
            return removed;
        }

        // Get current buffer contents
        public String getBufferContents() {
            int[] result = new int[size];
            for (int i = 0; i < size; i++) {
                result[i] = buffer[(front + i) % capacity];
            }
            return Arrays.toString(result);
        }

        // Check if buffer is empty
        public boolean isEmpty() {
            return size == 0;
        }

        // Check if buffer is full
        public boolean isFull() {
            return size == capacity;
        }

        public static void main(String[] args) {
            Circular cb = new Circular(3);

            cb.enqueue(1);
            cb.enqueue(2);
            cb.enqueue(3);
            System.out.println("Buffer: " + cb.getBufferContents()); // [1, 2, 3]

            cb.enqueue(4); // Overwrites 1
            System.out.println("Buffer after inserting 4: " + cb.getBufferContents()); // [2, 3, 4]

            cb.dequeue(); // Removes 2
            System.out.println("Buffer after dequeue: " + cb.getBufferContents()); // [3, 4]
        }
    }


