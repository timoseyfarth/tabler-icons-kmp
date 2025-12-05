package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.LetterZSmall: ImageVector
    get() {
        if (_LetterZSmall != null) {
            return _LetterZSmall!!
        }
        _LetterZSmall = ImageVector.Builder(
            name = "Filled.LetterZSmall",
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
                moveTo(10f, 8f)
                horizontalLineToRelative(4f)
                lineToRelative(-4f, 8f)
                horizontalLineToRelative(4f)
            }
        }.build()

        return _LetterZSmall!!
    }

@Suppress("ObjectPropertyName")
private var _LetterZSmall: ImageVector? = null
