package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandBulma: ImageVector
    get() {
        if (_BrandBulma != null) {
            return _BrandBulma!!
        }
        _BrandBulma = ImageVector.Builder(
            name = "Filled.BrandBulma",
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
                moveTo(5f, 16f)
                lineToRelative(1f, -9f)
                lineToRelative(5f, -5f)
                lineToRelative(6.5f, 6f)
                lineToRelative(-3.5f, 4f)
                lineToRelative(5f, 5f)
                lineToRelative(-8f, 5f)
                close()
            }
        }.build()

        return _BrandBulma!!
    }

@Suppress("ObjectPropertyName")
private var _BrandBulma: ImageVector? = null
