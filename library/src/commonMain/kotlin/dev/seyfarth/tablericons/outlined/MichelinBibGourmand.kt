package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.MichelinBibGourmand: ImageVector
    get() {
        if (_MichelinBibGourmand != null) {
            return _MichelinBibGourmand!!
        }
        _MichelinBibGourmand = ImageVector.Builder(
            name = "Filled.MichelinBibGourmand",
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
                moveTo(4.97f, 20f)
                curveToRelative(-2.395f, -1.947f, -4.763f, -5.245f, -1.005f, -8f)
                curveToRelative(-0.52f, -4f, 3.442f, -7.5f, 5.524f, -7.5f)
                curveToRelative(0.347f, -1f, 1.499f, -1.5f, 2.54f, -1.5f)
                curveToRelative(1.04f, 0f, 2.135f, 0.5f, 2.482f, 1.5f)
                curveToRelative(2.082f, 0f, 6.044f, 3.5f, 5.524f, 7.5f)
                curveToRelative(3.758f, 2.755f, 1.39f, 6.053f, -1.005f, 8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 11f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                arcToRelative(1f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 11f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                arcToRelative(1f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 17.085f)
                curveToRelative(3.5f, 2.712f, 6.5f, 2.712f, 9f, -1.085f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 18.5f)
                curveToRelative(0.815f, -2.337f, 1.881f, -1.472f, 2f, -0.55f)
            }
        }.build()

        return _MichelinBibGourmand!!
    }

@Suppress("ObjectPropertyName")
private var _MichelinBibGourmand: ImageVector? = null
