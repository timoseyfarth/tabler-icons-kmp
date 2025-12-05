package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.CircleNumber1: ImageVector
    get() {
        if (_CircleNumber1 != null) {
            return _CircleNumber1!!
        }
        _CircleNumber1 = ImageVector.Builder(
            name = "Filled.CircleNumber1",
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
                moveTo(12.994f, 7.886f)
                curveToRelative(-0.083f, -0.777f, -1.008f, -1.16f, -1.617f, -0.67f)
                lineToRelative(-0.084f, 0.077f)
                lineToRelative(-2f, 2f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.226f)
                lineToRelative(0.083f, 0.094f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.226f, 0f)
                lineToRelative(0.094f, -0.083f)
                lineToRelative(0.293f, -0.293f)
                verticalLineToRelative(5.586f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.986f, 0f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-8f)
                lineToRelative(-0.006f, -0.114f)
                close()
            }
        }.build()

        return _CircleNumber1!!
    }

@Suppress("ObjectPropertyName")
private var _CircleNumber1: ImageVector? = null
