package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandVite: ImageVector
    get() {
        if (_BrandVite != null) {
            return _BrandVite!!
        }
        _BrandVite = ImageVector.Builder(
            name = "Filled.BrandVite",
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
                moveTo(10f, 4.5f)
                lineToRelative(6f, -1.5f)
                lineToRelative(-2f, 6.5f)
                lineToRelative(2f, -0.5f)
                lineToRelative(-4f, 7f)
                verticalLineToRelative(-5f)
                lineToRelative(-3f, 1f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 6.5f)
                lineToRelative(7f, -1.5f)
                lineToRelative(-10f, 17f)
                lineToRelative(-10f, -17f)
                lineToRelative(7.741f, 1.5f)
            }
        }.build()

        return _BrandVite!!
    }

@Suppress("ObjectPropertyName")
private var _BrandVite: ImageVector? = null
