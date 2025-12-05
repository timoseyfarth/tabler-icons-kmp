package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandTelegram: ImageVector
    get() {
        if (_BrandTelegram != null) {
            return _BrandTelegram!!
        }
        _BrandTelegram = ImageVector.Builder(
            name = "Filled.BrandTelegram",
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
                moveTo(15f, 10f)
                lineToRelative(-4f, 4f)
                lineToRelative(6f, 6f)
                lineToRelative(4f, -16f)
                lineToRelative(-18f, 7f)
                lineToRelative(4f, 2f)
                lineToRelative(2f, 6f)
                lineToRelative(3f, -4f)
            }
        }.build()

        return _BrandTelegram!!
    }

@Suppress("ObjectPropertyName")
private var _BrandTelegram: ImageVector? = null
