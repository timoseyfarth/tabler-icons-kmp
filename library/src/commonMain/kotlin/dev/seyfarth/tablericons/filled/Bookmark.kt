package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Bookmark: ImageVector
    get() {
        if (_Bookmark != null) {
            return _Bookmark!!
        }
        _Bookmark = ImageVector.Builder(
            name = "Filled.Bookmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                verticalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.555f, 0.832f)
                lineToRelative(-5.445f, -3.63f)
                lineToRelative(-5.444f, 3.63f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.55f, -0.72f)
                lineToRelative(-0.006f, -0.112f)
                verticalLineToRelative(-14f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -5f)
                horizontalLineToRelative(4f)
                close()
            }
        }.build()

        return _Bookmark!!
    }

@Suppress("ObjectPropertyName")
private var _Bookmark: ImageVector? = null
