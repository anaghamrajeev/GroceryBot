package furhatos.app.groceriesassistant

import DatabaseBuilder.build
import furhatos.app.groceriesassistant.flow.Init
import furhatos.skills.Skill
import furhatos.flow.kotlin.*


class GroceriesassistantSkill : Skill() {
    override fun start() {
        Flow().run(Init)
    }
}

fun main(args: Array<String>) {
    //build()
    Skill.main(args)
}
