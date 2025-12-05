package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.LetterWSmall: ImageVector
    get() {
        if (_LetterWSmall != null) {
            return _LetterWSmall!!
        }
        _LetterWSmall = ImageVector.Builder(
            name = "Filled.LetterWSmall",
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
                moveTo(9f, 8f)
                lineToRelative(1f, 8f)
                lineToRelative(2f, -5f)
                lineToRelative(2f, 5f)
                lineToRelative(1f, -8f)
            }
        }.build()

        return _LetterWSmall!!
    }

@Suppress("ObjectPropertyName")
private var _LetterWSmall: ImageVector? = null
