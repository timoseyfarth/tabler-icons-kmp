package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandSuperhuman: ImageVector
    get() {
        if (_BrandSuperhuman != null) {
            return _BrandSuperhuman!!
        }
        _BrandSuperhuman = ImageVector.Builder(
            name = "Filled.BrandSuperhuman",
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
                moveTo(16f, 12f)
                lineToRelative(4f, 3f)
                lineToRelative(-8f, 7f)
                lineToRelative(-8f, -7f)
                lineToRelative(4f, -3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                lineToRelative(-8f, 6f)
                lineToRelative(8f, 6f)
                lineToRelative(8f, -6f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                horizontalLineToRelative(8f)
            }
        }.build()

        return _BrandSuperhuman!!
    }

@Suppress("ObjectPropertyName")
private var _BrandSuperhuman: ImageVector? = null
