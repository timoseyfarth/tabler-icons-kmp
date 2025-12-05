package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.HelpOctagon: ImageVector
    get() {
        if (_HelpOctagon != null) {
            return _HelpOctagon!!
        }
        _HelpOctagon = ImageVector.Builder(
            name = "Filled.HelpOctagon",
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
                moveTo(12f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.986f, 0f)
                lineToRelative(0.007f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.993f, -0.883f)
                close()
                moveTo(13.368f, 8.327f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.631f, 0.728f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.44f, 1.383f)
                lineToRelative(0.171f, -0.18f)
                arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.11f, -0.15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.34f, 1.886f)
                lineToRelative(-0.232f, 0.012f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.111f, 1.994f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.371f, -5.673f)
                close()
            }
        }.build()

        return _HelpOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _HelpOctagon: ImageVector? = null
