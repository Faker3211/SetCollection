import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Set<Integer> setHash = new HashSet<>();
        Set<Integer> setLinked = new LinkedHashSet<>();
        Set<Integer> setTree = new TreeSet<>();
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i <20; i++){
            int nr=random.nextInt( 50);
            list.add(nr);
            setLinked.add(nr);
            setHash.add(nr);
            setTree.add(nr);
        }
        System.out.println("HashSet\n " + setHash);
        System.out.println("LinkedHashSet\n " + setLinked);
        System.out.println("TreeSet\n" + setTree);
        System.out.println("List\n" + list);

        List<Integer> listSet = new ArrayList<>(setHash);
        System.out.println(listSet.get(4));
        setHash.addAll(setTree);
        System.out.println(setHash.remove(38));
        Set<Person> personSet = new HashSet();
        Person person1 = new Person("Agnieszka", "Dewiantka", 15,"123456789011");
        Person person2 = new Person("Dominik", "Trytytka", 16, "123456789011");
        Person person3 = new Person("Patryk", "Trytytka,", 12, "213769420666");
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);


        Iterator<Person> usersIterator1 = personSet.iterator();
        while (usersIterator1.hasNext()) {
            Person currentUser = usersIterator1.next();
            if (currentUser.getName().equals("Janek"))
            {
                usersIterator1.remove();
            }

        }
        for(Person person : personSet) System.out.println(person);

        ComparatorByPESEL compBP = new ComparatorByPESEL();
        Set<Person> pipol = new TreeSet<>(compBP);
        pipol.add(person1);
        pipol.add(person2);
        pipol.add(person3);
        for(Person person : pipol) System.out.println(person);
        CompBySurname compBS = new CompBySurname();
        Set<Person> pipol2 = new TreeSet<>(compBS);
        pipol.add(person1);
        pipol.add(person2);
        pipol.add(person3);
        for(Person person : pipol) System.out.println(person);
    }

}