package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandX: ImageVector
    get() {
        if (_BrandX != null) {
            return _BrandX!!
        }
        _BrandX = ImageVector.Builder(
            name = "Filled.BrandX",
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
                moveTo(4f, 4f)
                lineToRelative(11.733f, 16f)
                horizontalLineToRelative(4.267f)
                lineToRelative(-11.733f, -16f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 20f)
                lineToRelative(6.768f, -6.768f)
                moveToRelative(2.46f, -2.46f)
                lineToRelative(6.772f, -6.772f)
            }
        }.build()

        return _BrandX!!
    }

@Suppress("ObjectPropertyName")
private var _BrandX: ImageVector? = null
