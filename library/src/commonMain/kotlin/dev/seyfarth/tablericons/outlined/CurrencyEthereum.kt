package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CurrencyEthereum: ImageVector
    get() {
        if (_CurrencyEthereum != null) {
            return _CurrencyEthereum!!
        }
        _CurrencyEthereum = ImageVector.Builder(
            name = "Filled.CurrencyEthereum",
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
                moveTo(6f, 12f)
                lineToRelative(6f, -9f)
                lineToRelative(6f, 9f)
                lineToRelative(-6f, 9f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                lineToRelative(6f, -3f)
                lineToRelative(6f, 3f)
                lineToRelative(-6f, 2f)
                close()
            }
        }.build()

        return _CurrencyEthereum!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyEthereum: ImageVector? = null
