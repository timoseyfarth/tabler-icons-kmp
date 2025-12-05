package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.GlassFull: ImageVector
    get() {
        if (_GlassFull != null) {
            return _GlassFull!!
        }
        _GlassFull = ImageVector.Builder(
            name = "Filled.GlassFull",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.004f, 10.229f)
                lineToRelative(-0.003f, -0.186f)
                lineToRelative(0.001f, -0.113f)
                lineToRelative(0.008f, -0.071f)
                lineToRelative(1f, -7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.877f, -0.853f)
                lineToRelative(0.113f, -0.006f)
                horizontalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.968f, 0.747f)
                lineToRelative(0.022f, 0.112f)
                lineToRelative(1.006f, 7.05f)
                lineToRelative(0.004f, 0.091f)
                curveToRelative(0f, 3.226f, -2.56f, 5.564f, -6f, 5.945f)
                verticalLineToRelative(4.055f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.055f)
                curveToRelative(-3.358f, -0.371f, -5.878f, -2.609f, -5.996f, -5.716f)
                close()
                moveTo(16.133f, 4f)
                horizontalLineToRelative(-8.267f)
                lineToRelative(-0.607f, 4.258f)
                arcToRelative(6.001f, 6.001f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.125f, 0.787f)
                lineToRelative(0.216f, 0.155f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.32f, 0.31f)
                lineToRelative(-0.787f, -5.51f)
                close()
            }
        }.build()

        return _GlassFull!!
    }

@Suppress("ObjectPropertyName")
private var _GlassFull: ImageVector? = null
