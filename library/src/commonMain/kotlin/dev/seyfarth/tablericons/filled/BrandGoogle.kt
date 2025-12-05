package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.BrandGoogle: ImageVector
    get() {
        if (_BrandGoogle != null) {
            return _BrandGoogle!!
        }
        _BrandGoogle = ImageVector.Builder(
            name = "Filled.BrandGoogle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcToRelative(9.96f, 9.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.29f, 2.226f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.04f, 1.52f)
                lineToRelative(-1.51f, 1.362f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.265f, 0.06f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.103f, 6.836f)
                lineToRelative(0.001f, -0.004f)
                horizontalLineToRelative(-3.66f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.992f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(6.945f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.994f, 0.89f)
                curveToRelative(0.04f, 0.367f, 0.061f, 0.737f, 0.061f, 1.11f)
                curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
                reflectiveCurveToRelative(-10f, -4.477f, -10f, -10f)
                reflectiveCurveToRelative(4.477f, -10f, 10f, -10f)
                close()
            }
        }.build()

        return _BrandGoogle!!
    }

@Suppress("ObjectPropertyName")
private var _BrandGoogle: ImageVector? = null
