package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ToggleLeft: ImageVector
    get() {
        if (_ToggleLeft != null) {
            return _ToggleLeft!!
        }
        _ToggleLeft = ImageVector.Builder(
            name = "Filled.ToggleLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 3f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.995f, -2.824f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 5f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 14f)
                horizontalLineToRelative(-8f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -14f)
                close()
                moveTo(16f, 7f)
                horizontalLineToRelative(-8f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 10f)
                horizontalLineToRelative(8f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -10f)
            }
        }.build()

        return _ToggleLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ToggleLeft: ImageVector? = null
