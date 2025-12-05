package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Pin: ImageVector
    get() {
        if (_Pin != null) {
            return _Pin!!
        }
        _Pin = ImageVector.Builder(
            name = "Filled.Pin",
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
                moveTo(15f, 4.5f)
                lineToRelative(-4f, 4f)
                lineToRelative(-4f, 1.5f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(7f, 7f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(1.5f, -4f)
                lineToRelative(4f, -4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 15f)
                lineToRelative(-4.5f, 4.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 4f)
                lineToRelative(5.5f, 5.5f)
            }
        }.build()

        return _Pin!!
    }

@Suppress("ObjectPropertyName")
private var _Pin: ImageVector? = null
