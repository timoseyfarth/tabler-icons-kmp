package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Chess: ImageVector
    get() {
        if (_Chess != null) {
            return _Chess!!
        }
        _Chess = ImageVector.Builder(
            name = "Filled.Chess",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.438f, 2.001f)
                lineToRelative(0.438f, -0.001f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-1.263f)
                lineToRelative(1.24f, 5.79f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.747f, 1.184f)
                lineToRelative(-0.113f, 0.02f)
                lineToRelative(-0.117f, 0.006f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.996f, -1.093f)
                lineToRelative(0.018f, -0.117f)
                lineToRelative(1.24f, -5.79f)
                horizontalLineToRelative(-1.262f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(0.438f)
                arcToRelative(5.154f, 5.154f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.412f, -1.525f)
                lineToRelative(-0.02f, -0.259f)
                lineToRelative(-0.006f, -0.216f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 18f)
                horizontalLineToRelative(-12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.987f, -1.768f)
                lineToRelative(0.011f, -0.174f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.998f, -1.058f)
                close()
            }
        }.build()

        return _Chess!!
    }

@Suppress("ObjectPropertyName")
private var _Chess: ImageVector? = null
