package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CellSignal5: ImageVector
    get() {
        if (_CellSignal5 != null) {
            return _CellSignal5!!
        }
        _CellSignal5 = ImageVector.Builder(
            name = "Filled.CellSignal5",
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
                moveTo(20f, 20f)
                horizontalLineToRelative(-15.269f)
                arcToRelative(0.731f, 0.731f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.517f, -1.249f)
                lineToRelative(14.537f, -14.537f)
                arcToRelative(0.731f, 0.731f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.249f, 0.517f)
                verticalLineToRelative(15.269f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 7f)
                verticalLineToRelative(13f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 20f)
                verticalLineToRelative(-9f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 20f)
                verticalLineToRelative(-5f)
            }
        }.build()

        return _CellSignal5!!
    }

@Suppress("ObjectPropertyName")
private var _CellSignal5: ImageVector? = null
