package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Library: ImageVector
    get() {
        if (_Library != null) {
            return _Library!!
        }
        _Library = ImageVector.Builder(
            name = "Filled.Library",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.333f, 2f)
                arcToRelative(3.667f, 3.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.667f, 3.667f)
                verticalLineToRelative(8.666f)
                arcToRelative(3.667f, 3.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.667f, 3.667f)
                horizontalLineToRelative(-8.666f)
                arcToRelative(3.667f, 3.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.667f, -3.667f)
                verticalLineToRelative(-8.666f)
                arcToRelative(3.667f, 3.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.667f, -3.667f)
                close()
                moveTo(14f, 12f)
                horizontalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                moveToRelative(3f, -3f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                moveToRelative(-1f, -3f)
                horizontalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.517f, 6.391f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.99f, 1.738f)
                curveToRelative(-0.313f, 0.178f, -0.506f, 0.51f, -0.507f, 0.868f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.548f, 0.452f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.284f, 0f, 0.405f, -0.088f, 0.626f, -0.486f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.748f, 0.972f)
                curveToRelative(-0.546f, 0.98f, -1.28f, 1.514f, -2.374f, 1.514f)
                horizontalLineToRelative(-10f)
                curveToRelative(-1.652f, 0f, -3f, -1.348f, -3f, -3f)
                verticalLineToRelative(-10.002f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.517f, -2.605f)
            }
        }.build()

        return _Library!!
    }

@Suppress("ObjectPropertyName")
private var _Library: ImageVector? = null
