package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandJuejin: ImageVector
    get() {
        if (_BrandJuejin != null) {
            return _BrandJuejin!!
        }
        _BrandJuejin = ImageVector.Builder(
            name = "Filled.BrandJuejin",
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
                moveTo(2f, 12f)
                lineToRelative(10f, 7.422f)
                lineToRelative(10f, -7.422f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 9f)
                lineToRelative(5f, 4f)
                lineToRelative(5f, -4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 6f)
                lineToRelative(1f, 0.8f)
                lineToRelative(1f, -0.8f)
                lineToRelative(-1f, -0.8f)
                close()
            }
        }.build()

        return _BrandJuejin!!
    }

@Suppress("ObjectPropertyName")
private var _BrandJuejin: ImageVector? = null
