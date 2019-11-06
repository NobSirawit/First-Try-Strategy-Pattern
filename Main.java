public class Main {
    public static  void main(String[] args){
        Person person = new Person(50,50);

        person.setStratergy(new XMLPat());
        person.export();
        System.out.println(person.export());

        person.setStratergy(new JsonPat());
        person.export();

        System.out.println(person.export());
    }
}
