public record record_person(String name, int age) {
    
    public record_person{
        System.out.println("=====");
        System.out.println(name);
        System.out.println(age);
        System.out.println("=====");
    }
    
        public String getInfo(){
        return "Name: " + name + " age: " + age;
    }

    
}
/*o record só permite declarar atributos static
    ele trabalha com objetos imutáveis, permite apenas a leitura dos valores
    não permite construtor sem argumentos
    com ele você trabalha com padrões e valores pré definidos*/