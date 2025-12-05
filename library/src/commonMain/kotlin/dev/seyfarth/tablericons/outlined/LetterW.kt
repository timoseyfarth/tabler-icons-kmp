package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.LetterW: ImageVector
    get() {
        if (_LetterW != null) {
            return _LetterW!!
        }
        _LetterW = ImageVector.Builder(
            name = "Filled.LetterW",
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
                moveTo(4f, 4f)
                lineToRelative(4f, 16f)
                lineToRelative(4f, -14f)
                lineToRelative(4f, 14f)
                lineToRelative(4f, -16f)
            }
        }.build()

        return _LetterW!!
    }

@Suppress("ObjectPropertyName")
private var _LetterW: ImageVector? = null
