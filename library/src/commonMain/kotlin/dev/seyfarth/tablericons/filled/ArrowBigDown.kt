package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ArrowBigDown: ImageVector
    get() {
        if (_ArrowBigDown != null) {
            return _ArrowBigDown!!
        }
        _ArrowBigDown = ImageVector.Builder(
            name = "Filled.ArrowBigDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2f)
                lineToRelative(-0.15f, 0.005f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.85f, 1.995f)
                verticalLineToRelative(6.999f)
                lineToRelative(-2.586f, 0.001f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, 3.414f)
                lineToRelative(6.586f, 6.586f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.828f, 0f)
                lineToRelative(6.586f, -6.586f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.434f, -2.18f)
                lineToRelative(-0.068f, -0.145f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.78f, -1.089f)
                lineToRelative(-2.586f, -0.001f)
                verticalLineToRelative(-6.999f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.build()

        return _ArrowBigDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigDown: ImageVector? = null
