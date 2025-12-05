package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandVercel: ImageVector
    get() {
        if (_BrandVercel != null) {
            return _BrandVercel!!
        }
        _BrandVercel = ImageVector.Builder(
            name = "Filled.BrandVercel",
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
                moveTo(3f, 19f)
                horizontalLineToRelative(18f)
                lineToRelative(-9f, -15f)
                close()
            }
        }.build()

        return _BrandVercel!!
    }

@Suppress("ObjectPropertyName")
private var _BrandVercel: ImageVector? = null
