package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Clock: ImageVector
    get() {
        if (_Clock != null) {
            return _Clock!!
        }
        _Clock = ImageVector.Builder(
            name = "Filled.Clock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -14.995f, 8.984f)
                lineToRelative(-0.005f, -0.324f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.995f, -8.336f)
                close()
                moveTo(12f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                verticalLineToRelative(5f)
                lineToRelative(0.009f, 0.131f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.197f, 0.477f)
                lineToRelative(0.087f, 0.1f)
                lineToRelative(3f, 3f)
                lineToRelative(0.094f, 0.082f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.226f, 0f)
                lineToRelative(0.094f, -0.083f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.226f)
                lineToRelative(-0.083f, -0.094f)
                lineToRelative(-2.707f, -2.708f)
                verticalLineToRelative(-4.585f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.993f, -0.883f)
                close()
            }
        }.build()

        return _Clock!!
    }

@Suppress("ObjectPropertyName")
private var _Clock: ImageVector? = null
