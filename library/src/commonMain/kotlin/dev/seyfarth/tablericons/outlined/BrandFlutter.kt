package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandFlutter: ImageVector
    get() {
        if (_BrandFlutter != null) {
            return _BrandFlutter!!
        }
        _BrandFlutter = ImageVector.Builder(
            name = "Filled.BrandFlutter",
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
                moveTo(7f, 14f)
                lineToRelative(-3f, -3f)
                lineToRelative(8f, -8f)
                horizontalLineToRelative(6f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 21f)
                lineToRelative(-5f, -5f)
                lineToRelative(5f, -5f)
                horizontalLineToRelative(5f)
                lineToRelative(-5f, 5f)
                lineToRelative(5f, 5f)
                close()
            }
        }.build()

        return _BrandFlutter!!
    }

@Suppress("ObjectPropertyName")
private var _BrandFlutter: ImageVector? = null
