package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandVue: ImageVector
    get() {
        if (_BrandVue != null) {
            return _BrandVue!!
        }
        _BrandVue = ImageVector.Builder(
            name = "Filled.BrandVue",
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
                moveTo(16.5f, 4f)
                lineToRelative(-4.5f, 8f)
                lineToRelative(-4.5f, -8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 4f)
                lineToRelative(9f, 16f)
                lineToRelative(9f, -16f)
            }
        }.build()

        return _BrandVue!!
    }

@Suppress("ObjectPropertyName")
private var _BrandVue: ImageVector? = null
