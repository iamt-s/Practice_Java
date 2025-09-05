package ab;
public class PrimeMultithreaded {

    // Recursive method to check if a number is prime
    public static boolean isPrimeRecursive(int num, int divisor) {
        if (num <= 2) {
            return num == 2;
        }
        if (num % divisor == 0) {
            return false;
        }
        if (divisor * divisor > num) {
            return true;
        }
        return isPrimeRecursive(num, divisor + 1);
    }

    // Thread class to check a range of numbers for prime
    static class PrimeThread extends Thread {
        int start, end;

        public PrimeThread(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public void run() {
            for (int i = start; i <= end; i++) {
                if (isPrimeRecursive(i, 2)) {
                    System.out.println("Prime: " + i + " (Thread: " + this.getName() + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int rangeStart = 1;
        int rangeEnd = 100;

        // Divide range among 4 threads
        int numThreads = 4;
        int rangePerThread = (rangeEnd - rangeStart + 1) / numThreads;

        PrimeThread[] threads = new PrimeThread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int start = rangeStart + i * rangePerThread;
            int end = (i == numThreads - 1) ? rangeEnd : start + rangePerThread - 1;

            threads[i] = new PrimeThread(start, end);
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }

        System.out.println("Finished checking for primes.");
    }
}
