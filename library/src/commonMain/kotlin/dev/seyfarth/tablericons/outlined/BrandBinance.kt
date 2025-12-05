package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandBinance: ImageVector
    get() {
        if (_BrandBinance != null) {
            return _BrandBinance!!
        }
        _BrandBinance = ImageVector.Builder(
            name = "Filled.BrandBinance",
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
                moveTo(6f, 8f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
                lineToRelative(2f, -2f)
                lineToRelative(-6f, -6f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 16f)
                lineToRelative(2f, -2f)
                lineToRelative(4f, 4f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(2f, 2f)
                lineToRelative(-5.5f, 5.5f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 10f)
                lineToRelative(2f, 2f)
                lineToRelative(-2f, 2f)
                lineToRelative(-2f, -2f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 10f)
                lineToRelative(2f, 2f)
                lineToRelative(-2f, 2f)
                lineToRelative(-2f, -2f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 10f)
                lineToRelative(2f, 2f)
                lineToRelative(-2f, 2f)
                lineToRelative(-2f, -2f)
                close()
            }
        }.build()

        return _BrandBinance!!
    }

@Suppress("ObjectPropertyName")
private var _BrandBinance: ImageVector? = null
