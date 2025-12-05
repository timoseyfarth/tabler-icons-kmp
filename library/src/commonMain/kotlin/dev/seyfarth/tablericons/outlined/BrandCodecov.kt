package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandCodecov: ImageVector
    get() {
        if (_BrandCodecov != null) {
            return _BrandCodecov!!
        }
        _BrandCodecov = ImageVector.Builder(
            name = "Filled.BrandCodecov",
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
                moveTo(9.695f, 12.985f)
                arcToRelative(5.972f, 5.972f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.295f, -0.985f)
                curveToRelative(-1.257f, 0f, -2.436f, 0.339f, -3.4f, 1f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 18f, 0f)
                curveToRelative(-0.966f, -0.664f, -2.14f, -1f, -3.4f, -1f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.605f, 8.144f)
            }
        }.build()

        return _BrandCodecov!!
    }

@Suppress("ObjectPropertyName")
private var _BrandCodecov: ImageVector? = null
