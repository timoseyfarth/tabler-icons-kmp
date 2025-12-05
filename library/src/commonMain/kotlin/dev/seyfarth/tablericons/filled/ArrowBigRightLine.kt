package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ArrowBigRightLine: ImageVector
    get() {
        if (_ArrowBigRightLine != null) {
            return _ArrowBigRightLine!!
        }
        _ArrowBigRightLine = ImageVector.Builder(
            name = "Filled.ArrowBigRightLine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.089f, 3.634f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.089f, 1.78f)
                lineToRelative(-0.001f, 2.586f)
                horizontalLineToRelative(-4.999f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(6f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.993f, 0.883f)
                lineToRelative(4.999f, -0.001f)
                lineToRelative(0.001f, 2.587f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.414f, 1.414f)
                lineToRelative(6.586f, -6.586f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.828f)
                lineToRelative(-6.586f, -6.586f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.18f, -0.434f)
                lineToRelative(-0.145f, 0.068f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                close()
            }
        }.build()

        return _ArrowBigRightLine!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigRightLine: ImageVector? = null
