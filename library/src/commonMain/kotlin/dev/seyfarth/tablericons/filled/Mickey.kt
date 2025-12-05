package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Mickey: ImageVector
    get() {
        if (_Mickey != null) {
            return _Mickey!!
        }
        _Mickey = ImageVector.Builder(
            name = "Filled.Mickey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.501f, 2f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.878f, 8.913f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -15.374f, 3.372f)
                lineToRelative(-0.005f, -0.285f)
                lineToRelative(0.005f, -0.285f)
                arcToRelative(7.991f, 7.991f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.615f, -2.803f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.187f, -6.348f)
                arcToRelative(4.505f, 4.505f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.596f, -2.539f)
                lineToRelative(0.225f, -0.018f)
                lineToRelative(0.281f, -0.007f)
                lineToRelative(0.244f, 0.009f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.215f, 4.247f)
                arcToRelative(8.001f, 8.001f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.013f, 0f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.493f, -4.256f)
                close()
            }
        }.build()

        return _Mickey!!
    }

@Suppress("ObjectPropertyName")
private var _Mickey: ImageVector? = null
