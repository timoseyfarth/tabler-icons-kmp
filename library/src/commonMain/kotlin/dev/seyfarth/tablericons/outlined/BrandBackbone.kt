package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandBackbone: ImageVector
    get() {
        if (_BrandBackbone != null) {
            return _BrandBackbone!!
        }
        _BrandBackbone = ImageVector.Builder(
            name = "Filled.BrandBackbone",
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
                moveTo(5f, 20f)
                lineToRelative(14f, -8f)
                lineToRelative(-14f, -8f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 20f)
                lineToRelative(-14f, -8f)
                lineToRelative(14f, -8f)
                close()
            }
        }.build()

        return _BrandBackbone!!
    }

@Suppress("ObjectPropertyName")
private var _BrandBackbone: ImageVector? = null
