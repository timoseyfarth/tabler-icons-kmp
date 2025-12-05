package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandSublimeText: ImageVector
    get() {
        if (_BrandSublimeText != null) {
            return _BrandSublimeText!!
        }
        _BrandSublimeText = ImageVector.Builder(
            name = "Filled.BrandSublimeText",
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
                moveTo(19f, 8f)
                lineToRelative(-14f, 4.5f)
                verticalLineToRelative(-5.5f)
                lineToRelative(14f, -4.5f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 17f)
                lineToRelative(-14f, 4.5f)
                verticalLineToRelative(-5.5f)
                lineToRelative(14f, -4.5f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 11.5f)
                lineToRelative(-14f, -4.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 12.5f)
                lineToRelative(14f, 4.5f)
            }
        }.build()

        return _BrandSublimeText!!
    }

@Suppress("ObjectPropertyName")
private var _BrandSublimeText: ImageVector? = null
