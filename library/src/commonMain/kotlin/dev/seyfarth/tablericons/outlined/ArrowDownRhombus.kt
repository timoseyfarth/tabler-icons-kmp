package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ArrowDownRhombus: ImageVector
    get() {
        if (_ArrowDownRhombus != null) {
            return _ArrowDownRhombus!!
        }
        _ArrowDownRhombus = ImageVector.Builder(
            name = "Filled.ArrowDownRhombus",
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
                moveTo(12f, 8f)
                verticalLineToRelative(13f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 18f)
                lineToRelative(-3f, 3f)
                lineToRelative(-3f, -3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 5.5f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(2.5f, 2.5f)
                close()
            }
        }.build()

        return _ArrowDownRhombus!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownRhombus: ImageVector? = null
