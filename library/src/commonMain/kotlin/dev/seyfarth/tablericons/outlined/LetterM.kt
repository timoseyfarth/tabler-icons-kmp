package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.LetterM: ImageVector
    get() {
        if (_LetterM != null) {
            return _LetterM!!
        }
        _LetterM = ImageVector.Builder(
            name = "Filled.LetterM",
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
                moveTo(6f, 20f)
                verticalLineToRelative(-16f)
                lineToRelative(6f, 14f)
                lineToRelative(6f, -14f)
                verticalLineToRelative(16f)
            }
        }.build()

        return _LetterM!!
    }

@Suppress("ObjectPropertyName")
private var _LetterM: ImageVector? = null
