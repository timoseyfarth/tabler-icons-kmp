package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.MapPin: ImageVector
    get() {
        if (_MapPin != null) {
            return _MapPin!!
        }
        _MapPin = ImageVector.Builder(
            name = "Filled.MapPin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.364f, 4.636f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.203f, 12.519f)
                lineToRelative(-0.203f, 0.21f)
                lineToRelative(-4.243f, 4.242f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.097f, 0.135f)
                lineToRelative(-0.144f, -0.135f)
                lineToRelative(-4.244f, -4.243f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.728f, -12.728f)
                close()
                moveTo(12f, 8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6f)
                close()
            }
        }.build()

        return _MapPin!!
    }

@Suppress("ObjectPropertyName")
private var _MapPin: ImageVector? = null
