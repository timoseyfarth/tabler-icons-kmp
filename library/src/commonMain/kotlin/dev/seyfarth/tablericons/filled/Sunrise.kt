package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Sunrise: ImageVector
    get() {
        if (_Sunrise != null) {
            return _Sunrise!!
        }
        _Sunrise = ImageVector.Builder(
            name = "Filled.Sunrise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -5f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.307f, 9.893f)
                lineToRelative(0.7f, 0.7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, 1.414f)
                lineToRelative(-0.7f, -0.7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, -1.414f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.107f, 9.893f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.414f)
                lineToRelative(-0.7f, 0.7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, -1.414f)
                lineToRelative(0.7f, -0.7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.707f, 2.293f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.414f, 1.414f)
                lineToRelative(-1.293f, -1.292f)
                verticalLineToRelative(3.585f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineToRelative(-3.586f)
                lineToRelative(-1.293f, 1.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, -1.414f)
                lineToRelative(2.958f, -2.96f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.15f, -0.135f)
                lineToRelative(0.127f, -0.08f)
                lineToRelative(0.068f, -0.033f)
                lineToRelative(0.11f, -0.041f)
                lineToRelative(0.12f, -0.029f)
                curveToRelative(0.3f, -0.055f, 0.627f, 0.024f, 0.881f, 0.278f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 20f)
                horizontalLineToRelative(18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.583f, 7.002f)
                horizontalLineToRelative(-9.166f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.583f, -7.002f)
            }
        }.build()

        return _Sunrise!!
    }

@Suppress("ObjectPropertyName")
private var _Sunrise: ImageVector? = null
