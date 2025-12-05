package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BucketDroplet: ImageVector
    get() {
        if (_BucketDroplet != null) {
            return _BucketDroplet!!
        }
        _BucketDroplet = ImageVector.Builder(
            name = "Filled.BucketDroplet",
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
                moveTo(5f, 16f)
                lineToRelative(1.465f, 1.638f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3.015f, 0.099f)
                lineToRelative(1.55f, -1.737f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.737f, 9.737f)
                curveToRelative(2.299f, -2.3f, 3.23f, -5.095f, 2.081f, -6.245f)
                curveToRelative(-1.15f, -1.15f, -3.945f, -0.217f, -6.244f, 2.082f)
                curveToRelative(-2.3f, 2.299f, -3.231f, 5.095f, -2.082f, 6.244f)
                curveToRelative(1.15f, 1.15f, 3.946f, 0.218f, 6.245f, -2.081f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.492f, 11.818f)
                curveToRelative(0.362f, 0.362f, 0.768f, 0.676f, 1.208f, 0.934f)
                lineToRelative(6.895f, 4.047f)
                curveToRelative(1.078f, 0.557f, 2.255f, -0.075f, 3.692f, -1.512f)
                curveToRelative(1.437f, -1.437f, 2.07f, -2.614f, 1.512f, -3.692f)
                curveToRelative(-0.372f, -0.718f, -1.72f, -3.017f, -4.047f, -6.895f)
                arcToRelative(6.015f, 6.015f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.934f, -1.208f)
            }
        }.build()

        return _BucketDroplet!!
    }

@Suppress("ObjectPropertyName")
private var _BucketDroplet: ImageVector? = null
