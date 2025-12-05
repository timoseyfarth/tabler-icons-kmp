package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.CircleNumber8: ImageVector
    get() {
        if (_CircleNumber8 != null) {
            return _CircleNumber8!!
        }
        _CircleNumber8 = ImageVector.Builder(
            name = "Filled.CircleNumber8",
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
                moveTo(13f, 7f)
                horizontalLineToRelative(-2f)
                lineToRelative(-0.15f, 0.005f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.844f, 1.838f)
                lineToRelative(-0.006f, 0.157f)
                verticalLineToRelative(2f)
                lineToRelative(0.005f, 0.15f)
                curveToRelative(0.018f, 0.236f, 0.077f, 0.46f, 0.17f, 0.667f)
                lineToRelative(0.075f, 0.152f)
                lineToRelative(0.018f, 0.03f)
                lineToRelative(-0.018f, 0.032f)
                curveToRelative(-0.133f, 0.24f, -0.218f, 0.509f, -0.243f, 0.795f)
                lineToRelative(-0.007f, 0.174f)
                verticalLineToRelative(2f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.838f, 1.844f)
                lineToRelative(0.157f, 0.006f)
                horizontalLineToRelative(2f)
                lineToRelative(0.15f, -0.005f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.844f, -1.838f)
                lineToRelative(0.006f, -0.157f)
                verticalLineToRelative(-2f)
                lineToRelative(-0.005f, -0.15f)
                arcToRelative(1.988f, 1.988f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.17f, -0.667f)
                lineToRelative(-0.075f, -0.152f)
                lineToRelative(-0.019f, -0.032f)
                lineToRelative(0.02f, -0.03f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.242f, -0.795f)
                lineToRelative(0.007f, -0.174f)
                verticalLineToRelative(-2f)
                lineToRelative(-0.005f, -0.15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.838f, -1.844f)
                lineToRelative(-0.157f, -0.006f)
                close()
                moveTo(13f, 13f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13f, 9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
            }
        }.build()

        return _CircleNumber8!!
    }

@Suppress("ObjectPropertyName")
private var _CircleNumber8: ImageVector? = null
