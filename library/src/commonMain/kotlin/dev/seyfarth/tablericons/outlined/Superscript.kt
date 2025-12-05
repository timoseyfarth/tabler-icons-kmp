package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Superscript: ImageVector
    get() {
        if (_Superscript != null) {
            return _Superscript!!
        }
        _Superscript = ImageVector.Builder(
            name = "Filled.Superscript",
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
                moveTo(5f, 7f)
                lineToRelative(8f, 10f)
                moveToRelative(-8f, 0f)
                lineToRelative(8f, -10f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 11f)
                horizontalLineToRelative(-4f)
                lineToRelative(3.5f, -4f)
                arcToRelative(1.73f, 1.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -2f)
            }
        }.build()

        return _Superscript!!
    }

@Suppress("ObjectPropertyName")
private var _Superscript: ImageVector? = null
