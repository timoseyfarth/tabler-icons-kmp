package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ArrowBigRight: ImageVector
    get() {
        if (_ArrowBigRight != null) {
            return _ArrowBigRight!!
        }
        _ArrowBigRight = ImageVector.Builder(
            name = "Filled.ArrowBigRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.089f, 3.634f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.089f, 1.78f)
                lineToRelative(-0.001f, 2.586f)
                horizontalLineToRelative(-6.999f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(4f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.995f, 1.85f)
                lineToRelative(6.999f, -0.001f)
                lineToRelative(0.001f, 2.587f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.414f, 1.414f)
                lineToRelative(6.586f, -6.586f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.828f)
                lineToRelative(-6.586f, -6.586f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.18f, -0.434f)
                lineToRelative(-0.145f, 0.068f)
                close()
            }
        }.build()

        return _ArrowBigRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigRight: ImageVector? = null
