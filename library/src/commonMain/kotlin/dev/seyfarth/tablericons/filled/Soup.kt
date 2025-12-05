package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Soup: ImageVector
    get() {
        if (_Soup != null) {
            return _Soup!!
        }
        _Soup = ImageVector.Builder(
            name = "Filled.Soup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.694f, -2.247f, 5.49f, -3.983f, 6.983f)
                lineToRelative(-0.017f, 0.013f)
                verticalLineToRelative(0.504f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.85f, 1.995f)
                lineToRelative(-0.15f, 0.005f)
                horizontalLineToRelative(-8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                verticalLineToRelative(-0.496f)
                lineToRelative(-0.065f, -0.053f)
                curveToRelative(-1.76f, -1.496f, -3.794f, -4.965f, -3.928f, -6.77f)
                lineToRelative(-0.007f, -0.181f)
                verticalLineToRelative(-0.5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.417f, 3.188f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.166f, 1.624f)
                curveToRelative(-0.375f, 0.27f, -0.593f, 0.706f, -0.583f, 1.209f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.583f, 1.167f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.166f, 1.624f)
                arcToRelative(3.38f, 3.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.417f, -2.791f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.417f, -2.833f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.417f, 3.188f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.166f, 1.624f)
                curveToRelative(-0.375f, 0.27f, -0.593f, 0.706f, -0.583f, 1.209f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.583f, 1.167f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.166f, 1.624f)
                arcToRelative(3.38f, 3.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.417f, -2.791f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.417f, -2.833f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.417f, 3.188f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.166f, 1.624f)
                curveToRelative(-0.375f, 0.27f, -0.593f, 0.706f, -0.583f, 1.209f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.583f, 1.167f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.166f, 1.624f)
                arcToRelative(3.38f, 3.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.417f, -2.791f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.417f, -2.833f)
            }
        }.build()

        return _Soup!!
    }

@Suppress("ObjectPropertyName")
private var _Soup: ImageVector? = null
