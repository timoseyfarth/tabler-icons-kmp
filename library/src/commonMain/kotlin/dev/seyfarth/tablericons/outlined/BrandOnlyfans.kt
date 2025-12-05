package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandOnlyfans: ImageVector
    get() {
        if (_BrandOnlyfans != null) {
            return _BrandOnlyfans!!
        }
        _BrandOnlyfans = ImageVector.Builder(
            name = "Filled.BrandOnlyfans",
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
                moveTo(8.5f, 6f)
                arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 13f)
                arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -13f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 15f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 5f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 16f)
                curveToRelative(2.5f, 0f, 6.42f, -1.467f, 7f, -4f)
                horizontalLineToRelative(-6f)
                curveToRelative(3f, -1f, 6.44f, -3.533f, 7f, -6f)
                horizontalLineToRelative(-4f)
                curveToRelative(-3.03f, 0f, -3.764f, -0.196f, -5f, 1.5f)
            }
        }.build()

        return _BrandOnlyfans!!
    }

@Suppress("ObjectPropertyName")
private var _BrandOnlyfans: ImageVector? = null
