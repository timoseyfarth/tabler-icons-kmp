package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CurrencyEuro: ImageVector
    get() {
        if (_CurrencyEuro != null) {
            return _CurrencyEuro!!
        }
        _CurrencyEuro = ImageVector.Builder(
            name = "Filled.CurrencyEuro",
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
                moveTo(17.2f, 7f)
                arcToRelative(6f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 10f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 10f)
                horizontalLineToRelative(-8f)
                moveToRelative(0f, 4f)
                horizontalLineToRelative(8f)
            }
        }.build()

        return _CurrencyEuro!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyEuro: ImageVector? = null
