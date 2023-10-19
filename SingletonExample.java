public class SingletonExample {

    private static SingletonExample instance;
    private synchronized static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    private SingletonExample() {
        var1 = 2;
        var2 = 5;
    }

    private int var1;
    private int var2;

    public static void SetVar1(int n) { getInstance()._SetVar1(n);}
    public static int GetVar1() { return getInstance().var1;}

    private void _SetVar1(int n) {
        var1 = n;
    }
}
