package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.DualScreen: ImageVector
    get() {
        if (_DualScreen != null) {
            return _DualScreen!!
        }
        _DualScreen = ImageVector.Builder(
            name = "Filled.DualScreen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.351f, 0.936f)
                lineToRelative(-8f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.649f, -0.936f)
                verticalLineToRelative(-15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.212f, -0.616f)
                lineToRelative(0.068f, -0.079f)
                lineToRelative(0.078f, -0.072f)
                lineToRelative(0.066f, -0.05f)
                lineToRelative(0.092f, -0.058f)
                lineToRelative(0.065f, -0.033f)
                lineToRelative(0.1f, -0.04f)
                lineToRelative(0.099f, -0.028f)
                lineToRelative(0.046f, -0.01f)
                lineToRelative(0.108f, -0.013f)
                lineToRelative(0.066f, -0.001f)
                close()
                moveTo(13.351f, 6.064f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.649f, 0.936f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(-7.486f)
                close()
            }
        }.build()

        return _DualScreen!!
    }

@Suppress("ObjectPropertyName")
private var _DualScreen: ImageVector? = null
