package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.CircleNumber6: ImageVector
    get() {
        if (_CircleNumber6 != null) {
            return _CircleNumber6!!
        }
        _CircleNumber6 = ImageVector.Builder(
            name = "Filled.CircleNumber6",
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
                verticalLineToRelative(6f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.838f, 1.844f)
                lineToRelative(0.157f, 0.006f)
                horizontalLineToRelative(2f)
                lineToRelative(0.15f, -0.005f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.844f, -1.838f)
                lineToRelative(0.006f, -0.157f)
                verticalLineToRelative(-2f)
                lineToRelative(-0.005f, -0.15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.838f, -1.844f)
                lineToRelative(-0.157f, -0.006f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.993f, -0.117f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.85f, -1.995f)
                lineToRelative(-0.15f, -0.005f)
                close()
                moveTo(13f, 13f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
            }
        }.build()

        return _CircleNumber6!!
    }

@Suppress("ObjectPropertyName")
private var _CircleNumber6: ImageVector? = null
