
public class Fighter {
   
    private String name;
    private int health;
    private int attack;

   
    public Fighter(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    
    public void attack(Fighter opponent) {

        int damageDealt = this.attack; 
        
      
        opponent.health -= damageDealt;
        
        System.out.printf("%s attacks %s for %d damage!%n", 
                          this.name, opponent.name, damageDealt);
        System.out.printf("%s Health: %d | %s Health: %d%n",
                          this.name, this.health, opponent.name, opponent.health);
    }

   
    public boolean isAlive() {
        return this.health > 0;
    }

   
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
