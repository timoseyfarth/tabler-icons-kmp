package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Tags: ImageVector
    get() {
        if (_Tags != null) {
            return _Tags!!
        }
        _Tags = ImageVector.Builder(
            name = "Filled.Tags",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.172f, 5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.121f, 0.879f)
                lineToRelative(5.71f, 5.71f)
                arcToRelative(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.822f)
                lineToRelative(-3.592f, 3.592f)
                arcToRelative(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.822f, 0f)
                lineToRelative(-5.71f, -5.71f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.879f, -2.121f)
                verticalLineToRelative(-4.172f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                close()
                moveTo(7f, 9f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.01f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.293f, 5.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, 0f)
                lineToRelative(4.593f, 4.592f)
                arcToRelative(5.82f, 5.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 8.23f)
                lineToRelative(-1.592f, 1.592f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, -1.414f)
                lineToRelative(1.592f, -1.592f)
                arcToRelative(3.82f, 3.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -5.402f)
                lineToRelative(-4.592f, -4.592f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.414f)
            }
        }.build()

        return _Tags!!
    }

@Suppress("ObjectPropertyName")
private var _Tags: ImageVector? = null
