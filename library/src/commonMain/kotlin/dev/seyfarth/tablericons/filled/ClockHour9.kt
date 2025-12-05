package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ClockHour9: ImageVector
    get() {
        if (_ClockHour9 != null) {
            return _ClockHour9!!
        }
        _ClockHour9 = ImageVector.Builder(
            name = "Filled.ClockHour9",
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
                moveToRelative(-4.883f, 9.653f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.883f, -0.993f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(3.5f)
                close()
            }
        }.build()

        return _ClockHour9!!
    }

@Suppress("ObjectPropertyName")
private var _ClockHour9: ImageVector? = null
