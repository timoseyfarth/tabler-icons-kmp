package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.MilitaryRank: ImageVector
    get() {
        if (_MilitaryRank != null) {
            return _MilitaryRank!!
        }
        _MilitaryRank = ImageVector.Builder(
            name = "Filled.MilitaryRank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.555f, 2.168f)
                lineToRelative(6f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.445f, 0.832f)
                verticalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineToRelative(-8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineToRelative(-12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.445f, -0.832f)
                lineToRelative(6f, -4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.11f, 0f)
                moveToRelative(-0.108f, 12.938f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.894f, 0f)
                lineToRelative(-2f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.447f, 1.341f)
                lineToRelative(0.058f, 0.102f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.283f, 0.345f)
                lineToRelative(1.553f, -0.776f)
                lineToRelative(1.553f, 0.776f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.894f, -1.788f)
                close()
                moveTo(12.447f, 11.106f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.894f, 0f)
                lineToRelative(-2f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.447f, 1.341f)
                lineToRelative(0.058f, 0.102f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.283f, 0.345f)
                lineToRelative(1.553f, -0.776f)
                lineToRelative(1.553f, 0.776f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.894f, -1.788f)
                close()
                moveTo(12.447f, 7.106f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.894f, 0f)
                lineToRelative(-2f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.447f, 1.341f)
                lineToRelative(0.058f, 0.102f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.283f, 0.345f)
                lineToRelative(1.553f, -0.776f)
                lineToRelative(1.553f, 0.776f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.894f, -1.788f)
                close()
            }
        }.build()

        return _MilitaryRank!!
    }

@Suppress("ObjectPropertyName")
private var _MilitaryRank: ImageVector? = null
