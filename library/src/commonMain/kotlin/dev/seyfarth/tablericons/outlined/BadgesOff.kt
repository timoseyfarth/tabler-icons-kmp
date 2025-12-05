package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BadgesOff: ImageVector
    get() {
        if (_BadgesOff != null) {
            return _BadgesOff!!
        }
        _BadgesOff = ImageVector.Builder(
            name = "Filled.BadgesOff",
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
                moveTo(14.505f, 14.497f)
                lineToRelative(-2.505f, 1.503f)
                lineToRelative(-5f, -3f)
                verticalLineToRelative(4f)
                lineToRelative(5f, 3f)
                lineToRelative(5f, -3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.873f, 9.876f)
                lineToRelative(3.127f, -1.876f)
                verticalLineToRelative(-4f)
                lineToRelative(-5f, 3f)
                lineToRelative(-2.492f, -1.495f)
                moveToRelative(-2.508f, 1.495f)
                verticalLineToRelative(1f)
                lineToRelative(2.492f, 1.495f)
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

        return _BadgesOff!!
    }

@Suppress("ObjectPropertyName")
private var _BadgesOff: ImageVector? = null
