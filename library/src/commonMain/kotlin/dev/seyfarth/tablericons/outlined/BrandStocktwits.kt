package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandStocktwits: ImageVector
    get() {
        if (_BrandStocktwits != null) {
            return _BrandStocktwits!!
        }
        _BrandStocktwits = ImageVector.Builder(
            name = "Filled.BrandStocktwits",
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
                moveTo(16f, 3f)
                lineToRelative(-8f, 4.5f)
                lineToRelative(8f, 4.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 12f)
                lineToRelative(8f, 4.5f)
                lineToRelative(-8f, 4.5f)
            }
        }.build()

        return _BrandStocktwits!!
    }

@Suppress("ObjectPropertyName")
private var _BrandStocktwits: ImageVector? = null
