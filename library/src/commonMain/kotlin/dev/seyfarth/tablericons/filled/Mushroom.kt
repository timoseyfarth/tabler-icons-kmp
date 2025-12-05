package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Mushroom: ImageVector
    get() {
        if (_Mushroom != null) {
            return _Mushroom!!
        }
        _Mushroom = ImageVector.Builder(
            name = "Filled.Mushroom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 15f)
                verticalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.995f, 0.176f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(6f)
                close()
                moveTo(4.9f, 13f)
                arcToRelative(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.894f, -1.752f)
                lineToRelative(-0.006f, -0.148f)
                curveToRelative(0f, -5.023f, 4.027f, -9.1f, 9f, -9.1f)
                reflectiveCurveToRelative(9f, 4.077f, 9f, 9.1f)
                arcToRelative(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.752f, 1.894f)
                lineToRelative(-0.148f, 0.006f)
                horizontalLineToRelative(-14.2f)
                close()
            }
        }.build()

        return _Mushroom!!
    }

@Suppress("ObjectPropertyName")
private var _Mushroom: ImageVector? = null
