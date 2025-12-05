package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.TrendingDown2: ImageVector
    get() {
        if (_TrendingDown2 != null) {
            return _TrendingDown2!!
        }
        _TrendingDown2 = ImageVector.Builder(
            name = "Filled.TrendingDown2",
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
                moveTo(3f, 6f)
                horizontalLineToRelative(5f)
                lineToRelative(7f, 10f)
                horizontalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 19f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
            }
        }.build()

        return _TrendingDown2!!
    }

@Suppress("ObjectPropertyName")
private var _TrendingDown2: ImageVector? = null
