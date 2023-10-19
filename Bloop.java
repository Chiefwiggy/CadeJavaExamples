public class Bloop {

    String name;
    int hp;
    int maxhp;

    public Bloop() {
        this.name = "UNNAMED";
        this.hp = 0;
        this.maxhp = 0;
        System.out.println("Created Bloop");
    }

    public void PrintDetails() {
        System.out.println("Bloop: " + name + " HP: " + hp + " / " + maxhp);
    }

    public void Damage(int damage) {
        this.hp -= damage;
    }

    public void Initialize(int maxhp, String name) {
        BloopManager.Register(this);
        this.name = name;
        this.hp = maxhp;
        this.maxhp = maxhp;
    }

    public void Deinitialize() {
        BloopManager.Deregister(this);
    }


}
