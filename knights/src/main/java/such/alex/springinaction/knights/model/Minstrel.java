package such.alex.springinaction.knights.model;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.io.PrintStream;

/**
 * Created by alejandro on 8/1/16.
 */
@Aspect
public class Minstrel {
    private PrintStream printStream;

    public Minstrel(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Before("execution(* such.alex.springinaction.knights.model.Knight.embarkOnQuest())")
    public void singBeforeQuest() {
        printStream.println("LALALALALALALALAA!! EMBARKING ON A QUEST!!!");
    }

    @After("execution(* such.alex.springinaction.knights.model.Knight.embarkOnQuest())")
    public void singAfterQuest() {
        printStream.println("The end?");
    }
}
