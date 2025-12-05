package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Bus: ImageVector
    get() {
        if (_Bus != null) {
            return _Bus!!
        }
        _Bus = ImageVector.Builder(
            name = "Filled.Bus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 4f)
                curveToRelative(3.4f, 0f, 6f, 3.64f, 6f, 8f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineToRelative(-1.171f)
                arcToRelative(3.001f, 3.001f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.658f, 0f)
                horizontalLineToRelative(-6.342f)
                arcToRelative(3.001f, 3.001f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.658f, 0f)
                horizontalLineToRelative(-1.171f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineToRelative(-11f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                close()
                moveTo(6f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                moveToRelative(12f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                moveToRelative(-0.76f, -9.989f)
                lineToRelative(1.068f, 4.989f)
                horizontalLineToRelative(2.636f)
                curveToRelative(-0.313f, -2.756f, -1.895f, -4.82f, -3.704f, -4.989f)
                moveToRelative(-11.24f, -0.011f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(11f, 6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(15.191f, 6f)
                horizontalLineToRelative(-2.191f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.834f)
                close()
            }
        }.build()

        return _Bus!!
    }

@Suppress("ObjectPropertyName")
private var _Bus: ImageVector? = null
