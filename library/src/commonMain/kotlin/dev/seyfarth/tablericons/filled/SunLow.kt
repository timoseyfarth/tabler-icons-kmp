package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.SunLow: ImageVector
    get() {
        if (_SunLow != null) {
            return _SunLow!!
        }
        _SunLow = ImageVector.Builder(
            name = "Filled.SunLow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.407f, 16.993f)
                lineToRelative(0.01f, 0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.32f, 1.497f)
                lineToRelative(-0.104f, -0.093f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, -1.414f)
                moveToRelative(-11.4f, 0f)
                lineToRelative(0.01f, 0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.32f, 1.497f)
                lineToRelative(-0.104f, -0.093f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, -1.414f)
                moveToRelative(4.993f, -9.993f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 5f)
                lineToRelative(0.005f, -0.217f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.995f, -4.783f)
                moveToRelative(-4.993f, -1.407f)
                lineToRelative(0.01f, 0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.32f, 1.497f)
                lineToRelative(-0.104f, -0.093f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, -1.414f)
                moveToRelative(11.4f, 0f)
                lineToRelative(0.01f, 0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.32f, 1.497f)
                lineToRelative(-0.104f, -0.093f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.414f, -1.414f)
                moveToRelative(-14.397f, 5.407f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.117f, 1.993f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.117f, -1.993f)
                close()
                moveTo(12f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                moveToRelative(8.01f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.117f, 1.993f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.117f, -1.993f)
                close()
                moveTo(12f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
            }
        }.build()

        return _SunLow!!
    }

@Suppress("ObjectPropertyName")
private var _SunLow: ImageVector? = null
