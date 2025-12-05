package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandAlpineJs: ImageVector
    get() {
        if (_BrandAlpineJs != null) {
            return _BrandAlpineJs!!
        }
        _BrandAlpineJs = ImageVector.Builder(
            name = "Filled.BrandAlpineJs",
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
                moveTo(3f, 11.5f)
                lineToRelative(4.5f, 4.5f)
                horizontalLineToRelative(9f)
                lineToRelative(-9f, -9f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 16f)
                lineToRelative(4.5f, -4.5f)
                lineToRelative(-4.5f, -4.5f)
                lineToRelative(-4.5f, 4.5f)
            }
        }.build()

        return _BrandAlpineJs!!
    }

@Suppress("ObjectPropertyName")
private var _BrandAlpineJs: ImageVector? = null
