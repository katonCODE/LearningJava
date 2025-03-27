package DSAwork;
//part of week 3 work
public class DSA_Quiz3 {
    public static void main(String[] args) {
        // TODO code application logic here
        String[] stringList = {"Hello", "Hello", "Data", "Structures", "And", "Algorithms", "Students"};
        LinkedSet<String> linkedSet = new LinkedSet<>();
        for(int i = 0; i < stringList.length; i++) {
            linkedSet.add(stringList[i]);
        }

        System.out.println(linkedSet.toString());
        System.out.println(linkedSet.toStringRreversely(linkedSet.head));
    }
}