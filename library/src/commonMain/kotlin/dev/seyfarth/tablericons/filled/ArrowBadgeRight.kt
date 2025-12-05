package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ArrowBadgeRight: ImageVector
    get() {
        if (_ArrowBadgeRight != null) {
            return _ArrowBadgeRight!!
        }
        _ArrowBadgeRight = ImageVector.Builder(
            name = "Filled.ArrowBadgeRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 6f)
                lineToRelative(-0.112f, 0.006f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.669f, 1.619f)
                lineToRelative(3.501f, 4.375f)
                lineToRelative(-3.5f, 4.375f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.78f, 1.625f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.78f, -0.375f)
                lineToRelative(4f, -5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.25f)
                lineToRelative(-4f, -5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.78f, -0.375f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.build()

        return _ArrowBadgeRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBadgeRight: ImageVector? = null
