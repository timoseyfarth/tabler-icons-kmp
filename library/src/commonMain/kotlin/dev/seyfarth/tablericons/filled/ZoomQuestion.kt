package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ZoomQuestion: ImageVector
    get() {
        if (_ZoomQuestion != null) {
            return _ZoomQuestion!!
        }
        _ZoomQuestion = ImageVector.Builder(
            name = "Filled.ZoomQuestion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 3.072f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.32f, 11.834f)
                lineToRelative(5.387f, 5.387f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, 1.414f)
                lineToRelative(-5.388f, -5.387f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.905f, -6.32f)
                lineToRelative(0.005f, -0.285f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.995f, -6.643f)
                moveToRelative(-4f, 8.928f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.993f, 0.117f)
                lineToRelative(0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                moveToRelative(-1.9f, -5.123f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.433f, 1.389f)
                lineToRelative(0.088f, -0.09f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.379f, 0.824f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.002f, 2f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.9f, -4.123f)
            }
        }.build()

        return _ZoomQuestion!!
    }

@Suppress("ObjectPropertyName")
private var _ZoomQuestion: ImageVector? = null
