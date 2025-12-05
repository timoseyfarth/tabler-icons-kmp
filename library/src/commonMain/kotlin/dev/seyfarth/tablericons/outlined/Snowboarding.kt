package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Snowboarding: ImageVector
    get() {
        if (_Snowboarding != null) {
            return _Snowboarding!!
        }
        _Snowboarding = ImageVector.Builder(
            name = "Filled.Snowboarding",
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
                moveTo(15f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 19f)
                lineToRelative(4f, -2.5f)
                lineToRelative(-0.5f, -1.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 21f)
                lineToRelative(-1f, -6f)
                lineToRelative(-4.5f, -3f)
                lineToRelative(3.5f, -6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 9f)
                lineToRelative(1.5f, -3f)
                horizontalLineToRelative(5.5f)
                lineToRelative(2f, 4f)
                lineToRelative(3f, 1f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 17f)
                curveToRelative(0.399f, 1.154f, 0.899f, 1.805f, 1.5f, 1.951f)
                curveToRelative(6f, 1.464f, 10.772f, 2.262f, 13.5f, 2.927f)
                curveToRelative(1.333f, 0.325f, 2.333f, 0f, 3f, -0.976f)
            }
        }.build()

        return _Snowboarding!!
    }

@Suppress("ObjectPropertyName")
private var _Snowboarding: ImageVector? = null
