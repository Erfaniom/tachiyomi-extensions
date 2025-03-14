package eu.kanade.tachiyomi.extension.ar.kingofshojo

import eu.kanade.tachiyomi.multisrc.mangathemesia.MangaThemesia
import java.text.SimpleDateFormat
import java.util.Locale

class KingofShojo : MangaThemesia("King of Shojo", "https://kingofshojo.com", "ar", dateFormat = SimpleDateFormat("MMM d, yyy", Locale("ar"))) {

    override val hasProjectPage = true
}
