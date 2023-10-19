import java.util.ArrayList;

public class BloopManager {

    private static BloopManager instance;
    private synchronized static BloopManager getInstance() {
        if (instance == null) {
            instance = new BloopManager();
        }
        return instance;
    }

    private ArrayList<Bloop> liveBloops;

    private BloopManager() {
        liveBloops = new ArrayList<>();
    }



    public static void SummarizeAllBloops() { getInstance()._SummarizeAllBloops();}

    private void _SummarizeAllBloops() {
        System.out.println("-------SUMMARIZE--------");
        for (Bloop b : liveBloops) {
            b.PrintDetails();
        }
        System.out.println("-----END OF SUMMARY-----");
    }

    public static void Register(Bloop b) { getInstance()._Register(b);}
    public static void Deregister(Bloop b) {getInstance()._Deregister(b);}

    private void _Register(Bloop b) {
        liveBloops.add(b);
    }

    private void _Deregister(Bloop b) {
        liveBloops.remove(b);
    }
}
