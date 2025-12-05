package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ArrowBigUp: ImageVector
    get() {
        if (_ArrowBigUp != null) {
            return _ArrowBigUp!!
        }
        _ArrowBigUp = ImageVector.Builder(
            name = "Filled.ArrowBigUp",
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
                verticalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineToRelative(4f)
                lineToRelative(0.15f, -0.005f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.85f, -1.995f)
                lineToRelative(-0.001f, -7f)
                horizontalLineToRelative(2.587f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.414f, -3.414f)
                lineToRelative(-6.586f, -6.586f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.828f, 0f)
                close()
            }
        }.build()

        return _ArrowBigUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigUp: ImageVector? = null
