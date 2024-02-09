//package ru.alex.others;
//
//import java.util.*;
//
//import static java.lang.Integer.parseInt;
//
///***
// * Имеется m, исполнителей, пронумерованных числами от 1 до m, и k очередей задач, пронумерованных числами от 1 до k.
// * Изначально очереди пусты. Системе предстоит выполнить n задач: i-я задача встанет в очередь с номером qi; на si секунде и
// * потребует ti; секунд на выполнение.
// *
// * Каждую секунду происходит следующее:
// *
// *  Вконец некоторых очередей могут добавиться новые задачи (но не более одной задачи в каждую очередь)
// *
// * Пока это возможно, выбирается незанятый исполнитель с наименьшим номером и непустая очередь, из которой дольше
// * всего не забирались задачи. Если таких очередей несколько, то выбирается очередь с наименьшим номером. Исполнитель
// * забирает задачу из очереди и становится занятым на время ее выполнения.
// *
// * Для каждой задачи определите, когда и какой исполнитель начнет ее выполнять.
// */
//
//public class Scheduler {
//    static Map<Integer,MyQueue> queuePoll;
//    static Map<Integer, Consumer> consumers;
//    static Queue<String> tasks = new ArrayDeque<>();
//
//    public static void main(String[] args) {
//        inputData();
//        for (int i = 1; i < 100000; i++) {
//            putTaskInQueue(i);
//            while(consumers.){
//
//            }
//        }
//
//    }
//
//
//    public static void putTaskInQueue(int i) {
//        assert tasks.peek() != null;
//        String[] taskArray = tasks.peek().split(" ");
//        while (parseInt(taskArray[0]) == i) {
//            queuePoll.get(parseInt(taskArray[1])).add(parseInt(taskArray[2]));
//            tasks.poll();
//            assert tasks.peek() != null;
//            taskArray = tasks.peek().split(" ");
//        }
//    }
//
//
//    public static void inputData() {
//        Scanner scanner = new Scanner(System.in);
//        int taskNum = scanner.nextInt();
//        int consumersNum = scanner.nextInt();
//        int queueNum = scanner.nextInt();
//        queuePoll = new TreeMap<>();
//        for (int i = 1; i <= queueNum; i++) {
//            queuePoll.put(i, new MyQueue(i));
//        }
//        consumers = new TreeMap<>();
//        for (int i = 0; i < consumersNum; i++) {
//            consumers.put(i,new Consumer(i));
//        }
//        scanner.nextLine();
//        for (int i = 0; i < taskNum; i++) {
//            tasks.add(scanner.nextLine());
//        }
//    }
//
//
//}
//
//class MyQueue extends ArrayDeque<Integer> implements Comparable<MyQueue> {
//    MyQueue(int id){
//        super();
//        this.id = id;
//    }
//    public int id;
//
//    @Override
//    public int compareTo(MyQueue o) {
//        if (this.size()==o.size()){
//            return this.id-o.id;
//        }else return this.size()-o.size();
//    }
//}
//
//
//class Consumer implements Comparable<Consumer> {
//    public int id;
//    public int time = 0 ;
//
//    public Consumer(int id){
//        this.id= id;
//    }
//    @Override
//    public int compareTo(Consumer o) {
//        if (time == o.time) {
//            return id - o.id;
//        } else return o.time - time;
//    }
//
//    public void tikTak() {
//        if (time > 0) time--;
//
//    }
//
//    public void addTask(int time) {
//        this.time += time;
//    }
//}