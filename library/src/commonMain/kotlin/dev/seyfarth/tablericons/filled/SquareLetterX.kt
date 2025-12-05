package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.SquareLetterX: ImageVector
    get() {
        if (_SquareLetterX != null) {
            return _SquareLetterX!!
        }
        _SquareLetterX = ImageVector.Builder(
            name = "Filled.SquareLetterX",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                close()
                moveTo(14.447f, 7.106f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.341f, 0.447f)
                lineToRelative(-1.106f, 2.21f)
                lineToRelative(-1.106f, -2.21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.234f, -0.494f)
                lineToRelative(-0.107f, 0.047f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.447f, 1.341f)
                lineToRelative(1.774f, 3.553f)
                lineToRelative(-1.775f, 3.553f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.345f, 1.283f)
                lineToRelative(0.102f, 0.058f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.341f, -0.447f)
                lineToRelative(1.107f, -2.211f)
                lineToRelative(1.106f, 2.211f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.234f, 0.494f)
                lineToRelative(0.107f, -0.047f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.447f, -1.341f)
                lineToRelative(-1.776f, -3.553f)
                lineToRelative(1.776f, -3.553f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.345f, -1.283f)
                close()
            }
        }.build()

        return _SquareLetterX!!
    }

@Suppress("ObjectPropertyName")
private var _SquareLetterX: ImageVector? = null
