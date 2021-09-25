package Collections;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.PriorityQueue;

public class EmpPriorityQueue implements Comparable<EmpPriorityQueue>
{
    private int id;
    private String name;
    private LocalDate dob;


    public EmpPriorityQueue(int newId, String newName, LocalDate newDOB)
    {
        super();

        id = newId;

        name = newName;

        dob = newDOB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public int compareTo(EmpPriorityQueue o)
    {
        return this.getId();//.compareTo(o.getId());

    }

    @Override
    public String toString() {
        return "EmpPriorityQueue{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }

    public static void main(String[] args)
    {
        //natural ordering
        //custom ordering

        Comparator<EmpPriorityQueue> sortTheNames = Comparator.comparing(EmpPriorityQueue::getName);

        PriorityQueue<EmpPriorityQueue> priorityQueues = new PriorityQueue<>(sortTheNames);

        priorityQueues.add(new EmpPriorityQueue(51, "Ali",LocalDate.now()));
        priorityQueues.add(new EmpPriorityQueue(61, "Kainat",LocalDate.now()));
        priorityQueues.add(new EmpPriorityQueue(21, "Qasim",LocalDate.now()));
        priorityQueues.add(new EmpPriorityQueue(91, "Raja",LocalDate.now()));
        priorityQueues.add(new EmpPriorityQueue(31, "Ahmed",LocalDate.now()));
        priorityQueues.add(new EmpPriorityQueue(81, "Ubaid",LocalDate.now()));
        priorityQueues.add(new EmpPriorityQueue(41, "Asim",LocalDate.now()));
        priorityQueues.add(new EmpPriorityQueue(11, "Shaanza",LocalDate.now()));

        while (true)
        {
            EmpPriorityQueue e = priorityQueues.poll();


            System.out.println(e);

            if (e == null)
                return;
        }
    }
}