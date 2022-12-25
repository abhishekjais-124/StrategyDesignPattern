package Cache;

public class Cache {
    private CacheStrategy cacheStrategy;

    public Cache(CacheStrategy cacheStrategy) {
        this.cacheStrategy = cacheStrategy;
    }

    public void doOperation(){
        cacheStrategy.doOperation();
    }
}
