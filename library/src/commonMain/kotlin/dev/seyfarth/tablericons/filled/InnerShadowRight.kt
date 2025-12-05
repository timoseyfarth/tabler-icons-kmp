package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.InnerShadowRight: ImageVector
    get() {
        if (_InnerShadowRight != null) {
            return _InnerShadowRight!!
        }
        _InnerShadowRight = ImageVector.Builder(
            name = "Filled.InnerShadowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.929f, 4.929f)
                curveToRelative(3.905f, -3.905f, 10.237f, -3.905f, 14.142f, 0f)
                curveToRelative(3.905f, 3.905f, 3.905f, 10.237f, 0f, 14.142f)
                curveToRelative(-3.905f, 3.905f, -10.237f, 3.905f, -14.142f, 0f)
                curveToRelative(-3.905f, -3.905f, -3.905f, -10.237f, 0f, -14.142f)
                close()
                moveTo(16.949f, 7.05f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.413f, 1.414f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 7.072f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.414f, 1.414f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -9.9f)
                close()
            }
        }.build()

        return _InnerShadowRight!!
    }

@Suppress("ObjectPropertyName")
private var _InnerShadowRight: ImageVector? = null
