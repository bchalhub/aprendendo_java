public non-sealed class Manager extends herançaPolimorfismo_employee {
    
    private String login;

    private String password;

    private double commission;


    @Override    //sobre escrita de um comportamento, irá retornar "MN123".
    public String getCode(){
        return "MN" + this.code;
    }

    public Manager(String code,
                    String name,
                    String address,
                    int age,
                    double salary){
        super(code, name, address, age, salary);
        
    }

    public Manager(){

    }


    public String getLogin(){return login;}

    public void setLogin(final String login){this.login = login;}


    public String getPassword(){return password;}

    public void setPassword(final String password){this.password = password;}


    public double getCommission(){return commission;}

    public void setCommission(final double commission){this.commission = commission;}


    @Override  //sobre escrita de um comportamento
    public double getFullSalary(){
        return this.salary + this.commission;
    }

    
    
}
