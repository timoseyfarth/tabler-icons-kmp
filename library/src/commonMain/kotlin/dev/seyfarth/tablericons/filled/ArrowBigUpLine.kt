package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ArrowBigUpLine: ImageVector
    get() {
        if (_ArrowBigUpLine != null) {
            return _ArrowBigUpLine!!
        }
        _ArrowBigUpLine = ImageVector.Builder(
            name = "Filled.ArrowBigUpLine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.586f, 3f)
                lineToRelative(-6.586f, 6.586f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.434f, 2.18f)
                lineToRelative(0.068f, 0.145f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.78f, 1.089f)
                horizontalLineToRelative(2.586f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(6f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.883f, -0.993f)
                lineToRelative(-0.001f, -5f)
                horizontalLineToRelative(2.587f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.414f, -3.414f)
                lineToRelative(-6.586f, -6.586f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.828f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(6f)
                close()
            }
        }.build()

        return _ArrowBigUpLine!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigUpLine: ImageVector? = null
