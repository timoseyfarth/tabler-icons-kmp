package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Moon: ImageVector
    get() {
        if (_Moon != null) {
            return _Moon!!
        }
        _Moon = ImageVector.Builder(
            name = "Filled.Moon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.992f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9.236f, 13.838f)
                curveToRelative(0.341f, -0.82f, -0.476f, -1.644f, -1.298f, -1.31f)
                arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.864f, -10.787f)
                lineToRelative(0.077f, -0.08f)
                curveToRelative(0.551f, -0.63f, 0.113f, -1.653f, -0.758f, -1.653f)
                horizontalLineToRelative(-0.266f)
                lineToRelative(-0.068f, -0.006f)
                lineToRelative(-0.06f, -0.002f)
                close()
            }
        }.build()

        return _Moon!!
    }

@Suppress("ObjectPropertyName")
private var _Moon: ImageVector? = null
