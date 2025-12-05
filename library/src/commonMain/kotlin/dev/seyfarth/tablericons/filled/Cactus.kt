package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Cactus: ImageVector
    get() {
        if (_Cactus != null) {
            return _Cactus!!
        }
        _Cactus = ImageVector.Builder(
            name = "Filled.Cactus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.995f, -3.8f)
                lineToRelative(-0.005f, -0.2f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.993f, -0.117f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.85f, 1.995f)
                lineToRelative(0.15f, 0.005f)
                verticalLineToRelative(-7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.995f, -0.176f)
                lineToRelative(0.005f, 0.176f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.995f, -1.85f)
                lineToRelative(0.005f, -0.15f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.993f, -0.117f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(5f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.8f, 3.995f)
                lineToRelative(-0.2f, 0.005f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-10f)
                close()
            }
        }.build()

        return _Cactus!!
    }

@Suppress("ObjectPropertyName")
private var _Cactus: ImageVector? = null
