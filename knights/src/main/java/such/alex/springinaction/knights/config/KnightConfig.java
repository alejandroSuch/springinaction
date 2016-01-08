package such.alex.springinaction.knights.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import such.alex.springinaction.knights.model.Knight;
import such.alex.springinaction.knights.model.Minstrel;
import such.alex.springinaction.knights.model.Quest;
import such.alex.springinaction.knights.model.impl.BraveKnight;
import such.alex.springinaction.knights.model.impl.SlayDragonQuest;

/**
 * Created by alejandro on 8/1/16.
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

    @Bean
    public Minstrel minstrel() {
        return new Minstrel(System.out);
    }
}
