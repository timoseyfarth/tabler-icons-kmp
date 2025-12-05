package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandOpenSource: ImageVector
    get() {
        if (_BrandOpenSource != null) {
            return _BrandOpenSource!!
        }
        _BrandOpenSource = ImageVector.Builder(
            name = "Filled.BrandOpenSource",
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
                moveTo(12f, 3f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.618f, 17.243f)
                lineToRelative(-2.193f, -5.602f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.849f, 0f)
                lineToRelative(-2.193f, 5.603f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.617f, -17.244f)
                close()
            }
        }.build()

        return _BrandOpenSource!!
    }

@Suppress("ObjectPropertyName")
private var _BrandOpenSource: ImageVector? = null
