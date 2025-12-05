package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.OvalVertical: ImageVector
    get() {
        if (_OvalVertical != null) {
            return _OvalVertical!!
        }
        _OvalVertical = ImageVector.Builder(
            name = "Filled.OvalVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5f)
                curveToRelative(-5.457f, 0f, -10f, 3.028f, -10f, 7f)
                reflectiveCurveToRelative(4.543f, 7f, 10f, 7f)
                reflectiveCurveToRelative(10f, -3.028f, 10f, -7f)
                reflectiveCurveToRelative(-4.543f, -7f, -10f, -7f)
                close()
            }
        }.build()

        return _OvalVertical!!
    }

@Suppress("ObjectPropertyName")
private var _OvalVertical: ImageVector? = null
