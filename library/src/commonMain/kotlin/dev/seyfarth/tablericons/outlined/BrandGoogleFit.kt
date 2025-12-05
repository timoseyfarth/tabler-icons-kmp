package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandGoogleFit: ImageVector
    get() {
        if (_BrandGoogleFit != null) {
            return _BrandGoogleFit!!
        }
        _BrandGoogleFit = ImageVector.Builder(
            name = "Filled.BrandGoogleFit",
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
                moveTo(12f, 8.866f)
                lineToRelative(-2.733f, -2.734f)
                arcToRelative(3.866f, 3.866f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.467f, 5.467f)
                lineToRelative(2.733f, 2.734f)
                lineToRelative(5.467f, 5.467f)
                lineToRelative(8.202f, -8.201f)
                arcToRelative(3.866f, 3.866f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.469f, -5.466f)
                lineToRelative(-8.201f, 8.2f)
            }
        }.build()

        return _BrandGoogleFit!!
    }

@Suppress("ObjectPropertyName")
private var _BrandGoogleFit: ImageVector? = null
