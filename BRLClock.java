public non-sealed class BRLClock extends Clock{    /*aqui a classe poderia ser final ou non-sealed.
    Final significa que ninguém pode herdar. Não permitindo hierarquias a partir dessa classe.
    Non-sealed significa "Meu pai é sealed, mas eu libero a herança novamente." permitindo outras hierarquias a partir dele.*/ 
    
    @Override
    public Clock convert(final Clock clock){
        this.second = clock.getSecond();
                this.minute = clock.getMinute();
        switch (clock){
            case USClock usClock ->{
                
                this.hour = (usClock.getPeriodIndicator().equals("PM")) ? usClock.getHour() + 12 : usClock.getHour();
            }
            case BRLClock brlClock ->{
                this.hour = brlClock.getHour();
            }
        }
        return this;
    }
}
