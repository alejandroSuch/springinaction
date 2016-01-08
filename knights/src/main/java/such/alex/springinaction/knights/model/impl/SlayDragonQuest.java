package such.alex.springinaction.knights.model.impl;

import such.alex.springinaction.knights.model.Quest;

import java.io.PrintStream;

/**
 * Created by alejandro on 8/1/16.
 */
public class SlayDragonQuest implements Quest {
    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void embark() {
        printStream.println("Embarking on a quest to slay the dragon!");
    }
}
