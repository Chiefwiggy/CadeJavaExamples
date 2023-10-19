import java.util.ArrayDeque;
import java.util.Queue;

public class BloopFactory {


    private Queue<Bloop> recycledBloops;

    public BloopFactory() {
        recycledBloops = new ArrayDeque<>();
    }

    public Bloop GetBloop(String name, int maxhp) {
        Bloop newBloop = recycledBloops.poll();
        if (newBloop == null) {
            newBloop = new Bloop();
        }
        newBloop.Initialize(maxhp, name);
        return newBloop;
    }

    public void RecycleBloop(Bloop deadBloop) {
        deadBloop.Deinitialize();
        recycledBloops.add(deadBloop);
    }
}
