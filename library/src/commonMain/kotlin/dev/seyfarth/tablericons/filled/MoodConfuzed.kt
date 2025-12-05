package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.MoodConfuzed: ImageVector
    get() {
        if (_MoodConfuzed != null) {
            return _MoodConfuzed!!
        }
        _MoodConfuzed = ImageVector.Builder(
            name = "Filled.MoodConfuzed",
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
                moveTo(15.57f, 13.502f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.6f, 1.65f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, 1.696f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.4f, -1.35f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.14f, -1.996f)
                close()
                moveTo(9.01f, 9f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.986f)
                lineToRelative(0.117f, 0.007f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.986f)
                lineToRelative(-0.117f, -0.007f)
                close()
                moveTo(15.01f, 9f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.986f)
                lineToRelative(0.117f, 0.007f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.986f)
                lineToRelative(-0.117f, -0.007f)
                close()
            }
        }.build()

        return _MoodConfuzed!!
    }

@Suppress("ObjectPropertyName")
private var _MoodConfuzed: ImageVector? = null
