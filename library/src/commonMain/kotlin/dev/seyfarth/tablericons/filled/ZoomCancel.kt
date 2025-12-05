package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ZoomCancel: ImageVector
    get() {
        if (_ZoomCancel != null) {
            return _ZoomCancel!!
        }
        _ZoomCancel = ImageVector.Builder(
            name = "Filled.ZoomCancel",
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
                moveToRelative(-5.293f, 4.22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, 1.415f)
                lineToRelative(1.292f, 1.293f)
                lineToRelative(-1.292f, 1.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.414f, 1.414f)
                lineToRelative(1.293f, -1.292f)
                lineToRelative(1.293f, 1.292f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.414f, -1.414f)
                lineToRelative(-1.292f, -1.293f)
                lineToRelative(1.292f, -1.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.414f, -1.414f)
                lineToRelative(-1.293f, 1.292f)
                close()
            }
        }.build()

        return _ZoomCancel!!
    }

@Suppress("ObjectPropertyName")
private var _ZoomCancel: ImageVector? = null
