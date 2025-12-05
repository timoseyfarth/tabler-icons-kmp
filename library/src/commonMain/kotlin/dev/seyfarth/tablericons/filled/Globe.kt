package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Globe: ImageVector
    get() {
        if (_Globe != null) {
            return _Globe!!
        }
        _Globe = ImageVector.Builder(
            name = "Filled.Globe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 4f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.995f, 5.217f)
                lineToRelative(-0.005f, -0.217f)
                lineToRelative(0.005f, -0.217f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.995f, -4.783f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.133f, 1.502f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.365f, -0.369f)
                arcToRelative(9.015f, 9.015f, 0f, isMoreThanHalf = true, isPositiveArc = true, -10.404f, 14.622f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.312f, -1.51f)
                arcToRelative(7.015f, 7.015f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.096f, -11.378f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.369f, -1.365f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(8f)
                close()
            }
        }.build()

        return _Globe!!
    }

@Suppress("ObjectPropertyName")
private var _Globe: ImageVector? = null
