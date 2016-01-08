package such.alex.springinaction.knights.model.impl;

import such.alex.springinaction.knights.model.Knight;
import such.alex.springinaction.knights.model.Quest;

/**
 * Created by alejandro on 8/1/16.
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
