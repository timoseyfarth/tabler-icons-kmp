package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ZoomOut: ImageVector
    get() {
        if (_ZoomOut != null) {
            return _ZoomOut!!
        }
        _ZoomOut = ImageVector.Builder(
            name = "Filled.ZoomOut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 3.072f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.617f, 11.424f)
                lineToRelative(4.944f, 4.943f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.008f, 2.225f)
                lineToRelative(-0.114f, -0.103f)
                lineToRelative(-4.943f, -4.944f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.49f, -6.332f)
                lineToRelative(-0.006f, -0.285f)
                lineToRelative(0.005f, -0.285f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.995f, -6.643f)
                close()
                moveTo(13f, 9f)
                horizontalLineToRelative(-6f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.986f)
                lineToRelative(0.117f, 0.007f)
                horizontalLineToRelative(6f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.986f)
                lineToRelative(-0.117f, -0.007f)
                close()
            }
        }.build()

        return _ZoomOut!!
    }

@Suppress("ObjectPropertyName")
private var _ZoomOut: ImageVector? = null
