package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.GardenCart: ImageVector
    get() {
        if (_GardenCart != null) {
            return _GardenCart!!
        }
        _GardenCart = ImageVector.Builder(
            name = "Filled.GardenCart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.324f, 3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.855f, 1.258f)
                lineToRelative(1.097f, 2.742f)
                horizontalLineToRelative(14.724f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.94f, 1.341f)
                lineToRelative(-0.046f, 0.106f)
                lineToRelative(-2.934f, 5.871f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.96f, 3.182f)
                lineToRelative(0.005f, -0.192f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.499f, -1.618f)
                lineToRelative(-2.446f, -0.258f)
                lineToRelative(-3.446f, 4.75f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.08f, 0.762f)
                lineToRelative(-0.154f, -0.044f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.378f, -1.9f)
                verticalLineToRelative(-9.804f)
                lineToRelative(-1.679f, -4.196f)
                horizontalLineToRelative(-1.321f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                close()
                moveTo(17.5f, 16f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
                moveToRelative(-10.5f, -2.498f)
                lineToRelative(-0.002f, 5.498f)
                lineToRelative(2.783f, -3.833f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.614f, -1.474f)
                close()
            }
        }.build()

        return _GardenCart!!
    }

@Suppress("ObjectPropertyName")
private var _GardenCart: ImageVector? = null
