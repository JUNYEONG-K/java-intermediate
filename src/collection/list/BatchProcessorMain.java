package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        BatchProcessor batchProcessorWithArrayList = new BatchProcessor(new MyArrayList<>());
        batchProcessorWithArrayList.logic(100_000); // 6000ms
        BatchProcessor batchProcessorWithLinkedList = new BatchProcessor(new MyLinkedList<>());
        batchProcessorWithLinkedList.logic(100_000); // 6ms

    }
}
