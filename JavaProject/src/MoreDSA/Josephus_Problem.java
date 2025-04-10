package MoreDSA;

public class Josephus_Problem {
    public static void main(String[] args) {
        System.out.println(josephus_problem(9, 2));

    }

    public static int josephus_problem(int numSoldiers, int m_th) {

        int toReturn = 0;
        if (numSoldiers == 0 || m_th == 0) {
            return toReturn;
        }

        LinkedQueue<Integer> soldiersList = new LinkedQueue<>();

        for (int i = 1; i <= numSoldiers; i++) {
            soldiersList.enqueue(i);
        }

        int counter = m_th - 1;

        while (soldiersList.size() > 1) {
            if (counter == 0) {
                soldiersList.dequeue();
                counter = m_th - 1;
            } else {
                int toQue = soldiersList.dequeue();
                soldiersList.enqueue(toQue);
                counter--;
            }
        }

        toReturn = soldiersList.head.data;

        return toReturn;

    }

}
