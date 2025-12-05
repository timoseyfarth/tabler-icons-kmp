package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.CircleNumber4: ImageVector
    get() {
        if (_CircleNumber4 != null) {
            return _CircleNumber4!!
        }
        _CircleNumber4 = ImageVector.Builder(
            name = "Filled.CircleNumber4",
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
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.986f, 0f)
                lineToRelative(-0.007f, 0.117f)
                verticalLineToRelative(3f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.838f, 1.844f)
                lineToRelative(0.157f, 0.006f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.986f, 0f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-8f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.993f, -0.883f)
                close()
            }
        }.build()

        return _CircleNumber4!!
    }

@Suppress("ObjectPropertyName")
private var _CircleNumber4: ImageVector? = null
