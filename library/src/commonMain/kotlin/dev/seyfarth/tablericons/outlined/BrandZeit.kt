package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandZeit: ImageVector
    get() {
        if (_BrandZeit != null) {
            return _BrandZeit!!
        }
        _BrandZeit = ImageVector.Builder(
            name = "Filled.BrandZeit",
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
                moveTo(3f, 20f)
                horizontalLineToRelative(18f)
                lineToRelative(-9f, -16f)
                close()
            }
        }.build()

        return _BrandZeit!!
    }

@Suppress("ObjectPropertyName")
private var _BrandZeit: ImageVector? = null
