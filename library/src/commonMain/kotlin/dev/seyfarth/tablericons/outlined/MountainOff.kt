package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.MountainOff: ImageVector
    get() {
        if (_MountainOff != null) {
            return _MountainOff!!
        }
        _MountainOff = ImageVector.Builder(
            name = "Filled.MountainOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.281f, 14.26f)
                lineToRelative(-4.201f, -8.872f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.158f, 0f)
                lineToRelative(-0.165f, 0.349f)
                moveToRelative(-1.289f, 2.719f)
                lineToRelative(-5.468f, 11.544f)
                horizontalLineToRelative(17f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 11f)
                lineToRelative(2f, 2.5f)
                lineToRelative(2f, -2f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()

        return _MountainOff!!
    }

@Suppress("ObjectPropertyName")
private var _MountainOff: ImageVector? = null
