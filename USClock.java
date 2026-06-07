public non-sealed class USClock extends Clock{    /*aqui a classe poderia ser final ou non-sealed.
    Final significa que ninguém pode herdar. Não permitindo hierarquias a partir dessa classe.
    Non-sealed significa "Meu pai é sealed, mas eu libero a herança novamente." permitindo outras hierarquias a partir dele.*/ 

    //Atributo/propriedades
    private String periodIndicator;

    
    //Getter and Setter
    public String getPeriodIndicator(){
        return periodIndicator;
    }
    public void setAfterMidday(){
        this.periodIndicator = "PM";
    }
    public void setBeforeMidday(){
        this.periodIndicator = "AM";
    }


    //Método
    public void setHour(int hour){
        setBeforeMidday();
        if((hour > 12) && (hour <= 23)){
            setAfterMidday();
            this.hour = hour - 12;
        } else if (hour >= 24){
            this.hour = 0;
        } else{
            this.hour = hour;
        }
    }

    @Override
    public Clock convert(final Clock clock){
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock){
            case USClock usClock ->{
                this.hour = usClock.getHour();
                this.periodIndicator = usClock.getPeriodIndicator();
            }
            case BRLClock brlClock -> this.setHour(brlClock.getHour());
            
        }
        return this;
    }

    @Override
    public String getTime(){
        return super.getTime() + " " + this.getPeriodIndicator();
    }
        
    }
