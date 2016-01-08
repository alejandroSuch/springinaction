package such.alex.springinaction.knights;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import such.alex.springinaction.knights.config.KnightConfig;
import such.alex.springinaction.knights.model.Knight;

/**
 * Created by alejandro on 8/1/16.
 */
public class App {
    private static AnnotationConfigApplicationContext context;

    public static void main(String ...args) {
        createContext();

        final Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();

        context.close();
    }

    private static void createContext() {
        context = new AnnotationConfigApplicationContext();
        context.register(KnightConfig.class);
        context.refresh();
    }
}
