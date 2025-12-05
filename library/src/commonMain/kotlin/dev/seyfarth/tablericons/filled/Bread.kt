package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Bread: ImageVector
    get() {
        if (_Bread != null) {
            return _Bread!!
        }
        _Bread = ImageVector.Builder(
            name = "Filled.Bread",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 3f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.109f, 6.516f)
                lineToRelative(-0.11f, 0.126f)
                lineToRelative(0.001f, 8.358f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineToRelative(-8.356f)
                lineToRelative(-0.116f, -0.136f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.728f, -3.616f)
                lineToRelative(0.067f, -0.21f)
                curveToRelative(0.532f, -1.525f, 1.93f, -2.58f, 3.601f, -2.677f)
                lineToRelative(12.079f, 0.001f)
                close()
            }
        }.build()

        return _Bread!!
    }

@Suppress("ObjectPropertyName")
private var _Bread: ImageVector? = null
