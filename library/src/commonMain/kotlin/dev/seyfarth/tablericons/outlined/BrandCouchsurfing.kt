package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandCouchsurfing: ImageVector
    get() {
        if (_BrandCouchsurfing != null) {
            return _BrandCouchsurfing!!
        }
        _BrandCouchsurfing = ImageVector.Builder(
            name = "Filled.BrandCouchsurfing",
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
                moveTo(3.1f, 13f)
                curveToRelative(3.267f, 0f, 5.9f, -0.167f, 7.9f, -0.5f)
                curveToRelative(3f, -0.5f, 4f, -2f, 4f, -3.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6f, 0f)
                curveToRelative(0f, 1.554f, 1.807f, 3f, 3f, 4f)
                curveToRelative(1.193f, 1f, 2f, 2.5f, 2f, 3.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
                curveToRelative(0f, -2f, 4f, -3.5f, 7f, -3.5f)
                horizontalLineToRelative(2.9f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                moveToRelative(-9f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, -18f, 0f)
            }
        }.build()

        return _BrandCouchsurfing!!
    }

@Suppress("ObjectPropertyName")
private var _BrandCouchsurfing: ImageVector? = null
