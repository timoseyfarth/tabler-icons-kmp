package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Track: ImageVector
    get() {
        if (_Track != null) {
            return _Track!!
        }
        _Track = ImageVector.Builder(
            name = "Filled.Track",
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
                moveTo(4f, 15f)
                lineToRelative(11f, -11f)
                moveToRelative(5f, 5f)
                lineToRelative(-11f, 11f)
                moveToRelative(-4f, -8f)
                lineToRelative(7f, 7f)
                moveToRelative(-3.5f, -10.5f)
                lineToRelative(7f, 7f)
                moveToRelative(-3.5f, -10.5f)
                lineToRelative(7f, 7f)
            }
        }.build()

        return _Track!!
    }

@Suppress("ObjectPropertyName")
private var _Track: ImageVector? = null
