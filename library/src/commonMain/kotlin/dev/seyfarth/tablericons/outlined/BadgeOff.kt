package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BadgeOff: ImageVector
    get() {
        if (_BadgeOff != null) {
            return _BadgeOff!!
        }
        _BadgeOff = ImageVector.Builder(
            name = "Filled.BadgeOff",
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
                moveTo(7f, 7f)
                verticalLineToRelative(10f)
                lineToRelative(5f, 3f)
                lineToRelative(5f, -3f)
                moveToRelative(0f, -4f)
                verticalLineToRelative(-9f)
                lineToRelative(-5f, 3f)
                lineToRelative(-2.496f, -1.497f)
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

        return _BadgeOff!!
    }

@Suppress("ObjectPropertyName")
private var _BadgeOff: ImageVector? = null
