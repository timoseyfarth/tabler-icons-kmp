package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.AlertOctagon: ImageVector
    get() {
        if (_AlertOctagon != null) {
            return _AlertOctagon!!
        }
        _AlertOctagon = ImageVector.Builder(
            name = "Filled.AlertOctagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.897f, 1f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.664f, 1.016f)
                lineToRelative(0.165f, 0.156f)
                lineToRelative(4.1f, 4.1f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.168f, 2.605f)
                lineToRelative(0.006f, 0.227f)
                verticalLineToRelative(5.794f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.016f, 2.664f)
                lineToRelative(-0.156f, 0.165f)
                lineToRelative(-4.1f, 4.1f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.603f, 1.168f)
                lineToRelative(-0.227f, 0.006f)
                horizontalLineToRelative(-5.795f)
                arcToRelative(3.999f, 3.999f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.664f, -1.017f)
                lineToRelative(-0.165f, -0.156f)
                lineToRelative(-4.1f, -4.1f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.168f, -2.604f)
                lineToRelative(-0.006f, -0.227f)
                verticalLineToRelative(-5.794f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.016f, -2.664f)
                lineToRelative(0.156f, -0.165f)
                lineToRelative(4.1f, -4.1f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.605f, -1.168f)
                lineToRelative(0.227f, -0.006f)
                horizontalLineToRelative(5.793f)
                close()
                moveTo(12.01f, 15f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.986f)
                lineToRelative(0.117f, 0.007f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.986f)
                lineToRelative(-0.117f, -0.007f)
                close()
                moveTo(12f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                verticalLineToRelative(4f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.986f, 0f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-4f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.993f, -0.883f)
                close()
            }
        }.build()

        return _AlertOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _AlertOctagon: ImageVector? = null
