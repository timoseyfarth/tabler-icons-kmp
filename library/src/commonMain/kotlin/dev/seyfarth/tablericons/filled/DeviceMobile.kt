package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.DeviceMobile: ImageVector
    get() {
        if (_DeviceMobile != null) {
            return _DeviceMobile!!
        }
        _DeviceMobile = ImageVector.Builder(
            name = "Filled.DeviceMobile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.995f, 2.824f)
                lineToRelative(0.005f, 0.176f)
                verticalLineToRelative(14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.824f, -2.995f)
                lineToRelative(0.176f, -0.005f)
                horizontalLineToRelative(8f)
                close()
                moveTo(12f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.986f, 0f)
                lineToRelative(0.007f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.993f, -0.883f)
                close()
                moveTo(13f, 4f)
                horizontalLineToRelative(-2f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.986f)
                lineToRelative(0.117f, 0.007f)
                horizontalLineToRelative(2f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.986f)
                lineToRelative(-0.117f, -0.007f)
                close()
            }
        }.build()

        return _DeviceMobile!!
    }

@Suppress("ObjectPropertyName")
private var _DeviceMobile: ImageVector? = null
