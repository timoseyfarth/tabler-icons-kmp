package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Circles: ImageVector
    get() {
        if (_Circles != null) {
            return _Circles!!
        }
        _Circles = ImageVector.Builder(
            name = "Filled.Circles",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 12f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.995f, 5.217f)
                lineToRelative(-0.005f, -0.217f)
                lineToRelative(0.005f, -0.217f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.995f, -4.783f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 12f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.995f, 5.217f)
                lineToRelative(-0.005f, -0.217f)
                lineToRelative(0.005f, -0.217f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.995f, -4.783f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.995f, 5.217f)
                lineToRelative(-0.005f, -0.217f)
                lineToRelative(0.005f, -0.217f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.995f, -4.783f)
                close()
            }
        }.build()

        return _Circles!!
    }

@Suppress("ObjectPropertyName")
private var _Circles: ImageVector? = null
