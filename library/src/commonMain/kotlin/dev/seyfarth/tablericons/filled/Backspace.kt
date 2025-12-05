package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Backspace: ImageVector
    get() {
        if (_Backspace != null) {
            return _Backspace!!
        }
        _Backspace = ImageVector.Builder(
            name = "Filled.Backspace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.995f, 1.85f)
                lineToRelative(0.005f, 0.15f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.85f, 1.995f)
                lineToRelative(-0.15f, 0.005f)
                horizontalLineToRelative(-11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.608f, -0.206f)
                lineToRelative(-0.1f, -0.087f)
                lineToRelative(-5.037f, -5.04f)
                curveToRelative(-0.809f, -0.904f, -0.847f, -2.25f, -0.083f, -3.23f)
                lineToRelative(0.12f, -0.144f)
                lineToRelative(5f, -5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.577f, -0.284f)
                lineToRelative(0.131f, -0.009f)
                horizontalLineToRelative(11f)
                close()
                moveTo(12.511f, 9.14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.301f, 1.473f)
                lineToRelative(0.083f, 0.094f)
                lineToRelative(1.292f, 1.293f)
                lineToRelative(-1.292f, 1.293f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.403f, 1.403f)
                lineToRelative(0.094f, -0.083f)
                lineToRelative(1.293f, -1.292f)
                lineToRelative(1.293f, 1.292f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.403f, -1.403f)
                lineToRelative(-0.083f, -0.094f)
                lineToRelative(-1.292f, -1.293f)
                lineToRelative(1.292f, -1.293f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.403f, -1.403f)
                lineToRelative(-0.094f, 0.083f)
                lineToRelative(-1.293f, 1.292f)
                lineToRelative(-1.293f, -1.292f)
                lineToRelative(-0.094f, -0.083f)
                lineToRelative(-0.102f, -0.07f)
                close()
            }
        }.build()

        return _Backspace!!
    }

@Suppress("ObjectPropertyName")
private var _Backspace: ImageVector? = null
