package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CurrencyMonero: ImageVector
    get() {
        if (_CurrencyMonero != null) {
            return _CurrencyMonero!!
        }
        _CurrencyMonero = ImageVector.Builder(
            name = "Filled.CurrencyMonero",
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
                moveTo(3f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-11f)
                lineToRelative(6f, 7f)
                lineToRelative(6f, -7f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(3f)
            }
        }.build()

        return _CurrencyMonero!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyMonero: ImageVector? = null
