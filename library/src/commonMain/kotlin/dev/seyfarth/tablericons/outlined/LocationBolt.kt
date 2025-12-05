package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.LocationBolt: ImageVector
    get() {
        if (_LocationBolt != null) {
            return _LocationBolt!!
        }
        _LocationBolt = ImageVector.Builder(
            name = "Filled.LocationBolt",
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
                moveTo(13.05f, 20.1f)
                lineToRelative(-3.05f, -6.1f)
                lineToRelative(-7f, -3.5f)
                arcToRelative(0.55f, 0.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1f)
                lineToRelative(18f, -6.5f)
                lineToRelative(-3.312f, 9.173f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                lineToRelative(-2f, 3f)
                horizontalLineToRelative(4f)
                lineToRelative(-2f, 3f)
            }
        }.build()

        return _LocationBolt!!
    }

@Suppress("ObjectPropertyName")
private var _LocationBolt: ImageVector? = null
