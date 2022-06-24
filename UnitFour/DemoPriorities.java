package UnitFour;
public class DemoPriorities {
    public static void main(String[] args) {
        Thread mang = new Thread();
        System.out.println("Priority of the main Thread class :"+ Thread.currentThread().getPriority());
        System.out.println("Priority of the object of Thread class :"+mang.getPriority());

        // now if we set the priority of super Thread class by - 7 :
        Thread.currentThread().setPriority(7);
        System.out.println("\nAfter setting the new Priority ");

        System.out.println("Priority of the main Thread class :"+ Thread.currentThread().getPriority());
        System.out.println("Priority of the object of Thread class :"+mang.getPriority());


        ThreadwithPriorities objThread = new ThreadwithPriorities();
        System.out.println("Priority of new user-defined thread class"+objThread.getPriority());
    }
}
