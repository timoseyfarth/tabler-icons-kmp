package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Bulb: ImageVector
    get() {
        if (_Bulb != null) {
            return _Bulb!!
        }
        _Bulb = ImageVector.Builder(
            name = "Filled.Bulb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.893f, 4.893f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.32f, -0.083f)
                lineToRelative(0.094f, 0.083f)
                lineToRelative(0.7f, 0.7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.32f, 1.497f)
                lineToRelative(-0.094f, -0.083f)
                lineToRelative(-0.7f, -0.7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.414f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.693f, 4.893f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.497f, 1.32f)
                lineToRelative(-0.083f, 0.094f)
                lineToRelative(-0.7f, 0.7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.497f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                lineToRelative(0.7f, -0.7f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.883f, -0.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.6f, 10.8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.471f, 0.192f)
                lineToRelative(-0.129f, 0.008f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.6f, -0.2f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.6f, -10.8f)
                close()
            }
        }.build()

        return _Bulb!!
    }

@Suppress("ObjectPropertyName")
private var _Bulb: ImageVector? = null
