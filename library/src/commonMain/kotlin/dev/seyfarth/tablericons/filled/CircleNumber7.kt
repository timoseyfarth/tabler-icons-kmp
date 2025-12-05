package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.CircleNumber7: ImageVector
    get() {
        if (_CircleNumber7 != null) {
            return _CircleNumber7!!
        }
        _CircleNumber7 = ImageVector.Builder(
            name = "Filled.CircleNumber7",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
                reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
                reflectiveCurveToRelative(-10f, -4.477f, -10f, -10f)
                reflectiveCurveToRelative(4.477f, -10f, 10f, -10f)
                close()
                moveTo(14f, 7f)
                horizontalLineToRelative(-4f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.876f, 0.876f)
                lineToRelative(-0.007f, 0.117f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.876f, 0.876f)
                lineToRelative(0.117f, 0.007f)
                horizontalLineToRelative(2.718f)
                lineToRelative(-1.688f, 6.757f)
                lineToRelative(-0.022f, 0.115f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.927f, 0.482f)
                lineToRelative(0.035f, -0.111f)
                lineToRelative(2f, -8f)
                lineToRelative(0.021f, -0.112f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.878f, -1.125f)
                lineToRelative(-0.113f, -0.006f)
                close()
            }
        }.build()

        return _CircleNumber7!!
    }

@Suppress("ObjectPropertyName")
private var _CircleNumber7: ImageVector? = null
