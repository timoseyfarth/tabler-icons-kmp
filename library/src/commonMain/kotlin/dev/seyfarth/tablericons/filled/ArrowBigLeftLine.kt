package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ArrowBigLeftLine: ImageVector
    get() {
        if (_ArrowBigLeftLine != null) {
            return _ArrowBigLeftLine!!
        }
        _ArrowBigLeftLine = ImageVector.Builder(
            name = "Filled.ArrowBigLeftLine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.586f, 4f)
                lineToRelative(-6.586f, 6.586f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.828f)
                lineToRelative(6.586f, 6.586f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.18f, 0.434f)
                lineToRelative(0.145f, -0.068f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.089f, -1.78f)
                verticalLineToRelative(-2.586f)
                horizontalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineToRelative(-6f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.993f, -0.883f)
                lineToRelative(-5f, -0.001f)
                verticalLineToRelative(-2.585f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.414f, -1.414f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.415f, 12f)
                lineToRelative(6.585f, -6.586f)
                verticalLineToRelative(3.586f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.993f, 0.883f)
                lineToRelative(5f, -0.001f)
                verticalLineToRelative(4f)
                lineToRelative(-5f, 0.001f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(3.586f)
                lineToRelative(-6.585f, -6.586f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 8f)
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

        return _ArrowBigLeftLine!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigLeftLine: ImageVector? = null
