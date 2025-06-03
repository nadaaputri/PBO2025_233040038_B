package p14.Tugas3;

public class Counter {
    // variabel static untuk menghitung jumlah instance
    private static int instanceCount = 0;

    public Counter() {
        instanceCount++;
    }

    // Method static untuk mengakses nilai instanceCount
    public static int getInstanceCount() {
        return instanceCount;
    }
}
