package ru.spbau.bachelor2015.veselov.hw06.model.objects.inventory

import ru.spbau.bachelor2015.veselov.hw06.language.Phrases

object ItemNameResolver : ItemVisitor<String> {
    override fun visit(helmet: Helmet): String {
        return Phrases.HELMET
    }

    override fun visit(sword: Sword): String {
        return Phrases.SWORD
    }

    override fun visit(healingPotion: HealingPotion): String {
        return Phrases.HEALING_POTION
    }
}