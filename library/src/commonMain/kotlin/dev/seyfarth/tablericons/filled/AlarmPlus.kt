package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.AlarmPlus: ImageVector
    get() {
        if (_AlarmPlus != null) {
            return _AlarmPlus!!
        }
        _AlarmPlus = ImageVector.Builder(
            name = "Filled.AlarmPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 6.072f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.995f, 7.213f)
                lineToRelative(-0.005f, -0.285f)
                lineToRelative(0.005f, -0.285f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.995f, -6.643f)
                close()
                moveTo(12f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.117f, 1.993f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.993f, -0.117f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.117f, -1.993f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.993f, -0.883f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.412f, 3.191f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.273f, 1.539f)
                lineToRelative(-0.097f, 0.08f)
                lineToRelative(-2.75f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.273f, -1.54f)
                lineToRelative(0.097f, -0.08f)
                lineToRelative(2.75f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.191f, 3.412f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.291f, -0.288f)
                lineToRelative(0.106f, 0.067f)
                lineToRelative(2.75f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.07f, 1.685f)
                lineToRelative(-0.106f, -0.067f)
                lineToRelative(-2.75f, -2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.22f, -1.397f)
                close()
            }
        }.build()

        return _AlarmPlus!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmPlus: ImageVector? = null
