package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Triangle: ImageVector
    get() {
        if (_Triangle != null) {
            return _Triangle!!
        }
        _Triangle = ImageVector.Builder(
            name = "Filled.Triangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.67f)
                arcToRelative(2.914f, 2.914f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.492f, 1.403f)
                lineToRelative(-8.11f, 13.537f)
                arcToRelative(2.914f, 2.914f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.484f, 4.385f)
                horizontalLineToRelative(16.225f)
                arcToRelative(2.914f, 2.914f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.503f, -4.371f)
                lineToRelative(-8.116f, -13.546f)
                arcToRelative(2.917f, 2.917f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.494f, -1.408f)
                close()
            }
        }.build()

        return _Triangle!!
    }

@Suppress("ObjectPropertyName")
private var _Triangle: ImageVector? = null
