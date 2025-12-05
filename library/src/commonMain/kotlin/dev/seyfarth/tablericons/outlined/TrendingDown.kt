package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.TrendingDown: ImageVector
    get() {
        if (_TrendingDown != null) {
            return _TrendingDown!!
        }
        _TrendingDown = ImageVector.Builder(
            name = "Filled.TrendingDown",
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
                moveTo(3f, 7f)
                lineToRelative(6f, 6f)
                lineToRelative(4f, -4f)
                lineToRelative(8f, 8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 10f)
                lineToRelative(0f, 7f)
                lineToRelative(-7f, 0f)
            }
        }.build()

        return _TrendingDown!!
    }

@Suppress("ObjectPropertyName")
private var _TrendingDown: ImageVector? = null
