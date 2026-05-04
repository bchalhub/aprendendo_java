public class record_person_usando {
    public static void main(String[] args){
        
        var person = new record_person("Bárbara", 31);
        System.out.println(person);
        var newPerson = new record_person("Maria", 15); //Para alterar os valores é necessário criar outro objeto (new)
        System.out.println(newPerson.getInfo()); //usando a instância, criada em record_person, de getInfo()
    }
}
