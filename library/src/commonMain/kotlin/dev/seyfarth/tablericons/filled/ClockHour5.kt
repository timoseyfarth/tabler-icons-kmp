package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ClockHour5: ImageVector
    get() {
        if (_ClockHour5 != null) {
            return _ClockHour5!!
        }
        _ClockHour5 = ImageVector.Builder(
            name = "Filled.ClockHour5",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -15f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.995f, -8.336f)
                moveToRelative(-6f, 3.66f)
                verticalLineToRelative(5.022f)
                lineToRelative(0.003f, 0.054f)
                lineToRelative(0.02f, 0.135f)
                lineToRelative(0.005f, 0.025f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.056f, 0.165f)
                lineToRelative(0.04f, 0.082f)
                lineToRelative(0.04f, 0.065f)
                lineToRelative(2.004f, 3.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.664f, -1.11f)
                lineToRelative(-1.832f, -2.748f)
                verticalLineToRelative(-4.697f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.883f, -0.993f)
                lineToRelative(-0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
            }
        }.build()

        return _ClockHour5!!
    }

@Suppress("ObjectPropertyName")
private var _ClockHour5: ImageVector? = null
