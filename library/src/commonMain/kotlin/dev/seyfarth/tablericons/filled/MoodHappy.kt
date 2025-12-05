package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.MoodHappy: ImageVector
    get() {
        if (_MoodHappy != null) {
            return _MoodHappy!!
        }
        _MoodHappy = ImageVector.Builder(
            name = "Filled.MoodHappy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -14.995f, 8.984f)
                lineToRelative(-0.005f, -0.324f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.995f, -8.336f)
                close()
                moveTo(15f, 13f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(0.05f)
                arcToRelative(3.975f, 3.975f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.777f, 3.97f)
                lineToRelative(0.227f, 0.005f)
                arcToRelative(4.026f, 4.026f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.99f, -3.79f)
                lineToRelative(0.006f, -0.206f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1.029f)
                close()
                moveTo(9.01f, 8f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.117f, 1.993f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.117f, -1.993f)
                close()
                moveTo(15.01f, 8f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.117f, 1.993f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.117f, -1.993f)
                close()
            }
        }.build()

        return _MoodHappy!!
    }

@Suppress("ObjectPropertyName")
private var _MoodHappy: ImageVector? = null
