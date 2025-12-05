package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Icons: ImageVector
    get() {
        if (_Icons != null) {
            return _Icons!!
        }
        _Icons = ImageVector.Builder(
            name = "Filled.Icons",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.25f, 2.603f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.25f, 3.897f)
                lineToRelative(0.006f, -0.229f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.244f, -3.668f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.632f, 13.504f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.736f, 0f)
                lineToRelative(4f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.868f, 1.496f)
                horizontalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.868f, -1.496f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.293f, 2.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, 0f)
                lineToRelative(7f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.414f, 1.414f)
                lineToRelative(-7f, -7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.414f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.293f, 2.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, 1.414f)
                lineToRelative(-7f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, -1.414f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineToRelative(-7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineToRelative(-7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                close()
            }
        }.build()

        return _Icons!!
    }

@Suppress("ObjectPropertyName")
private var _Icons: ImageVector? = null
