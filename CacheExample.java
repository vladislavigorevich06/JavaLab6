import java.util.Arrays;

public class CacheExample {

    private String[] cacheAreas;

    // Конструктор с varargs для передачи областей
    public CacheExample(String... areas) {
        this.cacheAreas = areas;
    }

    // Конструктор по умолчанию — пустой массив
    public CacheExample() {
        this.cacheAreas = new String[0];
    }

    public String[] getCacheAreas() {
        return cacheAreas;
    }

    // Пример метода для "имитации обращения к кэшу"
    public boolean accessCache(String area) {
        if (cacheAreas == null || cacheAreas.length == 0) return false;
        return Arrays.asList(cacheAreas).contains(area);
    }
}
