package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CongruentTo: ImageVector
    get() {
        if (_CongruentTo != null) {
            return _CongruentTo!!
        }
        _CongruentTo = ImageVector.Builder(
            name = "Filled.CongruentTo",
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
                moveTo(5f, 13f)
                horizontalLineToRelative(14f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 17f)
                horizontalLineToRelative(14f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 7.686f)
                curveToRelative(2.333f, -2.624f, 4.667f, -1.856f, 7f, 0.064f)
                reflectiveCurveToRelative(4.667f, 2.688f, 7f, 0.064f)
            }
        }.build()

        return _CongruentTo!!
    }

@Suppress("ObjectPropertyName")
private var _CongruentTo: ImageVector? = null
