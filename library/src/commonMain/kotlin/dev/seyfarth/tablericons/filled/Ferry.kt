package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Ferry: ImageVector
    get() {
        if (_Ferry != null) {
            return _Ferry!!
        }
        _Ferry = ImageVector.Builder(
            name = "Filled.Ferry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.86f, 1.51f)
                lineToRelative(-2.202f, 3.709f)
                arcToRelative(4.06f, 4.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.365f, 1.781f)
                horizontalLineToRelative(-15.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.957f, -1.291f)
                lineToRelative(1.521f, -5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.957f, -0.709f)
                close()
                moveTo(19f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                moveToRelative(-5.106f, -7.447f)
                lineToRelative(0.723f, 1.447f)
                horizontalLineToRelative(0.874f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.864f, 0.497f)
                lineToRelative(2.037f, 3.503f)
                horizontalLineToRelative(-12.832f)
                lineToRelative(0.973f, -3.284f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.958f, -0.716f)
                horizontalLineToRelative(4.89f)
                lineToRelative(-0.275f, -0.553f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.788f, -0.894f)
            }
        }.build()

        return _Ferry!!
    }

@Suppress("ObjectPropertyName")
private var _Ferry: ImageVector? = null
