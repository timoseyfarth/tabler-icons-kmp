package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.BowlChopsticks: ImageVector
    get() {
        if (_BowlChopsticks != null) {
            return _BowlChopsticks!!
        }
        _BowlChopsticks = ImageVector.Builder(
            name = "Filled.BowlChopsticks",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.694f, -2.247f, 5.49f, -3.983f, 6.983f)
                lineToRelative(-0.017f, 0.013f)
                verticalLineToRelative(0.504f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.85f, 1.995f)
                lineToRelative(-0.15f, 0.005f)
                horizontalLineToRelative(-8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                verticalLineToRelative(-0.496f)
                lineToRelative(-0.065f, -0.053f)
                curveToRelative(-1.76f, -1.496f, -3.794f, -4.965f, -3.928f, -6.77f)
                lineToRelative(-0.007f, -0.181f)
                verticalLineToRelative(-0.5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.929f, 6.003f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.142f, 1.994f)
                lineToRelative(-14f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.142f, -1.994f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.79f, 1.022f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.42f, 1.956f)
                lineToRelative(-14f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.42f, -1.956f)
                close()
            }
        }.build()

        return _BowlChopsticks!!
    }

@Suppress("ObjectPropertyName")
private var _BowlChopsticks: ImageVector? = null
