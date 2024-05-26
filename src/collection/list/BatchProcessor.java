package collection.list;

public class BatchProcessor {
    //    private final MyArrayList<Integer> list = new MyArrayList<>();
//    private final MyLinkedList<Integer> list = new MyLinkedList<>(); // 구체적인 코드 변화 => 인터페익스에 의존하도록 변경하자!
    private final MyList<Integer> list; // 인터페이스에 의존! 이 클래스의 객체를 생성할 때 의존성을 주입해서 활용할 수 있다.

    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) { // O(n)
            list.add(0 , i); // 배열의 맨 앞에 추가 => MyLinkedList -> O(1) => O(n), MyArrayList -> O(n) => O(n*n)
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size);
        System.out.println("계산 시간: " + (endTime - startTime) + "ms");
    }
}
