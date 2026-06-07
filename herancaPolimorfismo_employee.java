public sealed abstract class herançaPolimorfismo_employee permits Manager, Salesman{

    protected String code;

    protected String name;

    protected String address;

    protected int age;

    protected double salary;

/* protected é mais restrito que o public e mais acessível que o private. 
Ele não permite acesso de fora da sua classe a menos que esteja herdando a classe, a herança é uma condição */

    public herançaPolimorfismo_employee(String code,
                    String name,
                    String address,
                    int age,
                    double salary){
        this.code = code;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
}

    public herançaPolimorfismo_employee(){

    }


    public String getCode() {return code;}

    public void setCode(String code){this.code = code;}


    public String getName() {return name;}

    public void setName(String name){this.name = name;}


    public String getAddress() {return address;}

    public void setAddress(String address){this.address = address;}


    public int getAge() {return age;}

    public void setAge(int age){this.age = age;}


    public double getSalary() {return salary;}

    public void setSalary(double salary){this.salary = salary;}


    public abstract double getFullSalary();


    public double getFullSalary(double extra){  //sobre carga de um método/função, um com parâmentos e outro sem. 
        return this.getFullSalary() + extra;    //São métodos com mesmo nome porém com parâmetros diferentes gerando comportamentos diferentes
    }

}
