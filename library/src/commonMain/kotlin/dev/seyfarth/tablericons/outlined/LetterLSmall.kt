package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.LetterLSmall: ImageVector
    get() {
        if (_LetterLSmall != null) {
            return _LetterLSmall!!
        }
        _LetterLSmall = ImageVector.Builder(
            name = "Filled.LetterLSmall",
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
                verticalLineToRelative(8f)
                horizontalLineToRelative(4f)
            }
        }.build()

        return _LetterLSmall!!
    }

@Suppress("ObjectPropertyName")
private var _LetterLSmall: ImageVector? = null
