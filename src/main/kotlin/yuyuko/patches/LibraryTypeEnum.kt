package yuyuko.patches

import com.evacipated.cardcrawl.modthespire.lib.SpireEnum
import com.megacrit.cardcrawl.helpers.CardLibrary

class LibraryTypeEnum {
    companion object {
        @SpireEnum
        @JvmField
        var YUYUKO_COLOR: CardLibrary.LibraryType? = null
    }
}