package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Pennant2: ImageVector
    get() {
        if (_Pennant2 != null) {
            return _Pennant2!!
        }
        _Pennant2 = ImageVector.Builder(
            name = "Filled.Pennant2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7.351f)
                lineToRelative(-8.406f, -3.735f)
                curveToRelative(-0.752f, -0.335f, -0.79f, -1.365f, -0.113f, -1.77f)
                lineToRelative(0.113f, -0.058f)
                lineToRelative(8.406f, -3.736f)
                verticalLineToRelative(-0.35f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                close()
            }
        }.build()

        return _Pennant2!!
    }

@Suppress("ObjectPropertyName")
private var _Pennant2: ImageVector? = null
