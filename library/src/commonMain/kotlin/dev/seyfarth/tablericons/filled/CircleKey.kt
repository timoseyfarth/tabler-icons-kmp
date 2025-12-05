package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.CircleKey: ImageVector
    get() {
        if (_CircleKey != null) {
            return _CircleKey!!
        }
        _CircleKey = ImageVector.Builder(
            name = "Filled.CircleKey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, -20f, 0f)
                curveToRelative(0f, -5.523f, 4.477f, -10f, 10f, -10f)
                close()
                moveTo(14f, 7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.98f, 2.65f)
                lineToRelative(-0.015f, 0.174f)
                lineToRelative(-0.005f, 0.176f)
                lineToRelative(0.005f, 0.176f)
                curveToRelative(0.019f, 0.319f, 0.087f, 0.624f, 0.197f, 0.908f)
                lineToRelative(0.09f, 0.209f)
                lineToRelative(-3.5f, 3.5f)
                lineToRelative(-0.082f, 0.094f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.226f)
                lineToRelative(0.083f, 0.094f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.226f, 0f)
                lineToRelative(0.094f, -0.083f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.226f)
                lineToRelative(-0.083f, -0.094f)
                lineToRelative(-0.792f, -0.793f)
                lineToRelative(0.585f, -0.585f)
                lineToRelative(0.793f, 0.792f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.403f, -1.403f)
                lineToRelative(-0.083f, -0.094f)
                lineToRelative(-0.792f, -0.793f)
                lineToRelative(0.792f, -0.792f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.293f, -5.708f)
                close()
                moveTo(14f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                close()
            }
        }.build()

        return _CircleKey!!
    }

@Suppress("ObjectPropertyName")
private var _CircleKey: ImageVector? = null
