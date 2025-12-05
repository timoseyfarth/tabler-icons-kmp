package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.LetterP: ImageVector
    get() {
        if (_LetterP != null) {
            return _LetterP!!
        }
        _LetterP = ImageVector.Builder(
            name = "Filled.LetterP",
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
                moveTo(7f, 20f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(5.5f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 9f)
                horizontalLineToRelative(-5.5f)
            }
        }.build()

        return _LetterP!!
    }

@Suppress("ObjectPropertyName")
private var _LetterP: ImageVector? = null
