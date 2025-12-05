package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ArrowBadgeDown: ImageVector
    get() {
        if (_ArrowBadgeDown != null) {
            return _ArrowBadgeDown!!
        }
        _ArrowBadgeDown = ImageVector.Builder(
            name = "Filled.ArrowBadgeDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.375f, 6.22f)
                lineToRelative(-4.375f, 3.498f)
                lineToRelative(-4.375f, -3.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.625f, 0.782f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.375f, 0.78f)
                lineToRelative(5f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.25f, 0f)
                lineToRelative(5f, -4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.375f, -0.78f)
                verticalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.625f, -0.78f)
                close()
            }
        }.build()

        return _ArrowBadgeDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBadgeDown: ImageVector? = null
