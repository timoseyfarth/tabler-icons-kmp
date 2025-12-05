package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandPaypal: ImageVector
    get() {
        if (_BrandPaypal != null) {
            return _BrandPaypal!!
        }
        _BrandPaypal = ImageVector.Builder(
            name = "Filled.BrandPaypal",
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
                moveTo(10f, 13f)
                lineToRelative(2.5f, 0f)
                curveToRelative(2.5f, 0f, 5f, -2.5f, 5f, -5f)
                curveToRelative(0f, -3f, -1.9f, -5f, -5f, -5f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-0.5f, 0f, -1f, 0.5f, -1f, 1f)
                lineToRelative(-2f, 14f)
                curveToRelative(0f, 0.5f, 0.5f, 1f, 1f, 1f)
                horizontalLineToRelative(2.8f)
                lineToRelative(1.2f, -5f)
                curveToRelative(0.1f, -0.6f, 0.4f, -1f, 1f, -1f)
                close()
                moveTo(17.5f, 7.2f)
                curveToRelative(1.7f, 1f, 2.5f, 2.8f, 2.5f, 4.8f)
                curveToRelative(0f, 2.5f, -2.5f, 4.5f, -5f, 4.5f)
                horizontalLineToRelative(-2.6f)
                lineToRelative(-0.6f, 3.6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 0.8f)
                lineToRelative(-2.7f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.6f)
                lineToRelative(0.2f, -1.4f)
            }
        }.build()

        return _BrandPaypal!!
    }

@Suppress("ObjectPropertyName")
private var _BrandPaypal: ImageVector? = null
