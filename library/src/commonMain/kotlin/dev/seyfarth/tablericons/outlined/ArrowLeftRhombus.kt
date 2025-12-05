package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ArrowLeftRhombus: ImageVector
    get() {
        if (_ArrowLeftRhombus != null) {
            return _ArrowLeftRhombus!!
        }
        _ArrowLeftRhombus = ImageVector.Builder(
            name = "Filled.ArrowLeftRhombus",
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
                moveTo(16f, 12f)
                horizontalLineToRelative(-13f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 9f)
                lineToRelative(-3f, 3f)
                lineToRelative(3f, 3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 9.5f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(-2.5f, -2.5f)
                close()
            }
        }.build()

        return _ArrowLeftRhombus!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeftRhombus: ImageVector? = null
